package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Any extension field descriptor. */
/* Rewritten from type alias, can be one of: 
  - typings.apolloProtobufjs.mod.IExtensionField
  - typings.apolloProtobufjs.mod.IExtensionMapField
*/
trait AnyExtensionField extends AnyNestedObject

object AnyExtensionField {
  @scala.inline
  def IExtensionField(
    extend: String,
    id: Double,
    `type`: String,
    options: StringDictionary[js.Any] = null,
    rule: String = null
  ): AnyExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyExtensionField]
  }
  @scala.inline
  def IExtensionMapField(
    extend: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[js.Any] = null,
    rule: String = null
  ): AnyExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyExtensionField]
  }
}

