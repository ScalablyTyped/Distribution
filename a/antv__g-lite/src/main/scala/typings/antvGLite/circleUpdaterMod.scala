package typings.antvGLite

import typings.antvGLite.aabbInterfacesMod.GeometryAABBUpdater
import typings.antvGLite.anon.Depth
import typings.antvGLite.anon.Height
import typings.antvGLite.circleMod.Circle
import typings.antvGLite.circleMod.ParsedCircleStyleProps
import typings.antvGLite.displayObjectMod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleUpdaterMod {
  
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
