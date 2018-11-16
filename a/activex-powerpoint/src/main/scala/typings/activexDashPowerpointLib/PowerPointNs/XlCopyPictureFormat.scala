package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCopyPictureFormat extends js.Object

@JSGlobal("PowerPoint.XlCopyPictureFormat")
@js.native
object XlCopyPictureFormat extends js.Object {
  @js.native
  sealed trait xlBitmap
    extends activexDashPowerpointLib.PowerPointNs.XlCopyPictureFormat
  
  @js.native
  sealed trait xlPicture
    extends activexDashPowerpointLib.PowerPointNs.XlCopyPictureFormat
  
  /* 2 */ val xlBitmap: xlBitmap with scala.Double = js.native
  /* -4147 */ val xlPicture: xlPicture with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlCopyPictureFormat with scala.Double] = js.native
}

