package typings.antvGLite

import typings.antvGLite.anon.Depth
import typings.antvGLite.anon.Height
import typings.antvGLite.distDisplayObjectsCircleMod.Circle
import typings.antvGLite.distDisplayObjectsCircleMod.ParsedCircleStyleProps
import typings.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typings.antvGLite.distServicesAabbInterfacesMod.GeometryAABBUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesAabbCircleUpdaterMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb/CircleUpdater", "CircleUpdater")
  @js.native
  open class CircleUpdater ()
    extends StObject
       with GeometryAABBUpdater[ParsedCircleStyleProps] {
    
    def update(parsedStyle: ParsedCircleStyleProps, `object`: Circle): Height = js.native
    /* CompleteClass */
    override def update(parsedStyle: ParsedCircleStyleProps, `object`: DisplayObject[Any, Any]): Depth = js.native
  }
}
