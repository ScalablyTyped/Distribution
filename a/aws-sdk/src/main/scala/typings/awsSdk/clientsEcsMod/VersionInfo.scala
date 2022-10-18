package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionInfo extends StObject {
  
  /**
    * The Git commit hash for the Amazon ECS container agent build on the amazon-ecs-agent  GitHub repository.
    */
  var agentHash: js.UndefOr[String] = js.undefined
  
  /**
    * The version number of the Amazon ECS container agent.
    */
  var agentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The Docker version that's running on the container instance.
    */
  var dockerVersion: js.UndefOr[String] = js.undefined
}
object VersionInfo {
  
  inline def apply(): VersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionInfo]
  }
  
  extension [Self <: VersionInfo](x: Self) {
    
    inline def setAgentHash(value: String): Self = StObject.set(x, "agentHash", value.asInstanceOf[js.Any])
    
    inline def setAgentHashUndefined: Self = StObject.set(x, "agentHash", js.undefined)
    
    inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
    
    inline def setDockerVersion(value: String): Self = StObject.set(x, "dockerVersion", value.asInstanceOf[js.Any])
    
    inline def setDockerVersionUndefined: Self = StObject.set(x, "dockerVersion", js.undefined)
  }
}
