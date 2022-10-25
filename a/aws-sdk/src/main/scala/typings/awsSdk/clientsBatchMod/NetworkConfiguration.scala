package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConfiguration extends StObject {
  
  /**
    * Indicates whether the job has a public IP address. For a job that's running on Fargate resources in a private subnet to send outbound traffic to the internet (for example, to pull container images), the private subnet requires a NAT gateway be attached to route requests to the internet. For more information, see Amazon ECS task networking in the Amazon Elastic Container Service Developer Guide. The default value is "DISABLED".
    */
  var assignPublicIp: js.UndefOr[AssignPublicIp] = js.undefined
}
object NetworkConfiguration {
  
  inline def apply(): NetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfiguration]
  }
  
  extension [Self <: NetworkConfiguration](x: Self) {
    
    inline def setAssignPublicIp(value: AssignPublicIp): Self = StObject.set(x, "assignPublicIp", value.asInstanceOf[js.Any])
    
    inline def setAssignPublicIpUndefined: Self = StObject.set(x, "assignPublicIp", js.undefined)
  }
}
