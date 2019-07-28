package typings.asn1.asn1Mod

import typings.asn1.Anon_GrowthFactor
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1", "BerWriter")
@js.native
class BerWriter () extends js.Object {
  def this(options: Anon_GrowthFactor) = this()
  val _buf: Buffer = js.native
  var _offset: Double = js.native
  val _size: Double = js.native
  val buffer: Buffer = js.native
  def _ensure(length: Double): Unit = js.native
  def endSequence(): Unit = js.native
  def startSequence(): Unit = js.native
  def startSequence(tag: Double): Unit = js.native
  def writeBoolean(b: Boolean): Unit = js.native
  def writeBoolean(b: Boolean, tag: Double): Unit = js.native
  def writeBuffer(buf: Buffer, tag: Double): Unit = js.native
  def writeByte(b: Double): Unit = js.native
  def writeEnumeration(i: Double): Unit = js.native
  def writeEnumeration(i: Double, tag: Double): Unit = js.native
  def writeInt(i: Double): Unit = js.native
  def writeInt(i: Double, tag: Double): Unit = js.native
  def writeLength(len: Double): Unit = js.native
  def writeNull(): Unit = js.native
  def writeOID(s: String, tag: Double): Unit = js.native
  def writeString(s: String): Unit = js.native
  def writeString(s: String, tag: Double): Unit = js.native
  def writeStringArray(strings: js.Array[String]): Unit = js.native
}

