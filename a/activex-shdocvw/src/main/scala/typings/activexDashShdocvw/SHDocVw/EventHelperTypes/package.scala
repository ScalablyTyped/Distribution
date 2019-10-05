package typings.activexDashShdocvw.SHDocVw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typings.activexDashShdocvw.activexDashShdocvwStrings.Cancel
  import typings.activexDashShdocvw.activexDashShdocvwStrings.Flags
  import typings.activexDashShdocvw.activexDashShdocvwStrings.Headers
  import typings.activexDashShdocvw.activexDashShdocvwStrings.PostData
  import typings.activexDashShdocvw.activexDashShdocvwStrings.Processed
  import typings.activexDashShdocvw.activexDashShdocvwStrings.TargetFrameName
  import typings.activexDashShdocvw.activexDashShdocvwStrings.URL
  import typings.activexDashShdocvw.activexDashShdocvwStrings.cItems
  import typings.activexDashShdocvw.activexDashShdocvwStrings.cVisits
  import typings.activexDashShdocvw.activexDashShdocvwStrings.fAvailableOffline
  import typings.activexDashShdocvw.activexDashShdocvwStrings.hItem
  import typings.activexDashShdocvw.activexDashShdocvwStrings.pDisp
  import typings.activexDashShdocvw.activexDashShdocvwStrings.strDate
  import typings.activexDashShdocvw.activexDashShdocvwStrings.strName
  import typings.activexDashShdocvw.activexDashShdocvwStrings.strUrl

  type InternetExplorerMedium_BeforeNavigate2_ArgNames = js.Tuple7[pDisp, URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  type InternetExplorer_BeforeNavigate2_ArgNames = js.Tuple7[pDisp, URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  type ShellBrowserWindow_BeforeNavigate2_ArgNames = js.Tuple7[pDisp, URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  type ShellNameSpace_FavoritesSelectionChange_ArgNames = js.Tuple7[cItems, hItem, strName, strUrl, cVisits, strDate, fAvailableOffline]
  type WebBrowser_BeforeNavigate2_ArgNames = js.Tuple7[pDisp, URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  type WebBrowser_V1_BeforeNavigate_ArgNames = js.Tuple6[URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  type WebBrowser_V1_FrameBeforeNavigate_ArgNames = js.Tuple6[URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  type WebBrowser_V1_FrameNewWindow_ArgNames = js.Tuple6[URL, Flags, TargetFrameName, PostData, Headers, Processed]
  type WebBrowser_V1_NewWindow_ArgNames = js.Tuple6[URL, Flags, TargetFrameName, PostData, Headers, Processed]
}
