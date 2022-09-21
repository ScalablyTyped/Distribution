package typings.aureliaKnockout

import typings.aureliaBinding.mod.ObserverLocator
import typings.aureliaDependencyInjection.mod.Container
import typings.aureliaLoader.mod.Loader
import typings.aureliaTemplating.mod.CompositionEngine
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aurelia-knockout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aurelia-knockout", "KnockoutBindable")
  @js.native
  open class KnockoutBindable protected ()
    extends typings.aureliaKnockout.knockoutBindableMod.KnockoutBindable {
    def this(observerLocator: ObserverLocator) = this()
  }
  
  @JSImport("aurelia-knockout", "KnockoutComposition")
  @js.native
  open class KnockoutComposition protected ()
    extends typings.aureliaKnockout.knockoutCompositionMod.KnockoutComposition {
    def this(compositionEngine: CompositionEngine, container: Container, loader: Loader) = this()
  }
  
  @JSImport("aurelia-knockout", "KnockoutCustomAttribute")
  @js.native
  open class KnockoutCustomAttribute protected ()
    extends typings.aureliaKnockout.knockoutCustomAttributeMod.KnockoutCustomAttribute {
    def this(element: Element) = this()
  }
  /* static members */
  object KnockoutCustomAttribute {
    
    @JSImport("aurelia-knockout", "KnockoutCustomAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
  }
  
  @JSImport("aurelia-knockout", "RequirePolyfill")
  @js.native
  open class RequirePolyfill protected ()
    extends typings.aureliaKnockout.requirePolyfillMod.RequirePolyfill {
    def this(loader: Loader) = this()
  }
  
  inline def configure(frameworkConfig: typings.aureliaKnockout.anon.Container): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(frameworkConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
