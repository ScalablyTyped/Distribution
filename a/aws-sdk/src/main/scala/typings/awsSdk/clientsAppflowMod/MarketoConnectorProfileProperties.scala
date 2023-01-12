package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarketoConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Marketo resource. 
    */
  var instanceUrl: InstanceUrl
}
object MarketoConnectorProfileProperties {
  
  inline def apply(instanceUrl: InstanceUrl): MarketoConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarketoConnectorProfileProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarketoConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    inline def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
