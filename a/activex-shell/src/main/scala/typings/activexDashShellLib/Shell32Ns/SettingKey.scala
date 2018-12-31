package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SettingKey extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("Shell32.SettingKey")
@js.native
object SettingKey extends js.Object {
  /**
    * The state of the **Use check boxes to select items** option. This option is enabled automatically when the system has a pen input device configured.
    *
    * _Windows Vista and later_
    */
  @js.native
  sealed trait SSF_AUTOCHECKSELECT
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** Not used. */
  @js.native
  sealed trait SSF_DESKTOPHTML
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the **Allow all uppercase names** option. As of Windows Vista, this folder option is no longer available. */
  @js.native
  sealed trait SSF_DONTPRETTYPATH
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the **Double-click to open an item (single-click to select)** option. */
  @js.native
  sealed trait SSF_DOUBLECLICKINWEBVIEW
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** Not used. */
  @js.native
  sealed trait SSF_FILTER
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** Not used. */
  @js.native
  sealed trait SSF_HIDDENFILEEXTS
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of icon display in the Windows Explorer list view. If this option is active, no icons are displayed in the list view. */
  @js.native
  sealed trait SSF_HIDEICONS
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /**
    * The state of display name display in the Windows Explorer list view. If this option is active, icons are displayed in the list view, but display names are not.
    *
    * _Windows Vista and later_
    */
  @js.native
  sealed trait SSF_ICONSONLY
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the **Show map network drive button in toolbar** option. As of Windows Vista, this option is no longer available. */
  @js.native
  sealed trait SSF_MAPNETDRVBUTTON
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the Recycle Bin's **Display delete confirmation dialog** option. */
  @js.native
  sealed trait SSF_NOCONFIRMRECYCLE
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the **Automatically search for network folders and printers** option. As of Windows Vista, this option is no longer available. */
  @js.native
  sealed trait SSF_NONETCRAWLING
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the **Launch folder windows in a separate process** option. */
  @js.native
  sealed trait SSF_SEPPROCESS
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** Not used. */
  @js.native
  sealed trait SSF_SERVERADMINUI
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the **Hidden files and folders** option. */
  @js.native
  sealed trait SSF_SHOWALLOBJECTS
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the **Show File Attributes in Detail View** option. As of Windows Vista, this option is no longer available. */
  @js.native
  sealed trait SSF_SHOWATTRIBCOL
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the **Show encrypted or compressed NTFS files in color** option. */
  @js.native
  sealed trait SSF_SHOWCOMPCOLOR
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the **Hide extensions for known file types** option. */
  @js.native
  sealed trait SSF_SHOWEXTENSIONS
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the **Show pop-up description for folder and desktop items** option. */
  @js.native
  sealed trait SSF_SHOWINFOTIP
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** Not used. */
  @js.native
  sealed trait SSF_SHOWSTARTPAGE
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the **Hide protected operating system files** option. */
  @js.native
  sealed trait SSF_SHOWSUPERHIDDEN
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /**
    * The state of the **Hidden files and folders** option. In Windows Vista and later, this is equivalent to `SSF_SHOWALLOBJECTS`. In versions of Windows before Windows Vista, this value
    * referred to the state of the **Do not show hidden files and folders** option.
    */
  @js.native
  sealed trait SSF_SHOWSYSFILES
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /**
    * The state of the **Display file icon on thumbnails** option. If this option is active, a file type overlay is applied when a file supplies a thumbnail representation.
    *
    * _Windows Vista and later_
    */
  @js.native
  sealed trait SSF_SHOWTYPEOVERLAY
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** Not used. */
  @js.native
  sealed trait SSF_SORTCOLUMNS
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the Windows XP display option, which selects between the Windows XP style and the classic style. As of Windows Vista, this option is no longer available. */
  @js.native
  sealed trait SSF_STARTPANELON
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the **Display as a web view option**. As of Windows Vista, this option is no longer available. */
  @js.native
  sealed trait SSF_WEBVIEW
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /** The state of the **Classic Style** option. As of Windows Vista, this option is no longer available. */
  @js.native
  sealed trait SSF_WIN95CLASSIC
    extends activexDashShellLib.Shell32Ns.SettingKey
  
