package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlVAlign extends js.Object

@JSGlobal("Office.XlVAlign")
@js.native
object XlVAlign extends js.Object {
  @js.native
  sealed trait xlVAlignBottom
    extends activexDashOfficeLib.OfficeNs.XlVAlign
  
  @js.native
  sealed trait xlVAlignCenter
    extends activexDashOfficeLib.OfficeNs.XlVAlign
  
  @js.native
  sealed trait xlVAlignDistributed
    extends activexDashOfficeLib.OfficeNs.XlVAlign
  
  @js.native
  sealed trait xlVAlignJustify
    extends activexDashOfficeLib.OfficeNs.XlVAlign
  
  @js.native
  sealed trait xlVAlignTop
    extends activexDashOfficeLib.OfficeNs.XlVAlign
  
  /* -4107 */ val xlVAlignBottom: xlVAlignBottom with scala.Double = js.native
  /* -4108 */ val xlVAlignCenter: xlVAlignCenter with scala.Double = js.native
  /* -4117 */ val xlVAlignDistributed: xlVAlignDistributed with scala.Double = js.native
  /* -4130 */ val xlVAlignJustify: xlVAlignJustify with scala.Double = js.native
  /* -4160 */ val xlVAlignTop: xlVAlignTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlVAlign with scala.Double] = js.native
}

