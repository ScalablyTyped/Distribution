package typings.applestAtem.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.applestAtem.anon.Auxs
import typings.applestAtem.anon.Channels
import typings.applestAtem.anon.NumberOfAUXs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** the current state of the vision mixer */
trait State extends StObject {
  
  /** a string representing the vision mixer model */
  var _pin: String
  
  var audio: Channels
  
  var channels: NumberDictionary[VisionChannel]
  
  /** a number representing the vision mixer model */
  var model: Double
  
  var tallys: NumberDictionary[TallyState]
  
  var topology: NumberOfAUXs
  
  var video: Auxs
}
object State {
  
  inline def apply(
    _pin: String,
    audio: Channels,
    channels: NumberDictionary[VisionChannel],
    model: Double,
    tallys: NumberDictionary[TallyState],
    topology: NumberOfAUXs,
    video: Auxs
  ): State = {
    val __obj = js.Dynamic.literal(_pin = _pin.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], tallys = tallys.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: Channels): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setChannels(value: NumberDictionary[VisionChannel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setModel(value: Double): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setTallys(value: NumberDictionary[TallyState]): Self = StObject.set(x, "tallys", value.asInstanceOf[js.Any])
    
    inline def setTopology(value: NumberOfAUXs): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: Auxs): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def set_pin(value: String): Self = StObject.set(x, "_pin", value.asInstanceOf[js.Any])
  }
}
