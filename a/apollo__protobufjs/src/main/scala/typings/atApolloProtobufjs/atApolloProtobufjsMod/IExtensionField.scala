package typings.atApolloProtobufjs.atApolloProtobufjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtensionField
  extends AnyExtensionField
     with IField {
  /** Extended type */
  var extend: String
}

object IExtensionField {
  @scala.inline
  def apply(
    extend: String,
    id: Double,
    `type`: String,
    options: StringDictionary[js.Any] = null,
    rule: String = null
  ): IExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend, id = id)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[IExtensionField]
  }
}

