package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.LocationValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeometryUtil {
  
  @JSGlobal("AMap.GeometryUtil")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 计算line上距离P最近的点
    */
  @scala.inline
  def closestOnLine(point: LocationValue, line: js.Array[LocationValue]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("closestOnLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  /**
    * 计算P2P3上距离P1最近的点
    * @param point1 P1
    * @param point2 P2
    * @param point3 P3
    */
  @scala.inline
  def closestOnSegment(point1: LocationValue, point2: LocationValue, point3: LocationValue): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("closestOnSegment")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], point3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  @scala.inline
  def distance(point1: LocationValue, point2: js.Array[LocationValue]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[Double]
  /**
    * 计算两个经纬度点之间的实际距离
    */
  @scala.inline
  def distance(point1: LocationValue, point2: LocationValue): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * 计算一个经纬度路径的实际长度
    */
  @scala.inline
  def distanceOfLine(line: js.Array[LocationValue]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("distanceOfLine")(line.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * 计算P到line的距离
    */
  @scala.inline
  def distanceToLine(point: LocationValue, line: js.Array[LocationValue]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceToLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def distanceToPolygon(point: LocationValue, polygon: js.Array[LocationValue]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceToPolygon")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * 计算P2P3到P1的距离
    * @param point1 P1
    * @param point2 P2
    * @param point3 P3
    */
  @scala.inline
  def distanceToSegment(point1: LocationValue, point2: LocationValue, point3: LocationValue): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceToSegment")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], point3.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * 判断两个经纬度路径是否相交
    */
  @scala.inline
  def doesLineLineIntersect(line1: js.Array[LocationValue], line2: js.Array[LocationValue]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doesLineLineIntersect")(line1.asInstanceOf[js.Any], line2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 判断经纬度路径和经纬度面是否交叉
    */
  @scala.inline
  def doesLineRingIntersect(line: js.Array[LocationValue], ring: js.Array[LocationValue]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doesLineRingIntersect")(line.asInstanceOf[js.Any], ring.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def doesPolygonPolygonIntersect(polygon1: js.Array[LocationValue], polygon2: js.Array[LocationValue]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doesPolygonPolygonIntersect")(polygon1.asInstanceOf[js.Any], polygon2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 判断两个经纬度面是否交叉
    */
  @scala.inline
  def doesRingRingIntersect(ring1: js.Array[LocationValue], ring2: js.Array[LocationValue]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doesRingRingIntersect")(ring1.asInstanceOf[js.Any], ring2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 判断线段和一个路径是否相交
    */
  @scala.inline
  def doesSegmentLineIntersect(point1: LocationValue, point2: LocationValue, line: js.Array[LocationValue]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doesSegmentLineIntersect")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 判断线段和多个环是否相交
    */
  @scala.inline
  def doesSegmentPolygonIntersect(point1: LocationValue, point2: LocationValue, polygon: js.Array[js.Array[LocationValue]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doesSegmentPolygonIntersect")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 判断线段和一个环是否相交
    */
  @scala.inline
  def doesSegmentRingIntersect(point1: LocationValue, point2: LocationValue, ring: js.Array[LocationValue]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doesSegmentRingIntersect")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], ring.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 判断两个线段是否相交
    */
  @scala.inline
  def doesSegmentsIntersect(point1: LocationValue, point2: LocationValue, point3: LocationValue, point4: LocationValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doesSegmentsIntersect")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], point3.asInstanceOf[js.Any], point4.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 判断一个经纬度路径是否为顺时针
    */
  @scala.inline
  def isClockwise(path: js.Array[LocationValue]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClockwise")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * 判断点是否在多个环组成区域内
    */
  @scala.inline
  def isPointInPolygon(point: LocationValue, polygon: js.Array[js.Array[LocationValue]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInPolygon")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 判断点是否在环内
    */
  @scala.inline
  def isPointInRing(point: LocationValue, ring: js.Array[LocationValue]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInRing")(point.asInstanceOf[js.Any], ring.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 判断P是否在line上
    * @param point 点P
    * @param line 线
    * @param tolerance 误差范围
    */
  @scala.inline
  def isPointOnLine(point: LocationValue, line: js.Array[LocationValue]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isPointOnLine(point: LocationValue, line: js.Array[LocationValue], tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 判断P是否在多个ring的边上
    * @param point 点P
    * @param polygon 多边形
    * @param tolerance 误差范围
    */
  @scala.inline
  def isPointOnPolygon(point: LocationValue, polygon: js.Array[js.Array[LocationValue]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnPolygon")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isPointOnPolygon(point: LocationValue, polygon: js.Array[js.Array[LocationValue]], tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnPolygon")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 判断P是否在ring的边上
    * @param point 点P
    * @param ring 环
    * @param tolerance 误差范围
    */
  @scala.inline
  def isPointOnRing(point: LocationValue, ring: js.Array[LocationValue]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnRing")(point.asInstanceOf[js.Any], ring.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isPointOnRing(point: LocationValue, ring: js.Array[LocationValue], tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnRing")(point.asInstanceOf[js.Any], ring.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 判断P1是否在P2P3上
    * @param point1 P1
    * @param point2 P2
    * @param point3 P3
    * @param tolerance 误差范围
    */
  @scala.inline
  def isPointOnSegment(point1: LocationValue, point2: LocationValue, point3: LocationValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnSegment")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], point3.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isPointOnSegment(point1: LocationValue, point2: LocationValue, point3: LocationValue, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnSegment")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], point3.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 判断环是否在另一个环内
    */
  @scala.inline
  def isRingInRing(ring1: js.Array[LocationValue], ring2: js.Array[LocationValue]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRingInRing")(ring1.asInstanceOf[js.Any], ring2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 将一个路径变为逆时针
    */
  @scala.inline
  def makesureAntiClockwise(path: js.Array[js.Tuple2[Double, Double]]): js.Array[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("makesureAntiClockwise")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  
  /**
    * 判断点是否在多个环组成区域内
    */
  @scala.inline
  def makesureClockwise(path: js.Array[js.Tuple2[Double, Double]]): js.Array[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("makesureClockwise")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  
  /**
    * 计算一个经纬度路径围成区域的实际面积
    */
  @scala.inline
  def ringArea(ring: js.Array[LocationValue]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ringArea")(ring.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * 计算两个经纬度面的交叉区域
    */
  @scala.inline
  def ringRingClip(ring1: js.Array[LocationValue], ring2: js.Array[LocationValue]): js.Array[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("ringRingClip")(ring1.asInstanceOf[js.Any], ring2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  
  @scala.inline
  def triangulateShape(
    shape1: js.Array[typings.amapJsApi.AMap.LngLat | typings.amapJsApi.AMap.Pixel],
    shape2: js.Array[typings.amapJsApi.AMap.LngLat | typings.amapJsApi.AMap.Pixel]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulateShape")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def triangulateShape(
    shape1: js.Array[typings.amapJsApi.AMap.LngLat | typings.amapJsApi.AMap.Pixel],
    shape2: js.Tuple2[Double, Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulateShape")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def triangulateShape(
    shape1: js.Tuple2[Double, Double],
    shape2: js.Array[typings.amapJsApi.AMap.LngLat | typings.amapJsApi.AMap.Pixel]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulateShape")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def triangulateShape(shape1: js.Tuple2[Double, Double], shape2: js.Tuple2[Double, Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulateShape")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
