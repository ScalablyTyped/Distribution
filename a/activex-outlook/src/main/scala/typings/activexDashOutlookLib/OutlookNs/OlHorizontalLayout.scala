package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlHorizontalLayout extends js.Object

@JSGlobal("Outlook.OlHorizontalLayout")
@js.native
object OlHorizontalLayout extends js.Object {
  @js.native
  sealed trait olHorizontalLayoutAlignCenter
    extends activexDashOutlookLib.OutlookNs.OlHorizontalLayout
  
  @js.native
  sealed trait olHorizontalLayoutAlignLeft
    extends activexDashOutlookLib.OutlookNs.OlHorizontalLayout
  
  @js.native
  sealed trait olHorizontalLayoutAlignRight
    extends activexDashOutlookLib.OutlookNs.OlHorizontalLayout
  
  @js.native
  sealed trait olHorizontalLayoutGrow
    extends activexDashOutlookLib.OutlookNs.OlHorizontalLayout
  
  /* 1 */ val olHorizontalLayoutAlignCenter: olHorizontalLayoutAlignCenter with scala.Double = js.native
  /* 0 */ val olHorizontalLayoutAlignLeft: olHorizontalLayoutAlignLeft with scala.Double = js.native
  /* 2 */ val olHorizontalLayoutAlignRight: olHorizontalLayoutAlignRight with scala.Double = js.native
  /* 3 */ val olHorizontalLayoutGrow: olHorizontalLayoutGrow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlHorizontalLayout with scala.Double] = js.native
}

