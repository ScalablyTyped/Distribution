package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBaseBlock extends StObject {
  
  var name: String
  
  var optional: scala.Boolean
  
  var primitiveSchema: js.UndefOr[BaseBlock[ValueBlock, ValueBlockJson]] = js.undefined
}
object IBaseBlock {
  
  inline def apply(name: String, optional: scala.Boolean): IBaseBlock = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseBlock]
  }
  
  extension [Self <: IBaseBlock](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: scala.Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveSchema(value: BaseBlock[ValueBlock, ValueBlockJson]): Self = StObject.set(x, "primitiveSchema", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveSchemaUndefined: Self = StObject.set(x, "primitiveSchema", js.undefined)
  }
}
