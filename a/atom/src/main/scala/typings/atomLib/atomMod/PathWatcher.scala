package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathWatcher extends DisposableLike {
  /**
    *  Return a Promise that will resolve when the underlying native watcher is
    *  ready to begin sending events.
    */
  def getStartPromise(): js.Promise[scala.Unit]
  /** Invokes a function when any errors related to this watcher are reported. */
  def onDidError(callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): Disposable
}

object PathWatcher {
  @scala.inline
  def apply(
    dispose: () => scala.Unit,
    getStartPromise: () => js.Promise[scala.Unit],
    onDidError: js.Function1[/* error */ stdLib.Error, scala.Unit] => Disposable
  ): PathWatcher = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getStartPromise = js.Any.fromFunction0(getStartPromise), onDidError = js.Any.fromFunction1(onDidError))
  
    __obj.asInstanceOf[PathWatcher]
  }
}

