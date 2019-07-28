package typings.adone.adoneNs.dataNs.bsonNs

import typings.adone.adoneNs.dataNs.bsonNs.INs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents BSON Double type
  */
@JSGlobal("adone.data.bson.Double")
@js.native
class Double protected () extends Type {
  def this(value: scala.Double) = this()
  /* CompleteClass */
  override var _bsontype: String = js.native
  @JSName("_bsontype")
  var _bsontype_Double: typings.adone.adoneStrings.Double = js.native
  def toJSON(): scala.Double = js.native
}

