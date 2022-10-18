package typings.antvGMath

import typings.antvGMath.anon.X
import typings.antvGMath.distTypesMod.BBox
import typings.antvGMath.distTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distArcMod {
  
  object default {
    
    @JSImport("@antv/g-math/dist/arc", JSImport.Default)
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
}
