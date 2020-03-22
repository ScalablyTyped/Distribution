package typings.aceBuilds.mod

import org.scalablytyped.runtime.Instantiable4
import typings.aceBuilds.mod.Ace.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ace-builds", "Range")
@js.native
class Range protected ()
  extends typings.aceBuilds.mod.Ace.Range {
  def this(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double) = this()
  /* CompleteClass */
  override var end: Point = js.native
  /* CompleteClass */
  override var start: Point = js.native
  /* CompleteClass */
  override def clipRows(firstRow: Double, lastRow: Double): typings.aceBuilds.mod.Ace.Range = js.native
  /* CompleteClass */
  override def collapseRows(): typings.aceBuilds.mod.Ace.Range = js.native
  /* CompleteClass */
  override def compare(row: Double, column: Double): Double = js.native
  /* CompleteClass */
  override def compareEnd(row: Double, column: Double): Double = js.native
  /* CompleteClass */
  override def compareInside(row: Double, column: Double): Double = js.native
  /* CompleteClass */
  override def comparePoint(p: Point): Double = js.native
  /* CompleteClass */
  override def compareRange(range: typings.aceBuilds.mod.Ace.Range): Double = js.native
  /* CompleteClass */
  override def compareStart(row: Double, column: Double): Double = js.native
  /* CompleteClass */
  override def contains(row: Double, column: Double): Boolean = js.native
  /* CompleteClass */
  override def containsRange(range: typings.aceBuilds.mod.Ace.Range): Boolean = js.native
  /* CompleteClass */
  override def extend(row: Double, column: Double): typings.aceBuilds.mod.Ace.Range = js.native
  /* CompleteClass */
  override def inside(row: Double, column: Double): Boolean = js.native
  /* CompleteClass */
  override def insideEnd(row: Double, column: Double): Boolean = js.native
  /* CompleteClass */
  override def insideStart(row: Double, column: Double): Boolean = js.native
  /* CompleteClass */
  override def intersects(range: typings.aceBuilds.mod.Ace.Range): Boolean = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def isEnd(row: Double, column: Double): Boolean = js.native
  /* CompleteClass */
  override def isEqual(range: typings.aceBuilds.mod.Ace.Range): Boolean = js.native
  /* CompleteClass */
  override def isMultiLine(): Boolean = js.native
  /* CompleteClass */
  override def isStart(row: Double, column: Double): Boolean = js.native
  /* CompleteClass */
  override def moveBy(row: Double, column: Double): Unit = js.native
  /* CompleteClass */
  override def setEnd(row: Double, column: Double): Unit = js.native
  /* CompleteClass */
  override def setStart(row: Double, column: Double): Unit = js.native
  /* CompleteClass */
  override def toScreenRange(session: typings.aceBuilds.mod.Ace.EditSession): typings.aceBuilds.mod.Ace.Range = js.native
}

@JSImport("ace-builds", "Range")
@js.native
object Range
  extends Instantiable4[
      /* startRow */ Double, 
      /* startColumn */ Double, 
      /* endRow */ Double, 
      /* endColumn */ Double, 
      typings.aceBuilds.mod.Ace.Range
    ] {
  def comparePoints(p1: Point, p2: Point): Double = js.native
  def fromPoints(start: Point, end: Point): typings.aceBuilds.mod.Ace.Range = js.native
}

