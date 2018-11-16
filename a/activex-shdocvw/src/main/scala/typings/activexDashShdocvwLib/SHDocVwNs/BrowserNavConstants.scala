package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BrowserNavConstants extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("SHDocVw.BrowserNavConstants")
@js.native
object BrowserNavConstants extends js.Object {
  /** If the navigation fails, the autosearch functionality attempts to navigate common root domains (.com, .edu, and so on). If this also fails, the URL is passed to a search engine. */
  @js.native
  sealed trait AllowAutosearch
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /**
           * Internet Explorer 8. Block cross-domain redirect requests. The navigation triggers the
           * [**DWebBrowserEvents2::RedirectXDomainBlocked**](https://msdn.microsoft.com/en-us/library/dd565686(v=vs.85).aspx) event if blocked.
           */
  @js.native
  sealed trait BlockRedirectsXDomain
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /** Causes the current Explorer Bar to navigate to the given item, if possible.  */
  @js.native
  sealed trait BrowserBar
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /** Internet Explorer 6 for Windows XP SP2 and later. Force the URL into the restricted zone. */
  @js.native
  sealed trait EnforceRestricted
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /**
           * Internet Explorer 6 for Windows XP SP2 and later. If the navigation fails when a hyperlink is being followed, this constant specifies that the resource should then be bound to the
           * moniker using the [**BINDF_HYPERLINK**](https://msdn.microsoft.com/en-us/library/ms775130(v=vs.85).aspx) flag.
           */
  @js.native
  sealed trait Hyperlink
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /**
           * Internet Explorer 7. Maintain state for dynamic navigation based on the filter string entered in the search band text box (wordwheel). Restore the wordwheel text when the navigation
           * completes.
           */
  @js.native
  sealed trait KeepWordWheelText
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /** Internet Explorer 6 for Windows XP SP2 and later. Use the default Popup Manager to block pop-up windows.  */
  @js.native
  sealed trait NewWindowsManaged
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /** Do not add the resource or file to the history list. The new page replaces the current page in the list. */
  @js.native
  sealed trait NoHistory
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /** Internet Explorer 7. Open the resource or file in a new background tab; the currently active window and/or tab remains open on top.  */
  @js.native
  sealed trait OpenInBackgroundTab
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /** Internet Explorer 7. Open the resource or file in a new tab. Allow the destination window to come to the foreground, if necessary.  */
  @js.native
  sealed trait OpenInNewTab
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /** Open the resource or file in a new window. */
  @js.native
  sealed trait OpenInNewWindow
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /** Internet Explorer 8 and later. Open the resource in a new tab that becomes the foreground tab. */
  @js.native
  sealed trait OpenNewForegroundTab
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /** Internet Explorer 6 for Windows XP SP2 and later. Prompt for the installation of ActiveX controls.   */
  @js.native
  sealed trait TrustedForActiveX
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /** Internet Explorer 6 for Windows XP SP2 and later. Block files that normally trigger a file download dialog box.  */
  @js.native
  sealed trait UntrustedForDownload
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /**
           * Internet Explorer 8. Open the resource as a replacement for the current or target tab. The existing tab is closed while the new tab takes its place in the tab bar and replaces it in the
           * tab group, if any. Browser history is copied forward to the new tab. On Windows Vista, this flag is implied if the navigation would cross integrity levels and **navOpenInNewTab**,
           * **navOpenInBackgroundTab**, or **navOpenInNewWindow**> is not specified.
           */
  @js.native
  sealed trait VirtualTab
    extends activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants
  
  /* 16 */ val AllowAutosearch: AllowAutosearch with scala.Double = js.native
  /* 32768 */ val BlockRedirectsXDomain: BlockRedirectsXDomain with scala.Double = js.native
  /* 32 */ val BrowserBar: BrowserBar with scala.Double = js.native
  /* 128 */ val EnforceRestricted: EnforceRestricted with scala.Double = js.native
  /* 64 */ val Hyperlink: Hyperlink with scala.Double = js.native
  /* 8192 */ val KeepWordWheelText: KeepWordWheelText with scala.Double = js.native
  /* 256 */ val NewWindowsManaged: NewWindowsManaged with scala.Double = js.native
  /* 2 */ val NoHistory: NoHistory with scala.Double = js.native
  /* 4096 */ val OpenInBackgroundTab: OpenInBackgroundTab with scala.Double = js.native
  /* 2048 */ val OpenInNewTab: OpenInNewTab with scala.Double = js.native
  /* 1 */ val OpenInNewWindow: OpenInNewWindow with scala.Double = js.native
  /* 65536 */ val OpenNewForegroundTab: OpenNewForegroundTab with scala.Double = js.native
  /* 1024 */ val TrustedForActiveX: TrustedForActiveX with scala.Double = js.native
  /* 512 */ val UntrustedForDownload: UntrustedForDownload with scala.Double = js.native
  /* 16384 */ val VirtualTab: VirtualTab with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShdocvwLib.SHDocVwNs.BrowserNavConstants with scala.Double] = js.native
}

