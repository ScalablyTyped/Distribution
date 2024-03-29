package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingModifiedServiceUpdate extends StObject {
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the service update
    */
  var Status: js.UndefOr[ServiceUpdateStatus] = js.undefined
}
object PendingModifiedServiceUpdate {
  
  inline def apply(): PendingModifiedServiceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedServiceUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PendingModifiedServiceUpdate] (val x: Self) extends AnyVal {
    
    inline def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateNameUndefined: Self = StObject.set(x, "ServiceUpdateName", js.undefined)
    
    inline def setStatus(value: ServiceUpdateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
