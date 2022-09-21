package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMCGAAttribute extends StObject {
  
  /**
    * The CGA attribute type.
    */
  var CGAAttributeType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CGAAttributeType * / any */ String
  ] = js.undefined
  
  /**
    * The name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMCGAAttribute
  
  /**
    * The value.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object CIMCGAAttribute {
  
  inline def apply(): CIMCGAAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMCGAAttribute")
    __obj.asInstanceOf[CIMCGAAttribute]
  }
  
  extension [Self <: CIMCGAAttribute](x: Self) {
    
    inline def setCGAAttributeType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CGAAttributeType * / any */ String
    ): Self = StObject.set(x, "CGAAttributeType", value.asInstanceOf[js.Any])
    
    inline def setCGAAttributeTypeUndefined: Self = StObject.set(x, "CGAAttributeType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMCGAAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
