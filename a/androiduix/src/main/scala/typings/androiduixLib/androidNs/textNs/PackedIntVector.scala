package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.PackedIntVector")
@js.native
class PackedIntVector protected () extends js.Object {
  def this(columns: scala.Double) = this()
  var mColumns: js.Any = js.native
  var mRowGapLength: js.Any = js.native
  var mRowGapStart: js.Any = js.native
  var mRows: js.Any = js.native
  var mValueGap: js.Any = js.native
  var mValues: js.Any = js.native
  def adjustValuesBelow(startRow: scala.Double, column: scala.Double, delta: scala.Double): scala.Unit = js.native
  def deleteAt(row: scala.Double, count: scala.Double): scala.Unit = js.native
  def getValue(row: scala.Double, column: scala.Double): scala.Double = js.native
  /* private */ def growBuffer(): js.Any = js.native
  def insertAt(row: scala.Double, values: js.Array[scala.Double]): scala.Unit = js.native
  /* private */ def moveRowGapTo(where: js.Any): js.Any = js.native
  /* private */ def moveValueGapTo(column: js.Any, where: js.Any): js.Any = js.native
  def setValue(row: scala.Double, column: scala.Double, value: scala.Double): scala.Unit = js.native
  /* private */ def setValueInternal(row: js.Any, column: js.Any, value: js.Any): js.Any = js.native
  def size(): scala.Double = js.native
  def width(): scala.Double = js.native
}

