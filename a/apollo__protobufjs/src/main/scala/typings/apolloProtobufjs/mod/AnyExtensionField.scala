package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any extension field descriptor. */
/* Rewritten from type alias, can be one of: 
  - typings.apolloProtobufjs.mod.IExtensionField
  - typings.apolloProtobufjs.mod.IExtensionMapField
*/
trait AnyExtensionField extends AnyNestedObject
object AnyExtensionField {
  
  @scala.inline
  def IExtensionField(extend: String, id: Double, `type`: String): typings.apolloProtobufjs.mod.IExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.apolloProtobufjs.mod.IExtensionField]
  }
  
  @scala.inline
  def IExtensionMapField(extend: String, id: Double, keyType: String, `type`: String): typings.apolloProtobufjs.mod.IExtensionMapField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.apolloProtobufjs.mod.IExtensionMapField]
  }
}
