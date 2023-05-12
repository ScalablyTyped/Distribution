package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveWaveRequest extends StObject {
  
  /**
    * Wave ID.
    */
  var waveID: WaveID
}
object ArchiveWaveRequest {
  
  inline def apply(waveID: WaveID): ArchiveWaveRequest = {
    val __obj = js.Dynamic.literal(waveID = waveID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveWaveRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArchiveWaveRequest] (val x: Self) extends AnyVal {
    
    inline def setWaveID(value: WaveID): Self = StObject.set(x, "waveID", value.asInstanceOf[js.Any])
  }
}
