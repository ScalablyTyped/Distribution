package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BufferFromEnc extends js.Object {
  val Buffer: Anon_Alloc | (org.scalablytyped.runtime.Instantiable1[/* str */ java.lang.String, adoneLib.glossesStdMod.bufferNs.Buffer]) = js.native
  val INSPECT_MAX_BYTES: scala.Double = js.native
  val SlowBuffer: Anon_Size | (org.scalablytyped.runtime.Instantiable1[/* size */ scala.Double, adoneLib.glossesStdMod.bufferNs.SlowBuffer]) = js.native
  def transcode(
    source: nodeLib.Buffer,
    fromEnc: nodeLib.bufferMod.TranscodeEncoding,
    toEnc: nodeLib.bufferMod.TranscodeEncoding
  ): nodeLib.Buffer = js.native
  def transcode(
    source: stdLib.Uint8Array,
    fromEnc: nodeLib.bufferMod.TranscodeEncoding,
    toEnc: nodeLib.bufferMod.TranscodeEncoding
  ): nodeLib.Buffer = js.native
}

