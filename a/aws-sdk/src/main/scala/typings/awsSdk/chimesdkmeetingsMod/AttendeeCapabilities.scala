package typings.awsSdk.chimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttendeeCapabilities extends StObject {
  
  /**
    * The audio capability assigned to an attendee.
    */
  var Audio: MediaCapabilities
  
  /**
    * The content capability assigned to an attendee.
    */
  var Content: MediaCapabilities
  
  /**
    * The video capability assigned to an attendee.
    */
  var Video: MediaCapabilities
}
object AttendeeCapabilities {
  
  inline def apply(Audio: MediaCapabilities, Content: MediaCapabilities, Video: MediaCapabilities): AttendeeCapabilities = {
    val __obj = js.Dynamic.literal(Audio = Audio.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttendeeCapabilities]
  }
  
  extension [Self <: AttendeeCapabilities](x: Self) {
    
    inline def setAudio(value: MediaCapabilities): Self = StObject.set(x, "Audio", value.asInstanceOf[js.Any])
    
    inline def setContent(value: MediaCapabilities): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: MediaCapabilities): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
  }
}
