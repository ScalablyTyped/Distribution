package typings.antvGLite

import typings.antvGLite.aabbInterfacesMod.GeometryAABBUpdater
import typings.antvGLite.anon.Depth
import typings.antvGLite.anon.Height
import typings.antvGLite.displayObjectMod.DisplayObject
import typings.antvGLite.lineMod.ParsedLineStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineUpdaterMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb/LineUpdater", "LineUpdater")
  @js.native
  open class LineUpdater ()
    extends StObject
       with GeometryAABBUpdater[ParsedLineStyleProps] {
    
    def update(parsedStyle: ParsedLineStyleProps): Height = js.native
    /* CompleteClass */
    override def update(parsedStyle: ParsedLineStyleProps, `object`: DisplayObject[Any, Any]): Depth = js.native
  }
}
