package typings.antvGLite

import typings.antvGLite.aabbInterfacesMod.GeometryAABBUpdater
import typings.antvGLite.anon.Depth
import typings.antvGLite.anon.Height
import typings.antvGLite.displayObjectMod.DisplayObject
import typings.antvGLite.displayObjectsPathMod.ParsedPathStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathUpdaterMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb/PathUpdater", "PathUpdater")
  @js.native
  open class PathUpdater ()
    extends StObject
       with GeometryAABBUpdater[ParsedPathStyleProps] {
    
    def update(parsedStyle: ParsedPathStyleProps): Height = js.native
    /* CompleteClass */
    override def update(parsedStyle: ParsedPathStyleProps, `object`: DisplayObject[Any, Any]): Depth = js.native
  }
}
