package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynatraceConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Dynatrace resource. 
    */
  var instanceUrl: InstanceUrl
}
object DynatraceConnectorProfileProperties {
  
  inline def apply(instanceUrl: InstanceUrl): DynatraceConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynatraceConnectorProfileProperties]
  }
  
  extension [Self <: DynatraceConnectorProfileProperties](x: Self) {
    
    inline def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
