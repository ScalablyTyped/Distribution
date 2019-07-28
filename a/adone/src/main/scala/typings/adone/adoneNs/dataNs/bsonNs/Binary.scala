package typings.adone.adoneNs.dataNs.bsonNs

import typings.adone.adoneNs.dataNs.bsonNs.INs.Type
import typings.adone.adoneNumbers.`true`
import typings.adone.adoneStrings.binary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a BSON Binary type
  */
@JSGlobal("adone.data.bson.Binary")
@js.native
class Binary protected () extends Type {
  def this(buffer: scala.Double) = this()
  def this(buffer: Buffer) = this()
  def this(buffer: scala.Double, subType: scala.Double) = this()
  def this(buffer: Buffer, subType: scala.Double) = this()
  /* CompleteClass */
  override var _bsontype: String = js.native
  @JSName("_bsontype")
  var _bsontype_Binary: binary = js.native
  /**
    * Returns the length of the binary
    */
  def length(): scala.Double = js.native
  /**
    * Updates this binary with `byte`
    */
  def put(byte: scala.Double): Unit = js.native
  /**
    * Reads length bytes starting at position
    */
  def read(position: scala.Double): Unit = js.native
  def read(position: scala.Double, length: scala.Double): Unit = js.native
  def toJSON(): String = js.native
  def value(): String = js.native
  /**
    * Returns the value of this binary as a string or buffer
    */
  @JSName("value")
  def value_true(asRaw: `true`): Buffer = js.native
  /**
    * Writes a buffer or string to the binary
    */
  def write(string: String): Unit = js.native
  def write(string: String, offset: scala.Double): Unit = js.native
  def write(string: Buffer): Unit = js.native
  def write(string: Buffer, offset: scala.Double): Unit = js.native
}

/* static members */
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

