package typings.adone.adoneNs.dataNs.bsonNs

import typings.adone.adoneNs.dataNs.bsonNs.INs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents BSON Symbol type
  */
@JSGlobal("adone.data.bson.Symbol")
@js.native
class Symbol protected () extends Type {
  def this(value: String) = this()
  /* CompleteClass */
  override var _bsontype: String = js.native
  @JSName("_bsontype")
  var _bsontype_Symbol: typings.adone.adoneStrings.Symbol = js.native
  def inspect(): String = js.native
  def toJSON(): String = js.native
}

