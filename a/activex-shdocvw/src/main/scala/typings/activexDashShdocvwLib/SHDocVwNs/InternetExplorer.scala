package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Internet Explorer Application. */
@JSGlobal("SHDocVw.InternetExplorer")
@js.native
class InternetExplorer protected () extends js.Object {
  /** Controls whether address bar is shown */
  var AddressBar: scala.Boolean = js.native
  /** Returns the application automation object if accessible, this automation object otherwise.. */
  val Application: js.Any = js.native
  /** Query to see if something is still in progress. */
  val Busy: scala.Boolean = js.native
  /** Returns the container/parent automation object, if any. */
  val Container: js.Any = js.native
  /** Returns the active Document automation object, if any. */
  val Document: js.Any = js.native
  /** Returns file specification of the application, including path. */
  val FullName: java.lang.String = js.native
  /** Maximizes window and turns off statusbar, toolbar, menubar, and titlebar. */
  var FullScreen: scala.Boolean = js.native
  /** Returns the HWND of the current IE window. */
  val HWND: scala.Double = js.native
  /** The vertical dimension (pixels) of the frame window/object. */
  var Height: scala.Double = js.native
  /** The horizontal position (pixels) of the frame window relative to the screen/container. */
  var Left: scala.Double = js.native
  /** Gets the short (UI-friendly) name of the URL/file currently viewed. */
  val LocationName: java.lang.String = js.native
  /** Gets the full URL/path currently viewed. */
  val LocationURL: java.lang.String = js.native
  /** Controls whether menubar is shown. */
  var MenuBar: scala.Boolean = js.native
  /** Returns name of the application. */
  val Name: java.lang.String = js.native
  /** Controls if the frame is offline (read from cache) */
  var Offline: scala.Boolean = js.native
  /** Returns the automation object of the container/parent if one exists or this automation object. */
  val Parent: js.Any = js.native
  /** Returns the path to the application. */
  val Path: java.lang.String = js.native
  val ReadyState: tagREADYSTATE = js.native
  /** Registers OC as a top-level browser (for target name resolution) */
  var RegisterAsBrowser: scala.Boolean = js.native
  /** Registers OC as a drop target for navigation */
  var RegisterAsDropTarget: scala.Boolean = js.native
  /** Controls whether the window is resizable */
  var Resizable: scala.Boolean = js.native
  var `SHDocVw.InternetExplorer_typekey`: InternetExplorer = js.native
  /** Controls if any dialog boxes can be shown */
  var Silent: scala.Boolean = js.native
  /** Turn on or off the statusbar. */
  var StatusBar: scala.Boolean = js.native
  /** Text of Status window. */
  var StatusText: java.lang.String = js.native
  /** Controls if the browser is in theater mode */
  var TheaterMode: scala.Boolean = js.native
  /** Controls which toolbar is shown. */
  var ToolBar: scala.Double = js.native
  /** The vertical position (pixels) of the frame window relative to the screen/container. */
  var Top: scala.Double = js.native
  /** Returns True if this is the top level object. */
  val TopLevelContainer: scala.Boolean = js.native
  /** Returns the type of the contained document object. */
  val Type: java.lang.String = js.native
  /** Determines whether the application is visible or hidden. */
  var Visible: scala.Boolean = js.native
  /** The horizontal dimension (pixels) of the frame window/object. */
  var Width: scala.Double = js.native
  /** Converts client sizes into window sizes. */
  def ClientToWindow(pcx: scala.Double, pcy: scala.Double): scala.Unit = js.native
  /** IOleCommandTarget::Exec */
  def ExecWB(cmdID: OLECMDID, cmdexecopt: OLECMDEXECOPT): scala.Unit = js.native
  def ExecWB(cmdID: OLECMDID, cmdexecopt: OLECMDEXECOPT, pvaIn: js.Any): scala.Unit = js.native
  def ExecWB(cmdID: OLECMDID, cmdexecopt: OLECMDEXECOPT, pvaIn: js.Any, pvaOut: js.Any): scala.Unit = js.native
  /** Retrieve the Associated value for the property vtValue in the context of the object. */
  def GetProperty(Property: java.lang.String): js.Any = js.native
  /** Navigates to the previous item in the history list. */
  def GoBack(): scala.Unit = js.native
  /** Navigates to the next item in the history list. */
  def GoForward(): scala.Unit = js.native
  /** Go home/start page. */
  def GoHome(): scala.Unit = js.native
  /** Go Search Page. */
  def GoSearch(): scala.Unit = js.native
  /** Navigates to a URL or file. */
  def Navigate(URL: java.lang.String): scala.Unit = js.native
  def Navigate(URL: java.lang.String, Flags: BrowserNavConstants): scala.Unit = js.native
  def Navigate(URL: java.lang.String, Flags: BrowserNavConstants, TargetFrameName: TargetFrameValues): scala.Unit = js.native
  def Navigate(
    URL: java.lang.String,
    Flags: BrowserNavConstants,
    TargetFrameName: TargetFrameValues,
    PostData: js.Any
  ): scala.Unit = js.native
  def Navigate(
    URL: java.lang.String,
    Flags: BrowserNavConstants,
    TargetFrameName: TargetFrameValues,
    PostData: js.Any,
    Headers: java.lang.String
  ): scala.Unit = js.native
  def Navigate(URL: java.lang.String, Flags: BrowserNavConstants, TargetFrameName: java.lang.String): scala.Unit = js.native
  def Navigate(
    URL: java.lang.String,
    Flags: BrowserNavConstants,
    TargetFrameName: java.lang.String,
    PostData: js.Any
  ): scala.Unit = js.native
  def Navigate(
    URL: java.lang.String,
    Flags: BrowserNavConstants,
    TargetFrameName: java.lang.String,
    PostData: js.Any,
    Headers: java.lang.String
  ): scala.Unit = js.native
  /** Navigates to a URL or file or pidl. */
  def Navigate2(URL: js.Any): scala.Unit = js.native
  def Navigate2(URL: js.Any, Flags: BrowserNavConstants): scala.Unit = js.native
  def Navigate2(URL: js.Any, Flags: BrowserNavConstants, TargetFrameName: TargetFrameValues): scala.Unit = js.native
  def Navigate2(URL: js.Any, Flags: BrowserNavConstants, TargetFrameName: TargetFrameValues, PostData: js.Any): scala.Unit = js.native
  def Navigate2(
    URL: js.Any,
    Flags: BrowserNavConstants,
    TargetFrameName: TargetFrameValues,
    PostData: js.Any,
    Headers: java.lang.String
  ): scala.Unit = js.native
  def Navigate2(URL: js.Any, Flags: BrowserNavConstants, TargetFrameName: java.lang.String): scala.Unit = js.native
  def Navigate2(URL: js.Any, Flags: BrowserNavConstants, TargetFrameName: java.lang.String, PostData: js.Any): scala.Unit = js.native
  def Navigate2(
    URL: js.Any,
    Flags: BrowserNavConstants,
    TargetFrameName: java.lang.String,
    PostData: js.Any,
    Headers: java.lang.String
  ): scala.Unit = js.native
  /** Associates vtValue with the name szProperty in the context of the object. */
  def PutProperty(Property: java.lang.String, vtValue: js.Any): scala.Unit = js.native
  /** IOleCommandTarget::QueryStatus */
  def QueryStatusWB(cmdID: OLECMDID): OLECMDF = js.native
  /** Exits application and closes the open document. */
  def Quit(): scala.Unit = js.native
  /** Refresh the currently viewed page. */
  def Refresh(): scala.Unit = js.native
  /** Refresh the currently viewed page. */
  def Refresh2(): scala.Unit = js.native
  def Refresh2(Level: RefreshConstants): scala.Unit = js.native
  def ShowBrowserBar(pvaClsid: BrowserBarConstants): scala.Unit = js.native
  def ShowBrowserBar(pvaClsid: BrowserBarConstants, pvarShow: scala.Boolean): scala.Unit = js.native
  /** Set BrowserBar to Clsid */
  def ShowBrowserBar(pvaClsid: java.lang.String): scala.Unit = js.native
  def ShowBrowserBar(pvaClsid: java.lang.String, pvarShow: scala.Boolean): scala.Unit = js.native
  /** Stops opening a file. */
  def Stop(): scala.Unit = js.native
}

