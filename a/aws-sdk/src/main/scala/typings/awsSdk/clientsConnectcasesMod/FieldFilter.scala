package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldFilter extends StObject {
  
  /**
    * Object containing field identifier and value information.
    */
  var contains: js.UndefOr[FieldValue] = js.undefined
  
  /**
    * Object containing field identifier and value information.
    */
  var equalTo: js.UndefOr[FieldValue] = js.undefined
  
  /**
    * Object containing field identifier and value information.
    */
  var greaterThan: js.UndefOr[FieldValue] = js.undefined
  
  /**
    * Object containing field identifier and value information.
    */
  var greaterThanOrEqualTo: js.UndefOr[FieldValue] = js.undefined
  
  /**
    * Object containing field identifier and value information.
    */
  var lessThan: js.UndefOr[FieldValue] = js.undefined
  
  /**
    * Object containing field identifier and value information. 
    */
  var lessThanOrEqualTo: js.UndefOr[FieldValue] = js.undefined
}
object FieldFilter {
  
  inline def apply(): FieldFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldFilter]
  }
  
  extension [Self <: FieldFilter](x: Self) {
    
    inline def setContains(value: FieldValue): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setEqualTo(value: FieldValue): Self = StObject.set(x, "equalTo", value.asInstanceOf[js.Any])
    
    inline def setEqualToUndefined: Self = StObject.set(x, "equalTo", js.undefined)
    
    inline def setGreaterThan(value: FieldValue): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
    
    inline def setGreaterThanOrEqualTo(value: FieldValue): Self = StObject.set(x, "greaterThanOrEqualTo", value.asInstanceOf[js.Any])
    
    inline def setGreaterThanOrEqualToUndefined: Self = StObject.set(x, "greaterThanOrEqualTo", js.undefined)
    
    inline def setGreaterThanUndefined: Self = StObject.set(x, "greaterThan", js.undefined)
    
    inline def setLessThan(value: FieldValue): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
    
    inline def setLessThanOrEqualTo(value: FieldValue): Self = StObject.set(x, "lessThanOrEqualTo", value.asInstanceOf[js.Any])
    
    inline def setLessThanOrEqualToUndefined: Self = StObject.set(x, "lessThanOrEqualTo", js.undefined)
    
    inline def setLessThanUndefined: Self = StObject.set(x, "lessThan", js.undefined)
  }
}
