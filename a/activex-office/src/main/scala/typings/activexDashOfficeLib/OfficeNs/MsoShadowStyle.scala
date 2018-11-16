package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoShadowStyle extends js.Object

@JSGlobal("Office.MsoShadowStyle")
@js.native
object MsoShadowStyle extends js.Object {
  @js.native
  sealed trait msoShadowStyleInnerShadow
    extends activexDashOfficeLib.OfficeNs.MsoShadowStyle
  
  @js.native
  sealed trait msoShadowStyleMixed
    extends activexDashOfficeLib.OfficeNs.MsoShadowStyle
  
  @js.native
  sealed trait msoShadowStyleOuterShadow
    extends activexDashOfficeLib.OfficeNs.MsoShadowStyle
  
  /* 1 */ val msoShadowStyleInnerShadow: msoShadowStyleInnerShadow with scala.Double = js.native
  /* -2 */ val msoShadowStyleMixed: msoShadowStyleMixed with scala.Double = js.native
  /* 2 */ val msoShadowStyleOuterShadow: msoShadowStyleOuterShadow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoShadowStyle with scala.Double] = js.native
}

