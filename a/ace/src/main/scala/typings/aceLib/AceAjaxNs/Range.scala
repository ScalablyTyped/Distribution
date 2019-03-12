package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var end: Position
  var endColumn: scala.Double
  var endRow: scala.Double
  var start: Position
  var startColumn: scala.Double
  var startRow: scala.Double
  /**
    * Returns the part of the current `Range` that occurs within the boundaries of `firstRow` and `lastRow` as a new `Range` object.
    * @param firstRow The starting row
    * @param lastRow The ending row
    **/
  def clipRows(firstRow: scala.Double, lastRow: scala.Double): Range
  /**
    * Returns a range containing the starting and ending rows of the original range, but with a column value of `0`.
    **/
  def collapseRows(): Range
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def compare(row: scala.Double, column: scala.Double): scala.Double
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def compareEnd(row: scala.Double, column: scala.Double): scala.Double
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def compareInside(row: scala.Double, column: scala.Double): scala.Double
  /**
    * Checks the row and column points of `p` with the row and column points of the calling range.
    * @param p A point to compare with
    **/
  def comparePoint(p: Range): scala.Double
  /**
    * Compares `this` range (A) with another range (B).
    * @param range A range to compare with
    **/
  def compareRange(range: Range): scala.Double
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def compareStart(row: scala.Double, column: scala.Double): scala.Double
  /**
    * Returns `true` if the `row` and `column` provided are within the given range. This can better be expressed as returning `true` if:
    * ```javascript
    * this.start.row <= row <= this.end.row &&
    * this.start.column <= column <= this.end.column
    * ```
    * @param row A row to check for
    * @param column A column to check for
    **/
  def contains(row: scala.Double, column: scala.Double): scala.Boolean
  /**
    * Checks the start and end points of `range` and compares them to the calling range. Returns `true` if the `range` is contained within the caller's range.
    * @param range A range to compare with
    **/
  def containsRange(range: Range): scala.Boolean
  /**
    * Changes the row and column points for the calling range for both the starting and ending points.
    * @param row A new row to extend to
    * @param column A new column to extend to
    **/
  def extend(row: scala.Double, column: scala.Double): Range
  /**
    * Creates and returns a new `Range` based on the row and column of the given parameters.
    * @param start A starting point to use
    * @param end An ending point to use
    **/
  def fromPoints(start: Range, end: Range): Range
  /**
    * Returns `true` if the `row` and `column` are within the given range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def inside(row: scala.Double, column: scala.Double): scala.Boolean
  /**
    * Returns `true` if the `row` and `column` are within the given range's ending points.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def insideEnd(row: scala.Double, column: scala.Double): scala.Boolean
  /**
    * Returns `true` if the `row` and `column` are within the given range's starting points.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def insideStart(row: scala.Double, column: scala.Double): scala.Boolean
  /**
    * Returns `true` if passed in `range` intersects with the one calling this method.
    * @param range A range to compare with
    **/
  def intersects(range: Range): scala.Boolean
  def isEmpty(): scala.Boolean
  /**
    * Returns `true` if the caller's ending row point is the same as `row`, and if the caller's ending column is the same as `column`.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def isEnd(row: scala.Double, column: scala.Double): scala.Boolean
  /**
    * Returns `true` if and only if the starting row and column, and ending row and column, are equivalent to those given by `range`.
    * @param range A range to check against
    **/
  def isEqual(range: Range): scala.Unit
  /**
    * Returns `true` if the range spans across multiple lines.
    **/
  def isMultiLine(): scala.Boolean
  /**
    * Returns `true` if the caller's starting row point is the same as `row`, and if the caller's starting column is the same as `column`.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def isStart(row: scala.Double, column: scala.Double): scala.Boolean
  /**
    * Sets the starting row and column for the range.
    * @param row A row point to set
    * @param column A column point to set
    **/
  def setEnd(row: scala.Double, column: scala.Double): scala.Unit
  /**
    * Sets the starting row and column for the range.
    * @param row A row point to set
    * @param column A column point to set
    **/
  def setStart(row: scala.Double, column: scala.Double): scala.Unit
  /**
    * Given the current `Range`, this function converts those starting and ending points into screen positions, and then returns a new `Range` object.
    * @param session The `EditSession` to retrieve coordinates from
    **/
  def toScreenRange(session: IEditSession): Range
}

object Range {
  @scala.inline
  def apply(
    clipRows: (scala.Double, scala.Double) => Range,
    clone: () => Range,
    collapseRows: () => Range,
    compare: (scala.Double, scala.Double) => scala.Double,
    compareEnd: (scala.Double, scala.Double) => scala.Double,
    compareInside: (scala.Double, scala.Double) => scala.Double,
    comparePoint: Range => scala.Double,
    compareRange: Range => scala.Double,
    compareStart: (scala.Double, scala.Double) => scala.Double,
    contains: (scala.Double, scala.Double) => scala.Boolean,
    containsRange: Range => scala.Boolean,
    end: Position,
    endColumn: scala.Double,
    endRow: scala.Double,
    extend: (scala.Double, scala.Double) => Range,
    fromPoints: (Range, Range) => Range,
    inside: (scala.Double, scala.Double) => scala.Boolean,
    insideEnd: (scala.Double, scala.Double) => scala.Boolean,
    insideStart: (scala.Double, scala.Double) => scala.Boolean,
    intersects: Range => scala.Boolean,
    isEmpty: () => scala.Boolean,
    isEnd: (scala.Double, scala.Double) => scala.Boolean,
    isEqual: Range => scala.Unit,
    isMultiLine: () => scala.Boolean,
    isStart: (scala.Double, scala.Double) => scala.Boolean,
    setEnd: (scala.Double, scala.Double) => scala.Unit,
    setStart: (scala.Double, scala.Double) => scala.Unit,
    start: Position,
    startColumn: scala.Double,
    startRow: scala.Double,
    toScreenRange: IEditSession => Range,
    toString: () => scala.Unit
  ): Range = {
    val __obj = js.Dynamic.literal(clipRows = js.Any.fromFunction2(clipRows), clone = js.Any.fromFunction0(clone), collapseRows = js.Any.fromFunction0(collapseRows), compare = js.Any.fromFunction2(compare), compareEnd = js.Any.fromFunction2(compareEnd), compareInside = js.Any.fromFunction2(compareInside), comparePoint = js.Any.fromFunction1(comparePoint), compareRange = js.Any.fromFunction1(compareRange), compareStart = js.Any.fromFunction2(compareStart), contains = js.Any.fromFunction2(contains), containsRange = js.Any.fromFunction1(containsRange), end = end, endColumn = endColumn, endRow = endRow, extend = js.Any.fromFunction2(extend), fromPoints = js.Any.fromFunction2(fromPoints), inside = js.Any.fromFunction2(inside), insideEnd = js.Any.fromFunction2(insideEnd), insideStart = js.Any.fromFunction2(insideStart), intersects = js.Any.fromFunction1(intersects), isEmpty = js.Any.fromFunction0(isEmpty), isEnd = js.Any.fromFunction2(isEnd), isEqual = js.Any.fromFunction1(isEqual), isMultiLine = js.Any.fromFunction0(isMultiLine), isStart = js.Any.fromFunction2(isStart), setEnd = js.Any.fromFunction2(setEnd), setStart = js.Any.fromFunction2(setStart), start = start, startColumn = startColumn, startRow = startRow, toScreenRange = js.Any.fromFunction1(toScreenRange), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Range]
  }
}

