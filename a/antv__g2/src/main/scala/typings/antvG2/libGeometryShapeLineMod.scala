package typings.antvG2

import typings.antvG2.libInterfaceMod.Point
import typings.antvG2.libInterfaceMod.Position
import typings.antvG2.libInterfaceMod.RangePoint
import typings.antvG2.libInterfaceMod.ShapeFactory
import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryShapeLineMod {
  
  @JSImport("@antv/g2/lib/geometry/shape/line", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2/lib/geometry/shape/line", JSImport.Default)
  @js.native
  val default: ShapeFactory = js.native
  
  inline def getPath(points: js.Array[Point | RangePoint], isInCircle: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(points: js.Array[Point | RangePoint], isInCircle: Boolean, isStack: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(points: js.Array[Point | RangePoint], isInCircle: Boolean, isStack: Boolean, smooth: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean,
    smooth: Boolean,
    constraint: js.Array[Position]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean,
    smooth: Boolean,
    constraint: js.Array[Position],
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean,
    smooth: Boolean,
    constraint: Unit,
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean,
    smooth: Unit,
    constraint: js.Array[Position]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean,
    smooth: Unit,
    constraint: js.Array[Position],
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean,
    smooth: Unit,
    constraint: Unit,
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(points: js.Array[Point | RangePoint], isInCircle: Boolean, isStack: Unit, smooth: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[Point | RangePoint],
    isInCircle: Boolean,
    isStack: Unit,
    smooth: Boolean,
    constraint: js.Array[Position]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[Point | RangePoint],
    isInCircle: Boolean,
    isStack: Unit,
    smooth: Boolean,
    constraint: js.Array[Position],
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[Point | RangePoint],
    isInCircle: Boolean,
    isStack: Unit,
    smooth: Boolean,
    constraint: Unit,
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[Point | RangePoint],
    isInCircle: Boolean,
    isStack: Unit,
    smooth: Unit,
    constraint: js.Array[Position]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[Point | RangePoint],
    isInCircle: Boolean,
    isStack: Unit,
    smooth: Unit,
    constraint: js.Array[Position],
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[Point | RangePoint],
    isInCircle: Boolean,
    isStack: Unit,
    smooth: Unit,
    constraint: Unit,
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
}
