package typings.antvCoord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @js.native
  trait CoordinateCfg extends StObject {
    
    val end: Point = js.native
    
    val isTransposed: js.UndefOr[Boolean] = js.native
    
    val matrix: js.UndefOr[js.Array[Double]] = js.native
    
    val start: Point = js.native
  }
  object CoordinateCfg {
    
    @scala.inline
    def apply(end: Point, start: Point): CoordinateCfg = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordinateCfg]
    }
    
    @scala.inline
    implicit class CoordinateCfgMutableBuilder[Self <: CoordinateCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTransposed(value: Boolean): Self = StObject.set(x, "isTransposed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTransposedUndefined: Self = StObject.set(x, "isTransposed", js.undefined)
      
      @scala.inline
      def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      @scala.inline
      def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value :_*))
      
      @scala.inline
      def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICoordinate extends StObject {
    
    /** 将坐标点进行矩阵变换 */
    def applyMatrix(x: Double, y: Double, tag: Double): js.Array[Double] = js.native
    
    /**
      * 将归一化的坐标点数据转换为画布坐标，并根据坐标系当前矩阵进行变换
      * @param point 归一化的坐标点
      * @return      返回进行矩阵变换后的画布坐标
      */
    def convert(point: Point): Point = js.native
    
    /** 转换指定维度的画布坐标 */
    def convertDim(percent: Double, dim: String): Double = js.native
    
    /** 坐标系结束位置，右上角 */
    val end: Point = js.native
    
    /** Helix, Polar 坐标系的结束角度 */
    val endAngle: js.UndefOr[Double] = js.native
    
    /** 获取坐标系中心点位置 */
    def getCenter(): Point = js.native
    
    /** 获取坐标系高度 */
    def getHeight(): Double = js.native
    
    /** 获取坐标系半径 */
    def getRadius(): Double = js.native
    
    /** 获取坐标系宽度 */
    def getWidth(): Double = js.native
    
    /** 初始化流程 */
    def initial(): Unit = js.native
    
    /** Helix, Polar 坐标系的内圆半径 */
    val innerRadius: js.UndefOr[Double] = js.native
    
    /**
      * 将进行过矩阵变换画布坐标转换为归一化坐标
      * @param point 画布坐标
      * @return      返回归一化的坐标点
      */
    def invert(point: Point): Point = js.native
    
    /** 将指定维度的画布坐标转换为 0 - 1 的值 */
    def invertDim(value: Double, dim: String): Double = js.native
    
    /** 将坐标点进行矩阵逆变换 */
    def invertMatrix(x: Double, y: Double, tag: Double): js.Array[Double] = js.native
    
    /** 是否为螺旋坐标系 */
    val isHelix: js.UndefOr[Boolean] = js.native
    
    /** 是否为极坐标系 */
    val isPolar: js.UndefOr[Boolean] = js.native
    
    /** 是否为直角坐标系 */
    val isRect: js.UndefOr[Boolean] = js.native
    
    /**
      * whether has reflect
      * @param dim
      */
    def isReflect(dim: String): Boolean = js.native
    
    /** 坐标系是否发生转置 */
    val isTransposed: Boolean = js.native
    
    /** 坐标系矩阵 */
    val matrix: js.Array[Double] = js.native
    
    /** Helix, Polar 坐标系的半径 */
    val radius: js.UndefOr[Double] = js.native
    
    /**
      * 坐标系反射变换
      * @param dim 反射维度
      * @return    返回坐标系对象
      */
    def reflect(dim: String): js.Any = js.native
    
    /**
      * 重置 matrix
      * @param matrix 如果传入，则使用，否则使用构造函数中传入的默认 matrix
      */
    def resetMatrix(): js.Any = js.native
    def resetMatrix(matrix: js.Array[Double]): js.Any = js.native
    
    /**
      * 坐标系旋转变换
      * @param  radian 旋转弧度
      * @return        返回坐标系对象
      */
    def rotate(radian: Double): js.Any = js.native
    
    /**
      * 坐标系比例变换
      * @param s1 x 方向缩放比例
      * @param s2 y 方向缩放比例
      * @return     返回坐标系对象
      */
    def scale(s1: Double, s2: Double): js.Any = js.native
    
    /** 坐标系起始位置，左下角 */
    val start: Point = js.native
    
    /** Helix, Polar 坐标系的起始角度 */
    val startAngle: js.UndefOr[Double] = js.native
    
    /**
      * 坐标系平移变换
      * @param x x 方向平移像素
      * @param y y 方向平移像素
      * @return    返回坐标系对象
      */
    def translate(x: Double, y: Double): js.Any = js.native
    
    /**
      * 将坐标系 x y 两个轴进行转置
      * @return 返回坐标系对象
      */
    def transpose(): js.Any = js.native
    
    /** 坐标系类型 */
    val `type`: String = js.native
    
    /** 更新配置 */
    def update(cfg: CoordinateCfg): Unit = js.native
    
    /** 坐标系 x 方向的范围 */
    val x: Range = js.native
    
    /** 坐标系 y 方向的范围 */
    val y: Range = js.native
  }
  
  @js.native
  trait Point extends StObject {
    
    val x: Double = js.native
    
    val y: Double = js.native
  }
  object Point {
    
    @scala.inline
    def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PolarCfg extends CoordinateCfg {
    
    val endAngle: js.UndefOr[Double] = js.native
    
    val innerRadius: js.UndefOr[Double] = js.native
    
    val radius: js.UndefOr[Double] = js.native
    
    val startAngle: js.UndefOr[Double] = js.native
  }
  object PolarCfg {
    
    @scala.inline
    def apply(end: Point, start: Point): PolarCfg = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolarCfg]
    }
    
    @scala.inline
    implicit class PolarCfgMutableBuilder[Self <: PolarCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      @scala.inline
      def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    }
  }
  
  @js.native
  trait Range extends StObject {
    
    val end: Double = js.native
    
    val start: Double = js.native
  }
  object Range {
    
    @scala.inline
    def apply(end: Double, start: Double): Range = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
