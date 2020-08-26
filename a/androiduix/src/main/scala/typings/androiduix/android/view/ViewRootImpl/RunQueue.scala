package typings.androiduix.android.view.ViewRootImpl

import typings.androiduix.android.os.Handler
import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunQueue extends js.Object {
  var mActions: js.Any = js.native
  def executeActions(handler: Handler): Unit = js.native
  def post(action: Runnable): Unit = js.native
  def postDelayed(action: Runnable, delayMillis: Double): Unit = js.native
  def removeCallbacks(action: Runnable): Unit = js.native
}

object RunQueue {
  @scala.inline
  def apply(
    executeActions: Handler => Unit,
    mActions: js.Any,
    post: Runnable => Unit,
    postDelayed: (Runnable, Double) => Unit,
    removeCallbacks: Runnable => Unit
  ): RunQueue = {
    val __obj = js.Dynamic.literal(executeActions = js.Any.fromFunction1(executeActions), mActions = mActions.asInstanceOf[js.Any], post = js.Any.fromFunction1(post), postDelayed = js.Any.fromFunction2(postDelayed), removeCallbacks = js.Any.fromFunction1(removeCallbacks))
    __obj.asInstanceOf[RunQueue]
  }
  @scala.inline
  implicit class RunQueueOps[Self <: RunQueue] (val x: Self) extends AnyVal {
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
    def setExecuteActions(value: Handler => Unit): Self = this.set("executeActions", js.Any.fromFunction1(value))
    @scala.inline
    def setMActions(value: js.Any): Self = this.set("mActions", value.asInstanceOf[js.Any])
    @scala.inline
    def setPost(value: Runnable => Unit): Self = this.set("post", js.Any.fromFunction1(value))
    @scala.inline
    def setPostDelayed(value: (Runnable, Double) => Unit): Self = this.set("postDelayed", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveCallbacks(value: Runnable => Unit): Self = this.set("removeCallbacks", js.Any.fromFunction1(value))
  }
  
}

