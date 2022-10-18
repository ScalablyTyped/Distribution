package typings.antvGPluginCanvasPicker

import typings.antvGLite.distDisplayObjectsLineMod.LineStyleProps
import typings.antvGLite.mod.DisplayObject
import typings.antvGPluginCanvasPicker.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLineMod {
  
  @JSImport("@antv/g-plugin-canvas-picker/dist/Line", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPointInPath(displayObject: DisplayObject[LineStyleProps, Any], position: X): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInPath")(displayObject.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
