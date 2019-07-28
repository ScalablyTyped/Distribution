package typings.activexDashShdocvw.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ShellDispatch Load in Shell Context */
@JSGlobal("SHDocVw.ShellWindows")
@js.native
class ShellWindows protected () extends js.Object {
  /** Get count of open Shell windows */
  val Count: Double = js.native
  var `SHDocVw.ShellWindows_typekey`: ShellWindows = js.native
  /** Find the window based on the location */
  def FindWindowSW(pvarloc: js.Any, pvarlocRoot: js.Any, swClass: Double, pHWND: Double, swfwOptions: Double): js.Any = js.native
  /** Return the shell window for the given index */
  def Item(): js.Any = js.native
  def Item(index: js.Any): js.Any = js.native
  /** Notifies the activation */
  def OnActivated(lCookie: Double, fActive: Boolean): Unit = js.native
  /** Notifies on creation and frame name set */
  def OnCreated(lCookie: Double, punk: js.Any): Unit = js.native
  /** Notifies the new location */
  def OnNavigate(lCookie: Double, pvarloc: js.Any): Unit = js.native
  /** Used by IExplore to register different processes */
  def ProcessAttachDetach(fAttach: Boolean): Unit = js.native
  /** Register a window with the list */
  def Register(pid: js.Any, HWND: Double, swClass: Double, plCookie: Double): Unit = js.native
  /** Register a pending open with the list */
  def RegisterPending(lThreadId: Double, pvarloc: js.Any, pvarlocRoot: js.Any, swClass: Double, plCookie: Double): Unit = js.native
  /** Remove a window from the list */
  def Revoke(lCookie: Double): Unit = js.native
}

