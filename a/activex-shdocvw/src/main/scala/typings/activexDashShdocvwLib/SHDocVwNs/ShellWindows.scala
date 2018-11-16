package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ShellDispatch Load in Shell Context */
@JSGlobal("SHDocVw.ShellWindows")
@js.native
class ShellWindows protected () extends js.Object {
  /** Get count of open Shell windows */
  val Count: scala.Double = js.native
  var `SHDocVw.ShellWindows_typekey`: ShellWindows = js.native
  /** Find the window based on the location */
  def FindWindowSW(
    pvarloc: js.Any,
    pvarlocRoot: js.Any,
    swClass: scala.Double,
    pHWND: scala.Double,
    swfwOptions: scala.Double
  ): js.Any = js.native
  /** Return the shell window for the given index */
  def Item(): js.Any = js.native
  /** Return the shell window for the given index */
  def Item(index: js.Any): js.Any = js.native
  /** Notifies the activation */
  def OnActivated(lCookie: scala.Double, fActive: scala.Boolean): scala.Unit = js.native
  /** Notifies on creation and frame name set */
  def OnCreated(lCookie: scala.Double, punk: js.Any): scala.Unit = js.native
  /** Notifies the new location */
  def OnNavigate(lCookie: scala.Double, pvarloc: js.Any): scala.Unit = js.native
  /** Used by IExplore to register different processes */
  def ProcessAttachDetach(fAttach: scala.Boolean): scala.Unit = js.native
  /** Register a window with the list */
  def Register(pid: js.Any, HWND: scala.Double, swClass: scala.Double, plCookie: scala.Double): scala.Unit = js.native
  /** Register a pending open with the list */
  def RegisterPending(
    lThreadId: scala.Double,
    pvarloc: js.Any,
    pvarlocRoot: js.Any,
    swClass: scala.Double,
    plCookie: scala.Double
  ): scala.Unit = js.native
  /** Remove a window from the list */
  def Revoke(lCookie: scala.Double): scala.Unit = js.native
}

