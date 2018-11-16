package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlSolutionScope extends js.Object

@JSGlobal("Outlook.OlSolutionScope")
@js.native
object OlSolutionScope extends js.Object {
  @js.native
  sealed trait olHideInDefaultModules
    extends activexDashOutlookLib.OutlookNs.OlSolutionScope
  
  @js.native
  sealed trait olShowInDefaultModules
    extends activexDashOutlookLib.OutlookNs.OlSolutionScope
  
  /* 0 */ val olHideInDefaultModules: olHideInDefaultModules with scala.Double = js.native
  /* 1 */ val olShowInDefaultModules: olShowInDefaultModules with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlSolutionScope with scala.Double] = js.native
}

