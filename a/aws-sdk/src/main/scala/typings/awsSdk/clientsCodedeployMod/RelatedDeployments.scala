package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedDeployments extends StObject {
  
  /**
    * The deployment IDs of 'auto-update outdated instances' deployments triggered by this deployment.
    */
  var autoUpdateOutdatedInstancesDeploymentIds: js.UndefOr[DeploymentsList] = js.undefined
  
  /**
    * The deployment ID of the root deployment that triggered this deployment.
    */
  var autoUpdateOutdatedInstancesRootDeploymentId: js.UndefOr[DeploymentId] = js.undefined
}
object RelatedDeployments {
  
  inline def apply(): RelatedDeployments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedDeployments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelatedDeployments] (val x: Self) extends AnyVal {
    
    inline def setAutoUpdateOutdatedInstancesDeploymentIds(value: DeploymentsList): Self = StObject.set(x, "autoUpdateOutdatedInstancesDeploymentIds", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateOutdatedInstancesDeploymentIdsUndefined: Self = StObject.set(x, "autoUpdateOutdatedInstancesDeploymentIds", js.undefined)
    
    inline def setAutoUpdateOutdatedInstancesDeploymentIdsVarargs(value: DeploymentId*): Self = StObject.set(x, "autoUpdateOutdatedInstancesDeploymentIds", js.Array(value*))
    
    inline def setAutoUpdateOutdatedInstancesRootDeploymentId(value: DeploymentId): Self = StObject.set(x, "autoUpdateOutdatedInstancesRootDeploymentId", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateOutdatedInstancesRootDeploymentIdUndefined: Self = StObject.set(x, "autoUpdateOutdatedInstancesRootDeploymentId", js.undefined)
  }
}
