package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GsmLocalId extends StObject {
  
  /**
    * GSM broadcast control channel.
    */
  var Bcch: BCCH
  
  /**
    * GSM base station identity code (BSIC).
    */
  var Bsic: BSIC
}
object GsmLocalId {
  
  inline def apply(Bcch: BCCH, Bsic: BSIC): GsmLocalId = {
    val __obj = js.Dynamic.literal(Bcch = Bcch.asInstanceOf[js.Any], Bsic = Bsic.asInstanceOf[js.Any])
    __obj.asInstanceOf[GsmLocalId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GsmLocalId] (val x: Self) extends AnyVal {
    
    inline def setBcch(value: BCCH): Self = StObject.set(x, "Bcch", value.asInstanceOf[js.Any])
    
    inline def setBsic(value: BSIC): Self = StObject.set(x, "Bsic", value.asInstanceOf[js.Any])
  }
}
