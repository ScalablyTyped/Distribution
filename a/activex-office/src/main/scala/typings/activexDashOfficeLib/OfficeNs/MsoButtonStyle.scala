package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoButtonStyle extends js.Object

@JSGlobal("Office.MsoButtonStyle")
@js.native
object MsoButtonStyle extends js.Object {
  @js.native
  sealed trait msoButtonAutomatic
    extends activexDashOfficeLib.OfficeNs.MsoButtonStyle
  
  @js.native
  sealed trait msoButtonCaption
    extends activexDashOfficeLib.OfficeNs.MsoButtonStyle
  
  @js.native
  sealed trait msoButtonIcon
    extends activexDashOfficeLib.OfficeNs.MsoButtonStyle
  
  @js.native
  sealed trait msoButtonIconAndCaption
    extends activexDashOfficeLib.OfficeNs.MsoButtonStyle
  
  @js.native
  sealed trait msoButtonIconAndCaptionBelow
    extends activexDashOfficeLib.OfficeNs.MsoButtonStyle
  
  @js.native
  sealed trait msoButtonIconAndWrapCaption
    extends activexDashOfficeLib.OfficeNs.MsoButtonStyle
  
  @js.native
  sealed trait msoButtonIconAndWrapCaptionBelow
    extends activexDashOfficeLib.OfficeNs.MsoButtonStyle
  
  @js.native
  sealed trait msoButtonWrapCaption
    extends activexDashOfficeLib.OfficeNs.MsoButtonStyle
  
  /* 0 */ val msoButtonAutomatic: msoButtonAutomatic with scala.Double = js.native
  /* 2 */ val msoButtonCaption: msoButtonCaption with scala.Double = js.native
  /* 1 */ val msoButtonIcon: msoButtonIcon with scala.Double = js.native
  /* 3 */ val msoButtonIconAndCaption: msoButtonIconAndCaption with scala.Double = js.native
  /* 11 */ val msoButtonIconAndCaptionBelow: msoButtonIconAndCaptionBelow with scala.Double = js.native
  /* 7 */ val msoButtonIconAndWrapCaption: msoButtonIconAndWrapCaption with scala.Double = js.native
  /* 15 */ val msoButtonIconAndWrapCaptionBelow: msoButtonIconAndWrapCaptionBelow with scala.Double = js.native
  /* 14 */ val msoButtonWrapCaption: msoButtonWrapCaption with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoButtonStyle with scala.Double] = js.native
}

