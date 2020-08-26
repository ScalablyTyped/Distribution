package typings.activexShell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Shell32 extends js.Object {
    /** FileSearchBand Class */
    @js.native
    class FileSearchBand protected ()
      extends typings.activexShell.Shell32.FileSearchBand
    
    /** Definition of interface Folder version 3 */
    @js.native
    class Folder3 protected ()
      extends typings.activexShell.Shell32.Folder3
    
    /** Definition of interface FolderItemVerb */
    @js.native
    class FolderItemVerb protected ()
      extends typings.activexShell.Shell32.FolderItemVerb
    
    /** Definition of interface FolderItemVerbs */
    @js.native
    class FolderItemVerbs protected ()
      extends typings.activexShell.Shell32.FolderItemVerbs
    
    /** Definition of interface FolderItems3 */
    @js.native
    class FolderItems3 protected ()
      extends typings.activexShell.Shell32.FolderItems3
    
    /** Shell Object Type Information */
    @js.native
    class Shell protected ()
      extends typings.activexShell.Shell32.Shell
    
    /** ShellDispatch Load in Shell Context */
    @js.native
    class ShellDispatchInproc protected ()
      extends typings.activexShell.Shell32.ShellDispatchInproc
    
    /** Shell Folder Item */
    @js.native
    class ShellFolderItem protected ()
      extends typings.activexShell.Shell32.ShellFolderItem
    
    /** Shell Folder View Object */
    @js.native
    class ShellFolderView protected ()
      extends typings.activexShell.Shell32.ShellFolderView
    
    /**
      * The **ShellFolderView** object fires two events, **EnumDone** and **SelectionChanged**, that are typically handled by applications. However, some applications
      * must handle events from a series of **ShellFolderView** objects. For example, an application might host a **WebBrowser** control that allows users to navigate through
      * a series of folders. Each folder has its own **ShellFolderView** object with its associated events. Handling these events can be difficult.
      *
      * The **ShellFolderViewOC** object simplifies event handling for such scenarios. It allows applications to handle events for all ShellFolderView objects with a single
      * pair of **ShellFolderViewOC** event handlers. Each time the user navigates to a new folder, the application passes the associated **ShellFolderView** object to the
      * **ShellFolderViewOC** object by calling **SetFolderView**. Then, when an **EnumDone** or **SelectionChanged** event is fired, the **ShellFolderViewOC** object
      * forwards the event to its own handler for processing.
      */
    @js.native
    class ShellFolderViewOC protected ()
      extends typings.activexShell.Shell32.ShellFolderViewOC
    
    /** Shell Link object */
    @js.native
    class ShellLinkObject protected ()
      extends typings.activexShell.Shell32.ShellLinkObject
    
    @js.native
    class ShellWindows protected ()
      extends typings.activexShell.Shell32.ShellWindows
    
  }
  
}

