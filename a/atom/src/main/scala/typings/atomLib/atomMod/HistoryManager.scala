package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryManager extends js.Object {
  /**
    *  Clear all projects from the history.
    *  Note: This is not a privacy function - other traces will still exist, e.g.
    *  window state.
    */
  def clearProjects(): scala.Unit
  /** Obtain a list of previously opened projects. */
  def getProjects(): js.Array[ProjectHistory]
  /** Invoke the given callback when the list of projects changes. */
  def onDidChangeProjects(callback: js.Function1[/* args */ atomLib.Anon_Reloaded, scala.Unit]): Disposable
}

object HistoryManager {
  @scala.inline
  def apply(
    clearProjects: js.Function0[scala.Unit],
    getProjects: js.Function0[js.Array[ProjectHistory]],
    onDidChangeProjects: js.Function1[js.Function1[/* args */ atomLib.Anon_Reloaded, scala.Unit], Disposable]
  ): HistoryManager = {
    val __obj = js.Dynamic.literal(clearProjects = clearProjects, getProjects = getProjects, onDidChangeProjects = onDidChangeProjects)
  
    __obj.asInstanceOf[HistoryManager]
  }
}

