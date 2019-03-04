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
  def onDidError(callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): Disposable
}

object PathWatcher {
  @scala.inline
  def apply(
    dispose: js.Function0[scala.Unit],
    getStartPromise: js.Function0[js.Promise[scala.Unit]],
    onDidError: js.Function1[js.Function1[/* error */ nodeLib.Error, scala.Unit], Disposable]
  ): PathWatcher = {
    val __obj = js.Dynamic.literal(dispose = dispose, getStartPromise = getStartPromise, onDidError = onDidError)
  
    __obj.asInstanceOf[PathWatcher]
  }
}

