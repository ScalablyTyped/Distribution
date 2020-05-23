package typings.ace.global.AceAjax

import org.scalablytyped.runtime.Instantiable4
import typings.ace.AceAjax.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new `Range` object with the given starting and ending row and column points.
  * @param startRow The starting row
  * @param startColumn The starting column
  * @param endRow The ending row
  * @param endColumn The ending column
  **/
@JSGlobal("AceAjax.Range")
@js.native
object Range
  extends Instantiable4[
      /* startRow */ Double, 
      /* startColumn */ Double, 
      /* endRow */ Double, 
      /* endColumn */ Double, 
      typings.ace.AceAjax.Range
    ] {
  def fromPoints(pos1: Position, pos2: Position): typings.ace.AceAjax.Range = js.native
}

