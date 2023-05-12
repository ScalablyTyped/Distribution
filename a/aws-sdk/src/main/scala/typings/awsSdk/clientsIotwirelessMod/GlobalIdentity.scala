package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalIdentity extends StObject {
  
  /**
    * GERAN (GSM EDGE Radio Access Network) cell global identifier.
    */
  var GeranCid: typings.awsSdk.clientsIotwirelessMod.GeranCid
  
  /**
    * Location area code of the global identity.
    */
  var Lac: LAC
}
object GlobalIdentity {
  
  inline def apply(GeranCid: GeranCid, Lac: LAC): GlobalIdentity = {
    val __obj = js.Dynamic.literal(GeranCid = GeranCid.asInstanceOf[js.Any], Lac = Lac.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalIdentity] (val x: Self) extends AnyVal {
    
    inline def setGeranCid(value: GeranCid): Self = StObject.set(x, "GeranCid", value.asInstanceOf[js.Any])
    
    inline def setLac(value: LAC): Self = StObject.set(x, "Lac", value.asInstanceOf[js.Any])
  }
}
