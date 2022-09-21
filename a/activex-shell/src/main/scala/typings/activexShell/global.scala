package typings.activexShell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Shell32 {
    
    /** FileSearchBand Class */
    @JSGlobal("Shell32.FileSearchBand")
    @js.native
    /* private */ open class FileSearchBand ()
      extends StObject
         with typings.activexShell.Shell32.FileSearchBand
    
    /** Definition of interface Folder version 3 */
    @JSGlobal("Shell32.Folder3")
    @js.native
    /* private */ open class Folder3 ()
      extends StObject
         with typings.activexShell.Shell32.Folder3
    
    /** Definition of interface FolderItemVerb */
    @JSGlobal("Shell32.FolderItemVerb")
    @js.native
    /* private */ open class FolderItemVerb ()
      extends StObject
         with typings.activexShell.Shell32.FolderItemVerb {
      
      /** Execute the verb */
      /* CompleteClass */
      override def DoIt(): Unit = js.native
      
      /** Get display name for item */
      /* CompleteClass */
      override val Name: String = js.native
      
      /* private */ /* CompleteClass */
      @JSName("Shell32.FolderItemVerb_typekey")
      var Shell32DotFolderItemVerb_typekey: typings.activexShell.Shell32.FolderItemVerb = js.native
    }
    
    /** Definition of interface FolderItemVerbs */
    @JSGlobal("Shell32.FolderItemVerbs")
    @js.native
    /* private */ open class FolderItemVerbs ()
      extends StObject
         with typings.activexShell.Shell32.FolderItemVerbs
    
    /** Definition of interface FolderItems3 */
    @JSGlobal("Shell32.FolderItems3")
    @js.native
    /* private */ open class FolderItems3 ()
      extends StObject
         with typings.activexShell.Shell32.FolderItems3
    
    /** Shell Object Type Information */
    @JSGlobal("Shell32.Shell")
    @js.native
    /* private */ open class Shell ()
      extends StObject
         with typings.activexShell.Shell32.Shell
    
    /** ShellDispatch Load in Shell Context */
    @JSGlobal("Shell32.ShellDispatchInproc")
    @js.native
    /* private */ open class ShellDispatchInproc ()
      extends StObject
         with typings.activexShell.Shell32.ShellDispatchInproc {
      
      /* private */ /* CompleteClass */
      @JSName("Shell32.ShellDispatchInproc_typekey")
      var Shell32DotShellDispatchInproc_typekey: typings.activexShell.Shell32.ShellDispatchInproc = js.native
    }
    
    /** Shell Folder Item */
    @JSGlobal("Shell32.ShellFolderItem")
    @js.native
    /* private */ open class ShellFolderItem ()
      extends StObject
         with typings.activexShell.Shell32.ShellFolderItem
    
    /** Shell Folder View Object */
    @JSGlobal("Shell32.ShellFolderView")
    @js.native
    /* private */ open class ShellFolderView ()
      extends StObject
         with typings.activexShell.Shell32.ShellFolderView
    
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
    @JSGlobal("Shell32.ShellFolderViewOC")
    @js.native
    /* private */ open class ShellFolderViewOC ()
      extends StObject
         with typings.activexShell.Shell32.ShellFolderViewOC {
      
      /** Set the ShellFolderView object to monitor events of. */
      /* CompleteClass */
      override def SetFolderView(pdisp: typings.activexShell.Shell32.ShellFolderView): Unit = js.native
      
      /* private */ /* CompleteClass */
      @JSName("Shell32.ShellFolderViewOC_typekey")
      var Shell32DotShellFolderViewOC_typekey: typings.activexShell.Shell32.ShellFolderViewOC = js.native
    }
    
    /** Shell Link object */
    @JSGlobal("Shell32.ShellLinkObject")
    @js.native
    /* private */ open class ShellLinkObject ()
      extends StObject
         with typings.activexShell.Shell32.ShellLinkObject
    
    @JSGlobal("Shell32.ShellWindows")
    @js.native
    /* private */ open class ShellWindows ()
      extends StObject
         with typings.activexShell.Shell32.ShellWindows
  }
}
