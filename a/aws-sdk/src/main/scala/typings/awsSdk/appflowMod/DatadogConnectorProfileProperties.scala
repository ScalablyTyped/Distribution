package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatadogConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Datadog resource. 
    */
  var instanceUrl: InstanceUrl
}
object DatadogConnectorProfileProperties {
  
  inline def apply(instanceUrl: InstanceUrl): DatadogConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatadogConnectorProfileProperties]
  }
  
  extension [Self <: DatadogConnectorProfileProperties](x: Self) {
    
    inline def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
