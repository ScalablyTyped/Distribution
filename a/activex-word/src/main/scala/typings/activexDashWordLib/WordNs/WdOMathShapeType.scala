package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOMathShapeType extends js.Object

@JSGlobal("Word.WdOMathShapeType")
@js.native
object WdOMathShapeType extends js.Object {
  @js.native
  sealed trait wdOMathShapeCentered
    extends activexDashWordLib.WordNs.WdOMathShapeType
  
  @js.native
  sealed trait wdOMathShapeMatch
    extends activexDashWordLib.WordNs.WdOMathShapeType
  
  /* 0 */ val wdOMathShapeCentered: wdOMathShapeCentered with scala.Double = js.native
  /* 1 */ val wdOMathShapeMatch: wdOMathShapeMatch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOMathShapeType with scala.Double] = js.native
}

