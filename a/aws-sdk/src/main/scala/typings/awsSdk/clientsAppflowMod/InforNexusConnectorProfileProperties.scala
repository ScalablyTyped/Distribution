package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InforNexusConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Infor Nexus resource. 
    */
  var instanceUrl: InstanceUrl
}
object InforNexusConnectorProfileProperties {
  
  inline def apply(instanceUrl: InstanceUrl): InforNexusConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InforNexusConnectorProfileProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InforNexusConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    inline def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
