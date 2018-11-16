package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdEnclosureType extends js.Object

@JSGlobal("Word.WdEnclosureType")
@js.native
object WdEnclosureType extends js.Object {
  @js.native
  sealed trait wdEnclosureCircle
    extends activexDashWordLib.WordNs.WdEnclosureType
  
  @js.native
  sealed trait wdEnclosureDiamond
    extends activexDashWordLib.WordNs.WdEnclosureType
  
  @js.native
  sealed trait wdEnclosureSquare
    extends activexDashWordLib.WordNs.WdEnclosureType
  
  @js.native
  sealed trait wdEnclosureTriangle
    extends activexDashWordLib.WordNs.WdEnclosureType
  
  /* 0 */ val wdEnclosureCircle: wdEnclosureCircle with scala.Double = js.native
  /* 3 */ val wdEnclosureDiamond: wdEnclosureDiamond with scala.Double = js.native
  /* 1 */ val wdEnclosureSquare: wdEnclosureSquare with scala.Double = js.native
  /* 2 */ val wdEnclosureTriangle: wdEnclosureTriangle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdEnclosureType with scala.Double] = js.native
}

