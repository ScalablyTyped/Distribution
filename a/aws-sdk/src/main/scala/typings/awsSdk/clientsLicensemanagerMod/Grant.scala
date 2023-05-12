package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grant extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the grant.
    */
  var GrantArn: Arn
  
  /**
    * Grant name.
    */
  var GrantName: String
  
  /**
    * Grant status.
    */
  var GrantStatus: typings.awsSdk.clientsLicensemanagerMod.GrantStatus
  
  /**
    * Granted operations.
    */
  var GrantedOperations: AllowedOperationList
  
  /**
    * The grantee principal ARN.
    */
  var GranteePrincipalArn: Arn
  
  /**
    * Home Region of the grant.
    */
  var HomeRegion: String
  
  /**
    * License ARN.
    */
  var LicenseArn: Arn
  
  /**
    * The options specified for the grant.
    */
  var Options: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.Options] = js.undefined
  
  /**
    * Parent ARN.
    */
  var ParentArn: Arn
  
  /**
    * Grant status reason.
    */
  var StatusReason: js.UndefOr[StatusReasonMessage] = js.undefined
  
  /**
    * Grant version.
    */
  var Version: String
}
object Grant {
  
  inline def apply(
    GrantArn: Arn,
    GrantName: String,
    GrantStatus: GrantStatus,
    GrantedOperations: AllowedOperationList,
    GranteePrincipalArn: Arn,
    HomeRegion: String,
    LicenseArn: Arn,
    ParentArn: Arn,
    Version: String
  ): Grant = {
    val __obj = js.Dynamic.literal(GrantArn = GrantArn.asInstanceOf[js.Any], GrantName = GrantName.asInstanceOf[js.Any], GrantStatus = GrantStatus.asInstanceOf[js.Any], GrantedOperations = GrantedOperations.asInstanceOf[js.Any], GranteePrincipalArn = GranteePrincipalArn.asInstanceOf[js.Any], HomeRegion = HomeRegion.asInstanceOf[js.Any], LicenseArn = LicenseArn.asInstanceOf[js.Any], ParentArn = ParentArn.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Grant] (val x: Self) extends AnyVal {
    
    inline def setGrantArn(value: Arn): Self = StObject.set(x, "GrantArn", value.asInstanceOf[js.Any])
    
    inline def setGrantName(value: String): Self = StObject.set(x, "GrantName", value.asInstanceOf[js.Any])
    
    inline def setGrantStatus(value: GrantStatus): Self = StObject.set(x, "GrantStatus", value.asInstanceOf[js.Any])
    
    inline def setGrantedOperations(value: AllowedOperationList): Self = StObject.set(x, "GrantedOperations", value.asInstanceOf[js.Any])
    
    inline def setGrantedOperationsVarargs(value: AllowedOperation*): Self = StObject.set(x, "GrantedOperations", js.Array(value*))
    
    inline def setGranteePrincipalArn(value: Arn): Self = StObject.set(x, "GranteePrincipalArn", value.asInstanceOf[js.Any])
    
    inline def setHomeRegion(value: String): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
    
    inline def setLicenseArn(value: Arn): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Options): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setParentArn(value: Arn): Self = StObject.set(x, "ParentArn", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: StatusReasonMessage): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
