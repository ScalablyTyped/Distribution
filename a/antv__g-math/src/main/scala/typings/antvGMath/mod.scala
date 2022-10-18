package typings.antvGMath

import typings.antvGMath.anon.MaxX
import typings.antvGMath.anon.X
import typings.antvGMath.distTypesMod.BBox
import typings.antvGMath.distTypesMod.Point
import typings.antvGMath.distTypesMod.PointTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Arc {
    
    @JSImport("@antv/g-math", "Arc")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 计算包围盒
      * @param {number} cx         圆心 x
      * @param {number} cy         圆心 y
      * @param {number} rx         x 轴方向的半径
      * @param {number} ry         y 轴方向的半径
      * @param {number} xRotation  旋转角度
      * @param {number} startAngle 起始角度
      * @param {number} endAngle   结束角度
      * @return {object} 包围盒对象
      */
    inline def box(
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      xRotation: Double,
      startAngle: Double,
      endAngle: Double
    ): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], xRotation.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any])).asInstanceOf[BBox]
    
    /**
      * 获取圆弧的长度，计算圆弧长度时不考虑旋转角度，
      * 仅跟 rx, ry, startAngle, endAngle 相关
      * @param {number} cx         圆心 x
      * @param {number} cy         圆心 y
      * @param {number} rx         x 轴方向的半径
      * @param {number} ry         y 轴方向的半径
      * @param {number} xRotation  旋转角度
      * @param {number} startAngle 起始角度
      * @param {number} endAngle   结束角度
      */
    inline def length(
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      xRotation: Double,
      startAngle: Double,
      endAngle: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], xRotation.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * 获取指定点到圆弧的最近距离的点
      * @param {number} cx         圆心 x
      * @param {number} cy         圆心 y
      * @param {number} rx         x 轴方向的半径
      * @param {number} ry         y 轴方向的半径
      * @param {number} xRotation  旋转角度
      * @param {number} startAngle 起始角度
      * @param {number} endAngle   结束角度
      * @param {number} x0         指定点的 x
      * @param {number} y0         指定点的 y
      * @return {object} 到指定点最近距离的点
      */
    inline def nearestPoint(
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      xRotation: Double,
      startAngle: Double,
      endAngle: Double,
      x0: Double,
      y0: Double
    ): X = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestPoint")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], xRotation.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[X]
    
    inline def pointAt(
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      xRotation: Double,
      startAngle: Double,
      endAngle: Double,
      t: Double
    ): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAt")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], xRotation.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def pointDistance(
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      xRotation: Double,
      startAngle: Double,
      endAngle: Double,
      x0: Double,
      y0: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], xRotation.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tangentAngle(
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      xRotation: Double,
      startAngle: Double,
      endAngle: Double,
      t: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentAngle")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], xRotation.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object Cubic {
    
    @JSImport("@antv/g-math", "Cubic")
    @js.native
    val ^ : js.Any = js.native
    
    inline def box(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any])).asInstanceOf[BBox]
    
    inline def divide(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      t: Double
    ): js.Array[js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]]]
    
    @JSImport("@antv/g-math", "Cubic.extrema")
    @js.native
    def extrema: js.Function4[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, js.Array[Any]] = js.native
    inline def extrema(p0: Double, p1: Double, p2: Double, p3: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("extrema")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def extrema_=(x: js.Function4[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extrema")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g-math", "Cubic.interpolationAt")
    @js.native
    def interpolationAt: js.Function5[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, /* t */ Double, Double] = js.native
    inline def interpolationAt(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolationAt")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def interpolationAt_=(
      x: js.Function5[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, /* t */ Double, Double]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolationAt")(x.asInstanceOf[js.Any])
    
    inline def length(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def nearestPoint(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      x0: Double,
      y0: Double
    ): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestPoint")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Point]
    inline def nearestPoint(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      x0: Double,
      y0: Double,
      length: Double
    ): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestPoint")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def pointAt(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      t: Double
    ): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAt")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def pointDistance(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      x0: Double,
      y0: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def pointDistance(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      x0: Double,
      y0: Double,
      length: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tangentAngle(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      t: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentAngle")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object Line {
    
    @JSImport("@antv/g-math", "Line")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 计算线段的包围盒
      * @param {number} x1 起始点 x
      * @param {number} y1 起始点 y
      * @param {number} x2 结束点 x
      * @param {number} y2 结束点 y
      * @return {object} 包围盒对象
      */
    inline def box(x1: Double, y1: Double, x2: Double, y2: Double): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[BBox]
    
    /**
      * 线段的长度
      * @param {number} x1 起始点 x
      * @param {number} y1 起始点 y
      * @param {number} x2 结束点 x
      * @param {number} y2 结束点 y
      * @return {number} 距离
      */
    inline def length(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * 根据比例获取点
      * @param {number} x1 起始点 x
      * @param {number} y1 起始点 y
      * @param {number} x2 结束点 x
      * @param {number} y2 结束点 y
      * @param {number} t 指定比例
      * @return {object} 包含 x, y 的点
      */
    inline def pointAt(x1: Double, y1: Double, x2: Double, y2: Double, t: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAt")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * 点到线段的距离
      * @param {number} x1 起始点 x
      * @param {number} y1 起始点 y
      * @param {number} x2 结束点 x
      * @param {number} y2 结束点 y
      * @param {number} x  测试点 x
      * @param {number} y  测试点 y
      * @return {number} 距离
      */
    inline def pointDistance(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * 点到直线的距离，而不是点到线段的距离
      * @param {number} x1 起始点 x
      * @param {number} y1 起始点 y
      * @param {number} x2 结束点 x
      * @param {number} y2 结束点 y
      * @param {number} x  测试点 x
      * @param {number} y  测试点 y
      * @return {number} 距离
      */
    inline def pointToLine(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointToLine")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * 线段的角度
      * @param {number} x1 起始点 x
      * @param {number} y1 起始点 y
      * @param {number} x2 结束点 x
      * @param {number} y2 结束点 y
      * @return {number} 导数
      */
    inline def tangentAngle(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentAngle")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object Polygon {
    
    @JSImport("@antv/g-math", "Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 计算多边形的包围盒
      * @param {array} points 点的集合 [x,y] 的形式
      * @return {object} 包围盒
      */
    inline def box(points: js.Array[PointTuple]): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("box")(points.asInstanceOf[js.Any]).asInstanceOf[BBox]
    
    /**
      * 计算多边形的长度
      * @param {array} points 点的集合 [x,y] 的形式
      * @return {object} 多边形边的长度
      */
    inline def length(points: js.Array[PointTuple]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(points.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * 根据比例获取多边形的点
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} t 在多边形的长度上的比例
      * @return {object} 根据比例值计算出来的点
      */
    inline def pointAt(points: js.Array[PointTuple], t: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAt")(points.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * 指定点到多边形的距离
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} x 指定点的 x
      * @param {number} y 指定点的 y
      * @return {number} 点到多边形的距离
      */
    inline def pointDistance(points: js.Array[PointTuple], x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(points.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * 根据比例获取多边形的切线角度
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} t 在多边形的长度上的比例
      * @return {object} 根据比例值计算出来的角度
      */
    inline def tangentAngle(points: js.Array[PointTuple], t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentAngle")(points.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object Polyline {
    
    @JSImport("@antv/g-math", "Polyline")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 计算多折线的包围盒
      * @param {array} points 点的集合 [x,y] 的形式
      * @return {object} 包围盒
      */
    inline def box(points: js.Array[PointTuple]): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("box")(points.asInstanceOf[js.Any]).asInstanceOf[BBox]
    
    /**
      * 计算多折线的长度
      * @param {array} points 点的集合 [x,y] 的形式
      * @return {object} 多条边的长度
      */
    inline def length(points: js.Array[PointTuple]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(points.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * 根据比例获取多折线的点
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} t 在多折线的长度上的比例
      * @return {object} 根据比例值计算出来的点
      */
    inline def pointAt(points: js.Array[PointTuple], t: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAt")(points.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * 指定点到多折线的距离
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} x 指定点的 x
      * @param {number} y 指定点的 y
      * @return {number} 点到多折线的距离
      */
    inline def pointDistance(points: js.Array[PointTuple], x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(points.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * 根据比例获取多折线的切线角度
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} t 在多折线的长度上的比例
      * @return {object} 根据比例值计算出来的角度
      */
    inline def tangentAngle(points: js.Array[PointTuple], t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentAngle")(points.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object Quad {
    
    @JSImport("@antv/g-math", "Quad")
    @js.native
    val ^ : js.Any = js.native
    
    inline def box(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[BBox]
    
    inline def divide(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, t: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    
    @JSImport("@antv/g-math", "Quad.interpolationAt")
    @js.native
    def interpolationAt: js.Function4[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* t */ Double, Double] = js.native
    inline def interpolationAt(p0: Double, p1: Double, p2: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolationAt")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def interpolationAt_=(x: js.Function4[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* t */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolationAt")(x.asInstanceOf[js.Any])
    
    inline def length(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def nearestPoint(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x0: Double, y0: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestPoint")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def pointAt(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, t: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAt")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def pointDistance(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x0: Double, y0: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tangentAngle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentAngle")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object Util {
    
    @JSImport("@antv/g-math", "Util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getBBoxByArray(xArr: js.Array[Double], yArr: js.Array[Double]): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("getBBoxByArray")(xArr.asInstanceOf[js.Any], yArr.asInstanceOf[js.Any])).asInstanceOf[BBox]
    
    inline def getBBoxRange(x1: Double, y1: Double, x2: Double, y2: Double): MaxX = (^.asInstanceOf[js.Dynamic].applyDynamic("getBBoxRange")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[MaxX]
    
    inline def isNumberEqual(v1: Double, v2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberEqual")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def piMod(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("piMod")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
