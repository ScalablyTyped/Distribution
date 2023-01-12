package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGrantRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the grant.
    */
  var GrantArn: Arn
  
  /**
    * The Status reason for the delete request.
    */
  var StatusReason: js.UndefOr[StatusReasonMessage] = js.undefined
  
  /**
    * Current version of the grant.
    */
  var Version: String
}
object DeleteGrantRequest {
  
  inline def apply(GrantArn: Arn, Version: String): DeleteGrantRequest = {
    val __obj = js.Dynamic.literal(GrantArn = GrantArn.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGrantRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGrantRequest] (val x: Self) extends AnyVal {
    
    inline def setGrantArn(value: Arn): Self = StObject.set(x, "GrantArn", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: StatusReasonMessage): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
