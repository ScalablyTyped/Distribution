package typings.awsSdk.clientsPricingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /**
    * The attributes that are available for this service.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
  
  /**
    * The code for the Amazon Web Services service.
    */
  var ServiceCode: String
}
object Service {
  
  inline def apply(ServiceCode: String): Service = {
    val __obj = js.Dynamic.literal(ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
    
    inline def setAttributeNames(value: AttributeNameList): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    inline def setAttributeNamesUndefined: Self = StObject.set(x, "AttributeNames", js.undefined)
    
    inline def setAttributeNamesVarargs(value: String*): Self = StObject.set(x, "AttributeNames", js.Array(value*))
    
    inline def setServiceCode(value: String): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
