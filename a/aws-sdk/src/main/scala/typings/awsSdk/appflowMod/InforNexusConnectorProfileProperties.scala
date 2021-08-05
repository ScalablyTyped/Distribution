package typings.awsSdk.appflowMod

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
  
  extension [Self <: InforNexusConnectorProfileProperties](x: Self) {
    
    inline def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
