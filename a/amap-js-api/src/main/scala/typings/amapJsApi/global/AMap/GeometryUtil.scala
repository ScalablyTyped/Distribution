package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.LocationValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeometryUtil {
  
  /**
    * 计算line上距离P最近的点
    */
  @JSGlobal("AMap.GeometryUtil.closestOnLine")
  @js.native
  def closestOnLine(point: LocationValue, line: js.Array[LocationValue]): js.Tuple2[Double, Double] = js.native
  
  /**
    * 计算P2P3上距离P1最近的点
    * @param point1 P1
    * @param point2 P2
    * @param point3 P3
    */
  @JSGlobal("AMap.GeometryUtil.closestOnSegment")
  @js.native
  def closestOnSegment(point1: LocationValue, point2: LocationValue, point3: LocationValue): js.Tuple2[Double, Double] = js.native
  
  @JSGlobal("AMap.GeometryUtil.distance")
  @js.native
  def distance(point1: LocationValue, point2: js.Array[LocationValue]): Double = js.native
  /**
    * 计算两个经纬度点之间的实际距离
    */
  @JSGlobal("AMap.GeometryUtil.distance")
  @js.native
  def distance(point1: LocationValue, point2: LocationValue): Double = js.native
  
  /**
    * 计算一个经纬度路径的实际长度
    */
  @JSGlobal("AMap.GeometryUtil.distanceOfLine")
  @js.native
  def distanceOfLine(line: js.Array[LocationValue]): Double = js.native
  
  /**
    * 计算P到line的距离
    */
  @JSGlobal("AMap.GeometryUtil.distanceToLine")
  @js.native
  def distanceToLine(point: LocationValue, line: js.Array[LocationValue]): Double = js.native
  
  @JSGlobal("AMap.GeometryUtil.distanceToPolygon")
  @js.native
  def distanceToPolygon(point: LocationValue, polygon: js.Array[LocationValue]): Double = js.native
  
  /**
    * 计算P2P3到P1的距离
    * @param point1 P1
    * @param point2 P2
    * @param point3 P3
    */
  @JSGlobal("AMap.GeometryUtil.distanceToSegment")
  @js.native
  def distanceToSegment(point1: LocationValue, point2: LocationValue, point3: LocationValue): Double = js.native
  
  /**
    * 判断两个经纬度路径是否相交
    */
  @JSGlobal("AMap.GeometryUtil.doesLineLineIntersect")
  @js.native
  def doesLineLineIntersect(line1: js.Array[LocationValue], line2: js.Array[LocationValue]): Boolean = js.native
  
  /**
    * 判断经纬度路径和经纬度面是否交叉
    */
  @JSGlobal("AMap.GeometryUtil.doesLineRingIntersect")
  @js.native
  def doesLineRingIntersect(line: js.Array[LocationValue], ring: js.Array[LocationValue]): Boolean = js.native
  
  @JSGlobal("AMap.GeometryUtil.doesPolygonPolygonIntersect")
  @js.native
  def doesPolygonPolygonIntersect(polygon1: js.Array[LocationValue], polygon2: js.Array[LocationValue]): Boolean = js.native
  
  /**
    * 判断两个经纬度面是否交叉
    */
  @JSGlobal("AMap.GeometryUtil.doesRingRingIntersect")
  @js.native
  def doesRingRingIntersect(ring1: js.Array[LocationValue], ring2: js.Array[LocationValue]): Boolean = js.native
  
  /**
    * 判断线段和一个路径是否相交
    */
  @JSGlobal("AMap.GeometryUtil.doesSegmentLineIntersect")
  @js.native
  def doesSegmentLineIntersect(point1: LocationValue, point2: LocationValue, line: js.Array[LocationValue]): Boolean = js.native
  
  /**
    * 判断线段和多个环是否相交
    */
  @JSGlobal("AMap.GeometryUtil.doesSegmentPolygonIntersect")
  @js.native
  def doesSegmentPolygonIntersect(point1: LocationValue, point2: LocationValue, polygon: js.Array[js.Array[LocationValue]]): Boolean = js.native
  
  /**
    * 判断线段和一个环是否相交
    */
  @JSGlobal("AMap.GeometryUtil.doesSegmentRingIntersect")
  @js.native
  def doesSegmentRingIntersect(point1: LocationValue, point2: LocationValue, ring: js.Array[LocationValue]): Boolean = js.native
  
  /**
    * 判断两个线段是否相交
    */
  @JSGlobal("AMap.GeometryUtil.doesSegmentsIntersect")
  @js.native
  def doesSegmentsIntersect(point1: LocationValue, point2: LocationValue, point3: LocationValue, point4: LocationValue): Boolean = js.native
  
  /**
    * 判断一个经纬度路径是否为顺时针
    */
  @JSGlobal("AMap.GeometryUtil.isClockwise")
  @js.native
  def isClockwise(path: js.Array[LocationValue]): Boolean = js.native
  
  /**
    * 判断点是否在多个环组成区域内
    */
  @JSGlobal("AMap.GeometryUtil.isPointInPolygon")
  @js.native
  def isPointInPolygon(point: LocationValue, polygon: js.Array[js.Array[LocationValue]]): Boolean = js.native
  
  /**
    * 判断点是否在环内
    */
  @JSGlobal("AMap.GeometryUtil.isPointInRing")
  @js.native
  def isPointInRing(point: LocationValue, ring: js.Array[LocationValue]): Boolean = js.native
  
  /**
    * 判断P是否在line上
    * @param point 点P
    * @param line 线
    * @param tolerance 误差范围
    */
  @JSGlobal("AMap.GeometryUtil.isPointOnLine")
  @js.native
  def isPointOnLine(point: LocationValue, line: js.Array[LocationValue]): Boolean = js.native
  @JSGlobal("AMap.GeometryUtil.isPointOnLine")
  @js.native
  def isPointOnLine(point: LocationValue, line: js.Array[LocationValue], tolerance: Double): Boolean = js.native
  
  /**
    * 判断P是否在多个ring的边上
    * @param point 点P
    * @param polygon 多边形
    * @param tolerance 误差范围
    */
  @JSGlobal("AMap.GeometryUtil.isPointOnPolygon")
  @js.native
  def isPointOnPolygon(point: LocationValue, polygon: js.Array[js.Array[LocationValue]]): Boolean = js.native
  @JSGlobal("AMap.GeometryUtil.isPointOnPolygon")
  @js.native
  def isPointOnPolygon(point: LocationValue, polygon: js.Array[js.Array[LocationValue]], tolerance: Double): Boolean = js.native
  
  /**
    * 判断P是否在ring的边上
    * @param point 点P
    * @param ring 环
    * @param tolerance 误差范围
    */
  @JSGlobal("AMap.GeometryUtil.isPointOnRing")
  @js.native
  def isPointOnRing(point: LocationValue, ring: js.Array[LocationValue]): Boolean = js.native
  @JSGlobal("AMap.GeometryUtil.isPointOnRing")
  @js.native
  def isPointOnRing(point: LocationValue, ring: js.Array[LocationValue], tolerance: Double): Boolean = js.native
  
  /**
    * 判断P1是否在P2P3上
    * @param point1 P1
    * @param point2 P2
    * @param point3 P3
    * @param tolerance 误差范围
    */
  @JSGlobal("AMap.GeometryUtil.isPointOnSegment")
  @js.native
  def isPointOnSegment(point1: LocationValue, point2: LocationValue, point3: LocationValue): Boolean = js.native
  @JSGlobal("AMap.GeometryUtil.isPointOnSegment")
  @js.native
  def isPointOnSegment(point1: LocationValue, point2: LocationValue, point3: LocationValue, tolerance: Double): Boolean = js.native
  
  /**
    * 判断环是否在另一个环内
    */
  @JSGlobal("AMap.GeometryUtil.isRingInRing")
  @js.native
  def isRingInRing(ring1: js.Array[LocationValue], ring2: js.Array[LocationValue]): Boolean = js.native
  
  /**
    * 将一个路径变为逆时针
    */
  @JSGlobal("AMap.GeometryUtil.makesureAntiClockwise")
  @js.native
  def makesureAntiClockwise(path: js.Array[js.Tuple2[Double, Double]]): js.Array[js.Tuple2[Double, Double]] = js.native
  
  /**
    * 判断点是否在多个环组成区域内
    */
  @JSGlobal("AMap.GeometryUtil.makesureClockwise")
  @js.native
  def makesureClockwise(path: js.Array[js.Tuple2[Double, Double]]): js.Array[js.Tuple2[Double, Double]] = js.native
  
  /**
    * 计算一个经纬度路径围成区域的实际面积
    */
  @JSGlobal("AMap.GeometryUtil.ringArea")
  @js.native
  def ringArea(ring: js.Array[LocationValue]): Double = js.native
  
  /**
    * 计算两个经纬度面的交叉区域
    */
  @JSGlobal("AMap.GeometryUtil.ringRingClip")
  @js.native
  def ringRingClip(ring1: js.Array[LocationValue], ring2: js.Array[LocationValue]): js.Array[js.Tuple2[Double, Double]] = js.native
  
  @JSGlobal("AMap.GeometryUtil.triangulateShape")
  @js.native
  def triangulateShape(
    shape1: js.Array[typings.amapJsApi.AMap.LngLat | typings.amapJsApi.AMap.Pixel],
    shape2: js.Array[typings.amapJsApi.AMap.LngLat | typings.amapJsApi.AMap.Pixel]
  ): js.Array[Double] = js.native
  @JSGlobal("AMap.GeometryUtil.triangulateShape")
  @js.native
  def triangulateShape(
    shape1: js.Array[typings.amapJsApi.AMap.LngLat | typings.amapJsApi.AMap.Pixel],
    shape2: js.Tuple2[Double, Double]
  ): js.Array[Double] = js.native
  @JSGlobal("AMap.GeometryUtil.triangulateShape")
  @js.native
  def triangulateShape(
    shape1: js.Tuple2[Double, Double],
    shape2: js.Array[typings.amapJsApi.AMap.LngLat | typings.amapJsApi.AMap.Pixel]
  ): js.Array[Double] = js.native
  @JSGlobal("AMap.GeometryUtil.triangulateShape")
  @js.native
  def triangulateShape(shape1: js.Tuple2[Double, Double], shape2: js.Tuple2[Double, Double]): js.Array[Double] = js.native
}
