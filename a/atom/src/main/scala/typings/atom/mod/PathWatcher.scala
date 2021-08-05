package typings.atom.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathWatcher
  extends StObject
     with DisposableLike {
  
  /**
    *  Return a Promise that will resolve when the underlying native watcher is
    *  ready to begin sending events.
    */
  def getStartPromise(): js.Promise[Unit]
  
  /** Invokes a function when any errors related to this watcher are reported. */
  def onDidError(callback: js.Function1[/* error */ Error, Unit]): Disposable
}
object PathWatcher {
  
  inline def apply(
    dispose: () => Unit,
    getStartPromise: () => js.Promise[Unit],
    onDidError: js.Function1[/* error */ Error, Unit] => Disposable
  ): PathWatcher = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getStartPromise = js.Any.fromFunction0(getStartPromise), onDidError = js.Any.fromFunction1(onDidError))
    __obj.asInstanceOf[PathWatcher]
  }
  
  extension [Self <: PathWatcher](x: Self) {
    
    inline def setGetStartPromise(value: () => js.Promise[Unit]): Self = StObject.set(x, "getStartPromise", js.Any.fromFunction0(value))
    
    inline def setOnDidError(value: js.Function1[/* error */ Error, Unit] => Disposable): Self = StObject.set(x, "onDidError", js.Any.fromFunction1(value))
  }
}
