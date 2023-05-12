package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAnalysisPermissionsRequest extends StObject {
  
  /**
    * The ID of the analysis whose permissions you're updating. The ID is part of the analysis URL.
    */
  var AnalysisId: ShortRestrictiveResourceId
  
  /**
    * The ID of the Amazon Web Services account that contains the analysis whose permissions you're updating. You must be using the Amazon Web Services account that the analysis is in.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * A structure that describes the permissions to add and the principal to add them to.
    */
  var GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
  
  /**
    * A structure that describes the permissions to remove and the principal to remove them from.
    */
  var RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
}
object UpdateAnalysisPermissionsRequest {
  
  inline def apply(AnalysisId: ShortRestrictiveResourceId, AwsAccountId: AwsAccountId): UpdateAnalysisPermissionsRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnalysisPermissionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAnalysisPermissionsRequest] (val x: Self) extends AnyVal {
    
    inline def setAnalysisId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setGrantPermissions(value: UpdateResourcePermissionList): Self = StObject.set(x, "GrantPermissions", value.asInstanceOf[js.Any])
    
    inline def setGrantPermissionsUndefined: Self = StObject.set(x, "GrantPermissions", js.undefined)
    
    inline def setGrantPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "GrantPermissions", js.Array(value*))
    
    inline def setRevokePermissions(value: UpdateResourcePermissionList): Self = StObject.set(x, "RevokePermissions", value.asInstanceOf[js.Any])
    
    inline def setRevokePermissionsUndefined: Self = StObject.set(x, "RevokePermissions", js.undefined)
    
    inline def setRevokePermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "RevokePermissions", js.Array(value*))
  }
}
