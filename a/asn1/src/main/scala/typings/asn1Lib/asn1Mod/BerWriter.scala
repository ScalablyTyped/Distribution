package typings
package asn1Lib.asn1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1", "BerWriter")
@js.native
class BerWriter () extends js.Object {
  def this(options: asn1Lib.Anon_GrowthFactor) = this()
  val _buf: nodeLib.Buffer = js.native
  var _offset: scala.Double = js.native
  val _size: scala.Double = js.native
  val buffer: nodeLib.Buffer = js.native
  def _ensure(length: scala.Double): scala.Unit = js.native
  def endSequence(): scala.Unit = js.native
  def startSequence(): scala.Unit = js.native
  def startSequence(tag: scala.Double): scala.Unit = js.native
  def writeBoolean(b: scala.Boolean): scala.Unit = js.native
  def writeBoolean(b: scala.Boolean, tag: scala.Double): scala.Unit = js.native
  def writeBuffer(buf: nodeLib.Buffer, tag: scala.Double): scala.Unit = js.native
  def writeByte(b: scala.Double): scala.Unit = js.native
  def writeEnumeration(i: scala.Double): scala.Unit = js.native
  def writeEnumeration(i: scala.Double, tag: scala.Double): scala.Unit = js.native
  def writeInt(i: scala.Double): scala.Unit = js.native
  def writeInt(i: scala.Double, tag: scala.Double): scala.Unit = js.native
  def writeLength(len: scala.Double): scala.Unit = js.native
  def writeNull(): scala.Unit = js.native
  def writeOID(s: java.lang.String, tag: scala.Double): scala.Unit = js.native
  def writeString(s: java.lang.String): scala.Unit = js.native
  def writeString(s: java.lang.String, tag: scala.Double): scala.Unit = js.native
  def writeStringArray(strings: js.Array[java.lang.String]): scala.Unit = js.native
}

