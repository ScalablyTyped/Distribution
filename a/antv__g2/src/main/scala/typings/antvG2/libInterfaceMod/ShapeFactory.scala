package typings.antvG2.libInterfaceMod

import typings.antvG2.libDependentsMod.Coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeFactory
  extends StObject
     with RegisterShapeFactory {
  
  /**
    * @title 坐标系对象。
    */
  var coordinate: Coordinate = js.native
  
  /**
    * @title 工厂名。
    */
  var geometryType: String = js.native
  
  /**
    * @title 根据名称获取具体的 shape 对象。
    */
  def getShape(shapeType: String): Shape = js.native
  def getShape(shapeType: js.Array[String]): Shape = js.native
  
  /**
    * @title 获取构成 shape 的关键点。
    */
  def getShapePoints(shapeType: String, pointInfo: ShapePoint): js.Array[Point] = js.native
  def getShapePoints(shapeType: js.Array[String], pointInfo: ShapePoint): js.Array[Point] = js.native
  
  /**
    * @title ShapeFactory 下所有的主题样式。
    */
  var theme: LooseObject = js.native
}
