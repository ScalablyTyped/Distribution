package typings
package asn1Lib.asn1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1", "BerReader")
@js.native
class BerReader protected () extends js.Object {
  def this(data: nodeLib.Buffer) = this()
  val _buf: nodeLib.Buffer = js.native
  var _offset: scala.Double = js.native
  var _size: scala.Double = js.native
  val buffer: nodeLib.Buffer = js.native
  val length: scala.Double = js.native
  val offset: scala.Double = js.native
  val remain: scala.Double = js.native
  def _readTag(): scala.Double = js.native
  def _readTag(tag: scala.Double): scala.Double = js.native
  def peek(): scala.Double | scala.Null = js.native
  def readBoolean(): scala.Boolean = js.native
  def readByte(peek: scala.Boolean): scala.Double | scala.Null = js.native
  def readEnumeration(): scala.Double = js.native
  def readInt(): scala.Double = js.native
  def readLength(): scala.Double = js.native
  def readLength(offset: scala.Double): scala.Double = js.native
  def readOID(): java.lang.String = js.native
  def readOID(tag: scala.Double): java.lang.String = js.native
  def readSequence(): scala.Double | scala.Null = js.native
  def readSequence(tag: scala.Double): scala.Double | scala.Null = js.native
  def readString(): java.lang.String = js.native
  def readString(tag: scala.Double): java.lang.String = js.native
  def readString(tag: scala.Double, retbuf: scala.Boolean): nodeLib.Buffer = js.native
}

