package typings.antvGMath

import typings.antvGMath.typesMod.BBox
import typings.antvGMath.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-math/lib/line", JSImport.Namespace)
@js.native
object lineMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    /**
      * 计算线段的包围盒
      * @param {number} x1 起始点 x
      * @param {number} y1 起始点 y
      * @param {number} x2 结束点 x
      * @param {number} y2 结束点 y
      * @return {object} 包围盒对象
      */
    def box(x1: Double, y1: Double, x2: Double, y2: Double): BBox = js.native
    
    /**
      * 线段的长度
      * @param {number} x1 起始点 x
      * @param {number} y1 起始点 y
      * @param {number} x2 结束点 x
      * @param {number} y2 结束点 y
      * @return {number} 距离
      */
    def length(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
    
    /**
      * 根据比例获取点
      * @param {number} x1 起始点 x
      * @param {number} y1 起始点 y
      * @param {number} x2 结束点 x
      * @param {number} y2 结束点 y
      * @param {number} t 指定比例
      * @return {object} 包含 x, y 的点
      */
    def pointAt(x1: Double, y1: Double, x2: Double, y2: Double, t: Double): Point = js.native
    
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
    def pointDistance(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): Double = js.native
    
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
    def pointToLine(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): Double = js.native
    
    /**
      * 线段的角度
      * @param {number} x1 起始点 x
      * @param {number} y1 起始点 y
      * @param {number} x2 结束点 x
      * @param {number} y2 结束点 y
      * @return {number} 导数
      */
    def tangentAngle(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  }
}
