package typings.atom.mod

import typings.atom.anon.Reloaded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryManager extends StObject {
  
  /**
    *  Clear all projects from the history.
    *  Note: This is not a privacy function - other traces will still exist, e.g.
    *  window state.
    */
  def clearProjects(): Unit
  
  /** Obtain a list of previously opened projects. */
  def getProjects(): js.Array[ProjectHistory]
  
  /** Invoke the given callback when the list of projects changes. */
  def onDidChangeProjects(callback: js.Function1[/* args */ Reloaded, Unit]): Disposable
}
object HistoryManager {
  
  inline def apply(
    clearProjects: () => Unit,
    getProjects: () => js.Array[ProjectHistory],
    onDidChangeProjects: js.Function1[/* args */ Reloaded, Unit] => Disposable
  ): HistoryManager = {
    val __obj = js.Dynamic.literal(clearProjects = js.Any.fromFunction0(clearProjects), getProjects = js.Any.fromFunction0(getProjects), onDidChangeProjects = js.Any.fromFunction1(onDidChangeProjects))
    __obj.asInstanceOf[HistoryManager]
  }
  
  extension [Self <: HistoryManager](x: Self) {
    
    inline def setClearProjects(value: () => Unit): Self = StObject.set(x, "clearProjects", js.Any.fromFunction0(value))
    
    inline def setGetProjects(value: () => js.Array[ProjectHistory]): Self = StObject.set(x, "getProjects", js.Any.fromFunction0(value))
    
    inline def setOnDidChangeProjects(value: js.Function1[/* args */ Reloaded, Unit] => Disposable): Self = StObject.set(x, "onDidChangeProjects", js.Any.fromFunction1(value))
  }
}
