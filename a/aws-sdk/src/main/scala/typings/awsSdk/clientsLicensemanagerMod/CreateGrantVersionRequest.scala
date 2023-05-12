package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGrantVersionRequest extends StObject {
  
  /**
    * Allowed operations for the grant.
    */
  var AllowedOperations: js.UndefOr[AllowedOperationList] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: typings.awsSdk.clientsLicensemanagerMod.ClientToken
  
  /**
    * Amazon Resource Name (ARN) of the grant.
    */
  var GrantArn: Arn
  
  /**
    * Grant name.
    */
  var GrantName: js.UndefOr[String] = js.undefined
  
  /**
    * The options specified for the grant.
    */
  var Options: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.Options] = js.undefined
  
  /**
    * Current version of the grant.
    */
  var SourceVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Grant status.
    */
  var Status: js.UndefOr[GrantStatus] = js.undefined
  
  /**
    * Grant status reason.
    */
  var StatusReason: js.UndefOr[StatusReasonMessage] = js.undefined
}
object CreateGrantVersionRequest {
  
  inline def apply(ClientToken: ClientToken, GrantArn: Arn): CreateGrantVersionRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], GrantArn = GrantArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGrantVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGrantVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setAllowedOperations(value: AllowedOperationList): Self = StObject.set(x, "AllowedOperations", value.asInstanceOf[js.Any])
    
    inline def setAllowedOperationsUndefined: Self = StObject.set(x, "AllowedOperations", js.undefined)
    
    inline def setAllowedOperationsVarargs(value: AllowedOperation*): Self = StObject.set(x, "AllowedOperations", js.Array(value*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setGrantArn(value: Arn): Self = StObject.set(x, "GrantArn", value.asInstanceOf[js.Any])
    
    inline def setGrantName(value: String): Self = StObject.set(x, "GrantName", value.asInstanceOf[js.Any])
    
    inline def setGrantNameUndefined: Self = StObject.set(x, "GrantName", js.undefined)
    
    inline def setOptions(value: Options): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setSourceVersion(value: String): Self = StObject.set(x, "SourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "SourceVersion", js.undefined)
    
    inline def setStatus(value: GrantStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: StatusReasonMessage): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
