package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoTextCharWrap extends js.Object

@JSGlobal("Office.MsoTextCharWrap")
@js.native
object MsoTextCharWrap extends js.Object {
  @js.native
  sealed trait msoCharWrapMixed
    extends activexDashOfficeLib.OfficeNs.MsoTextCharWrap
  
  @js.native
  sealed trait msoCustomCharWrap
    extends activexDashOfficeLib.OfficeNs.MsoTextCharWrap
  
  @js.native
  sealed trait msoNoCharWrap
    extends activexDashOfficeLib.OfficeNs.MsoTextCharWrap
  
  @js.native
  sealed trait msoStandardCharWrap
    extends activexDashOfficeLib.OfficeNs.MsoTextCharWrap
  
  @js.native
  sealed trait msoStrictCharWrap
    extends activexDashOfficeLib.OfficeNs.MsoTextCharWrap
  
  /* -2 */ val msoCharWrapMixed: msoCharWrapMixed with scala.Double = js.native
  /* 3 */ val msoCustomCharWrap: msoCustomCharWrap with scala.Double = js.native
  /* 0 */ val msoNoCharWrap: msoNoCharWrap with scala.Double = js.native
  /* 1 */ val msoStandardCharWrap: msoStandardCharWrap with scala.Double = js.native
  /* 2 */ val msoStrictCharWrap: msoStrictCharWrap with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTextCharWrap with scala.Double] = js.native
}

