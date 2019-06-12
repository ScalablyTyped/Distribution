package typings
package agoraDashRtcDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stream extends js.Object {
  /**
    * (Optional) Specifies a [[MediaStream]] object.
    *
    * If this parameter is empty, this method gets the supported decoding formats of the web browser as the receiver.
    * Otherwise the method gets the supported encoding formats as the sender. In most cases, the supported decoding and encoding formats are the same.
    */
  var stream: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod.MediaStream
}

object Anon_Stream {
  @scala.inline
  def apply(stream: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod.MediaStream): Anon_Stream = {
    val __obj = js.Dynamic.literal(stream = stream)
  
    __obj.asInstanceOf[Anon_Stream]
  }
}

