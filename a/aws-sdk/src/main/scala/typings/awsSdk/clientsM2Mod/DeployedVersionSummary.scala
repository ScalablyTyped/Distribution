package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeployedVersionSummary extends StObject {
  
  /**
    * The version of the deployed application.
    */
  var applicationVersion: Version
  
  /**
    * The status of the deployment.
    */
  var status: DeploymentLifecycle
  
  /**
    * The reason for the reported status.
    */
  var statusReason: js.UndefOr[String] = js.undefined
}
object DeployedVersionSummary {
  
  inline def apply(applicationVersion: Version, status: DeploymentLifecycle): DeployedVersionSummary = {
    val __obj = js.Dynamic.literal(applicationVersion = applicationVersion.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeployedVersionSummary]
  }
  
  extension [Self <: DeployedVersionSummary](x: Self) {
    
    inline def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DeploymentLifecycle): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
  }
}
