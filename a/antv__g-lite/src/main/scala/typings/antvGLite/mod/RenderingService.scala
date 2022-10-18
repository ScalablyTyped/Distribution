package typings.antvGLite.mod

import typings.antvGLite.distCameraInterfacesMod.ICamera
import typings.antvGLite.distCssInterfacesMod.StyleValueRegistry
import typings.antvGLite.distServicesRenderingServiceMod.RenderingPlugin
import typings.manaSyringe.libContributionMod.Contribution.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "RenderingService")
@js.native
open class RenderingService protected ()
  extends typings.antvGLite.distServicesMod.RenderingService {
  def this(
    renderingPluginProvider: Provider[RenderingPlugin],
    canvasConfig: typings.antvGLite.distTypesMod.CanvasConfig,
    renderingContext: typings.antvGLite.distServicesRenderingContextMod.RenderingContext,
    sceneGraphService: typings.antvGLite.distServicesInterfacesMod.SceneGraphService,
    styleValueRegistry: StyleValueRegistry,
    camera: ICamera
  ) = this()
}
