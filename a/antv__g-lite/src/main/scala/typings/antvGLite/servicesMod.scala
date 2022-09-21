package typings.antvGLite

import typings.antvGLite.cssInterfacesMod.StyleValueRegistry
import typings.antvGLite.displayObjectsMod.DisplayObjectPool
import typings.antvGLite.distTypesMod.CanvasConfig
import typings.antvGLite.interfacesMod.ICamera
import typings.antvGLite.renderingServiceMod.RenderingPlugin
import typings.manaSyringe.contributionMod.Contribution.Provider
import typings.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesMod {
  
  @JSImport("@antv/g-lite/dist/services", "CircleUpdater")
  @js.native
  open class CircleUpdater ()
    extends typings.antvGLite.aabbMod.CircleUpdater
  
  @JSImport("@antv/g-lite/dist/services", "ContextService")
  @js.native
  val ContextService: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "DefaultSceneGraphSelector")
  @js.native
  open class DefaultSceneGraphSelector ()
    extends typings.antvGLite.sceneGraphSelectorMod.DefaultSceneGraphSelector
  
  @JSImport("@antv/g-lite/dist/services", "DefaultSceneGraphService")
  @js.native
  open class DefaultSceneGraphService protected ()
    extends typings.antvGLite.sceneGraphServiceMod.DefaultSceneGraphService {
    def this(sceneGraphSelectorFactory: js.Function0[typings.antvGLite.sceneGraphSelectorMod.SceneGraphSelector]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/services", "EllipseUpdater")
  @js.native
  open class EllipseUpdater ()
    extends typings.antvGLite.aabbMod.EllipseUpdater
  
  @JSImport("@antv/g-lite/dist/services", "EventService")
  @js.native
  open class EventService protected ()
    extends typings.antvGLite.eventServiceMod.EventService {
    def this(
      renderingContext: typings.antvGLite.renderingContextMod.RenderingContext,
      contextService: typings.antvGLite.contextServiceMod.ContextService[Any],
      canvasConfig: CanvasConfig,
      displayObjectPool: DisplayObjectPool
    ) = this()
  }
  
  @JSImport("@antv/g-lite/dist/services", "GeometryAABBUpdater")
  @js.native
  val GeometryAABBUpdater: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "GeometryUpdaterFactory")
  @js.native
  val GeometryUpdaterFactory: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "LineUpdater")
  @js.native
  open class LineUpdater ()
    extends typings.antvGLite.aabbMod.LineUpdater
  
  @JSImport("@antv/g-lite/dist/services", "OffscreenCanvasCreator")
  @js.native
  open class OffscreenCanvasCreator ()
    extends typings.antvGLite.offscreenCanvasCreatorMod.OffscreenCanvasCreator
  
  @JSImport("@antv/g-lite/dist/services", "PathUpdater")
  @js.native
  open class PathUpdater ()
    extends typings.antvGLite.aabbMod.PathUpdater
  
  @JSImport("@antv/g-lite/dist/services", "PolylineUpdater")
  @js.native
  open class PolylineUpdater ()
    extends typings.antvGLite.aabbMod.PolylineUpdater
  
  @JSImport("@antv/g-lite/dist/services", "RectUpdater")
  @js.native
  open class RectUpdater ()
    extends typings.antvGLite.aabbMod.RectUpdater
  
  @JSImport("@antv/g-lite/dist/services", "RenderReason")
  @js.native
  object RenderReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.renderingContextMod.RenderReason & Double] = js.native
    
    /* 0 */ val CAMERA_CHANGED: typings.antvGLite.renderingContextMod.RenderReason.CAMERA_CHANGED & Double = js.native
    
    /* 1 */ val DISPLAY_OBJECT_CHANGED: typings.antvGLite.renderingContextMod.RenderReason.DISPLAY_OBJECT_CHANGED & Double = js.native
    
    /* 2 */ val NONE: typings.antvGLite.renderingContextMod.RenderReason.NONE & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/services", "RenderingContext")
  @js.native
  val RenderingContext: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "RenderingPluginContribution")
  @js.native
  val RenderingPluginContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "RenderingService")
  @js.native
  open class RenderingService protected ()
    extends typings.antvGLite.renderingServiceMod.RenderingService {
    def this(
      renderingPluginProvider: Provider[RenderingPlugin],
      canvasConfig: CanvasConfig,
      renderingContext: typings.antvGLite.renderingContextMod.RenderingContext,
      sceneGraphService: typings.antvGLite.servicesInterfacesMod.SceneGraphService,
      styleValueRegistry: StyleValueRegistry,
      camera: ICamera
    ) = this()
  }
  
  @JSImport("@antv/g-lite/dist/services", "SceneGraphSelector")
  @js.native
  val SceneGraphSelector: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "SceneGraphSelectorFactory")
  @js.native
  val SceneGraphSelectorFactory: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "SceneGraphService")
  @js.native
  val SceneGraphService: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "TextService")
  @js.native
  open class TextService protected ()
    extends typings.antvGLite.textServiceMod.TextService {
    def this(offscreenCanvas: typings.antvGLite.offscreenCanvasCreatorMod.OffscreenCanvasCreator) = this()
  }
  
  @JSImport("@antv/g-lite/dist/services", "TextUpdater")
  @js.native
  open class TextUpdater protected ()
    extends typings.antvGLite.aabbMod.TextUpdater {
    def this(textService: typings.antvGLite.textServiceMod.TextService) = this()
  }
}
