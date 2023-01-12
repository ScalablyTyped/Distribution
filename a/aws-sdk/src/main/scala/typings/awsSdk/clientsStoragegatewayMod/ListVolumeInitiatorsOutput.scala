package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVolumeInitiatorsOutput extends StObject {
  
  /**
    * The host names and port numbers of all iSCSI initiators that are connected to the gateway.
    */
  var Initiators: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.Initiators] = js.undefined
}
object ListVolumeInitiatorsOutput {
  
  inline def apply(): ListVolumeInitiatorsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVolumeInitiatorsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVolumeInitiatorsOutput] (val x: Self) extends AnyVal {
    
    inline def setInitiators(value: Initiators): Self = StObject.set(x, "Initiators", value.asInstanceOf[js.Any])
    
    inline def setInitiatorsUndefined: Self = StObject.set(x, "Initiators", js.undefined)
    
    inline def setInitiatorsVarargs(value: Initiator*): Self = StObject.set(x, "Initiators", js.Array(value*))
  }
}
