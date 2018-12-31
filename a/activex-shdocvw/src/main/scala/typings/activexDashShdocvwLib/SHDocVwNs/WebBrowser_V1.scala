package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WebBrowser Control */
@JSGlobal("SHDocVw.WebBrowser_V1")
@js.native
class WebBrowser_V1 protected () extends js.Object {
  /** Returns the application automation object if accessible, this automation object otherwise.. */
  val Application: js.Any = js.native
  /** Query to see if something is still in progress. */
  val Busy: scala.Boolean = js.native
  /** Returns the container/parent automation object, if any. */
  val Container: js.Any = js.native
  /** Returns the active Document automation object, if any. */
  val Document: js.Any = js.native
  /** The vertical dimension (pixels) of the frame window/object. */
  var Height: scala.Double = js.native
  /** The horizontal position (pixels) of the frame window relative to the screen/container. */
  var Left: scala.Double = js.native
  /** Gets the short (UI-friendly) name of the URL/file currently viewed. */
  val LocationName: java.lang.String = js.native
  /** Gets the full URL/path currently viewed. */
  val LocationURL: java.lang.String = js.native
  /** Returns the automation object of the container/parent if one exists or this automation object. */
  val Parent: js.Any = js.native
  var `SHDocVw.WebBrowser_V1_typekey`: WebBrowser_V1 = js.native
  /** The vertical position (pixels) of the frame window relative to the screen/container. */
  var Top: scala.Double = js.native
  /** Returns True if this is the top level object. */
  val TopLevelContainer: scala.Boolean = js.native
  /** Returns the type of the contained document object. */
  val Type: java.lang.String = js.native
  /** The horizontal dimension (pixels) of the frame window/object. */
  var Width: scala.Double = js.native
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
  /** Refresh the currently viewed page. */
  def Refresh(): scala.Unit = js.native
  /** Refresh the currently viewed page. */
  def Refresh2(): scala.Unit = js.native
  def Refresh2(Level: RefreshConstants): scala.Unit = js.native
  /** Stops opening a file. */
  def Stop(): scala.Unit = js.native
}

