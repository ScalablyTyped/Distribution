package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoTriState extends js.Object

@JSGlobal("Office.MsoTriState")
@js.native
object MsoTriState extends js.Object {
  @js.native
  sealed trait msoCTrue
    extends activexDashOfficeLib.OfficeNs.MsoTriState
  
  @js.native
  sealed trait msoFalse
    extends activexDashOfficeLib.OfficeNs.MsoTriState
  
  @js.native
  sealed trait msoTriStateMixed
    extends activexDashOfficeLib.OfficeNs.MsoTriState
  
  @js.native
  sealed trait msoTriStateToggle
    extends activexDashOfficeLib.OfficeNs.MsoTriState
  
  @js.native
  sealed trait msoTrue
    extends activexDashOfficeLib.OfficeNs.MsoTriState
  
  /* 1 */ val msoCTrue: msoCTrue with scala.Double = js.native
  /* 0 */ val msoFalse: msoFalse with scala.Double = js.native
  /* -2 */ val msoTriStateMixed: msoTriStateMixed with scala.Double = js.native
  /* -3 */ val msoTriStateToggle: msoTriStateToggle with scala.Double = js.native
  /* -1 */ val msoTrue: msoTrue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTriState with scala.Double] = js.native
}

