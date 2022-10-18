package typings.antvGPluginCanvasPicker

import typings.antvGLite.distDisplayObjectsCircleMod.CircleStyleProps
import typings.antvGLite.mod.DisplayObject
import typings.antvGLite.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCircleMod {
  
  @JSImport("@antv/g-plugin-canvas-picker/dist/Circle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPointInPath(displayObject: DisplayObject[CircleStyleProps, Any], position: Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInPath")(displayObject.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
