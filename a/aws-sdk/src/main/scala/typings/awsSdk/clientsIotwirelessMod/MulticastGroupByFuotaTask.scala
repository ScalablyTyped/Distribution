package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MulticastGroupByFuotaTask extends StObject {
  
  var Id: js.UndefOr[MulticastGroupId] = js.undefined
}
object MulticastGroupByFuotaTask {
  
  inline def apply(): MulticastGroupByFuotaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MulticastGroupByFuotaTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MulticastGroupByFuotaTask] (val x: Self) extends AnyVal {
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
