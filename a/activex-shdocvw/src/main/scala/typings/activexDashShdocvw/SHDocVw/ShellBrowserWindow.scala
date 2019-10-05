package typings.activexDashShdocvw.SHDocVw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Shell Browser Window. */
@JSGlobal("SHDocVw.ShellBrowserWindow")
@js.native
class ShellBrowserWindow protected () extends js.Object {
  /** Controls whether address bar is shown */
  var AddressBar: Boolean = js.native
  /** Returns the application automation object if accessible, this automation object otherwise.. */
  val Application: js.Any = js.native
  /** Query to see if something is still in progress. */
  val Busy: Boolean = js.native
  /** Returns the container/parent automation object, if any. */
  val Container: js.Any = js.native
  /** Returns the active Document automation object, if any. */
  val Document: js.Any = js.native
  /** Returns file specification of the application, including path. */
  val FullName: String = js.native
  /** Maximizes window and turns off statusbar, toolbar, menubar, and titlebar. */
  var FullScreen: Boolean = js.native
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
  /** Controls if the frame is offline (read from cache) */
  var Offline: Boolean = js.native
  /** Returns the automation object of the container/parent if one exists or this automation object. */
  val Parent: js.Any = js.native
  /** Returns the path to the application. */
  val Path: String = js.native
  val ReadyState: tagREADYSTATE = js.native
  /** Registers OC as a top-level browser (for target name resolution) */
  var RegisterAsBrowser: Boolean = js.native
  /** Registers OC as a drop target for navigation */
  var RegisterAsDropTarget: Boolean = js.native
  /** Controls whether the window is resizable */
  var Resizable: Boolean = js.native
  var `SHDocVw.ShellBrowserWindow_typekey`: ShellBrowserWindow = js.native
  /** Controls if any dialog boxes can be shown */
  var Silent: Boolean = js.native
  /** Turn on or off the statusbar. */
  var StatusBar: Boolean = js.native
  /** Text of Status window. */
  var StatusText: String = js.native
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
  /** Converts client sizes into window sizes. */
  def ClientToWindow(pcx: Double, pcy: Double): Unit = js.native
  /** IOleCommandTarget::Exec */
  def ExecWB(cmdID: OLECMDID, cmdexecopt: OLECMDEXECOPT): Unit = js.native
  def ExecWB(cmdID: OLECMDID, cmdexecopt: OLECMDEXECOPT, pvaIn: js.Any): Unit = js.native
  def ExecWB(cmdID: OLECMDID, cmdexecopt: OLECMDEXECOPT, pvaIn: js.Any, pvaOut: js.Any): Unit = js.native
  /** Retrieve the Associated value for the property vtValue in the context of the object. */
  def GetProperty(Property: String): js.Any = js.native
  /** Navigates to the previous item in the history list. */
  def GoBack(): Unit = js.native
  /** Navigates to the next item in the history list. */
  def GoForward(): Unit = js.native
  /** Go home/start page. */
  def GoHome(): Unit = js.native
  /** Go Search Page. */
  def GoSearch(): Unit = js.native
  /** Navigates to a URL or file. */
  def Navigate(URL: String): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants, TargetFrameName: String): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants, TargetFrameName: String, PostData: js.Any): Unit = js.native
  def Navigate(
    URL: String,
    Flags: BrowserNavConstants,
    TargetFrameName: String,
    PostData: js.Any,
    Headers: String
  ): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants, TargetFrameName: TargetFrameValues): Unit = js.native
  def Navigate(URL: String, Flags: BrowserNavConstants, TargetFrameName: TargetFrameValues, PostData: js.Any): Unit = js.native
  def Navigate(
    URL: String,
    Flags: BrowserNavConstants,
    TargetFrameName: TargetFrameValues,
    PostData: js.Any,
    Headers: String
  ): Unit = js.native
  /** Navigates to a URL or file or pidl. */
  def Navigate2(URL: js.Any): Unit = js.native
  def Navigate2(URL: js.Any, Flags: BrowserNavConstants): Unit = js.native
  def Navigate2(URL: js.Any, Flags: BrowserNavConstants, TargetFrameName: String): Unit = js.native
  def Navigate2(URL: js.Any, Flags: BrowserNavConstants, TargetFrameName: String, PostData: js.Any): Unit = js.native
  def Navigate2(
    URL: js.Any,
    Flags: BrowserNavConstants,
    TargetFrameName: String,
    PostData: js.Any,
    Headers: String
  ): Unit = js.native
  def Navigate2(URL: js.Any, Flags: BrowserNavConstants, TargetFrameName: TargetFrameValues): Unit = js.native
  def Navigate2(URL: js.Any, Flags: BrowserNavConstants, TargetFrameName: TargetFrameValues, PostData: js.Any): Unit = js.native
  def Navigate2(
    URL: js.Any,
    Flags: BrowserNavConstants,
    TargetFrameName: TargetFrameValues,
    PostData: js.Any,
    Headers: String
  ): Unit = js.native
  /** Associates vtValue with the name szProperty in the context of the object. */
  def PutProperty(Property: String, vtValue: js.Any): Unit = js.native
  /** IOleCommandTarget::QueryStatus */
  def QueryStatusWB(cmdID: OLECMDID): OLECMDF = js.native
  /** Exits application and closes the open document. */
  def Quit(): Unit = js.native
  /** Refresh the currently viewed page. */
  def Refresh(): Unit = js.native
  /** Refresh the currently viewed page. */
  def Refresh2(): Unit = js.native
  def Refresh2(Level: RefreshConstants): Unit = js.native
  /** Set BrowserBar to Clsid */
  def ShowBrowserBar(pvaClsid: String): Unit = js.native
  def ShowBrowserBar(pvaClsid: String, pvarShow: Boolean): Unit = js.native
  def ShowBrowserBar(pvaClsid: BrowserBarConstants): Unit = js.native
  def ShowBrowserBar(pvaClsid: BrowserBarConstants, pvarShow: Boolean): Unit = js.native
  /** Stops opening a file. */
  def Stop(): Unit = js.native
}

