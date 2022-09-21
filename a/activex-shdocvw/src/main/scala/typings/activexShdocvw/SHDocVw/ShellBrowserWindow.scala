package typings.activexShdocvw.SHDocVw

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Shell Browser Window. */
@js.native
trait ShellBrowserWindow extends StObject {
  
  /** Controls whether address bar is shown */
  var AddressBar: Boolean = js.native
  
  /** Returns the application automation object if accessible, this automation object otherwise.. */
  val Application: Any = js.native
  
  /** Query to see if something is still in progress. */
  val Busy: Boolean = js.native
  
  /** Converts client sizes into window sizes. */
  def ClientToWindow(pcx: Double, pcy: Double): Unit = js.native
  
  /** Returns the container/parent automation object, if any. */
  val Container: Any = js.native
  
  /** Returns the active Document automation object, if any. */
  val Document: Any = js.native
  
  /** IOleCommandTarget::Exec */
  def ExecWB(cmdID: OLECMDID, cmdexecopt: OLECMDEXECOPT): Unit = js.native
  def ExecWB(cmdID: OLECMDID, cmdexecopt: OLECMDEXECOPT, pvaIn: Any): Unit = js.native
  def ExecWB(cmdID: OLECMDID, cmdexecopt: OLECMDEXECOPT, pvaIn: Any, pvaOut: Any): Unit = js.native
  def ExecWB(cmdID: OLECMDID, cmdexecopt: OLECMDEXECOPT, pvaIn: Unit, pvaOut: Any): Unit = js.native
  
  /** Returns file specification of the application, including path. */
  val FullName: String = js.native
  
  /** Maximizes window and turns off statusbar, toolbar, menubar, and titlebar. */
  var FullScreen: Boolean = js.native
  
  /** Retrieve the Associated value for the property vtValue in the context of the object. */
  def GetProperty(Property: String): Any = js.native
  
  /** Navigates to the previous item in the history list. */
  def GoBack(): Unit = js.native
  
  /** Navigates to the next item in the history list. */
  def GoForward(): Unit = js.native
  
  /** Go home/start page. */
  def GoHome(): Unit = js.native
  
  /** Go Search Page. */
  def GoSearch(): Unit = js.native
  
  /** Returns the HWND of the current IE window. */
  val HWND: Double = js.native
  
  /** The vertical dimension (pixels) of the frame window/object. */
  var Height: Double = js.native
  
  /** The horizontal position (pixels) of the frame window relative to the screen/container. */
  var Left: Double = js.native
  
  /** Gets the short (UI-friendly) name of the URL/file currently viewed. */
  val LocationName: String = js.native
  
  /** Gets the full URL/path currently viewed. */
  val LocationURL: String = js.native
  
  /** Controls whether menubar is shown. */
  var MenuBar: Boolean = js.native
  
  /** Returns name of the application. */
  val Name: String = js.native
  
