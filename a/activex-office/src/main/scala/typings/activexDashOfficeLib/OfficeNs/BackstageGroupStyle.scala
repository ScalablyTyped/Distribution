package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackstageGroupStyle extends js.Object

@JSGlobal("Office.BackstageGroupStyle")
@js.native
object BackstageGroupStyle extends js.Object {
  @js.native
  sealed trait BackstageGroupStyleError
    extends activexDashOfficeLib.OfficeNs.BackstageGroupStyle
  
  @js.native
  sealed trait BackstageGroupStyleNormal
    extends activexDashOfficeLib.OfficeNs.BackstageGroupStyle
  
  @js.native
  sealed trait BackstageGroupStyleWarning
    extends activexDashOfficeLib.OfficeNs.BackstageGroupStyle
  
  /* 2 */ val BackstageGroupStyleError: BackstageGroupStyleError with scala.Double = js.native
  /* 0 */ val BackstageGroupStyleNormal: BackstageGroupStyleNormal with scala.Double = js.native
  /* 1 */ val BackstageGroupStyleWarning: BackstageGroupStyleWarning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.BackstageGroupStyle with scala.Double] = js.native
}

