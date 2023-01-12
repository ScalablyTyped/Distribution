package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioTrack extends StObject {
  
  /**
    * 1-based integer value that maps to a specific audio track
    */
  var Track: integerMin1
}
object AudioTrack {
  
  inline def apply(Track: integerMin1): AudioTrack = {
    val __obj = js.Dynamic.literal(Track = Track.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioTrack] (val x: Self) extends AnyVal {
    
    inline def setTrack(value: integerMin1): Self = StObject.set(x, "Track", value.asInstanceOf[js.Any])
  }
}
