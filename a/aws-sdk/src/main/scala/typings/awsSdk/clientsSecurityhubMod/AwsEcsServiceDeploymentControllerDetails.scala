package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsServiceDeploymentControllerDetails extends StObject {
  
  /**
    * The rolling update (ECS) deployment type replaces the current running version of the container with the latest version. The blue/green (CODE_DEPLOY) deployment type uses the blue/green deployment model that is powered by CodeDeploy. This deployment model a new deployment of a service can be verified before production traffic is sent to it. The external (EXTERNAL) deployment type allows the use of any third-party deployment controller for full control over the deployment process for an Amazon ECS service. Valid values: ECS | CODE_DEPLOY | EXTERNAL 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsServiceDeploymentControllerDetails {
  
  inline def apply(): AwsEcsServiceDeploymentControllerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsServiceDeploymentControllerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsServiceDeploymentControllerDetails] (val x: Self) extends AnyVal {
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
