package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnarchiveWaveRequest extends StObject {
  
  /**
    * Wave ID.
    */
  var waveID: WaveID
}
object UnarchiveWaveRequest {
  
  inline def apply(waveID: WaveID): UnarchiveWaveRequest = {
    val __obj = js.Dynamic.literal(waveID = waveID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnarchiveWaveRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnarchiveWaveRequest] (val x: Self) extends AnyVal {
    
    inline def setWaveID(value: WaveID): Self = StObject.set(x, "waveID", value.asInstanceOf[js.Any])
  }
}
