package typings.antvGMath

import typings.antvGMath.distTypesMod.BBox
import typings.antvGMath.distTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRectMod {
  
  object default {
    
    @JSImport("@antv/g-math/dist/rect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 矩形包围盒计算
      * @param {number} x      起始点 x
      * @param {number} y      起始点 y
      * @param {number} width  宽度
      * @param {number} height 高度
      * @return {object} 包围盒
      */
    inline def box(x: Double, y: Double, width: Double, height: Double): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[BBox]
    
    /**
      * 长度，矩形不需要传入 x, y 即可计算周长，但是避免出错
      * @param {number} x      起始点 x
      * @param {number} y      起始点 y
      * @param {number} width  宽
      * @param {number} height 高
      */
    inline def length(x: Double, y: Double, width: Double, height: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * 按照比例计算对应的点
      * @param {number} x      起始点 x
      * @param {number} y      起始点 y
      * @param {number} width  宽度
      * @param {number} height 高度
      * @param {number} t 比例 0-1 之间的值
      * @return {object} 计算出来的点信息，包含 x,y
      */
    inline def pointAt(x: Double, y: Double, width: Double, height: Double, t: Double): Point | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point | Null]
    
    /**
      * 点到矩形的最小距离
      * @param {number} x      起始点 x
      * @param {number} y      起始点 y
      * @param {number} width  宽度
      * @param {number} height 高度
      * @param {number} x0     指定点的 x
      * @param {number} y0     指定点的 y
      * @return {number} 最短距离
      */
    inline def pointDistance(x: Double, y: Double, width: Double, height: Double, x0: Double, y0: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * 获取对应点的切线角度
      * @param {number} x      起始点 x
      * @param {number} y      起始点 y
      * @param {number} width  宽度
      * @param {number} height 高度
      * @param {number} t 比例 0-1 之间的值
      * @return {number} 切线的角度
      */
    inline def tangentAngle(x: Double, y: Double, width: Double, height: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentAngle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
