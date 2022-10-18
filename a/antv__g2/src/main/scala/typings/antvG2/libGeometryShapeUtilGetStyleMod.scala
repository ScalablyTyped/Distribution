package typings.antvG2

import org.scalablytyped.runtime.StringDictionary
import typings.antvG2.libInterfaceMod.ShapeInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryShapeUtilGetStyleMod {
  
  @JSImport("@antv/g2/lib/geometry/shape/util/get-style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBackgroundRectStyle(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundRectStyle")().asInstanceOf[Any]
  inline def getBackgroundRectStyle(cfg: ShapeInfo): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundRectStyle")(cfg.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getStyle(cfg: ShapeInfo, isStroke: Boolean, isFill: Boolean): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(cfg.asInstanceOf[js.Any], isStroke.asInstanceOf[js.Any], isFill.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def getStyle(cfg: ShapeInfo, isStroke: Boolean, isFill: Boolean, sizeName: String): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(cfg.asInstanceOf[js.Any], isStroke.asInstanceOf[js.Any], isFill.asInstanceOf[js.Any], sizeName.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
