package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFlipCmd extends js.Object

@JSGlobal("Office.MsoFlipCmd")
@js.native
object MsoFlipCmd extends js.Object {
  @js.native
  sealed trait msoFlipHorizontal
    extends activexDashOfficeLib.OfficeNs.MsoFlipCmd
  
  @js.native
  sealed trait msoFlipVertical
    extends activexDashOfficeLib.OfficeNs.MsoFlipCmd
  
  /* 0 */ val msoFlipHorizontal: msoFlipHorizontal with scala.Double = js.native
  /* 1 */ val msoFlipVertical: msoFlipVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFlipCmd with scala.Double] = js.native
}

