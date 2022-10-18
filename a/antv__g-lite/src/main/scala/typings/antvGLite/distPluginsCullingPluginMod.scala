package typings.antvGLite

import typings.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typings.antvGLite.distServicesRenderingContextMod.RenderingContext
import typings.antvGLite.distServicesRenderingServiceMod.RenderingPlugin
import typings.antvGLite.distServicesRenderingServiceMod.RenderingService
import typings.manaSyringe.libContributionMod.Contribution.Provider
import typings.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsCullingPluginMod {
  
  @JSImport("@antv/g-lite/dist/plugins/CullingPlugin", "CullingPlugin")
  @js.native
  open class CullingPlugin protected ()
    extends StObject
       with RenderingPlugin {
    def this(strategyProvider: Provider[CullingStrategyContribution], renderingContext: RenderingContext) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(renderer: RenderingService): Unit = js.native
    
    /* private */ var renderingContext: Any = js.native
    
    /* private */ var strategyProvider: Any = js.native
  }
  /* static members */
  object CullingPlugin {
    
    @JSImport("@antv/g-lite/dist/plugins/CullingPlugin", "CullingPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/plugins/CullingPlugin", "CullingPlugin.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
  
  trait CullingStrategyContribution extends StObject {
    
    def isVisible(`object`: DisplayObject[Any, Any]): Boolean
  }
  object CullingStrategyContribution {
    
    @JSImport("@antv/g-lite/dist/plugins/CullingPlugin", "CullingStrategyContribution")
    @js.native
    val ^ : DefinedToken = js.native
    
    extension [Self <: CullingStrategyContribution](x: Self) {
      
      inline def setIsVisible(value: DisplayObject[Any, Any] => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction1(value))
    }
  }
}
