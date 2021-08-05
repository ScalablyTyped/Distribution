package typings.antvCoord

import org.scalablytyped.runtime.Instantiable1
import typings.antvCoord.interfaceMod.CoordinateCfg
import typings.antvCoord.interfaceMod.ICoordinate
import typings.antvCoord.interfaceMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("@antv/coord/lib/coord/base", JSImport.Default)
  @js.native
  abstract class default protected ()
    extends StObject
       with Coordinate {
    def this(cfg: CoordinateCfg) = this()
  }
  
  @js.native
  trait Coordinate
    extends StObject
       with ICoordinate {
    
    /**
      * 将坐标点进行矩阵变换
      * @param x   对应 x 轴画布坐标
      * @param y   对应 y 轴画布坐标
      * @param tag 默认为 0，可取值 0, 1
      * @return    返回变换后的三阶向量 [x, y, z]
      */
    def applyMatrix(x: Double, y: Double): js.Array[Double] = js.native
    
    /* protected */ var center: Point = js.native
    
    /**
      * 将归一化的坐标点数据转换为画布坐标
      * @param point
      */
    def convertPoint(point: Point): Point = js.native
    
    @JSName("endAngle")
    var endAngle_Coordinate: Double = js.native
    
    /* protected */ var height: Double = js.native
    
    @JSName("innerRadius")
    var innerRadius_Coordinate: Double = js.native
    
    /**
      * 将坐标点进行矩阵逆变换
      * @param x   对应 x 轴画布坐标
      * @param y   对应 y 轴画布坐标
      * @param tag 默认为 0，可取值 0, 1
      * @return    返回矩阵逆变换后的三阶向量 [x, y, z]
      */
    def invertMatrix(x: Double, y: Double): js.Array[Double] = js.native
    
    /**
      * 画布坐标转换为归一化的坐标点数据
      * @param point
      */
    def invertPoint(point: Point): Point = js.native
    
    @JSName("isHelix")
    val isHelix_Coordinate: Boolean = js.native
    
    @JSName("isPolar")
    val isPolar_Coordinate: Boolean = js.native
    
    @JSName("isRect")
    val isRect_Coordinate: Boolean = js.native
    
    /* private */ var isReflectX: js.Any = js.native
    
    /* private */ var isReflectY: js.Any = js.native
    
    @JSName("matrix")
    var matrix_Coordinate: Matrix3 = js.native
    
    /* private */ var originalMatrix: js.Any = js.native
    
    @JSName("radius")
    var radius_Coordinate: Double = js.native
    
    def resetMatrix(matrix: Matrix3): Unit = js.native
    
    @JSName("startAngle")
    var startAngle_Coordinate: Double = js.native
    
    /* protected */ var width: Double = js.native
  }
  
  type CoordinateCtor = Instantiable1[/* cfg */ js.Any, Coordinate]
  
  type Matrix3 = js.Tuple9[Double, Double, Double, Double, Double, Double, Double, Double, Double]
  
  type Vector2 = js.Tuple2[Double, Double]
  
  type Vector3 = js.Tuple3[Double, Double, Double]
}
