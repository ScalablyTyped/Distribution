package typings.antvGLite

import typings.antvGLite.anon.Depth
import typings.antvGLite.anon.Height
import typings.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typings.antvGLite.distDisplayObjectsEllipseMod.Ellipse
import typings.antvGLite.distDisplayObjectsEllipseMod.ParsedEllipseStyleProps
import typings.antvGLite.distServicesAabbInterfacesMod.GeometryAABBUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesAabbEllipseUpdaterMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb/EllipseUpdater", "EllipseUpdater")
  @js.native
  open class EllipseUpdater ()
    extends StObject
       with GeometryAABBUpdater[ParsedEllipseStyleProps] {
    
    /* CompleteClass */
    override def update(parsedStyle: ParsedEllipseStyleProps, `object`: DisplayObject[Any, Any]): Depth = js.native
    def update(parsedStyle: ParsedEllipseStyleProps, `object`: Ellipse): Height = js.native
  }
}
