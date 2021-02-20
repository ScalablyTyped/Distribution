package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarketoConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Marketo resource. 
    */
  var instanceUrl: InstanceUrl = js.native
}
object MarketoConnectorProfileProperties {
  
  @scala.inline
  def apply(instanceUrl: InstanceUrl): MarketoConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarketoConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class MarketoConnectorProfilePropertiesMutableBuilder[Self <: MarketoConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
