package typings.aureliaKnockout

import typings.aureliaBinding.mod.InternalPropertyObserver
import typings.aureliaBinding.mod.ObserverLocator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object knockoutBindableMod {
  
  @JSImport("aurelia-knockout/dist/commonjs/knockout-bindable", "KnockoutBindable")
  @js.native
  open class KnockoutBindable protected () extends StObject {
    def this(observerLocator: ObserverLocator) = this()
    
    /**
      * Applys all values from a data object (usually the activation data) to the corresponding instance fields
      * in the current view model if they are marked as @bindable. By default all matching values from the data object
      * are applied. To only apply observable values set the last parameter to `true`. Subscriptions are created
      * for all Knockout observables in the data object to update the view-model values respectively.
      *
      * @param data - the data object
      * @param target - the target view model
      * @param applyOnlyObservables - `true` if only observable values should be applied, false by default.
      */
    def applyBindableValues(data: Any, target: Any, applyOnlyObservables: Boolean): Unit = js.native
    
    /** internal: do not use */
    def getObserver(target: Any, key: String): InternalPropertyObserver = js.native
    
    var observerLocator: ObserverLocator = js.native
    
    var subscriptions: js.Array[Any] = js.native
  }
}
