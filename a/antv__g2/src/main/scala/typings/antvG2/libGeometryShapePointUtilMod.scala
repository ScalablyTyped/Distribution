package typings.antvG2

import typings.antvG2.libInterfaceMod.ShapeInfo
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryShapePointUtilMod {
  
  @JSImport("@antv/g2/lib/geometry/shape/point/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2/lib/geometry/shape/point/util", "HOLLOW_SHAPES")
  @js.native
  val HOLLOW_SHAPES: js.Array[String] = js.native
  
  @JSImport("@antv/g2/lib/geometry/shape/point/util", "SHAPES")
  @js.native
  val SHAPES: js.Array[String] = js.native
  
  inline def drawPoints(shape: Any, cfg: ShapeInfo, container: IGroup, shapeName: String, isStroke: Boolean): IShape | IGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPoints")(shape.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any], container.asInstanceOf[js.Any], shapeName.asInstanceOf[js.Any], isStroke.asInstanceOf[js.Any])).asInstanceOf[IShape | IGroup]
}
