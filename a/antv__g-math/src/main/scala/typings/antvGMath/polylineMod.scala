package typings.antvGMath

import typings.antvGMath.typesMod.BBox
import typings.antvGMath.typesMod.Point
import typings.antvGMath.typesMod.PointTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-math/lib/polyline", JSImport.Namespace)
@js.native
object polylineMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    /**
      * 计算多折线的包围盒
      * @param {array} points 点的集合 [x,y] 的形式
      * @return {object} 包围盒
      */
    def box(points: js.Array[PointTuple]): BBox = js.native
    
    /**
      * 计算多折线的长度
      * @param {array} points 点的集合 [x,y] 的形式
      * @return {object} 多条边的长度
      */
    def length(points: js.Array[PointTuple]): Double = js.native
    
    /**
      * 根据比例获取多折线的点
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} t 在多折线的长度上的比例
      * @return {object} 根据比例值计算出来的点
      */
    def pointAt(points: js.Array[PointTuple], t: Double): Point = js.native
    
    /**
      * 指定点到多折线的距离
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} x 指定点的 x
      * @param {number} y 指定点的 y
      * @return {number} 点到多折线的距离
      */
    def pointDistance(points: js.Array[PointTuple], x: Double, y: Double): Double = js.native
    
    /**
      * 根据比例获取多折线的切线角度
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} t 在多折线的长度上的比例
      * @return {object} 根据比例值计算出来的角度
      */
    def tangentAngle(points: js.Array[PointTuple], t: Double): Double = js.native
  }
}
