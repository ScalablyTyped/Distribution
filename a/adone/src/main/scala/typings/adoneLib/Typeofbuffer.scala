package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbuffer extends js.Object {
  val Buffer: (org.scalablytyped.runtime.Instantiable1[/* str */ java.lang.String, adoneLib.glossesStdMod.bufferNs.Buffer]) | TypeofClassBuffer
  val INSPECT_MAX_BYTES: scala.Double
  val SlowBuffer: Anon_Size | (org.scalablytyped.runtime.Instantiable1[/* size */ scala.Double, adoneLib.glossesStdMod.bufferNs.SlowBuffer])
  val constants: Anon_MAXLENGTH
  val kMaxLength: scala.Double
  val kStringMaxLength: scala.Double
  def transcode(
    source: stdLib.Uint8Array,
    fromEnc: nodeLib.bufferMod.TranscodeEncoding,
    toEnc: nodeLib.bufferMod.TranscodeEncoding
  ): nodeLib.Buffer
}

object Typeofbuffer {
  @scala.inline
  def apply(
    Buffer: TypeofClassBuffer,
    INSPECT_MAX_BYTES: scala.Double,
    SlowBuffer: Anon_Size,
    constants: Anon_MAXLENGTH,
    kMaxLength: scala.Double,
    kStringMaxLength: scala.Double,
    transcode: (stdLib.Uint8Array, nodeLib.bufferMod.TranscodeEncoding, nodeLib.bufferMod.TranscodeEncoding) => nodeLib.Buffer
  ): Typeofbuffer = {
    val __obj = js.Dynamic.literal(Buffer = Buffer, INSPECT_MAX_BYTES = INSPECT_MAX_BYTES, SlowBuffer = SlowBuffer, constants = constants, kMaxLength = kMaxLength, kStringMaxLength = kStringMaxLength, transcode = js.Any.fromFunction3(transcode))
  
    __obj.asInstanceOf[Typeofbuffer]
  }
}

