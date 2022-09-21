package typings.activexShdocvw.SHDocVw

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** WebBrowser Control */
@js.native
trait WebBrowserV1 extends StObject {
  
  /** Returns the application automation object if accessible, this automation object otherwise.. */
  val Application: Any = js.native
  
  /** Query to see if something is still in progress. */
  val Busy: Boolean = js.native
  
  /** Returns the container/parent automation object, if any. */
  val Container: Any = js.native
  
  /** Returns the active Document automation object, if any. */
  val Document: Any = js.native
  
  /** Navigates to the previous item in the history list. */
  def GoBack(): Unit = js.native
  
  /** Navigates to the next item in the history list. */
  def GoForward(): Unit = js.native
  
  /** Go home/start page. */
  def GoHome(): Unit = js.native
  
  /** Go Search Page. */
  def GoSearch(): Unit = js.native
  
  /** The vertical dimension (pixels) of the frame window/object. */
  var Height: Double = js.native
  
  /** The horizontal position (pixels) of the frame window relative to the screen/container. */
  var Left: Double = js.native
  
  /** Gets the short (UI-friendly) name of the URL/file currently viewed. */
  val LocationName: String = js.native
  
  /** Gets the full URL/path currently viewed. */
  val LocationURL: String = js.native
  
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
  
  /** Returns the automation object of the container/parent if one exists or this automation object. */
  val Parent: Any = js.native
  
  /** Refresh the currently viewed page. */
  def Refresh(): Unit = js.native
  
  /** Refresh the currently viewed page. */
  def Refresh2(): Unit = js.native
  def Refresh2(Level: RefreshConstants): Unit = js.native
  
  /* private */ @JSName("SHDocVw.WebBrowser_V1_typekey")
  var SHDocVwDotWebBrowser_V1_typekey: WebBrowserV1 = js.native
  
  /** Stops opening a file. */
  def Stop(): Unit = js.native
  
  /** The vertical position (pixels) of the frame window relative to the screen/container. */
  var Top: Double = js.native
  
  /** Returns True if this is the top level object. */
  val TopLevelContainer: Boolean = js.native
  
  /** Returns the type of the contained document object. */
  val Type: String = js.native
  
  /** The horizontal dimension (pixels) of the frame window/object. */
  var Width: Double = js.native
}
