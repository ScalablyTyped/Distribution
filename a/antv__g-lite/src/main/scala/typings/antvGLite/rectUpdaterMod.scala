package typings.antvGLite

import typings.antvGLite.aabbInterfacesMod.GeometryAABBUpdater
import typings.antvGLite.anon.Depth
import typings.antvGLite.anon.Height
import typings.antvGLite.displayObjectMod.DisplayObject
import typings.antvGLite.displayObjectsMod.Group
import typings.antvGLite.displayObjectsMod.Image
import typings.antvGLite.displayObjectsMod.Rect
import typings.antvGLite.imageMod.ParsedImageStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectUpdaterMod {
  
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
