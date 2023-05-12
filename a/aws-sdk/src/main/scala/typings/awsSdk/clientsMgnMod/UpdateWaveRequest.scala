package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWaveRequest extends StObject {
  
  /**
    * Wave description.
    */
  var description: js.UndefOr[WaveDescription] = js.undefined
  
  /**
    * Wave name.
    */
  var name: js.UndefOr[WaveName] = js.undefined
  
  /**
    * Wave ID.
    */
  var waveID: WaveID
}
object UpdateWaveRequest {
  
  inline def apply(waveID: WaveID): UpdateWaveRequest = {
    val __obj = js.Dynamic.literal(waveID = waveID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWaveRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWaveRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: WaveDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: WaveName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWaveID(value: WaveID): Self = StObject.set(x, "waveID", value.asInstanceOf[js.Any])
  }
}
