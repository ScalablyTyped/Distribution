package typings.antvGLite

import typings.antvGLite.aabbInterfacesMod.GeometryAABBUpdater
import typings.antvGLite.anon.Depth
import typings.antvGLite.anon.Height
import typings.antvGLite.displayObjectMod.DisplayObject
import typings.antvGLite.polylineMod.ParsedPolylineStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineUpdaterMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb/PolylineUpdater", "PolylineUpdater")
  @js.native
  open class PolylineUpdater ()
    extends StObject
       with GeometryAABBUpdater[ParsedPolylineStyleProps] {
    
    def update(parsedStyle: ParsedPolylineStyleProps): Height = js.native
    /* CompleteClass */
    override def update(parsedStyle: ParsedPolylineStyleProps, `object`: DisplayObject[Any, Any]): Depth = js.native
  }
}
