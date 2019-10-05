package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AceAjax.Range")
@js.native
class RangeCls protected () extends Range {
  def this(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double) = this()
  /* CompleteClass */
  override var end: Position = js.native
  /* CompleteClass */
  override var endColumn: Double = js.native
  /* CompleteClass */
  override var endRow: Double = js.native
  /* CompleteClass */
  override var start: Position = js.native
  /* CompleteClass */
  override var startColumn: Double = js.native
  /* CompleteClass */
  override var startRow: Double = js.native
  /**
    * Returns the part of the current `Range` that occurs within the boundaries of `firstRow` and `lastRow` as a new `Range` object.
    * @param firstRow The starting row
    * @param lastRow The ending row
    **/
  /* CompleteClass */
  override def clipRows(firstRow: Double, lastRow: Double): Range = js.native
  /**
    * Returns a range containing the starting and ending rows of the original range, but with a column value of `0`.
    **/
  /* CompleteClass */
  override def collapseRows(): Range = js.native
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def compare(row: Double, column: Double): Double = js.native
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def compareEnd(row: Double, column: Double): Double = js.native
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def compareInside(row: Double, column: Double): Double = js.native
  /**
    * Checks the row and column points of `p` with the row and column points of the calling range.
    * @param p A point to compare with
    **/
  /* CompleteClass */
  override def comparePoint(p: Range): Double = js.native
  /**
    * Compares `this` range (A) with another range (B).
    * @param range A range to compare with
    **/
  /* CompleteClass */
  override def compareRange(range: Range): Double = js.native
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def compareStart(row: Double, column: Double): Double = js.native
  /**
    * Returns `true` if the `row` and `column` provided are within the given range. This can better be expressed as returning `true` if:
    * ```javascript
    * this.start.row <= row <= this.end.row &&
    * this.start.column <= column <= this.end.column
    * ```
    * @param row A row to check for
    * @param column A column to check for
    **/
  /* CompleteClass */
  override def contains(row: Double, column: Double): Boolean = js.native
  /**
    * Checks the start and end points of `range` and compares them to the calling range. Returns `true` if the `range` is contained within the caller's range.
    * @param range A range to compare with
    **/
  /* CompleteClass */
  override def containsRange(range: Range): Boolean = js.native
  /**
    * Changes the row and column points for the calling range for both the starting and ending points.
    * @param row A new row to extend to
    * @param column A new column to extend to
    **/
  /* CompleteClass */
  override def extend(row: Double, column: Double): Range = js.native
  /**
    * Creates and returns a new `Range` based on the row and column of the given parameters.
    * @param start A starting point to use
    * @param end An ending point to use
    **/
  /* CompleteClass */
  override def fromPoints(start: Range, end: Range): Range = js.native
  /**
    * Returns `true` if the `row` and `column` are within the given range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def inside(row: Double, column: Double): Boolean = js.native
  /**
    * Returns `true` if the `row` and `column` are within the given range's ending points.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def insideEnd(row: Double, column: Double): Boolean = js.native
  /**
    * Returns `true` if the `row` and `column` are within the given range's starting points.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def insideStart(row: Double, column: Double): Boolean = js.native
  /**
    * Returns `true` if passed in `range` intersects with the one calling this method.
    * @param range A range to compare with
    **/
  /* CompleteClass */
  override def intersects(range: Range): Boolean = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /**
    * Returns `true` if the caller's ending row point is the same as `row`, and if the caller's ending column is the same as `column`.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def isEnd(row: Double, column: Double): Boolean = js.native
  /**
    * Returns `true` if and only if the starting row and column, and ending row and column, are equivalent to those given by `range`.
    * @param range A range to check against
    **/
  /* CompleteClass */
  override def isEqual(range: Range): Unit = js.native
  /**
    * Returns `true` if the range spans across multiple lines.
    **/
  /* CompleteClass */
  override def isMultiLine(): Boolean = js.native
  /**
    * Returns `true` if the caller's starting row point is the same as `row`, and if the caller's starting column is the same as `column`.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def isStart(row: Double, column: Double): Boolean = js.native
  /**
    * Sets the starting row and column for the range.
    * @param row A row point to set
    * @param column A column point to set
    **/
  /* CompleteClass */
  override def setEnd(row: Double, column: Double): Unit = js.native
  /**
    * Sets the starting row and column for the range.
    * @param row A row point to set
    * @param column A column point to set
    **/
  /* CompleteClass */
  override def setStart(row: Double, column: Double): Unit = js.native
  /**
    * Given the current `Range`, this function converts those starting and ending points into screen positions, and then returns a new `Range` object.
    * @param session The `EditSession` to retrieve coordinates from
    **/
  /* CompleteClass */
  override def toScreenRange(session: IEditSession): Range = js.native
}

