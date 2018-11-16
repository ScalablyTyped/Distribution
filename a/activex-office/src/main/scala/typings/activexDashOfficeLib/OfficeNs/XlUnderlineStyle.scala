package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlUnderlineStyle extends js.Object

@JSGlobal("Office.XlUnderlineStyle")
@js.native
object XlUnderlineStyle extends js.Object {
  @js.native
  sealed trait xlUnderlineStyleDouble
    extends activexDashOfficeLib.OfficeNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleDoubleAccounting
    extends activexDashOfficeLib.OfficeNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleNone
    extends activexDashOfficeLib.OfficeNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleSingle
    extends activexDashOfficeLib.OfficeNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleSingleAccounting
    extends activexDashOfficeLib.OfficeNs.XlUnderlineStyle
  
  /* -4119 */ val xlUnderlineStyleDouble: xlUnderlineStyleDouble with scala.Double = js.native
  /* 5 */ val xlUnderlineStyleDoubleAccounting: xlUnderlineStyleDoubleAccounting with scala.Double = js.native
  /* -4142 */ val xlUnderlineStyleNone: xlUnderlineStyleNone with scala.Double = js.native
  /* 2 */ val xlUnderlineStyleSingle: xlUnderlineStyleSingle with scala.Double = js.native
  /* 4 */ val xlUnderlineStyleSingleAccounting: xlUnderlineStyleSingleAccounting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlUnderlineStyle with scala.Double] = js.native
}

