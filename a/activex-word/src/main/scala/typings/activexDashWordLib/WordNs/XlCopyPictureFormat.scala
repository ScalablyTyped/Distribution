package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCopyPictureFormat extends js.Object

@JSGlobal("Word.XlCopyPictureFormat")
@js.native
object XlCopyPictureFormat extends js.Object {
  @js.native
  sealed trait xlBitmap
    extends activexDashWordLib.WordNs.XlCopyPictureFormat
  
  @js.native
  sealed trait xlPicture
    extends activexDashWordLib.WordNs.XlCopyPictureFormat
  
  /* 2 */ val xlBitmap: xlBitmap with scala.Double = js.native
  /* -4147 */ val xlPicture: xlPicture with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlCopyPictureFormat with scala.Double] = js.native
}

