package typings.aceBuilds.mod.Ace

import typings.aceBuilds.AnonFold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldLine extends js.Object {
  var end: Point = js.native
  var folds: js.Array[Fold] = js.native
  var range: Range = js.native
  var start: Point = js.native
  def addFold(fold: Fold): Unit = js.native
  def addRemoveChars(row: Double, column: Double, len: Double): Unit = js.native
  def containsRow(row: Double): Boolean = js.native
  def getNextFoldTo(row: Double, column: Double): Null | AnonFold = js.native
  def idxToPosition(idx: Double): Point = js.native
  def merge(foldLineNext: FoldLine): Unit = js.native
  def shiftRow(shift: Double): Unit = js.native
  def split(row: Double, column: Double): FoldLine = js.native
  def walk(callback: js.Function): Unit = js.native
  def walk(callback: js.Function, endRow: Double): Unit = js.native
  def walk(callback: js.Function, endRow: Double, endColumn: Double): Unit = js.native
}

