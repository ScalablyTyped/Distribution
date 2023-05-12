package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceSyncConfigInput extends StObject {
  
  /**
    * The name of the service that you want to delete the service sync configuration for.
    */
  var serviceName: ResourceName
}
object DeleteServiceSyncConfigInput {
  
  inline def apply(serviceName: ResourceName): DeleteServiceSyncConfigInput = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceSyncConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceSyncConfigInput] (val x: Self) extends AnyVal {
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
