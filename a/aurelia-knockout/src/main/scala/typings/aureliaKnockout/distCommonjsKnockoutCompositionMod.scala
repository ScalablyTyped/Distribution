package typings.aureliaKnockout

import typings.aureliaDependencyInjection.mod.Container
import typings.aureliaLoader.mod.Loader
import typings.aureliaTemplating.mod.CompositionEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsKnockoutCompositionMod {
  
  @JSImport("aurelia-knockout/dist/commonjs/knockout-composition", "KnockoutComposition")
  @js.native
  open class KnockoutComposition protected () extends StObject {
    def this(compositionEngine: CompositionEngine, container: Container, loader: Loader) = this()
    
    /** internal: do not use */
    def buildCompositionSettings(value: Any, bindingContext: Any): js.Promise[Any] = js.native
    
    var compositionEngine: CompositionEngine = js.native
    
    var container: Container = js.native
    
    /** internal: do not use */
    def getViewModelInstance(moduleId: String): js.Promise[Any] = js.native
    
    var loader: Loader = js.native
    
    /**
      * Registers the `compose` Knockout Binding to use Compositions in your Views.
      */
    def register(): Unit = js.native
  }
}
