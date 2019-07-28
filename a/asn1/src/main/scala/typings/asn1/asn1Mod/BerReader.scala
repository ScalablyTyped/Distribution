package typings.asn1.asn1Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1", "BerReader")
@js.native
class BerReader protected () extends js.Object {
  def this(data: Buffer) = this()
  val _buf: Buffer = js.native
  var _offset: Double = js.native
  var _size: Double = js.native
  val buffer: Buffer = js.native
  val length: Double = js.native
  val offset: Double = js.native
  val remain: Double = js.native
  def _readTag(): Double = js.native
  def _readTag(tag: Double): Double = js.native
  def peek(): Double | Null = js.native
  def readBoolean(): Boolean = js.native
  def readByte(peek: Boolean): Double | Null = js.native
  def readEnumeration(): Double = js.native
  def readInt(): Double = js.native
  def readLength(): Double = js.native
  def readLength(offset: Double): Double = js.native
  def readOID(): String = js.native
  def readOID(tag: Double): String = js.native
  def readSequence(): Double | Null = js.native
  def readSequence(tag: Double): Double | Null = js.native
  def readString(): String = js.native
  def readString(tag: Double): String = js.native
  def readString(tag: Double, retbuf: Boolean): Buffer = js.native
}

