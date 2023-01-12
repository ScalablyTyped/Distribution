package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentVersion extends StObject {
  
  /**
    * The number of Edge Manager agents.
    */
  var AgentCount: Long
  
  /**
    * Version of the agent.
    */
  var Version: EdgeVersion
}
object AgentVersion {
  
  inline def apply(AgentCount: Long, Version: EdgeVersion): AgentVersion = {
    val __obj = js.Dynamic.literal(AgentCount = AgentCount.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentVersion] (val x: Self) extends AnyVal {
    
    inline def setAgentCount(value: Long): Self = StObject.set(x, "AgentCount", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: EdgeVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
