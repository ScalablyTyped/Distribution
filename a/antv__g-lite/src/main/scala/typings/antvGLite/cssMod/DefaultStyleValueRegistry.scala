package typings.antvGLite.cssMod

import typings.antvGLite.aabbInterfacesMod.GeometryAABBUpdater
import typings.antvGLite.servicesInterfacesMod.SceneGraphService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite/dist/css", "DefaultStyleValueRegistry")
@js.native
open class DefaultStyleValueRegistry protected ()
  extends typings.antvGLite.styleValueRegistryMod.DefaultStyleValueRegistry {
  /**
    * need recalc later
    */
  def this(
    sceneGraphService: SceneGraphService,
    propertySyntaxFactory: typings.antvGLite.csspropertyMod.CSSPropertySyntaxFactory,
    geometryUpdaterFactory: js.Function1[/* tagName */ String, GeometryAABBUpdater[Any]]
  ) = this()
}
