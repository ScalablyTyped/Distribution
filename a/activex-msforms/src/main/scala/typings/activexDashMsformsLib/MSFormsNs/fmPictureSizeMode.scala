package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmPictureSizeMode extends js.Object

@JSGlobal("MSForms.fmPictureSizeMode")
@js.native
object fmPictureSizeMode extends js.Object {
  @js.native
  sealed trait fmPictureSizeModeClip
    extends activexDashMsformsLib.MSFormsNs.fmPictureSizeMode
  
  @js.native
  sealed trait fmPictureSizeModeStretch
    extends activexDashMsformsLib.MSFormsNs.fmPictureSizeMode
  
  @js.native
  sealed trait fmPictureSizeModeZoom
    extends activexDashMsformsLib.MSFormsNs.fmPictureSizeMode
  
  /* 0 */ val fmPictureSizeModeClip: fmPictureSizeModeClip with scala.Double = js.native
  /* 1 */ val fmPictureSizeModeStretch: fmPictureSizeModeStretch with scala.Double = js.native
  /* 3 */ val fmPictureSizeModeZoom: fmPictureSizeModeZoom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmPictureSizeMode with scala.Double] = js.native
}

