package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BrowseInfoFlags extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("Shell32.BrowseInfoFlags")
@js.native
object BrowseInfoFlags extends js.Object {
  /**
    * Allow folder junctions such as a library or a compressed file with a .zip file name extension to be browsed.
    *
    * _Windows 7 and later._
    */
  @js.native
  sealed trait BIF_BROWSEFILEJUNCTIONS
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /** Only return computers. If the user selects anything other than a computer, the **OK** button is grayed. */
  @js.native
  sealed trait BIF_BROWSEFORCOMPUTER
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * Only allow the selection of printers. If the user selects anything other than a printer, the **OK** button is grayed.
    *
    * In Windows XP and later systems, the best practice is to use a Windows XP-style dialog, setting the root of the dialog to the **Printers and Faxes** folder (`CSIDL_PRINTERS`).
    */
  @js.native
  sealed trait BIF_BROWSEFORPRINTER
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * The browse dialog box displays files as well as folders.
    *
    * _[Version 4.7.1](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @js.native
  sealed trait BIF_BROWSEINCLUDEFILES
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * The browse dialog box can display URLs. The `BIF_USENEWUI` and `BIF_BROWSEINCLUDEFILES` flags must also be set. If any of these three flags are not set, the browser dialog box rejects URLs.
    * Even when these flags are set, the browse dialog box displays URLs only if the folder that contains the selected item supports URLs.
    *
    * When the folder's [IShellFolder::GetAttributesOf](https://msdn.microsoft.com/en-us/library/windows/desktop/bb775068.aspx) method is called to request the selected item's attributes, the
    * folder must set the `SFGAO_FOLDER` attribute flag. Otherwise, the browse dialog box will not display the URL.
    *
    * _[Version 5.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @js.native
  sealed trait BIF_BROWSEINCLUDEURLS
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /** Do not include network folders below the domain level in the dialog box's tree view control. */
  @js.native
  sealed trait BIF_DONTGOBELOWDOMAIN
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * Include an edit control in the browse dialog box that allows the user to type the name of an item.
    *
    * _[Version 4.7.1](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @js.native
  sealed trait BIF_EDITBOX
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * Use the new user interface. Setting this flag provides the user with a larger dialog box that can be resized. The dialog box has several new capabilities, including: drag-and-drop
    * capability within the dialog box, reordering, shortcut menus, new folders, delete, and other shortcut menu commands.
    *
    * _[Version 5.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @js.native
  sealed trait BIF_NEWDIALOGSTYLE
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * Do not include the **New Folder** button in the browse dialog box.
    *
    * _[Version 6.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @js.native
  sealed trait BIF_NONEWFOLDERBUTTON
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * When the selected item is a shortcut, return the PIDL of the shortcut itself rather than its target.
    *
    * _[Version 6.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @js.native
  sealed trait BIF_NOTRANSLATETARGETS
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * Only return file system ancestors. An ancestor is a subfolder that is beneath the root folder in the namespace hierarchy. If the user selects an ancestor of the root folder that is not
    * part of the file system, the **OK** button is grayed.
    */
  @js.native
  sealed trait BIF_RETURNFSANCESTORS
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * Only return file system directories. If the user selects folders that are not part of the file system, the **OK** button is grayed.
    *
    * **Note** The **OK** button remains enabled for `\\server` items, as well as `\\server\share` and directory items. However, if the user selects a `\\server` item, passing the PIDL
    * returned by [SHBrowseForFolder](https://msdn.microsoft.com/en-us/library/windows/desktop/bb762115.aspx) to
    * [SHGetPathFromIDList](https://msdn.microsoft.com/en-us/library/windows/desktop/bb762194.aspx) fails.
    */
  @js.native
  sealed trait BIF_RETURNONLYFSDIRS
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * The browse dialog box can display sharable resources on remote systems. This is intended for applications that want to expose remote shares on a local system. The BIF_NEWDIALOGSTYLE flag
    * must also be set.
    *
    * _[Version 5.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @js.native
  sealed trait BIF_SHAREABLE
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * Include a status area in the dialog box. The callback function can set the status text by sending messages to the dialog box. This flag is not supported when BIF_NEWDIALOGSTYLE
    * is specified.
    */
  @js.native
  sealed trait BIF_STATUSTEXT
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * When combined with `BIF_NEWDIALOGSTYLE`, adds a usage hint to the dialog box, in place of the edit box. `BIF_EDITBOX` overrides this flag.
    *
    * _[Version 6.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @js.native
  sealed trait BIF_UAHINT
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * Use the new user interface, including an edit box. This flag is equivalent to `BIF_EDITBOX | BIF_NEWDIALOGSTYLE`.
    *
    * _[Version 5.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @js.native
  sealed trait BIF_USENEWUI
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /**
    * If the user types an invalid name into the edit box, the browse dialog box calls the application's
    * [BrowseCallbackProc](https://msdn.microsoft.com/en-us/library/windows/desktop/bb762598.aspx) with the **BFFM_VALIDATEFAILED** message. This flag is ignored if BIF_EDITBOX is not specified.
    *
    * _[Version 4.71](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779)_
    */
  @js.native
  sealed trait BIF_VALIDATE
    extends activexDashShellLib.Shell32Ns.BrowseInfoFlags
  
  /* 0x00010000 */ val BIF_BROWSEFILEJUNCTIONS: BIF_BROWSEFILEJUNCTIONS with scala.Double = js.native
  /* 0x00001000 */ val BIF_BROWSEFORCOMPUTER: BIF_BROWSEFORCOMPUTER with scala.Double = js.native
  /* 0x00002000 */ val BIF_BROWSEFORPRINTER: BIF_BROWSEFORPRINTER with scala.Double = js.native
  /* 0x00004000 */ val BIF_BROWSEINCLUDEFILES: BIF_BROWSEINCLUDEFILES with scala.Double = js.native
  /* 0x00000080 */ val BIF_BROWSEINCLUDEURLS: BIF_BROWSEINCLUDEURLS with scala.Double = js.native
  /* 0x00000002 */ val BIF_DONTGOBELOWDOMAIN: BIF_DONTGOBELOWDOMAIN with scala.Double = js.native
  /* 0x00000010 */ val BIF_EDITBOX: BIF_EDITBOX with scala.Double = js.native
  /* 0x00000040 */ val BIF_NEWDIALOGSTYLE: BIF_NEWDIALOGSTYLE with scala.Double = js.native
  /* 0x00000200 */ val BIF_NONEWFOLDERBUTTON: BIF_NONEWFOLDERBUTTON with scala.Double = js.native
  /* 0x00000400 */ val BIF_NOTRANSLATETARGETS: BIF_NOTRANSLATETARGETS with scala.Double = js.native
  /* 0x00000008 */ val BIF_RETURNFSANCESTORS: BIF_RETURNFSANCESTORS with scala.Double = js.native
  /* 0x00000001 */ val BIF_RETURNONLYFSDIRS: BIF_RETURNONLYFSDIRS with scala.Double = js.native
  /* 0x00008000 */ val BIF_SHAREABLE: BIF_SHAREABLE with scala.Double = js.native
  /* 0x00000004 */ val BIF_STATUSTEXT: BIF_STATUSTEXT with scala.Double = js.native
  /* 0x00000100 */ val BIF_UAHINT: BIF_UAHINT with scala.Double = js.native
  /* 0x00000090 */ val BIF_USENEWUI: BIF_USENEWUI with scala.Double = js.native
  /* 0x00000020 */ val BIF_VALIDATE: BIF_VALIDATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShellLib.Shell32Ns.BrowseInfoFlags with scala.Double] = js.native
}

