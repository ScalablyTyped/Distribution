package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoPictureColorType extends js.Object

@JSGlobal("Office.MsoPictureColorType")
@js.native
object MsoPictureColorType extends js.Object {
  @js.native
  sealed trait msoPictureAutomatic
    extends activexDashOfficeLib.OfficeNs.MsoPictureColorType
  
  @js.native
  sealed trait msoPictureBlackAndWhite
    extends activexDashOfficeLib.OfficeNs.MsoPictureColorType
  
  @js.native
  sealed trait msoPictureGrayscale
    extends activexDashOfficeLib.OfficeNs.MsoPictureColorType
  
  @js.native
  sealed trait msoPictureMixed
    extends activexDashOfficeLib.OfficeNs.MsoPictureColorType
  
  @js.native
  sealed trait msoPictureWatermark
    extends activexDashOfficeLib.OfficeNs.MsoPictureColorType
  
  /* 1 */ val msoPictureAutomatic: msoPictureAutomatic with scala.Double = js.native
  /* 3 */ val msoPictureBlackAndWhite: msoPictureBlackAndWhite with scala.Double = js.native
  /* 2 */ val msoPictureGrayscale: msoPictureGrayscale with scala.Double = js.native
  /* -2 */ val msoPictureMixed: msoPictureMixed with scala.Double = js.native
  /* 4 */ val msoPictureWatermark: msoPictureWatermark with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoPictureColorType with scala.Double] = js.native
}

