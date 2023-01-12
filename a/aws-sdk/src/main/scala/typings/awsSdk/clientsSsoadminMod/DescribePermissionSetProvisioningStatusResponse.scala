package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePermissionSetProvisioningStatusResponse extends StObject {
  
  /**
    * The status object for the permission set provisioning operation.
    */
  var PermissionSetProvisioningStatus: js.UndefOr[typings.awsSdk.clientsSsoadminMod.PermissionSetProvisioningStatus] = js.undefined
}
object DescribePermissionSetProvisioningStatusResponse {
  
  inline def apply(): DescribePermissionSetProvisioningStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePermissionSetProvisioningStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePermissionSetProvisioningStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setPermissionSetProvisioningStatus(value: PermissionSetProvisioningStatus): Self = StObject.set(x, "PermissionSetProvisioningStatus", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetProvisioningStatusUndefined: Self = StObject.set(x, "PermissionSetProvisioningStatus", js.undefined)
  }
}
