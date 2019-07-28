package typings.adone.adoneNs.dataNs.bsonNs

import typings.adone.Anon_NumberDecimal
import typings.adone.adoneNs.dataNs.bsonNs.INs.Type
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents BSON Decimal128 type
  */
@JSGlobal("adone.data.bson.Decimal128")
@js.native
class Decimal128 protected () extends Type {
  /**
    * @param bytes a buffer containing the raw Decimal128 bytes
    */
  def this(bytes: Buffer) = this()
  /* CompleteClass */
  override var _bsontype: String = js.native
  @JSName("_bsontype")
  var _bsontype_Decimal128: typings.adone.adoneStrings.Decimal128 = js.native
  def toJSON(): Anon_NumberDecimal = js.native
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
  def fromString(string: String): Decimal128 = js.native
}

