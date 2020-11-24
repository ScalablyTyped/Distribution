package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends js.Object {
  
  def clipRows(firstRow: Double, lastRow: Double): Range = js.native
  
  def collapseRows(): Range = js.native
  
  def compare(row: Double, column: Double): Double = js.native
  
  def compareEnd(row: Double, column: Double): Double = js.native
  
  def compareInside(row: Double, column: Double): Double = js.native
  
  def comparePoint(p: Point): Double = js.native
  
  def compareRange(range: Range): Double = js.native
  
  def compareStart(row: Double, column: Double): Double = js.native
  
  def contains(row: Double, column: Double): Boolean = js.native
  
  def containsRange(range: Range): Boolean = js.native
  
  var end: Point = js.native
  
  def extend(row: Double, column: Double): Range = js.native
  
  def inside(row: Double, column: Double): Boolean = js.native
  
  def insideEnd(row: Double, column: Double): Boolean = js.native
  
  def insideStart(row: Double, column: Double): Boolean = js.native
  
  def intersects(range: Range): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isEnd(row: Double, column: Double): Boolean = js.native
  
  def isEqual(range: Range): Boolean = js.native
  
  def isMultiLine(): Boolean = js.native
  
  def isStart(row: Double, column: Double): Boolean = js.native
  
  def moveBy(row: Double, column: Double): Unit = js.native
  
  def setEnd(row: Double, column: Double): Unit = js.native
  
  def setStart(row: Double, column: Double): Unit = js.native
  
  var start: Point = js.native
  
  def toScreenRange(session: EditSession): Range = js.native
}
object Range {
  
  @scala.inline
  def apply(
    clipRows: (Double, Double) => Range,
    collapseRows: () => Range,
    compare: (Double, Double) => Double,
    compareEnd: (Double, Double) => Double,
    compareInside: (Double, Double) => Double,
    comparePoint: Point => Double,
    compareRange: Range => Double,
    compareStart: (Double, Double) => Double,
    contains: (Double, Double) => Boolean,
    containsRange: Range => Boolean,
    end: Point,
    extend: (Double, Double) => Range,
    inside: (Double, Double) => Boolean,
    insideEnd: (Double, Double) => Boolean,
    insideStart: (Double, Double) => Boolean,
    intersects: Range => Boolean,
    isEmpty: () => Boolean,
    isEnd: (Double, Double) => Boolean,
    isEqual: Range => Boolean,
    isMultiLine: () => Boolean,
    isStart: (Double, Double) => Boolean,
    moveBy: (Double, Double) => Unit,
    setEnd: (Double, Double) => Unit,
    setStart: (Double, Double) => Unit,
    start: Point,
    toScreenRange: EditSession => Range
  ): Range = {
    val __obj = js.Dynamic.literal(clipRows = js.Any.fromFunction2(clipRows), collapseRows = js.Any.fromFunction0(collapseRows), compare = js.Any.fromFunction2(compare), compareEnd = js.Any.fromFunction2(compareEnd), compareInside = js.Any.fromFunction2(compareInside), comparePoint = js.Any.fromFunction1(comparePoint), compareRange = js.Any.fromFunction1(compareRange), compareStart = js.Any.fromFunction2(compareStart), contains = js.Any.fromFunction2(contains), containsRange = js.Any.fromFunction1(containsRange), end = end.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), inside = js.Any.fromFunction2(inside), insideEnd = js.Any.fromFunction2(insideEnd), insideStart = js.Any.fromFunction2(insideStart), intersects = js.Any.fromFunction1(intersects), isEmpty = js.Any.fromFunction0(isEmpty), isEnd = js.Any.fromFunction2(isEnd), isEqual = js.Any.fromFunction1(isEqual), isMultiLine = js.Any.fromFunction0(isMultiLine), isStart = js.Any.fromFunction2(isStart), moveBy = js.Any.fromFunction2(moveBy), setEnd = js.Any.fromFunction2(setEnd), setStart = js.Any.fromFunction2(setStart), start = start.asInstanceOf[js.Any], toScreenRange = js.Any.fromFunction1(toScreenRange))
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClipRows(value: (Double, Double) => Range): Self = this.set("clipRows", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollapseRows(value: () => Range): Self = this.set("collapseRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompare(value: (Double, Double) => Double): Self = this.set("compare", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompareEnd(value: (Double, Double) => Double): Self = this.set("compareEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompareInside(value: (Double, Double) => Double): Self = this.set("compareInside", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComparePoint(value: Point => Double): Self = this.set("comparePoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompareRange(value: Range => Double): Self = this.set("compareRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompareStart(value: (Double, Double) => Double): Self = this.set("compareStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContains(value: (Double, Double) => Boolean): Self = this.set("contains", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContainsRange(value: Range => Boolean): Self = this.set("containsRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: Point): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtend(value: (Double, Double) => Range): Self = this.set("extend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInside(value: (Double, Double) => Boolean): Self = this.set("inside", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsideEnd(value: (Double, Double) => Boolean): Self = this.set("insideEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsideStart(value: (Double, Double) => Boolean): Self = this.set("insideStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIntersects(value: Range => Boolean): Self = this.set("intersects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnd(value: (Double, Double) => Boolean): Self = this.set("isEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsEqual(value: Range => Boolean): Self = this.set("isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsMultiLine(value: () => Boolean): Self = this.set("isMultiLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsStart(value: (Double, Double) => Boolean): Self = this.set("isStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMoveBy(value: (Double, Double) => Unit): Self = this.set("moveBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetEnd(value: (Double, Double) => Unit): Self = this.set("setEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetStart(value: (Double, Double) => Unit): Self = this.set("setStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStart(value: Point): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToScreenRange(value: EditSession => Range): Self = this.set("toScreenRange", js.Any.fromFunction1(value))
  }
}
