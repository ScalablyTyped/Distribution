package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceStatusDetails extends StObject {
  
  /**
    * The time when a status check failed. For an instance that was launched and impaired, this is the time when the instance was launched.
    */
  var ImpairedSince: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of instance status.
    */
  var Name: js.UndefOr[StatusName] = js.undefined
  
  /**
    * The status.
    */
  var Status: js.UndefOr[StatusType] = js.undefined
}
object InstanceStatusDetails {
  
  inline def apply(): InstanceStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatusDetails]
  }
  
  extension [Self <: InstanceStatusDetails](x: Self) {
    
    inline def setImpairedSince(value: js.Date): Self = StObject.set(x, "ImpairedSince", value.asInstanceOf[js.Any])
    
    inline def setImpairedSinceUndefined: Self = StObject.set(x, "ImpairedSince", js.undefined)
    
    inline def setName(value: StatusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: StatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
