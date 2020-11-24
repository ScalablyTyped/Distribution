package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any nested object descriptor. */
/* Rewritten from type alias, can be one of: 
  - typings.apolloProtobufjs.mod.IEnum
  - typings.apolloProtobufjs.mod.IType
  - typings.apolloProtobufjs.mod.IService
  - typings.apolloProtobufjs.mod.AnyExtensionField
  - typings.apolloProtobufjs.mod.INamespace
*/
trait AnyNestedObject extends js.Object
object AnyNestedObject {
  
  @scala.inline
  def IService(methods: StringDictionary[js.UndefOr[IMethod]]): AnyNestedObject = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNestedObject]
  }
  
  @scala.inline
  def IType(fields: StringDictionary[js.UndefOr[IField]]): AnyNestedObject = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNestedObject]
  }
  
  @scala.inline
  def IEnum(values: StringDictionary[js.UndefOr[Double]]): AnyNestedObject = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNestedObject]
  }
  
  @scala.inline
  def IExtensionField(extend: String, id: Double, `type`: String): AnyNestedObject = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNestedObject]
  }
  
  @scala.inline
  def INamespace(): AnyNestedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnyNestedObject]
  }
  
  @scala.inline
  def IExtensionMapField(extend: String, id: Double, keyType: String, `type`: String): AnyNestedObject = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNestedObject]
  }
}
