package typings.antvGLite.distCssMod

import typings.antvGLite.distServicesAabbInterfacesMod.GeometryAABBUpdater
import typings.antvGLite.distServicesInterfacesMod.SceneGraphService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite/dist/css", "DefaultStyleValueRegistry")
@js.native
open class DefaultStyleValueRegistry protected ()
  extends typings.antvGLite.distCssStyleValueRegistryMod.DefaultStyleValueRegistry {
  /**
    * need recalc later
    */
  def this(
    sceneGraphService: SceneGraphService,
    propertySyntaxFactory: typings.antvGLite.distCssCsspropertyMod.CSSPropertySyntaxFactory,
    geometryUpdaterFactory: js.Function1[/* tagName */ String, GeometryAABBUpdater[Any]]
  ) = this()
}
