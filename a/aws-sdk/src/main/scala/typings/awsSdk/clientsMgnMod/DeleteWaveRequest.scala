package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWaveRequest extends StObject {
  
  /**
    * Wave ID.
    */
  var waveID: WaveID
}
object DeleteWaveRequest {
  
  inline def apply(waveID: WaveID): DeleteWaveRequest = {
    val __obj = js.Dynamic.literal(waveID = waveID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWaveRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWaveRequest] (val x: Self) extends AnyVal {
    
    inline def setWaveID(value: WaveID): Self = StObject.set(x, "waveID", value.asInstanceOf[js.Any])
  }
}
