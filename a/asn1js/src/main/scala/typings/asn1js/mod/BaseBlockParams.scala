package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseBlockParams
  extends StObject
     with LocalBaseBlockParams {
  
  var name: js.UndefOr[String] = js.undefined
  
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  
  var primitiveSchema: js.UndefOr[js.Object] = js.undefined
}
object BaseBlockParams {
  
  inline def apply(): BaseBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseBlockParams]
  }
  
  extension [Self <: BaseBlockParams](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptional(value: scala.Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setPrimitiveSchema(value: js.Object): Self = StObject.set(x, "primitiveSchema", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveSchemaUndefined: Self = StObject.set(x, "primitiveSchema", js.undefined)
  }
}
