package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoBlogImageType extends js.Object

@JSGlobal("Office.MsoBlogImageType")
@js.native
object MsoBlogImageType extends js.Object {
  @js.native
  sealed trait msoblogImageTypeGIF
    extends activexDashOfficeLib.OfficeNs.MsoBlogImageType
  
  @js.native
  sealed trait msoblogImageTypeJPEG
    extends activexDashOfficeLib.OfficeNs.MsoBlogImageType
  
  @js.native
  sealed trait msoblogImageTypePNG
    extends activexDashOfficeLib.OfficeNs.MsoBlogImageType
  
  /* 2 */ val msoblogImageTypeGIF: msoblogImageTypeGIF with scala.Double = js.native
  /* 1 */ val msoblogImageTypeJPEG: msoblogImageTypeJPEG with scala.Double = js.native
  /* 3 */ val msoblogImageTypePNG: msoblogImageTypePNG with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoBlogImageType with scala.Double] = js.native
}

