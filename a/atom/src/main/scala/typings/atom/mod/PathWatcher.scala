package typings.atom.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathWatcher extends DisposableLike {
  
  /**
    *  Return a Promise that will resolve when the underlying native watcher is
    *  ready to begin sending events.
    */
  def getStartPromise(): js.Promise[Unit] = js.native
  
  /** Invokes a function when any errors related to this watcher are reported. */
  def onDidError(callback: js.Function1[/* error */ Error, Unit]): Disposable = js.native
}
object PathWatcher {
  
  @scala.inline
  def apply(
    dispose: () => Unit,
    getStartPromise: () => js.Promise[Unit],
    onDidError: js.Function1[/* error */ Error, Unit] => Disposable
  ): PathWatcher = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getStartPromise = js.Any.fromFunction0(getStartPromise), onDidError = js.Any.fromFunction1(onDidError))
    __obj.asInstanceOf[PathWatcher]
  }
  
  @scala.inline
  implicit class PathWatcherOps[Self <: PathWatcher] (val x: Self) extends AnyVal {
    
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
    def setGetStartPromise(value: () => js.Promise[Unit]): Self = this.set("getStartPromise", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDidError(value: js.Function1[/* error */ Error, Unit] => Disposable): Self = this.set("onDidError", js.Any.fromFunction1(value))
  }
}
