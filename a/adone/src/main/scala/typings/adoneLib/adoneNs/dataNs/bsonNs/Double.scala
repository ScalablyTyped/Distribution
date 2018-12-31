package typings
package adoneLib.adoneNs.dataNs.bsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents BSON Double type
  */
@JSGlobal("adone.data.bson.Double")
@js.native
class Double protected ()
  extends adoneLib.adoneNs.dataNs.bsonNs.INs.Type {
  def this(value: scala.Double) = this()
  /* CompleteClass */
  override var _bsontype: java.lang.String = js.native
  @JSName("_bsontype")
  var _bsontype_Double: adoneLib.adoneLibStrings.Double = js.native
  def toJSON(): scala.Double = js.native
}

