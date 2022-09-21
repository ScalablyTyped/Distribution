package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any nested object descriptor. */
/* Rewritten from type alias, can be one of: 
  - typings.apolloProtobufjs.mod.IEnum
  - typings.apolloProtobufjs.mod.IType
  - typings.apolloProtobufjs.mod.IService
  - typings.apolloProtobufjs.mod.AnyExtensionField
  - typings.apolloProtobufjs.mod.INamespace
*/
trait AnyNestedObject extends StObject
object AnyNestedObject {
  
  inline def IEnum(values: StringDictionary[Double]): typings.apolloProtobufjs.mod.IEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.apolloProtobufjs.mod.IEnum]
  }
  
  inline def IExtensionField(extend: String, id: Double, `type`: String): typings.apolloProtobufjs.mod.IExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.apolloProtobufjs.mod.IExtensionField]
  }
  
  inline def IExtensionMapField(extend: String, id: Double, keyType: String, `type`: String): typings.apolloProtobufjs.mod.IExtensionMapField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.apolloProtobufjs.mod.IExtensionMapField]
  }
  
  inline def INamespace(): typings.apolloProtobufjs.mod.INamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.apolloProtobufjs.mod.INamespace]
  }
  
  inline def IService(methods: StringDictionary[IMethod]): typings.apolloProtobufjs.mod.IService = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.apolloProtobufjs.mod.IService]
  }
  
  inline def IType(fields: StringDictionary[IField]): typings.apolloProtobufjs.mod.IType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.apolloProtobufjs.mod.IType]
  }
}
