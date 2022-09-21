package typings.aceBuilds.mod

import typings.aceBuilds.mod.Ace.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("ace-builds", "Range")
@js.native
open class Range protected ()
  extends StObject
     with typings.aceBuilds.mod.Ace.Range {
  def this(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double) = this()
  
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
  var end: Point = js.native
  
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
  var start: Point = js.native
  
  /* CompleteClass */
  override def toScreenRange(session: typings.aceBuilds.mod.Ace.EditSession): typings.aceBuilds.mod.Ace.Range = js.native
}
object Range {
  
  @JSImport("ace-builds", "Range")
  @js.native
  val ^ : js.Any = js.native
  
  inline def comparePoints(p1: Point, p2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("comparePoints")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fromPoints(start: Point, end: Point): typings.aceBuilds.mod.Ace.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.aceBuilds.mod.Ace.Range]
}
