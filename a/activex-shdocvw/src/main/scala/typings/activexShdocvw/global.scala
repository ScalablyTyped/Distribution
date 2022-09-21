package typings.activexShdocvw

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object SHDocVw {
    
    @JSGlobal("SHDocVw.CScriptErrorList")
    @js.native
    /* private */ open class CScriptErrorList ()
      extends StObject
         with typings.activexShdocvw.SHDocVw.CScriptErrorList {
      
      /* private */ /* CompleteClass */
      @JSName("SHDocVw.CScriptErrorList_typekey")
      var SHDocVwDotCScriptErrorList_typekey: typings.activexShdocvw.SHDocVw.CScriptErrorList = js.native
      
      /* CompleteClass */
      override def advanceError(): Unit = js.native
      
      /* CompleteClass */
      override def canAdvanceError(): Double = js.native
      
      /* CompleteClass */
      override def canRetreatError(): Double = js.native
      
      /* CompleteClass */
      override def getAlwaysShowLockState(): Double = js.native
      
      /* CompleteClass */
      override def getDetailsPaneOpen(): Double = js.native
      
      /* CompleteClass */
      override def getErrorChar(): Double = js.native
      
      /* CompleteClass */
      override def getErrorCode(): Double = js.native
      
      /* CompleteClass */
      override def getErrorLine(): Double = js.native
      
      /* CompleteClass */
      override def getErrorMsg(): String = js.native
      
      /* CompleteClass */
      override def getErrorUrl(): String = js.native
      
      /* CompleteClass */
      override def getPerErrorDisplay(): Double = js.native
      
      /* CompleteClass */
      override def retreatError(): Unit = js.native
      
      /* CompleteClass */
      override def setDetailsPaneOpen(fDetailsPaneOpen: Double): Unit = js.native
      
      /* CompleteClass */
      override def setPerErrorDisplay(fPerErrorDisplay: Double): Unit = js.native
    }
    
    /** Internet Explorer Application. */
    @JSGlobal("SHDocVw.InternetExplorer")
    @js.native
    /* private */ open class InternetExplorer ()
      extends StObject
         with typings.activexShdocvw.SHDocVw.InternetExplorer
    
    /** Internet Explorer Application with default integrity of Medium */
    @JSGlobal("SHDocVw.InternetExplorerMedium")
    @js.native
    /* private */ open class InternetExplorerMedium ()
      extends StObject
         with typings.activexShdocvw.SHDocVw.InternetExplorerMedium
    
    /** Shell Browser Window. */
    @JSGlobal("SHDocVw.ShellBrowserWindow")
    @js.native
    /* private */ open class ShellBrowserWindow ()
      extends StObject
         with typings.activexShdocvw.SHDocVw.ShellBrowserWindow
    
    @JSGlobal("SHDocVw.ShellNameSpace")
    @js.native
    /* private */ open class ShellNameSpace ()
      extends StObject
         with typings.activexShdocvw.SHDocVw.ShellNameSpace {
      
      /* CompleteClass */
      var Columns: String = js.native
      
      /** number of view types */
      /* CompleteClass */
      override val CountViewTypes: Double = js.native
      
      /** method CreateSubscriptionForSelection */
      /* CompleteClass */
      override def CreateSubscriptionForSelection(): Boolean = js.native
      
      /** method DeleteSubscriptionForSelection */
      /* CompleteClass */
      override def DeleteSubscriptionForSelection(): Boolean = js.native
      
      /* CompleteClass */
      var Depth: Double = js.native
      
      /** options  */
      /* CompleteClass */
      var EnumOptions: Double = js.native
      
      /** expands item specified depth */
      /* CompleteClass */
      override def Expand(var_0: Any, iDepth: Double): Unit = js.native
      
      /** method Export */
      /* CompleteClass */
      override def Export(): Unit = js.native
      
      /* CompleteClass */
      var Flags: Double = js.native
      
      /** method Import */
      /* CompleteClass */
      override def Import(): Unit = js.native
      
      /** method InvokeContextMenuCommand */
      /* CompleteClass */
      override def InvokeContextMenuCommand(strCommand: String): Unit = js.native
      
      /* CompleteClass */
      var Mode: Double = js.native
      
      /** method MoveSelectionDown */
      /* CompleteClass */
      override def MoveSelectionDown(): Unit = js.native
      
      /** method MoveSelectionTo */
      /* CompleteClass */
      override def MoveSelectionTo(): Unit = js.native
      
      /** method MoveSelectionUp */
      /* CompleteClass */
      override def MoveSelectionUp(): Unit = js.native
      
      /** method NewFolder */
      /* CompleteClass */
      override def NewFolder(): Unit = js.native
      
      /** method ResetSort */
      /* CompleteClass */
      override def ResetSort(): Unit = js.native
      
      /** get the root item */
      /* CompleteClass */
      var Root: Any = js.native
      
      /* private */ /* CompleteClass */
      @JSName("SHDocVw.ShellNameSpace_typekey")
      var SHDocVwDotShellNameSpace_typekey: typings.activexShdocvw.SHDocVw.ShellNameSpace = js.native
      
      /** get the selected item */
      /* CompleteClass */
      var SelectedItem: Any = js.native
      
      /** collection of selected items */
      /* CompleteClass */
      override def SelectedItems(): Any = js.native
      
      /** old, use put_Root() instead */
      /* CompleteClass */
      override def SetRoot(bstrFullPath: String): Unit = js.native
      
      /** set view type */
      /* CompleteClass */
      override def SetViewType(iType: Double): Unit = js.native
      
      /** Query to see if subscriptions are enabled */
      /* CompleteClass */
      override val SubscriptionsEnabled: Boolean = js.native
      
      /** method Synchronize */
      /* CompleteClass */
      override def Synchronize(): Unit = js.native
      
      /* CompleteClass */
      var TVFlags: Double = js.native
      
      /** unselects all items */
      /* CompleteClass */
      override def UnselectAll(): Unit = js.native
    }
    
    @JSGlobal("SHDocVw.ShellUIHelper")
    @js.native
    /* private */ open class ShellUIHelper ()
      extends StObject
         with typings.activexShdocvw.SHDocVw.ShellUIHelper
    
    /** ShellDispatch Load in Shell Context */
    @JSGlobal("SHDocVw.ShellWindows")
    @js.native
    /* private */ open class ShellWindows ()
      extends StObject
         with typings.activexShdocvw.SHDocVw.ShellWindows
    
    /** WebBrowser Control */
    @JSGlobal("SHDocVw.WebBrowser")
    @js.native
    /* private */ open class WebBrowser ()
      extends StObject
         with typings.activexShdocvw.SHDocVw.WebBrowser
    
    /** WebBrowser Control */
    @JSGlobal("SHDocVw.WebBrowser_V1")
    @js.native
    /* private */ open class WebBrowserV1 ()
      extends StObject
         with typings.activexShdocvw.SHDocVw.WebBrowserV1
  }
}
