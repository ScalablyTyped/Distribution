package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - activexDashShellLib.activexDashShellLibNumbers.`0x00800000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00000200`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00000800`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00000080`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00010000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00000004`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00004000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x01000000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00001000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00008000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00100000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00080000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00000001`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00000100`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00000008`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00000002`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00002000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00400000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00040000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00000020`
  - activexDashShellLib.activexDashShellLibNumbers.`0x02000000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00000010`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00200000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00020000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00000400`
*/
trait SettingKey extends js.Object

object SettingKey {
  /**
    * The state of the **Use check boxes to select items** option. This option is enabled automatically when the system has a pen input device configured.
    *
    * _Windows Vista and later_
    */
  @scala.inline
  def SSF_AUTOCHECKSELECT: activexDashShellLib.activexDashShellLibNumbers.`0x00800000` = this.cast(0x00800000)
  /** Not used. */
  @scala.inline
  def SSF_DESKTOPHTML: activexDashShellLib.activexDashShellLibNumbers.`0x00000200` = this.cast(0x00000200)
  /** The state of the **Allow all uppercase names** option. As of Windows Vista, this folder option is no longer available. */
  @scala.inline
  def SSF_DONTPRETTYPATH: activexDashShellLib.activexDashShellLibNumbers.`0x00000800` = this.cast(0x00000800)
  /** The state of the **Double-click to open an item (single-click to select)** option. */
  @scala.inline
  def SSF_DOUBLECLICKINWEBVIEW: activexDashShellLib.activexDashShellLibNumbers.`0x00000080` = this.cast(0x00000080)
  /** Not used. */
  @scala.inline
  def SSF_FILTER: activexDashShellLib.activexDashShellLibNumbers.`0x00010000` = this.cast(0x00010000)
  /** Not used. */
  @scala.inline
  def SSF_HIDDENFILEEXTS: activexDashShellLib.activexDashShellLibNumbers.`0x00000004` = this.cast(0x00000004)
  /** The state of icon display in the Windows Explorer list view. If this option is active, no icons are displayed in the list view. */
  @scala.inline
  def SSF_HIDEICONS: activexDashShellLib.activexDashShellLibNumbers.`0x00004000` = this.cast(0x00004000)
  /**
    * The state of display name display in the Windows Explorer list view. If this option is active, icons are displayed in the list view, but display names are not.
    *
    * _Windows Vista and later_
    */
  @scala.inline
  def SSF_ICONSONLY: activexDashShellLib.activexDashShellLibNumbers.`0x01000000` = this.cast(0x01000000)
  /** The state of the **Show map network drive button in toolbar** option. As of Windows Vista, this option is no longer available. */
  @scala.inline
  def SSF_MAPNETDRVBUTTON: activexDashShellLib.activexDashShellLibNumbers.`0x00001000` = this.cast(0x00001000)
  /** The state of the Recycle Bin's **Display delete confirmation dialog** option. */
  @scala.inline
  def SSF_NOCONFIRMRECYCLE: activexDashShellLib.activexDashShellLibNumbers.`0x00008000` = this.cast(0x00008000)
  /** The state of the **Automatically search for network folders and printers** option. As of Windows Vista, this option is no longer available. */
  @scala.inline
  def SSF_NONETCRAWLING: activexDashShellLib.activexDashShellLibNumbers.`0x00100000` = this.cast(0x00100000)
  /** The state of the **Launch folder windows in a separate process** option. */
  @scala.inline
  def SSF_SEPPROCESS: activexDashShellLib.activexDashShellLibNumbers.`0x00080000` = this.cast(0x00080000)
  /** Not used. */
  @scala.inline
  def SSF_SERVERADMINUI: activexDashShellLib.activexDashShellLibNumbers.`0x00000004` = this.cast(0x00000004)
  /** The state of the **Hidden files and folders** option. */
  @scala.inline
  def SSF_SHOWALLOBJECTS: activexDashShellLib.activexDashShellLibNumbers.`0x00000001` = this.cast(0x00000001)
  /** The state of the **Show File Attributes in Detail View** option. As of Windows Vista, this option is no longer available. */
  @scala.inline
  def SSF_SHOWATTRIBCOL: activexDashShellLib.activexDashShellLibNumbers.`0x00000100` = this.cast(0x00000100)
  /** The state of the **Show encrypted or compressed NTFS files in color** option. */
  @scala.inline
  def SSF_SHOWCOMPCOLOR: activexDashShellLib.activexDashShellLibNumbers.`0x00000008` = this.cast(0x00000008)
  /** The state of the **Hide extensions for known file types** option. */
  @scala.inline
  def SSF_SHOWEXTENSIONS: activexDashShellLib.activexDashShellLibNumbers.`0x00000002` = this.cast(0x00000002)
  /** The state of the **Show pop-up description for folder and desktop items** option. */
  @scala.inline
  def SSF_SHOWINFOTIP: activexDashShellLib.activexDashShellLibNumbers.`0x00002000` = this.cast(0x00002000)
  /** Not used. */
  @scala.inline
  def SSF_SHOWSTARTPAGE: activexDashShellLib.activexDashShellLibNumbers.`0x00400000` = this.cast(0x00400000)
  /** The state of the **Hide protected operating system files** option. */
  @scala.inline
  def SSF_SHOWSUPERHIDDEN: activexDashShellLib.activexDashShellLibNumbers.`0x00040000` = this.cast(0x00040000)
  /**
    * The state of the **Hidden files and folders** option. In Windows Vista and later, this is equivalent to `SSF_SHOWALLOBJECTS`. In versions of Windows before Windows Vista, this value
    * referred to the state of the **Do not show hidden files and folders** option.
    */
  @scala.inline
  def SSF_SHOWSYSFILES: activexDashShellLib.activexDashShellLibNumbers.`0x00000020` = this.cast(0x00000020)
  /**
    * The state of the **Display file icon on thumbnails** option. If this option is active, a file type overlay is applied when a file supplies a thumbnail representation.
    *
    * _Windows Vista and later_
    */
  @scala.inline
  def SSF_SHOWTYPEOVERLAY: activexDashShellLib.activexDashShellLibNumbers.`0x02000000` = this.cast(0x02000000)
  /** Not used. */
  @scala.inline
  def SSF_SORTCOLUMNS: activexDashShellLib.activexDashShellLibNumbers.`0x00000010` = this.cast(0x00000010)
  /** The state of the Windows XP display option, which selects between the Windows XP style and the classic style. As of Windows Vista, this option is no longer available. */
  @scala.inline
  def SSF_STARTPANELON: activexDashShellLib.activexDashShellLibNumbers.`0x00200000` = this.cast(0x00200000)
  /** The state of the **Display as a web view option**. As of Windows Vista, this option is no longer available. */
  @scala.inline
  def SSF_WEBVIEW: activexDashShellLib.activexDashShellLibNumbers.`0x00020000` = this.cast(0x00020000)
  /** The state of the **Classic Style** option. As of Windows Vista, this option is no longer available. */
  @scala.inline
  def SSF_WIN95CLASSIC: activexDashShellLib.activexDashShellLibNumbers.`0x00000400` = this.cast(0x00000400)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

