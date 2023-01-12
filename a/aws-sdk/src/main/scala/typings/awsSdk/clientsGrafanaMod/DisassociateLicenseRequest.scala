package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateLicenseRequest extends StObject {
  
  /**
    * The type of license to remove from the workspace.
    */
  var licenseType: LicenseType
  
  /**
    * The ID of the workspace to remove the Grafana Enterprise license from.
    */
  var workspaceId: WorkspaceId
}
object DisassociateLicenseRequest {
  
  inline def apply(licenseType: LicenseType, workspaceId: WorkspaceId): DisassociateLicenseRequest = {
    val __obj = js.Dynamic.literal(licenseType = licenseType.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateLicenseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateLicenseRequest] (val x: Self) extends AnyVal {
    
    inline def setLicenseType(value: LicenseType): Self = StObject.set(x, "licenseType", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
