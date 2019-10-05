package typings.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.PackedObjectVector")
@js.native
class PackedObjectVector[E] protected () extends js.Object {
  def this(columns: Double) = this()
  var mColumns: js.Any = js.native
  var mRowGapLength: js.Any = js.native
  var mRowGapStart: js.Any = js.native
  var mRows: js.Any = js.native
  var mValues: js.Any = js.native
  def deleteAt(row: Double, count: Double): Unit = js.native
  def dump(): Unit = js.native
  def getValue(row: Double, column: Double): E = js.native
  /* private */ def growBuffer(): js.Any = js.native
  def insertAt(row: Double, values: js.Array[E]): Unit = js.native
  /* private */ def moveRowGapTo(where: js.Any): js.Any = js.native
  def setValue(row: Double, column: Double, value: E): Unit = js.native
  def size(): Double = js.native
  def width(): Double = js.native
}