  /** Navigates to a URL or file. */
  def Navigate(URL: String): Unit = js.native
  def Navigate(URL: String, Flags: Unit, TargetFrameName: String): Unit = js.native
  def Navigate(URL: String, Flags: Unit, TargetFrameName: String, PostData: Any): Unit = js.native
  def Navigate(URL: String, Flags: Unit, TargetFrameName: String, PostData: Any, Headers: String): Unit = js.native
  def Navigate(URL: String, Flags: Unit, TargetFrameName: String, PostData: Unit, Headers: String): Unit = js.native
  def Navigate(URL: String, Flags: Unit, TargetFrameName: Unit, PostData: Any): Unit = js.native
  def Navigate(URL: String, Flags: Unit, TargetFrameName: Unit, PostData: Any, Headers: String): Unit = js.native
  def Navigate(URL: String, Flags: Unit, TargetFrameName: Unit, PostData: Unit, Headers: String): Unit = js.native
  def Navigate(URL: String, Flags: Unit, TargetFrameName: TargetFrameValues): Unit = js.native
  def Navigate(URL: String, Flags: Unit, TargetFrameName: TargetFrameValues, PostData: Any): Unit = js.native
  def Navigate(URL: String, Flags: Unit, TargetFrameName: TargetFrameValues, PostData: Any, Headers: String): Unit = js.native
  def Navigate(URL: String, Flags: Unit, TargetFrameName: TargetFrameValues, PostData: Unit, Headers: String): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants, TargetFrameName: String): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants, TargetFrameName: String, PostData: Any): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants, TargetFrameName: String, PostData: Any, Headers: String): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants, TargetFrameName: String, PostData: Unit, Headers: String): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants, TargetFrameName: Unit, PostData: Any): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants, TargetFrameName: Unit, PostData: Any, Headers: String): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants, TargetFrameName: Unit, PostData: Unit, Headers: String): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants, TargetFrameName: TargetFrameValues): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants, TargetFrameName: TargetFrameValues, PostData: Any): Unit = js.native
  def Navigate(
    URL: String,
    Flags: BrowserNavConstants,
    TargetFrameName: TargetFrameValues,
    PostData: Any,
    Headers: String
  ): Unit = js.native
  def Navigate(
    URL: String,
    Flags: BrowserNavConstants,
    TargetFrameName: TargetFrameValues,
    PostData: Unit,
    Headers: String
  ): Unit = js.native
  
  /** Navigates to a URL or file or pidl. */
  def Navigate2(URL: Any): Unit = js.native
  def Navigate2(URL: Any, Flags: Unit, TargetFrameName: String): Unit = js.native
  def Navigate2(URL: Any, Flags: Unit, TargetFrameName: String, PostData: Any): Unit = js.native
  def Navigate2(URL: Any, Flags: Unit, TargetFrameName: String, PostData: Any, Headers: String): Unit = js.native
  def Navigate2(URL: Any, Flags: Unit, TargetFrameName: String, PostData: Unit, Headers: String): Unit = js.native
  def Navigate2(URL: Any, Flags: Unit, TargetFrameName: Unit, PostData: Any): Unit = js.native
  def Navigate2(URL: Any, Flags: Unit, TargetFrameName: Unit, PostData: Any, Headers: String): Unit = js.native
  def Navigate2(URL: Any, Flags: Unit, TargetFrameName: Unit, PostData: Unit, Headers: String): Unit = js.native
  def Navigate2(URL: Any, Flags: Unit, TargetFrameName: TargetFrameValues): Unit = js.native
  def Navigate2(URL: Any, Flags: Unit, TargetFrameName: TargetFrameValues, PostData: Any): Unit = js.native
  def Navigate2(URL: Any, Flags: Unit, TargetFrameName: TargetFrameValues, PostData: Any, Headers: String): Unit = js.native
  def Navigate2(URL: Any, Flags: Unit, TargetFrameName: TargetFrameValues, PostData: Unit, Headers: String): Unit = js.native
  def Navigate2(URL: Any, Flags: BrowserNavConstants): Unit = js.native
  def Navigate2(URL: Any, Flags: BrowserNavConstants, TargetFrameName: String): Unit = js.native
  def Navigate2(URL: Any, Flags: BrowserNavConstants, TargetFrameName: String, PostData: Any): Unit = js.native
  def Navigate2(URL: Any, Flags: BrowserNavConstants, TargetFrameName: String, PostData: Any, Headers: String): Unit = js.native
  def Navigate2(URL: Any, Flags: BrowserNavConstants, TargetFrameName: String, PostData: Unit, Headers: String): Unit = js.native
  def Navigate2(URL: Any, Flags: BrowserNavConstants, TargetFrameName: Unit, PostData: Any): Unit = js.native
  def Navigate2(URL: Any, Flags: BrowserNavConstants, TargetFrameName: Unit, PostData: Any, Headers: String): Unit = js.native
  def Navigate2(URL: Any, Flags: BrowserNavConstants, TargetFrameName: Unit, PostData: Unit, Headers: String): Unit = js.native
  def Navigate2(URL: Any, Flags: BrowserNavConstants, TargetFrameName: TargetFrameValues): Unit = js.native
  def Navigate2(URL: Any, Flags: BrowserNavConstants, TargetFrameName: TargetFrameValues, PostData: Any): Unit = js.native
  def Navigate2(
    URL: Any,
    Flags: BrowserNavConstants,
    TargetFrameName: TargetFrameValues,
    PostData: Any,
    Headers: String
  ): Unit = js.native
  def Navigate2(
    URL: Any,
    Flags: BrowserNavConstants,
    TargetFrameName: TargetFrameValues,
    PostData: Unit,
    Headers: String
  ): Unit = js.native
  
  /** Controls if the frame is offline (read from cache) */
  var Offline: Boolean = js.native
  
  /** Returns the automation object of the container/parent if one exists or this automation object. */
  val Parent: Any = js.native
  
  /** Returns the path to the application. */
  val Path: String = js.native
  
  /** Associates vtValue with the name szProperty in the context of the object. */
  def PutProperty(Property: String, vtValue: Any): Unit = js.native
  
  /** IOleCommandTarget::QueryStatus */
  def QueryStatusWB(cmdID: OLECMDID): OLECMDF = js.native
  
  /** Exits application and closes the open document. */
  def Quit(): Unit = js.native
  
  val ReadyState: tagREADYSTATE = js.native
  
  /** Refresh the currently viewed page. */
  def Refresh(): Unit = js.native
  
  /** Refresh the currently viewed page. */
  def Refresh2(): Unit = js.native
  def Refresh2(Level: RefreshConstants): Unit = js.native
  
  /** Registers OC as a top-level browser (for target name resolution) */
  var RegisterAsBrowser: Boolean = js.native
  
  /** Registers OC as a drop target for navigation */
  var RegisterAsDropTarget: Boolean = js.native
  
  /** Controls whether the window is resizable */
  var Resizable: Boolean = js.native
  
  /* private */ @JSName("SHDocVw.ShellBrowserWindow_typekey")
  var SHDocVwDotShellBrowserWindow_typekey: ShellBrowserWindow = js.native
  
  /** Set BrowserBar to Clsid */
  def ShowBrowserBar(pvaClsid: String): Unit = js.native
  def ShowBrowserBar(pvaClsid: String, pvarShow: Boolean): Unit = js.native
  def ShowBrowserBar(pvaClsid: BrowserBarConstants): Unit = js.native
  def ShowBrowserBar(pvaClsid: BrowserBarConstants, pvarShow: Boolean): Unit = js.native
  
  /** Controls if any dialog boxes can be shown */
  var Silent: Boolean = js.native
  
  /** Turn on or off the statusbar. */
  var StatusBar: Boolean = js.native
  
  /** Text of Status window. */
  var StatusText: String = js.native
  
  /** Stops opening a file. */
  def Stop(): Unit = js.native
  
  /** Controls if the browser is in theater mode */
  var TheaterMode: Boolean = js.native
  
  /** Controls which toolbar is shown. */
  var ToolBar: Double = js.native
  
  /** The vertical position (pixels) of the frame window relative to the screen/container. */
  var Top: Double = js.native
  
  /** Returns True if this is the top level object. */
  val TopLevelContainer: Boolean = js.native
  
  /** Returns the type of the contained document object. */
  val Type: String = js.native
  
  /** Determines whether the application is visible or hidden. */
  var Visible: Boolean = js.native
  
  /** The horizontal dimension (pixels) of the frame window/object. */
  var Width: Double = js.native
}
