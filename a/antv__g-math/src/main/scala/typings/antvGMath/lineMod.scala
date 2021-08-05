package typings.antvGMath

import typings.antvGMath.typesMod.BBox
import typings.antvGMath.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod {
  
  object default {
    
    @JSImport("@antv/g-math/lib/line", JSImport.Default)
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
}
