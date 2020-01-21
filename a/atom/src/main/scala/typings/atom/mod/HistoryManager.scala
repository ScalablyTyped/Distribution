package typings.atom.mod

import typings.atom.AnonReloaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryManager extends js.Object {
  /**
    *  Clear all projects from the history.
    *  Note: This is not a privacy function - other traces will still exist, e.g.
    *  window state.
    */
  def clearProjects(): Unit
  /** Obtain a list of previously opened projects. */
  def getProjects(): js.Array[ProjectHistory]
  /** Invoke the given callback when the list of projects changes. */
  def onDidChangeProjects(callback: js.Function1[/* args */ AnonReloaded, Unit]): Disposable
}

object HistoryManager {
  @scala.inline
  def apply(
    clearProjects: () => Unit,
    getProjects: () => js.Array[ProjectHistory],
    onDidChangeProjects: js.Function1[/* args */ AnonReloaded, Unit] => Disposable
  ): HistoryManager = {
    val __obj = js.Dynamic.literal(clearProjects = js.Any.fromFunction0(clearProjects), getProjects = js.Any.fromFunction0(getProjects), onDidChangeProjects = js.Any.fromFunction1(onDidChangeProjects))
  
    __obj.asInstanceOf[HistoryManager]
  }
}

