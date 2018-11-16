package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.PackedObjectVector")
@js.native
class PackedObjectVector[E] protected () extends js.Object {
  def this(columns: scala.Double) = this()
  var mColumns: js.Any = js.native
  var mRowGapLength: js.Any = js.native
  var mRowGapStart: js.Any = js.native
  var mRows: js.Any = js.native
  var mValues: js.Any = js.native
  def deleteAt(row: scala.Double, count: scala.Double): scala.Unit = js.native
  def dump(): scala.Unit = js.native
  def getValue(row: scala.Double, column: scala.Double): E = js.native
  /* private */ def growBuffer(): js.Any = js.native
  def insertAt(row: scala.Double, values: js.Array[E]): scala.Unit = js.native
  /* private */ def moveRowGapTo(where: js.Any): js.Any = js.native
  def setValue(row: scala.Double, column: scala.Double, value: E): scala.Unit = js.native
  def size(): scala.Double = js.native
  def width(): scala.Double = js.native
}

