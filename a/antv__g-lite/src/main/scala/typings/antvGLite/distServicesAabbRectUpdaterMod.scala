package typings.antvGLite

import typings.antvGLite.anon.Depth
import typings.antvGLite.anon.Height
import typings.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typings.antvGLite.distDisplayObjectsImageMod.ParsedImageStyleProps
import typings.antvGLite.distDisplayObjectsMod.Group
import typings.antvGLite.distDisplayObjectsMod.Image
import typings.antvGLite.distDisplayObjectsMod.Rect
import typings.antvGLite.distServicesAabbInterfacesMod.GeometryAABBUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesAabbRectUpdaterMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb/RectUpdater", "RectUpdater")
  @js.native
  open class RectUpdater ()
    extends StObject
       with GeometryAABBUpdater[ParsedImageStyleProps] {
    
    /* CompleteClass */
    override def update(parsedStyle: ParsedImageStyleProps, `object`: DisplayObject[Any, Any]): Depth = js.native
    def update(parsedStyle: ParsedImageStyleProps, `object`: Group): Height = js.native
    def update(parsedStyle: ParsedImageStyleProps, `object`: Image): Height = js.native
    def update(parsedStyle: ParsedImageStyleProps, `object`: Rect): Height = js.native
  }
}
