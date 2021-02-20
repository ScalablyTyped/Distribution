package typings.antvGMath

import typings.antvGMath.anon.X
import typings.antvGMath.typesMod.BBox
import typings.antvGMath.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
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
    @JSImport("@antv/g-math/lib/arc", "default.box")
    @js.native
    def box(
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      xRotation: Double,
      startAngle: Double,
      endAngle: Double
    ): BBox = js.native
    
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
    @JSImport("@antv/g-math/lib/arc", "default.length")
    @js.native
    def length(
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      xRotation: Double,
      startAngle: Double,
      endAngle: Double
    ): Unit = js.native
    
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
    @JSImport("@antv/g-math/lib/arc", "default.nearestPoint")
    @js.native
    def nearestPoint(
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      xRotation: Double,
      startAngle: Double,
      endAngle: Double,
      x0: Double,
      y0: Double
    ): X = js.native
    
    @JSImport("@antv/g-math/lib/arc", "default.pointAt")
    @js.native
    def pointAt(
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      xRotation: Double,
      startAngle: Double,
      endAngle: Double,
      t: Double
    ): Point = js.native
    
    @JSImport("@antv/g-math/lib/arc", "default.pointDistance")
    @js.native
    def pointDistance(
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      xRotation: Double,
      startAngle: Double,
      endAngle: Double,
      x0: Double,
      y0: Double
    ): Double = js.native
    
    @JSImport("@antv/g-math/lib/arc", "default.tangentAngle")
    @js.native
    def tangentAngle(
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      xRotation: Double,
      startAngle: Double,
      endAngle: Double,
      t: Double
    ): Double = js.native
  }
}
