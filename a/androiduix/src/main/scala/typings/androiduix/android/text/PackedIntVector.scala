package typings.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.PackedIntVector")
@js.native
class PackedIntVector protected () extends js.Object {
  def this(columns: Double) = this()
  var mColumns: js.Any = js.native
  var mRowGapLength: js.Any = js.native
  var mRowGapStart: js.Any = js.native
  var mRows: js.Any = js.native
  var mValueGap: js.Any = js.native
  var mValues: js.Any = js.native
  def adjustValuesBelow(startRow: Double, column: Double, delta: Double): Unit = js.native
  def deleteAt(row: Double, count: Double): Unit = js.native
  def getValue(row: Double, column: Double): Double = js.native
  /* private */ def growBuffer(): js.Any = js.native
  def insertAt(row: Double, values: js.Array[Double]): Unit = js.native
  /* private */ def moveRowGapTo(where: js.Any): js.Any = js.native
  /* private */ def moveValueGapTo(column: js.Any, where: js.Any): js.Any = js.native
  def setValue(row: Double, column: Double, value: Double): Unit = js.native
  /* private */ def setValueInternal(row: js.Any, column: js.Any, value: js.Any): js.Any = js.native
  def size(): Double = js.native
  def width(): Double = js.native
}

