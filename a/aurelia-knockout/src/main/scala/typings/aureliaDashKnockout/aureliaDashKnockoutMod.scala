package typings.aureliaDashKnockout

import typings.aureliaDashBinding.aureliaDashBindingMod.ObserverLocator
import typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod.Container
import typings.aureliaDashLoader.aureliaDashLoaderMod.Loader
import typings.aureliaDashTemplating.aureliaDashTemplatingMod.CompositionEngine
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-knockout", JSImport.Namespace)
@js.native
object aureliaDashKnockoutMod extends js.Object {
  @js.native
  class KnockoutBindable protected ()
    extends typings.aureliaDashKnockout.distCommonjsKnockoutDashBindableMod.KnockoutBindable {
    def this(observerLocator: ObserverLocator) = this()
  }
  
  @js.native
  class KnockoutComposition protected ()
    extends typings.aureliaDashKnockout.distCommonjsKnockoutDashCompositionMod.KnockoutComposition {
    def this(compositionEngine: CompositionEngine, container: Container, loader: Loader) = this()
  }
  
  @js.native
  class KnockoutCustomAttribute protected ()
    extends typings.aureliaDashKnockout.distCommonjsKnockoutDashCustomDashAttributeMod.KnockoutCustomAttribute {
    def this(element: Element) = this()
  }
  
  @js.native
  class RequirePolyfill protected ()
    extends typings.aureliaDashKnockout.distCommonjsRequireDashPolyfillMod.RequirePolyfill {
    def this(loader: Loader) = this()
  }
  
  def configure(frameworkConfig: Anon_Container): Unit = js.native
  /* static members */
  @js.native
  object KnockoutCustomAttribute extends js.Object {
    def register(): Unit = js.native
  }
  
}

