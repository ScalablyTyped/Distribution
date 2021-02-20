package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
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
trait ViewRefTracker extends StObject {
  
  def detachView(viewRef: ViewRef): Unit = js.native
}
object ViewRefTracker {
  
  @scala.inline
  def apply(detachView: ViewRef => Unit): ViewRefTracker = {
    val __obj = js.Dynamic.literal(detachView = js.Any.fromFunction1(detachView))
    __obj.asInstanceOf[ViewRefTracker]
  }
  
  @scala.inline
  implicit class ViewRefTrackerMutableBuilder[Self <: ViewRefTracker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetachView(value: ViewRef => Unit): Self = StObject.set(x, "detachView", js.Any.fromFunction1(value))
  }
}
