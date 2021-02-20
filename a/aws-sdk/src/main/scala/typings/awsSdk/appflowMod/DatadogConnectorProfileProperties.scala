package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatadogConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Datadog resource. 
    */
  var instanceUrl: InstanceUrl = js.native
}
object DatadogConnectorProfileProperties {
  
  @scala.inline
  def apply(instanceUrl: InstanceUrl): DatadogConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatadogConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class DatadogConnectorProfilePropertiesMutableBuilder[Self <: DatadogConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
