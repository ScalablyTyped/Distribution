package typings.atom.mod

import typings.atom.anon.Reloaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryManager extends js.Object {
  /**
    *  Clear all projects from the history.
    *  Note: This is not a privacy function - other traces will still exist, e.g.
    *  window state.
    */
  def clearProjects(): Unit = js.native
  /** Obtain a list of previously opened projects. */
  def getProjects(): js.Array[ProjectHistory] = js.native
  /** Invoke the given callback when the list of projects changes. */
  def onDidChangeProjects(callback: js.Function1[/* args */ Reloaded, Unit]): Disposable = js.native
}

object HistoryManager {
  @scala.inline
  def apply(
    clearProjects: () => Unit,
    getProjects: () => js.Array[ProjectHistory],
    onDidChangeProjects: js.Function1[/* args */ Reloaded, Unit] => Disposable
  ): HistoryManager = {
    val __obj = js.Dynamic.literal(clearProjects = js.Any.fromFunction0(clearProjects), getProjects = js.Any.fromFunction0(getProjects), onDidChangeProjects = js.Any.fromFunction1(onDidChangeProjects))
    __obj.asInstanceOf[HistoryManager]
  }
  @scala.inline
  implicit class HistoryManagerOps[Self <: HistoryManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClearProjects(value: () => Unit): Self = this.set("clearProjects", js.Any.fromFunction0(value))
    @scala.inline
    def setGetProjects(value: () => js.Array[ProjectHistory]): Self = this.set("getProjects", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDidChangeProjects(value: js.Function1[/* args */ Reloaded, Unit] => Disposable): Self = this.set("onDidChangeProjects", js.Any.fromFunction1(value))
  }
  
}

