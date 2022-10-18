package typings.antvG2

import org.scalablytyped.runtime.StringDictionary
import typings.antvG2.libDependentsMod.Coordinate
import typings.antvG2.libInterfaceMod.Position
import typings.antvG2.libInterfaceMod.Shape
import typings.antvG2.libInterfaceMod.ShapeInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryShapeAreaUtilMod {
  
  @JSImport("@antv/g2/lib/geometry/shape/area/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConstraint(coordinate: Coordinate): js.Array[Position] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConstraint")(coordinate.asInstanceOf[js.Any]).asInstanceOf[js.Array[Position]]
  
  inline def getShapeAttrs(cfg: ShapeInfo, isStroke: Boolean, smooth: Boolean, registeredShape: Shape): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getShapeAttrs")(cfg.asInstanceOf[js.Any], isStroke.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], registeredShape.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def getShapeAttrs(
    cfg: ShapeInfo,
    isStroke: Boolean,
    smooth: Boolean,
    registeredShape: Shape,
    constraint: js.Array[Position]
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getShapeAttrs")(cfg.asInstanceOf[js.Any], isStroke.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], registeredShape.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
