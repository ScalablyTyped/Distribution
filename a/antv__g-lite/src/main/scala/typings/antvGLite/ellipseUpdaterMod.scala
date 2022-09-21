package typings.antvGLite

import typings.antvGLite.aabbInterfacesMod.GeometryAABBUpdater
import typings.antvGLite.anon.Depth
import typings.antvGLite.anon.Height
import typings.antvGLite.displayObjectMod.DisplayObject
import typings.antvGLite.ellipseMod.Ellipse
import typings.antvGLite.ellipseMod.ParsedEllipseStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipseUpdaterMod {
  
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