  /* 0x00800000 */ val SSF_AUTOCHECKSELECT: SSF_AUTOCHECKSELECT with scala.Double = js.native
  /* 0x00000200 */ val SSF_DESKTOPHTML: SSF_DESKTOPHTML with scala.Double = js.native
  /* 0x00000800 */ val SSF_DONTPRETTYPATH: SSF_DONTPRETTYPATH with scala.Double = js.native
  /* 0x00000080 */ val SSF_DOUBLECLICKINWEBVIEW: SSF_DOUBLECLICKINWEBVIEW with scala.Double = js.native
  /* 0x00010000 */ val SSF_FILTER: SSF_FILTER with scala.Double = js.native
  /* 0x00000004 */ val SSF_HIDDENFILEEXTS: SSF_HIDDENFILEEXTS with scala.Double = js.native
  /* 0x00004000 */ val SSF_HIDEICONS: SSF_HIDEICONS with scala.Double = js.native
  /* 0x01000000 */ val SSF_ICONSONLY: SSF_ICONSONLY with scala.Double = js.native
  /* 0x00001000 */ val SSF_MAPNETDRVBUTTON: SSF_MAPNETDRVBUTTON with scala.Double = js.native
  /* 0x00008000 */ val SSF_NOCONFIRMRECYCLE: SSF_NOCONFIRMRECYCLE with scala.Double = js.native
  /* 0x00100000 */ val SSF_NONETCRAWLING: SSF_NONETCRAWLING with scala.Double = js.native
  /* 0x00080000 */ val SSF_SEPPROCESS: SSF_SEPPROCESS with scala.Double = js.native
  /* 0x00000004 */ val SSF_SERVERADMINUI: SSF_SERVERADMINUI with scala.Double = js.native
  /* 0x00000001 */ val SSF_SHOWALLOBJECTS: SSF_SHOWALLOBJECTS with scala.Double = js.native
  /* 0x00000100 */ val SSF_SHOWATTRIBCOL: SSF_SHOWATTRIBCOL with scala.Double = js.native
  /* 0x00000008 */ val SSF_SHOWCOMPCOLOR: SSF_SHOWCOMPCOLOR with scala.Double = js.native
  /* 0x00000002 */ val SSF_SHOWEXTENSIONS: SSF_SHOWEXTENSIONS with scala.Double = js.native
  /* 0x00002000 */ val SSF_SHOWINFOTIP: SSF_SHOWINFOTIP with scala.Double = js.native
  /* 0x00400000 */ val SSF_SHOWSTARTPAGE: SSF_SHOWSTARTPAGE with scala.Double = js.native
  /* 0x00040000 */ val SSF_SHOWSUPERHIDDEN: SSF_SHOWSUPERHIDDEN with scala.Double = js.native
  /* 0x00000020 */ val SSF_SHOWSYSFILES: SSF_SHOWSYSFILES with scala.Double = js.native
  /* 0x02000000 */ val SSF_SHOWTYPEOVERLAY: SSF_SHOWTYPEOVERLAY with scala.Double = js.native
  /* 0x00000010 */ val SSF_SORTCOLUMNS: SSF_SORTCOLUMNS with scala.Double = js.native
  /* 0x00200000 */ val SSF_STARTPANELON: SSF_STARTPANELON with scala.Double = js.native
  /* 0x00020000 */ val SSF_WEBVIEW: SSF_WEBVIEW with scala.Double = js.native
  /* 0x00000400 */ val SSF_WIN95CLASSIC: SSF_WIN95CLASSIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShellLib.Shell32Ns.SettingKey with scala.Double] = js.native
}

