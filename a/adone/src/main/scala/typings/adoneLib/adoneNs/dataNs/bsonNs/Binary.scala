package typings
package adoneLib.adoneNs.dataNs.bsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a BSON Binary type
  */
@JSGlobal("adone.data.bson.Binary")
@js.native
class Binary protected ()
  extends adoneLib.adoneNs.dataNs.bsonNs.INs.Type {
  def this(buffer: nodeLib.Buffer) = this()
  def this(buffer: scala.Double) = this()
  def this(buffer: nodeLib.Buffer, subType: scala.Double) = this()
  def this(buffer: scala.Double, subType: scala.Double) = this()
  /* CompleteClass */
  override var _bsontype: java.lang.String = js.native
  @JSName("_bsontype")
  var _bsontype_Binary: adoneLib.adoneLibStrings.binary = js.native
  /**
    * Returns the length of the binary
    */
  def length(): scala.Double = js.native
  /**
    * Updates this binary with `byte`
    */
  def put(byte: scala.Double): scala.Unit = js.native
  /**
    * Reads length bytes starting at position
    */
  def read(position: scala.Double): scala.Unit = js.native
  def read(position: scala.Double, length: scala.Double): scala.Unit = js.native
  def toJSON(): java.lang.String = js.native
  def value(): java.lang.String = js.native
  /**
    * Returns the value of this binary as a string or buffer
    */
  def value(asRaw: adoneLib.adoneLibNumbers.`true`): nodeLib.Buffer = js.native
  /**
    * Writes a buffer or string to the binary
    */
  def write(string: java.lang.String): scala.Unit = js.native
  def write(string: java.lang.String, offset: scala.Double): scala.Unit = js.native
  def write(string: nodeLib.Buffer): scala.Unit = js.native
  def write(string: nodeLib.Buffer, offset: scala.Double): scala.Unit = js.native
}

/**
  * Represents a BSON Binary type
  */
@JSGlobal("adone.data.bson.Binary")
@js.native
object Binary extends js.Object {
  var BUFFER_SIZE: scala.Double = js.native
  var SUBTYPE_BYTE_ARRAY: scala.Double = js.native
  var SUBTYPE_DEFAULT: scala.Double = js.native
  var SUBTYPE_FUNCTION: scala.Double = js.native
  var SUBTYPE_MD5: scala.Double = js.native
  var SUBTYPE_USER_DEFINED: scala.Double = js.native
  var SUBTYPE_UUID: scala.Double = js.native
  var SUBTYPE_UUID_OLD: scala.Double = js.native
}

