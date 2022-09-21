package typings.antvGLite.mod

import typings.antvGLite.cssInterfacesMod.StyleValueRegistry
import typings.antvGLite.interfacesMod.ICamera
import typings.antvGLite.renderingServiceMod.RenderingPlugin
import typings.manaSyringe.contributionMod.Contribution.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "RenderingService")
@js.native
open class RenderingService protected ()
  extends typings.antvGLite.servicesMod.RenderingService {
  def this(
    renderingPluginProvider: Provider[RenderingPlugin],
    canvasConfig: typings.antvGLite.distTypesMod.CanvasConfig,
    renderingContext: typings.antvGLite.renderingContextMod.RenderingContext,
    sceneGraphService: typings.antvGLite.servicesInterfacesMod.SceneGraphService,
    styleValueRegistry: StyleValueRegistry,
    camera: ICamera
  ) = this()
}
