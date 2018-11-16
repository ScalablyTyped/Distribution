package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlVerticalLayout extends js.Object

@JSGlobal("Outlook.OlVerticalLayout")
@js.native
object OlVerticalLayout extends js.Object {
  @js.native
  sealed trait olVerticalLayoutAlignBottom
    extends activexDashOutlookLib.OutlookNs.OlVerticalLayout
  
  @js.native
  sealed trait olVerticalLayoutAlignMiddle
    extends activexDashOutlookLib.OutlookNs.OlVerticalLayout
  
  @js.native
  sealed trait olVerticalLayoutAlignTop
    extends activexDashOutlookLib.OutlookNs.OlVerticalLayout
  
  @js.native
  sealed trait olVerticalLayoutGrow
    extends activexDashOutlookLib.OutlookNs.OlVerticalLayout
  
  /* 2 */ val olVerticalLayoutAlignBottom: olVerticalLayoutAlignBottom with scala.Double = js.native
  /* 1 */ val olVerticalLayoutAlignMiddle: olVerticalLayoutAlignMiddle with scala.Double = js.native
  /* 0 */ val olVerticalLayoutAlignTop: olVerticalLayoutAlignTop with scala.Double = js.native
  /* 3 */ val olVerticalLayoutGrow: olVerticalLayoutGrow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlVerticalLayout with scala.Double] = js.native
}

