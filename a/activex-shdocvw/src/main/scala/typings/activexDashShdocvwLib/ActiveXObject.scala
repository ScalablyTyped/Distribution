package typings
package activexDashShdocvwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.BeforeScriptExecute,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.pDispWindow],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_PDispWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.ClientToHostWindow,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.CX, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.CY
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_CX, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.CommandStateChange,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Command, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Enable
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_Command, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DocumentComplete,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_PDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.FileDownload,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ActiveDocument, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_ActiveDocument, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NavigateComplete2,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_PDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NavigateError,
    argNames: js.Tuple5[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Frame, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusCode, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NewProcess,
    argNames: js.Tuple3[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.lCauseFlag, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pWB2, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_CancelLCauseFlag, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NewWindow2,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ppDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_CancelPpDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NewWindow3,
    argNames: js.Tuple5[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ppDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwFlags, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.bstrUrlContext, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.bstrUrl
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_BstrUrl, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnFullScreen,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.FullScreen],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_FullScreen, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnMenuBar,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.MenuBar],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_MenuBar, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnStatusBar,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusBar],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_StatusBar, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnTheaterMode,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.TheaterMode],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_TheaterMode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnToolBar,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.ToolBar],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_ToolBar, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnVisible,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Visible],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_Visible, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PrintTemplateInstantiation,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_PDispAny, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PrintTemplateTeardown,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_PDispAny, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PrivacyImpactedStateChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.bImpacted],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_BImpacted, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.ProgressChange,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Progress, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ProgressMax
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_Progress, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PropertyChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.szProperty],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_SzProperty, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.RedirectXDomainBlocked,
    argNames: js.Tuple5[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.StartURL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.RedirectURL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Frame, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusCode
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_Frame, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.SetPhishingFilterStatus,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.PhishingFilterStatus],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_PhishingFilterStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.SetSecureLockIcon,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.SecureLockIcon],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_SecureLockIcon, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusTextChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Text],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_Text, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.ThirdPartyUrlBlocked,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwCount
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_DwCount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.TitleChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Text],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_Text, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.UpdatePageStatus,
    argNames: js.Tuple3[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.nPage, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.fDone
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_FDone, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WebWorkerFinsihed,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.dwUniqueID],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_DwUniqueID, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WebWorkerStarted,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwUniqueID, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.bstrWorkerLabel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_BstrWorkerLabel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowClosing,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.IsChildWindow, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_CancelIsChildWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetHeight,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Height],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_Height, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetLeft,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Left],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_Left, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetResizable,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Resizable],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_Resizable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetTop,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Top],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_Top, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetWidth,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Width],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_Width, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowStateChanged,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwWindowStateFlags, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwValidFlagsMask
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ Anon_DwValidFlagsMask, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.BeforeScriptExecute,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.pDispWindow],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_PDispWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.ClientToHostWindow,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.CX, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.CY
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_CX, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.CommandStateChange,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Command, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Enable
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_Command, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DocumentComplete,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_PDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.FileDownload,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ActiveDocument, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_ActiveDocument, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NavigateComplete2,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_PDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NavigateError,
    argNames: js.Tuple5[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Frame, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusCode, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NewProcess,
    argNames: js.Tuple3[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.lCauseFlag, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pWB2, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_CancelLCauseFlag, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NewWindow2,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ppDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_CancelPpDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NewWindow3,
    argNames: js.Tuple5[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ppDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwFlags, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.bstrUrlContext, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.bstrUrl
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_BstrUrl, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnFullScreen,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.FullScreen],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_FullScreen, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnMenuBar,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.MenuBar],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_MenuBar, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnStatusBar,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusBar],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_StatusBar, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnTheaterMode,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.TheaterMode],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_TheaterMode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnToolBar,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.ToolBar],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_ToolBar, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnVisible,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Visible],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_Visible, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PrintTemplateInstantiation,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_PDispAny, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PrintTemplateTeardown,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_PDispAny, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PrivacyImpactedStateChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.bImpacted],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_BImpacted, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.ProgressChange,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Progress, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ProgressMax
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_Progress, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PropertyChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.szProperty],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_SzProperty, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.RedirectXDomainBlocked,
    argNames: js.Tuple5[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.StartURL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.RedirectURL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Frame, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusCode
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_Frame, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.SetPhishingFilterStatus,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.PhishingFilterStatus],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_PhishingFilterStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.SetSecureLockIcon,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.SecureLockIcon],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_SecureLockIcon, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusTextChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Text],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_Text, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.ThirdPartyUrlBlocked,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwCount
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_DwCount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.TitleChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Text],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_Text, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.UpdatePageStatus,
    argNames: js.Tuple3[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.nPage, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.fDone
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_FDone, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WebWorkerFinsihed,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.dwUniqueID],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_DwUniqueID, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WebWorkerStarted,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwUniqueID, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.bstrWorkerLabel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_BstrWorkerLabel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowClosing,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.IsChildWindow, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_CancelIsChildWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetHeight,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Height],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_Height, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetLeft,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Left],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_Left, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetResizable,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Resizable],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_Resizable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetTop,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Top],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_Top, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetWidth,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Width],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_Width, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowStateChanged,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwWindowStateFlags, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwValidFlagsMask
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ Anon_DwValidFlagsMask, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.BeforeScriptExecute,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.pDispWindow],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_PDispWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.ClientToHostWindow,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.CX, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.CY
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_CX, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.CommandStateChange,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Command, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Enable
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_Command, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DocumentComplete,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_PDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.FileDownload,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ActiveDocument, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_ActiveDocument, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NavigateComplete2,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_PDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NavigateError,
    argNames: js.Tuple5[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Frame, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusCode, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NewProcess,
    argNames: js.Tuple3[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.lCauseFlag, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pWB2, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_CancelLCauseFlag, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NewWindow2,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ppDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_CancelPpDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NewWindow3,
    argNames: js.Tuple5[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ppDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwFlags, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.bstrUrlContext, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.bstrUrl
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_BstrUrl, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnFullScreen,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.FullScreen],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_FullScreen, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnMenuBar,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.MenuBar],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_MenuBar, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnStatusBar,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusBar],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_StatusBar, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnTheaterMode,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.TheaterMode],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_TheaterMode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnToolBar,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.ToolBar],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_ToolBar, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnVisible,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Visible],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_Visible, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PrintTemplateInstantiation,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_PDispAny, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PrintTemplateTeardown,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_PDispAny, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PrivacyImpactedStateChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.bImpacted],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_BImpacted, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.ProgressChange,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Progress, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ProgressMax
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_Progress, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PropertyChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.szProperty],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_SzProperty, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.RedirectXDomainBlocked,
    argNames: js.Tuple5[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.StartURL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.RedirectURL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Frame, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusCode
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_Frame, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.SetPhishingFilterStatus,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.PhishingFilterStatus],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_PhishingFilterStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.SetSecureLockIcon,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.SecureLockIcon],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_SecureLockIcon, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusTextChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Text],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_Text, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.ThirdPartyUrlBlocked,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwCount
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_DwCount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.TitleChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Text],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_Text, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.UpdatePageStatus,
    argNames: js.Tuple3[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.nPage, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.fDone
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_FDone, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WebWorkerFinsihed,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.dwUniqueID],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_DwUniqueID, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WebWorkerStarted,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwUniqueID, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.bstrWorkerLabel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_BstrWorkerLabel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowClosing,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.IsChildWindow, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_CancelIsChildWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetHeight,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Height],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_Height, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetLeft,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Left],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_Left, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetResizable,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Resizable],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_Resizable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetTop,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Top],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_Top, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetWidth,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Width],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_Width, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowStateChanged,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwWindowStateFlags, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwValidFlagsMask
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ Anon_DwValidFlagsMask, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellWindows,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowRegistered,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.lCookie],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellWindows, 
      /* parameter */ Anon_LCookie, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellWindows,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowRevoked,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.lCookie],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellWindows, 
      /* parameter */ Anon_LCookie, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.CommandStateChange,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Command, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Enable
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ Anon_Command, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.FrameNavigateComplete,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.URL],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ Anon_URL, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NavigateComplete,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.URL],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ Anon_URL, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.ProgressChange,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Progress, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ProgressMax
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ Anon_Progress, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PropertyChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Property],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ Anon_Property, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.Quit,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusTextChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Text],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ Anon_Text, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.TitleChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Text],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ Anon_Text, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.BeforeScriptExecute,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.pDispWindow],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_PDispWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.ClientToHostWindow,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.CX, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.CY
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_CX, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.CommandStateChange,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Command, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Enable
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_Command, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DocumentComplete,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_PDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.FileDownload,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ActiveDocument, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_ActiveDocument, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NavigateComplete2,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_PDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NavigateError,
    argNames: js.Tuple5[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Frame, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusCode, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NewProcess,
    argNames: js.Tuple3[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.lCauseFlag, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pWB2, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_CancelLCauseFlag, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NewWindow2,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ppDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_CancelPpDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NewWindow3,
    argNames: js.Tuple5[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ppDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwFlags, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.bstrUrlContext, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.bstrUrl
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_BstrUrl, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnFullScreen,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.FullScreen],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_FullScreen, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnMenuBar,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.MenuBar],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_MenuBar, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnStatusBar,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusBar],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_StatusBar, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnTheaterMode,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.TheaterMode],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_TheaterMode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnToolBar,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.ToolBar],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_ToolBar, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnVisible,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Visible],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_Visible, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PrintTemplateInstantiation,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_PDispAny, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PrintTemplateTeardown,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_PDispAny, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PrivacyImpactedStateChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.bImpacted],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_BImpacted, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.ProgressChange,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Progress, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.ProgressMax
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_Progress, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.PropertyChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.szProperty],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_SzProperty, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.RedirectXDomainBlocked,
    argNames: js.Tuple5[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.StartURL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.RedirectURL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Frame, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusCode
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_Frame, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.SetPhishingFilterStatus,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.PhishingFilterStatus],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_PhishingFilterStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.SetSecureLockIcon,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.SecureLockIcon],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_SecureLockIcon, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.StatusTextChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Text],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_Text, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.ThirdPartyUrlBlocked,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.URL, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwCount
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_DwCount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.TitleChange,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Text],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_Text, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.UpdatePageStatus,
    argNames: js.Tuple3[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.pDisp, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.nPage, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.fDone
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_FDone, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WebWorkerFinsihed,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.dwUniqueID],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_DwUniqueID, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WebWorkerStarted,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwUniqueID, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.bstrWorkerLabel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_BstrWorkerLabel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowClosing,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.IsChildWindow, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_CancelIsChildWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetHeight,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Height],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_Height, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetLeft,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Left],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_Left, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetResizable,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Resizable],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_Resizable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetTop,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Top],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_Top, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowSetWidth,
    argNames: js.Array[activexDashShdocvwLib.activexDashShdocvwLibStrings.Width],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_Width, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowStateChanged,
    argNames: js.Tuple2[
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwWindowStateFlags, 
      activexDashShdocvwLib.activexDashShdocvwLibStrings.dwValidFlagsMask
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ Anon_DwValidFlagsMask, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeNavigate(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.BeforeNavigate,
    argNames: activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.WebBrowser_V1_BeforeNavigate_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.WebBrowser_V1_BeforeNavigate_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeNavigate2(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.BeforeNavigate2,
    argNames: activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.InternetExplorerMedium_BeforeNavigate2_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.InternetExplorerMedium_BeforeNavigate2_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeNavigate2(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.BeforeNavigate2,
    argNames: activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.InternetExplorer_BeforeNavigate2_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.InternetExplorer_BeforeNavigate2_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeNavigate2(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.BeforeNavigate2,
    argNames: activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.ShellBrowserWindow_BeforeNavigate2_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.ShellBrowserWindow_BeforeNavigate2_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeNavigate2(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.BeforeNavigate2,
    argNames: activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.WebBrowser_BeforeNavigate2_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.WebBrowser_BeforeNavigate2_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellNameSpace,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellNameSpace, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DownloadBegin(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DownloadBegin,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DownloadBegin(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DownloadBegin,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DownloadBegin(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DownloadBegin,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DownloadBegin(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DownloadBegin,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DownloadBegin(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DownloadBegin,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DownloadComplete(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DownloadComplete,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DownloadComplete(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DownloadComplete,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DownloadComplete(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DownloadComplete,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DownloadComplete(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DownloadComplete,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DownloadComplete(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.DownloadComplete,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_FavoritesSelectionChange(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellNameSpace,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.FavoritesSelectionChange,
    argNames: activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.ShellNameSpace_FavoritesSelectionChange_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellNameSpace, 
      /* parameter */ activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.ShellNameSpace_FavoritesSelectionChange_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_FrameBeforeNavigate(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.FrameBeforeNavigate,
    argNames: activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.WebBrowser_V1_FrameBeforeNavigate_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.WebBrowser_V1_FrameBeforeNavigate_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_FrameNewWindow(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.FrameNewWindow,
    argNames: activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.WebBrowser_V1_FrameNewWindow_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.WebBrowser_V1_FrameNewWindow_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Initialized(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellNameSpace,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.Initialized,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellNameSpace, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_NewWindow(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.NewWindow,
    argNames: activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.WebBrowser_V1_NewWindow_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs.WebBrowser_V1_NewWindow_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_OnQuit(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnQuit,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorerMedium, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_OnQuit(
    obj: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnQuit,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.InternetExplorer, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_OnQuit(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnQuit,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellBrowserWindow, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_OnQuit(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.OnQuit,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_SelectionChange(
    obj: activexDashShdocvwLib.SHDocVwNs.ShellNameSpace,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.SelectionChange,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.ShellNameSpace, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_WindowActivate(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowActivate,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_WindowMove(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowMove,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_WindowResize(
    obj: activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1,
    event: activexDashShdocvwLib.activexDashShdocvwLibStrings.WindowResize,
    handler: js.ThisFunction1[
      /* this */ activexDashShdocvwLib.SHDocVwNs.WebBrowser_V1, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

