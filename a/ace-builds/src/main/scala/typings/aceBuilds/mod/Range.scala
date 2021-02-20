package typings.aceBuilds.mod

import typings.aceBuilds.mod.Ace.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("ace-builds", "Range")
@js.native
class Range protected ()
  extends typings.aceBuilds.mod.Ace.Range {
  def this(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double) = this()
}
object Range {
  
  @JSImport("ace-builds", "Range.comparePoints")
  @js.native
  def comparePoints(p1: Point, p2: Point): Double = js.native
  
  @JSImport("ace-builds", "Range.fromPoints")
  @js.native
  def fromPoints(start: Point, end: Point): typings.aceBuilds.mod.Ace.Range = js.native
}
