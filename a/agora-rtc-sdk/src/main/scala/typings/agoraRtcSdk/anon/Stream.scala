package typings.agoraRtcSdk.anon

import typings.agoraRtcSdk.mod.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stream extends StObject {
  
  /**
    * (Optional) Specifies a [[MediaStream]] object.
    *
    * If this parameter is empty, this method gets the supported decoding formats of the web browser as the receiver.
    * Otherwise the method gets the supported encoding formats as the sender. In most cases, the supported decoding and encoding formats are the same.
    */
  var stream: MediaStream
}
object Stream {
  
  inline def apply(stream: MediaStream): Stream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
  
  extension [Self <: Stream](x: Self) {
    
    inline def setStream(value: MediaStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
