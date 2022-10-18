package typings.antvGPluginCanvasPicker

import typings.antvGLite.distDisplayObjectsEllipseMod.EllipseStyleProps
import typings.antvGLite.mod.DisplayObject
import typings.antvGPluginCanvasPicker.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEllipseMod {
  
  @JSImport("@antv/g-plugin-canvas-picker/dist/Ellipse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPointInPath(displayObject: DisplayObject[EllipseStyleProps, Any], hasXY: X): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInPath")(displayObject.asInstanceOf[js.Any], hasXY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
