package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoPictureCompress extends js.Object

@JSGlobal("Office.MsoPictureCompress")
@js.native
object MsoPictureCompress extends js.Object {
  @js.native
  sealed trait msoPictureCompressDocDefault
    extends activexDashOfficeLib.OfficeNs.MsoPictureCompress
  
  @js.native
  sealed trait msoPictureCompressFalse
    extends activexDashOfficeLib.OfficeNs.MsoPictureCompress
  
  @js.native
  sealed trait msoPictureCompressTrue
    extends activexDashOfficeLib.OfficeNs.MsoPictureCompress
  
  /* -1 */ val msoPictureCompressDocDefault: msoPictureCompressDocDefault with scala.Double = js.native
  /* 0 */ val msoPictureCompressFalse: msoPictureCompressFalse with scala.Double = js.native
  /* 1 */ val msoPictureCompressTrue: msoPictureCompressTrue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoPictureCompress with scala.Double] = js.native
}

