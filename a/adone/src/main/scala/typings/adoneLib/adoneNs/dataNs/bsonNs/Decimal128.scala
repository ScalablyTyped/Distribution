package typings
package adoneLib.adoneNs.dataNs.bsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents BSON Decimal128 type
  */
@JSGlobal("adone.data.bson.Decimal128")
@js.native
class Decimal128 protected ()
  extends adoneLib.adoneNs.dataNs.bsonNs.INs.Type {
  /**
    * @param bytes a buffer containing the raw Decimal128 bytes
    */
  def this(bytes: nodeLib.Buffer) = this()
  /* CompleteClass */
  override var _bsontype: java.lang.String = js.native
  @JSName("_bsontype")
  var _bsontype_Decimal128: adoneLib.adoneLibStrings.Decimal128 = js.native
  def toJSON(): adoneLib.Anon_NumberDecimal = js.native
}

/* static members */
@JSGlobal("adone.data.bson.Decimal128")
@js.native
object Decimal128 extends js.Object {
  /**
    * Create a Decimal128 instance from a string representation
    *
    * @param string a numeric string representation
    */
  def fromString(string: java.lang.String): adoneLib.adoneNs.dataNs.bsonNs.Decimal128 = js.native
}

