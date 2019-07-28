package typings.activexDashShell.Shell32Ns

import typings.activexDashShell.activexDashShellNumbers.`0x00000001`
import typings.activexDashShell.activexDashShellNumbers.`0x00000002`
import typings.activexDashShell.activexDashShellNumbers.`0x00000004`
import typings.activexDashShell.activexDashShellNumbers.`0x00000008`
import typings.activexDashShell.activexDashShellNumbers.`0x00000010`
import typings.activexDashShell.activexDashShellNumbers.`0x00000020`
import typings.activexDashShell.activexDashShellNumbers.`0x00000040`
import typings.activexDashShell.activexDashShellNumbers.`0x00000080`
import typings.activexDashShell.activexDashShellNumbers.`0x00000090`
import typings.activexDashShell.activexDashShellNumbers.`0x00000100`
import typings.activexDashShell.activexDashShellNumbers.`0x00000200`
import typings.activexDashShell.activexDashShellNumbers.`0x00000400`
import typings.activexDashShell.activexDashShellNumbers.`0x00001000`
import typings.activexDashShell.activexDashShellNumbers.`0x00002000`
import typings.activexDashShell.activexDashShellNumbers.`0x00004000`
import typings.activexDashShell.activexDashShellNumbers.`0x00008000`
import typings.activexDashShell.activexDashShellNumbers.`0x00010000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typings.activexDashShell.activexDashShellNumbers.`0x00010000`
  - typings.activexDashShell.activexDashShellNumbers.`0x00001000`
  - typings.activexDashShell.activexDashShellNumbers.`0x00002000`
  - typings.activexDashShell.activexDashShellNumbers.`0x00004000`
  - typings.activexDashShell.activexDashShellNumbers.`0x00000080`
  - typings.activexDashShell.activexDashShellNumbers.`0x00000002`
  - typings.activexDashShell.activexDashShellNumbers.`0x00000010`
  - typings.activexDashShell.activexDashShellNumbers.`0x00000040`
  - typings.activexDashShell.activexDashShellNumbers.`0x00000200`
  - typings.activexDashShell.activexDashShellNumbers.`0x00000400`
  - typings.activexDashShell.activexDashShellNumbers.`0x00000008`
  - typings.activexDashShell.activexDashShellNumbers.`0x00000001`
  - typings.activexDashShell.activexDashShellNumbers.`0x00008000`
  - typings.activexDashShell.activexDashShellNumbers.`0x00000004`
  - typings.activexDashShell.activexDashShellNumbers.`0x00000100`
  - typings.activexDashShell.activexDashShellNumbers.`0x00000090`
  - typings.activexDashShell.activexDashShellNumbers.`0x00000020`
*/
trait BrowseInfoFlags extends js.Object

object BrowseInfoFlags {
  /**
    * Allow folder junctions such as a library or a compressed file with a .zip file name extension to be browsed.
    *
    * _Windows 7 and later._
    */
  @scala.inline
  def BIF_BROWSEFILEJUNCTIONS: `0x00010000` = this.cast(0x00010000)
  /** Only return computers. If the user selects anything other than a computer, the **OK** button is grayed. */
  @scala.inline
  def BIF_BROWSEFORCOMPUTER: `0x00001000` = this.cast(0x00001000)
  /**
    * Only allow the selection of printers. If the user selects anything other than a printer, the **OK** button is grayed.
    *
    * In Windows XP and later systems, the best practice is to use a Windows XP-style dialog, setting the root of the dialog to the **Printers and Faxes** folder (`CSIDL_PRINTERS`).
    */
  @scala.inline
  def BIF_BROWSEFORPRINTER: `0x00002000` = this.cast(0x00002000)
  /**
    * The browse dialog box displays files as well as folders.
    *
    * _[Version 4.7.1](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @scala.inline
  def BIF_BROWSEINCLUDEFILES: `0x00004000` = this.cast(0x00004000)
  /**
    * The browse dialog box can display URLs. The `BIF_USENEWUI` and `BIF_BROWSEINCLUDEFILES` flags must also be set. If any of these three flags are not set, the browser dialog box rejects URLs.
    * Even when these flags are set, the browse dialog box displays URLs only if the folder that contains the selected item supports URLs.
    *
    * When the folder's [IShellFolder::GetAttributesOf](https://msdn.microsoft.com/en-us/library/windows/desktop/bb775068.aspx) method is called to request the selected item's attributes, the
    * folder must set the `SFGAO_FOLDER` attribute flag. Otherwise, the browse dialog box will not display the URL.
    *
    * _[Version 5.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @scala.inline
  def BIF_BROWSEINCLUDEURLS: `0x00000080` = this.cast(0x00000080)
  /** Do not include network folders below the domain level in the dialog box's tree view control. */
  @scala.inline
  def BIF_DONTGOBELOWDOMAIN: `0x00000002` = this.cast(0x00000002)
  /**
    * Include an edit control in the browse dialog box that allows the user to type the name of an item.
    *
    * _[Version 4.7.1](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @scala.inline
  def BIF_EDITBOX: `0x00000010` = this.cast(0x00000010)
  /**
    * Use the new user interface. Setting this flag provides the user with a larger dialog box that can be resized. The dialog box has several new capabilities, including: drag-and-drop
    * capability within the dialog box, reordering, shortcut menus, new folders, delete, and other shortcut menu commands.
    *
    * _[Version 5.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @scala.inline
  def BIF_NEWDIALOGSTYLE: `0x00000040` = this.cast(0x00000040)
  /**
    * Do not include the **New Folder** button in the browse dialog box.
    *
    * _[Version 6.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @scala.inline
  def BIF_NONEWFOLDERBUTTON: `0x00000200` = this.cast(0x00000200)
  /**
    * When the selected item is a shortcut, return the PIDL of the shortcut itself rather than its target.
    *
    * _[Version 6.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @scala.inline
  def BIF_NOTRANSLATETARGETS: `0x00000400` = this.cast(0x00000400)
  /**
    * Only return file system ancestors. An ancestor is a subfolder that is beneath the root folder in the namespace hierarchy. If the user selects an ancestor of the root folder that is not
    * part of the file system, the **OK** button is grayed.
    */
  @scala.inline
  def BIF_RETURNFSANCESTORS: `0x00000008` = this.cast(0x00000008)
  /**
    * Only return file system directories. If the user selects folders that are not part of the file system, the **OK** button is grayed.
    *
    * **Note** The **OK** button remains enabled for `\\server` items, as well as `\\server\share` and directory items. However, if the user selects a `\\server` item, passing the PIDL
    * returned by [SHBrowseForFolder](https://msdn.microsoft.com/en-us/library/windows/desktop/bb762115.aspx) to
    * [SHGetPathFromIDList](https://msdn.microsoft.com/en-us/library/windows/desktop/bb762194.aspx) fails.
    */
  @scala.inline
  def BIF_RETURNONLYFSDIRS: `0x00000001` = this.cast(0x00000001)
  /**
    * The browse dialog box can display sharable resources on remote systems. This is intended for applications that want to expose remote shares on a local system. The BIF_NEWDIALOGSTYLE flag
    * must also be set.
    *
    * _[Version 5.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @scala.inline
  def BIF_SHAREABLE: `0x00008000` = this.cast(0x00008000)
  /**
    * Include a status area in the dialog box. The callback function can set the status text by sending messages to the dialog box. This flag is not supported when BIF_NEWDIALOGSTYLE
    * is specified.
    */
  @scala.inline
  def BIF_STATUSTEXT: `0x00000004` = this.cast(0x00000004)
  /**
    * When combined with `BIF_NEWDIALOGSTYLE`, adds a usage hint to the dialog box, in place of the edit box. `BIF_EDITBOX` overrides this flag.
    *
    * _[Version 6.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @scala.inline
  def BIF_UAHINT: `0x00000100` = this.cast(0x00000100)
  /**
    * Use the new user interface, including an edit box. This flag is equivalent to `BIF_EDITBOX | BIF_NEWDIALOGSTYLE`.
    *
    * _[Version 5.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @scala.inline
  def BIF_USENEWUI: `0x00000090` = this.cast(0x00000090)
  /**
    * If the user types an invalid name into the edit box, the browse dialog box calls the application's
    * [BrowseCallbackProc](https://msdn.microsoft.com/en-us/library/windows/desktop/bb762598.aspx) with the **BFFM_VALIDATEFAILED** message. This flag is ignored if BIF_EDITBOX is not specified.
    *
    * _[Version 4.71](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779)_
    */
  @scala.inline
  def BIF_VALIDATE: `0x00000020` = this.cast(0x00000020)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

