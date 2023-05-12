package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioTrackSelection extends StObject {
  
  /**
    * Configure decoding options for Dolby E streams - these should be Dolby E frames carried in PCM streams tagged with SMPTE-337
    */
  var DolbyEDecode: js.UndefOr[AudioDolbyEDecode] = js.undefined
  
  /**
    * Selects one or more unique audio tracks from within a source.
    */
  var Tracks: listOfAudioTrack
}
object AudioTrackSelection {
  
  inline def apply(Tracks: listOfAudioTrack): AudioTrackSelection = {
    val __obj = js.Dynamic.literal(Tracks = Tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrackSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioTrackSelection] (val x: Self) extends AnyVal {
    
    inline def setDolbyEDecode(value: AudioDolbyEDecode): Self = StObject.set(x, "DolbyEDecode", value.asInstanceOf[js.Any])
    
    inline def setDolbyEDecodeUndefined: Self = StObject.set(x, "DolbyEDecode", js.undefined)
    
    inline def setTracks(value: listOfAudioTrack): Self = StObject.set(x, "Tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: AudioTrack*): Self = StObject.set(x, "Tracks", js.Array(value*))
  }
}
