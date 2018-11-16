package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdBrowserLevel extends js.Object

@JSGlobal("Word.WdBrowserLevel")
@js.native
object WdBrowserLevel extends js.Object {
  @js.native
  sealed trait wdBrowserLevelMicrosoftInternetExplorer5
    extends activexDashWordLib.WordNs.WdBrowserLevel
  
  @js.native
  sealed trait wdBrowserLevelMicrosoftInternetExplorer6
    extends activexDashWordLib.WordNs.WdBrowserLevel
  
  @js.native
  sealed trait wdBrowserLevelV4
    extends activexDashWordLib.WordNs.WdBrowserLevel
  
  /* 1 */ val wdBrowserLevelMicrosoftInternetExplorer5: wdBrowserLevelMicrosoftInternetExplorer5 with scala.Double = js.native
  /* 2 */ val wdBrowserLevelMicrosoftInternetExplorer6: wdBrowserLevelMicrosoftInternetExplorer6 with scala.Double = js.native
  /* 0 */ val wdBrowserLevelV4: wdBrowserLevelV4 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdBrowserLevel with scala.Double] = js.native
}

