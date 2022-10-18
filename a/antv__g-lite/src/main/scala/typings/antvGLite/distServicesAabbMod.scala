package typings.antvGLite

import typings.antvGLite.distServicesTextServiceMod.TextService
import typings.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesAabbMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb", "CircleUpdater")
  @js.native
  open class CircleUpdater ()
    extends typings.antvGLite.distServicesAabbCircleUpdaterMod.CircleUpdater
  
  @JSImport("@antv/g-lite/dist/services/aabb", "EllipseUpdater")
  @js.native
  open class EllipseUpdater ()
    extends typings.antvGLite.distServicesAabbEllipseUpdaterMod.EllipseUpdater
  
  @JSImport("@antv/g-lite/dist/services/aabb", "GeometryAABBUpdater")
  @js.native
  val GeometryAABBUpdater: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services/aabb", "GeometryUpdaterFactory")
  @js.native
  val GeometryUpdaterFactory: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services/aabb", "LineUpdater")
  @js.native
  open class LineUpdater ()
    extends typings.antvGLite.distServicesAabbLineUpdaterMod.LineUpdater
  
  @JSImport("@antv/g-lite/dist/services/aabb", "PathUpdater")
  @js.native
  open class PathUpdater ()
    extends typings.antvGLite.distServicesAabbPathUpdaterMod.PathUpdater
  
  @JSImport("@antv/g-lite/dist/services/aabb", "PolylineUpdater")
  @js.native
  open class PolylineUpdater ()
    extends typings.antvGLite.distServicesAabbPolylineUpdaterMod.PolylineUpdater
  
  @JSImport("@antv/g-lite/dist/services/aabb", "RectUpdater")
  @js.native
  open class RectUpdater ()
    extends typings.antvGLite.distServicesAabbRectUpdaterMod.RectUpdater
  
  @JSImport("@antv/g-lite/dist/services/aabb", "TextUpdater")
  @js.native
  open class TextUpdater protected ()
    extends typings.antvGLite.distServicesAabbTextUpdaterMod.TextUpdater {
    def this(textService: TextService) = this()
  }
}
