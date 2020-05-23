package typings.aureliaKnockout

import typings.aureliaBinding.mod.ObserverLocator
import typings.aureliaDependencyInjection.mod.Container
import typings.aureliaLoader.mod.Loader
import typings.aureliaTemplating.mod.CompositionEngine
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-knockout", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class KnockoutBindable protected ()
    extends typings.aureliaKnockout.knockoutBindableMod.KnockoutBindable {
    def this(observerLocator: ObserverLocator) = this()
  }
  
  @js.native
  class KnockoutComposition protected ()
    extends typings.aureliaKnockout.knockoutCompositionMod.KnockoutComposition {
    def this(compositionEngine: CompositionEngine, container: Container, loader: Loader) = this()
  }
  
  @js.native
  class KnockoutCustomAttribute protected ()
    extends typings.aureliaKnockout.knockoutCustomAttributeMod.KnockoutCustomAttribute {
    def this(element: Element) = this()
  }
  
  @js.native
  class RequirePolyfill protected ()
    extends typings.aureliaKnockout.requirePolyfillMod.RequirePolyfill {
    def this(loader: Loader) = this()
  }
  
  def configure(frameworkConfig: typings.aureliaKnockout.anon.Container): Unit = js.native
  /* static members */
  @js.native
  object KnockoutCustomAttribute extends js.Object {
    def register(): Unit = js.native
  }
  
}

