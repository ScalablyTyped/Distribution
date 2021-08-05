package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for tracking root `ViewRef`s in `ApplicationRef`.
  *
  * NOTE: Importing `ApplicationRef` here directly creates circular dependency, which is why we have
  * a subset of the `ApplicationRef` interface `ViewRefTracker` here.
  */
trait ViewRefTracker extends StObject {
  
  def detachView(viewRef: ViewRef): Unit
}
object ViewRefTracker {
  
  inline def apply(detachView: ViewRef => Unit): ViewRefTracker = {
    val __obj = js.Dynamic.literal(detachView = js.Any.fromFunction1(detachView))
    __obj.asInstanceOf[ViewRefTracker]
  }
  
  extension [Self <: ViewRefTracker](x: Self) {
    
    inline def setDetachView(value: ViewRef => Unit): Self = StObject.set(x, "detachView", js.Any.fromFunction1(value))
  }
}
