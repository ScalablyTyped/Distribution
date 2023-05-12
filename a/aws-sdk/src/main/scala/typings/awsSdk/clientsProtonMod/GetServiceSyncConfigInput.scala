package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceSyncConfigInput extends StObject {
  
  /**
    * The name of the service that you want to get the service sync configuration for.
    */
  var serviceName: ResourceName
}
object GetServiceSyncConfigInput {
  
  inline def apply(serviceName: ResourceName): GetServiceSyncConfigInput = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceSyncConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceSyncConfigInput] (val x: Self) extends AnyVal {
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
