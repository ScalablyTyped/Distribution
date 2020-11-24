package typings.aceBuilds.mod

import org.scalablytyped.runtime.Instantiable4
import typings.aceBuilds.mod.Ace.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ace-builds", "Range")
@js.native
class Range protected ()
  extends typings.aceBuilds.mod.Ace.Range {
  def this(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double) = this()
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
