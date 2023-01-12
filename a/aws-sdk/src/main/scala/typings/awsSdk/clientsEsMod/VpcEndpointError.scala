package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcEndpointError extends StObject {
  
  /**
    * The code associated with the error.
    */
  var ErrorCode: js.UndefOr[VpcEndpointErrorCode] = js.undefined
  
  /**
    * A message describing the error.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the endpoint. 
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.clientsEsMod.VpcEndpointId] = js.undefined
}
object VpcEndpointError {
  
  inline def apply(): VpcEndpointError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcEndpointError] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: VpcEndpointErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
  }
}
