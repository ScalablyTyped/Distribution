package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcPictureCaptionArrangement extends js.Object

@JSGlobal("Access.AcPictureCaptionArrangement")
@js.native
object AcPictureCaptionArrangement extends js.Object {
  @js.native
  sealed trait acBottom
    extends activexDashAccessLib.AccessNs.AcPictureCaptionArrangement
  
  @js.native
  sealed trait acGeneral
    extends activexDashAccessLib.AccessNs.AcPictureCaptionArrangement
  
  @js.native
  sealed trait acLeft
    extends activexDashAccessLib.AccessNs.AcPictureCaptionArrangement
  
  @js.native
  sealed trait acNoPictureCaption
    extends activexDashAccessLib.AccessNs.AcPictureCaptionArrangement
  
  @js.native
  sealed trait acRight
    extends activexDashAccessLib.AccessNs.AcPictureCaptionArrangement
  
  @js.native
  sealed trait acTop
    extends activexDashAccessLib.AccessNs.AcPictureCaptionArrangement
  
  /* 3 */ val acBottom: acBottom with scala.Double = js.native
  /* 1 */ val acGeneral: acGeneral with scala.Double = js.native
  /* 4 */ val acLeft: acLeft with scala.Double = js.native
  /* 0 */ val acNoPictureCaption: acNoPictureCaption with scala.Double = js.native
  /* 5 */ val acRight: acRight with scala.Double = js.native
  /* 2 */ val acTop: acTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcPictureCaptionArrangement with scala.Double] = js.native
}

