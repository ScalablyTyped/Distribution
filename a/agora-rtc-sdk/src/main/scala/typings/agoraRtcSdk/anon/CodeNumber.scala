package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeNumber extends StObject {
  
  /** The event code for media stream relay.
    *
    * - 0: The user disconnects from the server due to a poor network connection.
    * - 1: The user is connected to the server.
    * - 2: The user joins the source channel.
    * - 3: The user joins the destination channel.
    * - 4: The SDK starts relaying the media stream to the destination channel.
    * - 5: The server receives the video stream from the source channel.
    * - 6: The server receives the audio stream from the source channel.
    * - 7: The destination channel is updated.
    */
  var code: Double
}
object CodeNumber {
  
  inline def apply(code: Double): CodeNumber = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeNumber]
  }
  
  extension [Self <: CodeNumber](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
