package typings.antvGMath

import typings.antvGMath.typesMod.BBox
import typings.antvGMath.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectMod {
  
  object default {
    
    /**
      * 矩形包围盒计算
      * @param {number} x      起始点 x
      * @param {number} y      起始点 y
      * @param {number} width  宽度
      * @param {number} height 高度
      * @return {object} 包围盒
      */
    @JSImport("@antv/g-math/lib/rect", "default.box")
    @js.native
    def box(x: Double, y: Double, width: Double, height: Double): BBox = js.native
    
    /**
      * 长度，矩形不需要传入 x, y 即可计算周长，但是避免出错
      * @param {number} x      起始点 x
      * @param {number} y      起始点 y
      * @param {number} width  宽
      * @param {number} height 高
      */
    @JSImport("@antv/g-math/lib/rect", "default.length")
    @js.native
    def length(x: Double, y: Double, width: Double, height: Double): Double = js.native
    
    /**
      * 按照比例计算对应的点
      * @param {number} x      起始点 x
      * @param {number} y      起始点 y
      * @param {number} width  宽度
      * @param {number} height 高度
      * @param {number} t 比例 0-1 之间的值
      * @return {object} 计算出来的点信息，包含 x,y
      */
    @JSImport("@antv/g-math/lib/rect", "default.pointAt")
    @js.native
    def pointAt(x: Double, y: Double, width: Double, height: Double, t: Double): Point = js.native
    
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
    @JSImport("@antv/g-math/lib/rect", "default.pointDistance")
    @js.native
    def pointDistance(x: Double, y: Double, width: Double, height: Double, x0: Double, y0: Double): Double = js.native
    
    /**
      * 获取对应点的切线角度
      * @param {number} x      起始点 x
      * @param {number} y      起始点 y
      * @param {number} width  宽度
      * @param {number} height 高度
      * @param {number} t 比例 0-1 之间的值
      * @return {number} 切线的角度
      */
    @JSImport("@antv/g-math/lib/rect", "default.tangentAngle")
    @js.native
    def tangentAngle(x: Double, y: Double, width: Double, height: Double, t: Double): Double = js.native
  }
}
