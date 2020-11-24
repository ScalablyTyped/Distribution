package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for tracking root `ViewRef`s in `ApplicationRef`.
  *
  * NOTE: Importing `ApplicationRef` here directly creates circular dependency, which is why we have
  * a subset of the `ApplicationRef` interface `ViewRefTracker` here.
  */
@js.native
trait ViewRefTracker extends js.Object {
  
  def detachView(viewRef: ViewRef): Unit = js.native
}
object ViewRefTracker {
  
  @scala.inline
  def apply(detachView: ViewRef => Unit): ViewRefTracker = {
    val __obj = js.Dynamic.literal(detachView = js.Any.fromFunction1(detachView))
    __obj.asInstanceOf[ViewRefTracker]
  }
  
  @scala.inline
  implicit class ViewRefTrackerOps[Self <: ViewRefTracker] (val x: Self) extends AnyVal {
    
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
    def setDetachView(value: ViewRef => Unit): Self = this.set("detachView", js.Any.fromFunction1(value))
  }
}
