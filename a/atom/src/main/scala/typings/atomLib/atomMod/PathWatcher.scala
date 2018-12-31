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

