package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamStream extends StObject {
  
  /**
    * The stream that adds or removes a track:
    * - `video`: boolean, marks whether the stream contains a video track.
    * - `audio`: boolean, marks whether the stream contains an audio track.
    */
  var stream: typings.agoraRtcSdk.mod.Stream
}
object StreamStream {
  
  inline def apply(stream: typings.agoraRtcSdk.mod.Stream): StreamStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamStream]
  }
  
  extension [Self <: StreamStream](x: Self) {
    
    inline def setStream(value: typings.agoraRtcSdk.mod.Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
