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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynatraceConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    inline def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
