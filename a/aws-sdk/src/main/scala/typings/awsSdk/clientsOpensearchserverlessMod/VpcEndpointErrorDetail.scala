package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcEndpointErrorDetail extends StObject {
  
  /**
    * The error code for the failed request.
    */
  var errorCode: js.UndefOr[String] = js.undefined
  
  /**
    * An error message describing the reason for the failure.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the VPC endpoint.
    */
  var id: js.UndefOr[VpcEndpointId] = js.undefined
}
object VpcEndpointErrorDetail {
  
  inline def apply(): VpcEndpointErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointErrorDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcEndpointErrorDetail] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setId(value: VpcEndpointId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
