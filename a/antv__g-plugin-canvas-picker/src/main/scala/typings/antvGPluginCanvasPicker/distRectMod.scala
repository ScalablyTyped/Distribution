package typings.antvGPluginCanvasPicker

import typings.antvGLite.distDisplayObjectsRectMod.RectStyleProps
import typings.antvGLite.mod.DisplayObject
import typings.antvGLite.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRectMod {
  
  @JSImport("@antv/g-plugin-canvas-picker/dist/Rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPointInPath(
    displayObject: DisplayObject[RectStyleProps, Any],
    position: Point,
    isPointInPath: js.Function2[
      /* displayObject */ DisplayObject[RectStyleProps, Any], 
      /* position */ Point, 
      Boolean
    ]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInPath")(displayObject.asInstanceOf[js.Any], position.asInstanceOf[js.Any], isPointInPath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
