package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZendeskConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Zendesk resource. 
    */
  var instanceUrl: InstanceUrl
}
object ZendeskConnectorProfileProperties {
  
  inline def apply(instanceUrl: InstanceUrl): ZendeskConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZendeskConnectorProfileProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZendeskConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    inline def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
