package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlackConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Slack resource. 
    */
  var instanceUrl: InstanceUrl
}
object SlackConnectorProfileProperties {
  
  inline def apply(instanceUrl: InstanceUrl): SlackConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlackConnectorProfileProperties]
  }
  
  extension [Self <: SlackConnectorProfileProperties](x: Self) {
    
    inline def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
