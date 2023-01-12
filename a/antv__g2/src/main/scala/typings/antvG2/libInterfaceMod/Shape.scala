package typings.antvG2.libInterfaceMod

import typings.antvG2.libDependentsMod.Coordinate
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import typings.antvGBase.libTypesMod.PathCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shape
  extends StObject
     with RegisterShape {
  
  /**
    * @title 坐标系对象。
    */
  var coordinate: Coordinate
  
  /**
    * @title 工具函数，将 0～1 path 转化成实际画布 path。
    */
  def parsePath(path: Any): js.Array[PathCommand]
  
  /**
    * @title 工具函数，0～1 的坐标点转换成实际画布坐标点。
    */
  def parsePoint(point: Point): Point
  
  /**
    * @title 工具函数，0～1 的坐标点集合转换成实际画布坐标点集合。
    */
  def parsePoints(points: js.Array[Point]): js.Array[Point]
}
object Shape {
  
  inline def apply(
    coordinate: Coordinate,
    draw: (ShapeInfo, IGroup) => IShape | IGroup | Unit,
    parsePath: Any => js.Array[PathCommand],
    parsePoint: Point => Point,
    parsePoints: js.Array[Point] => js.Array[Point]
  ): Shape = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], draw = js.Any.fromFunction2(draw), parsePath = js.Any.fromFunction1(parsePath), parsePoint = js.Any.fromFunction1(parsePoint), parsePoints = js.Any.fromFunction1(parsePoints))
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
    
    inline def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setParsePath(value: Any => js.Array[PathCommand]): Self = StObject.set(x, "parsePath", js.Any.fromFunction1(value))
    
    inline def setParsePoint(value: Point => Point): Self = StObject.set(x, "parsePoint", js.Any.fromFunction1(value))
    
    inline def setParsePoints(value: js.Array[Point] => js.Array[Point]): Self = StObject.set(x, "parsePoints", js.Any.fromFunction1(value))
  }
}
