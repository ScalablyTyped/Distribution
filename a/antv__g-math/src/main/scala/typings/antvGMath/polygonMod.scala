package typings.antvGMath

import typings.antvGMath.typesMod.BBox
import typings.antvGMath.typesMod.Point
import typings.antvGMath.typesMod.PointTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonMod {
  
  object default {
    
    @JSImport("@antv/g-math/lib/polygon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 计算多边形的包围盒
      * @param {array} points 点的集合 [x,y] 的形式
      * @return {object} 包围盒
      */
    @scala.inline
    def box(points: js.Array[PointTuple]): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("box")(points.asInstanceOf[js.Any]).asInstanceOf[BBox]
    
    /**
      * 计算多边形的长度
      * @param {array} points 点的集合 [x,y] 的形式
      * @return {object} 多边形边的长度
      */
    @scala.inline
    def length(points: js.Array[PointTuple]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(points.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * 根据比例获取多边形的点
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} t 在多边形的长度上的比例
      * @return {object} 根据比例值计算出来的点
      */
    @scala.inline
    def pointAt(points: js.Array[PointTuple], t: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAt")(points.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * 指定点到多边形的距离
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} x 指定点的 x
      * @param {number} y 指定点的 y
      * @return {number} 点到多边形的距离
      */
    @scala.inline
    def pointDistance(points: js.Array[PointTuple], x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(points.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * 根据比例获取多边形的切线角度
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} t 在多边形的长度上的比例
      * @return {object} 根据比例值计算出来的角度
      */
    @scala.inline
    def tangentAngle(points: js.Array[PointTuple], t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentAngle")(points.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
