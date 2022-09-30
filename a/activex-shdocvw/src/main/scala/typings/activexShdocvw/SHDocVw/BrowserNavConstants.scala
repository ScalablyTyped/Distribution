package typings.activexShdocvw.SHDocVw

import typings.activexShdocvw.activexShdocvwInts.`1024`
import typings.activexShdocvw.activexShdocvwInts.`128`
import typings.activexShdocvw.activexShdocvwInts.`16384`
import typings.activexShdocvw.activexShdocvwInts.`16`
import typings.activexShdocvw.activexShdocvwInts.`1`
import typings.activexShdocvw.activexShdocvwInts.`2048`
import typings.activexShdocvw.activexShdocvwInts.`256`
import typings.activexShdocvw.activexShdocvwInts.`2`
import typings.activexShdocvw.activexShdocvwInts.`32768`
import typings.activexShdocvw.activexShdocvwInts.`32`
import typings.activexShdocvw.activexShdocvwInts.`4096`
import typings.activexShdocvw.activexShdocvwInts.`512`
import typings.activexShdocvw.activexShdocvwInts.`64`
import typings.activexShdocvw.activexShdocvwInts.`65536`
import typings.activexShdocvw.activexShdocvwInts.`8192`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// eslint-disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typings.activexShdocvw.activexShdocvwInts.`1`
  - typings.activexShdocvw.activexShdocvwInts.`2`
  - typings.activexShdocvw.activexShdocvwInts.`16`
  - typings.activexShdocvw.activexShdocvwInts.`32`
  - typings.activexShdocvw.activexShdocvwInts.`64`
  - typings.activexShdocvw.activexShdocvwInts.`128`
  - typings.activexShdocvw.activexShdocvwInts.`256`
  - typings.activexShdocvw.activexShdocvwInts.`512`
  - typings.activexShdocvw.activexShdocvwInts.`1024`
  - typings.activexShdocvw.activexShdocvwInts.`2048`
  - typings.activexShdocvw.activexShdocvwInts.`4096`
  - typings.activexShdocvw.activexShdocvwInts.`8192`
  - typings.activexShdocvw.activexShdocvwInts.`16384`
  - typings.activexShdocvw.activexShdocvwInts.`32768`
  - typings.activexShdocvw.activexShdocvwInts.`65536`
*/
trait BrowserNavConstants extends StObject
object BrowserNavConstants {
  
  /** If the navigation fails, the autosearch functionality attempts to navigate common root domains (.com, .edu, and so on). If this also fails, the URL is passed to a search engine. */
  inline def AllowAutosearch: `16` = 16.asInstanceOf[`16`]
  
  /**
    * Internet Explorer 8. Block cross-domain redirect requests. The navigation triggers the
    * [**DWebBrowserEvents2::RedirectXDomainBlocked**](https://msdn.microsoft.com/en-us/library/dd565686(v=vs.85).aspx) event if blocked.
    */
  inline def BlockRedirectsXDomain: `32768` = 32768.asInstanceOf[`32768`]
  
  /** Causes the current Explorer Bar to navigate to the given item, if possible.  */
  inline def BrowserBar: `32` = 32.asInstanceOf[`32`]
  
  /** Internet Explorer 6 for Windows XP SP2 and later. Force the URL into the restricted zone. */
  inline def EnforceRestricted: `128` = 128.asInstanceOf[`128`]
  
  /**
    * Internet Explorer 6 for Windows XP SP2 and later. If the navigation fails when a hyperlink is being followed, this constant specifies that the resource should then be bound to the
    * moniker using the [**BINDF_HYPERLINK**](https://msdn.microsoft.com/en-us/library/ms775130(v=vs.85).aspx) flag.
    */
  inline def Hyperlink: `64` = 64.asInstanceOf[`64`]
  
  /**
    * Internet Explorer 7. Maintain state for dynamic navigation based on the filter string entered in the search band text box (wordwheel). Restore the wordwheel text when the navigation
    * completes.
    */
  inline def KeepWordWheelText: `8192` = 8192.asInstanceOf[`8192`]
  
  /** Internet Explorer 6 for Windows XP SP2 and later. Use the default Popup Manager to block pop-up windows.  */
  inline def NewWindowsManaged: `256` = 256.asInstanceOf[`256`]
  
  /** Do not add the resource or file to the history list. The new page replaces the current page in the list. */
  inline def NoHistory: `2` = 2.asInstanceOf[`2`]
  
  /** Internet Explorer 7. Open the resource or file in a new background tab; the currently active window and/or tab remains open on top.  */
  inline def OpenInBackgroundTab: `4096` = 4096.asInstanceOf[`4096`]
  
  /** Internet Explorer 7. Open the resource or file in a new tab. Allow the destination window to come to the foreground, if necessary.  */
  inline def OpenInNewTab: `2048` = 2048.asInstanceOf[`2048`]
  
  /** Open the resource or file in a new window. */
  inline def OpenInNewWindow: `1` = 1.asInstanceOf[`1`]
  
  /** Internet Explorer 8 and later. Open the resource in a new tab that becomes the foreground tab. */
  inline def OpenNewForegroundTab: `65536` = 65536.asInstanceOf[`65536`]
  
  /** Internet Explorer 6 for Windows XP SP2 and later. Prompt for the installation of ActiveX controls.   */
  inline def TrustedForActiveX: `1024` = 1024.asInstanceOf[`1024`]
  
  /** Internet Explorer 6 for Windows XP SP2 and later. Block files that normally trigger a file download dialog box.  */
  inline def UntrustedForDownload: `512` = 512.asInstanceOf[`512`]
  
  /**
    * Internet Explorer 8. Open the resource as a replacement for the current or target tab. The existing tab is closed while the new tab takes its place in the tab bar and replaces it in the
    * tab group, if any. Browser history is copied forward to the new tab. On Windows Vista, this flag is implied if the navigation would cross integrity levels and **navOpenInNewTab**,
    * **navOpenInBackgroundTab**, or **navOpenInNewWindow**> is not specified.
    */
  inline def VirtualTab: `16384` = 16384.asInstanceOf[`16384`]
}
