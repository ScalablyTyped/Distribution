package typings.antvComponent

import typings.antvComponent.anon.X
import typings.antvComponent.typesMod.Region
import typings.antvGBase.interfacesMod.IElement
import typings.antvGBase.typesMod.BBox
import typings.antvGBase.typesMod.Point
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@antv/component/lib/util/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearDom(container: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearDom")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createBBox(x: Double, y: Double, width: Double, height: Double): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("createBBox")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[BBox]
  
  inline def distance(p1: Point, p2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def formatPadding(padding: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatPadding")(padding.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def formatPadding(padding: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatPadding")(padding.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getBBoxWithClip(element: IElement): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("getBBoxWithClip")(element.asInstanceOf[js.Any]).asInstanceOf[BBox]
  
  inline def getCirclePoint(center: Point, radius: Double, angle: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getCirclePoint")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def getTextPoint(start: Point, end: Point, position: String, offset: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextPoint")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def getValueByPercent(min: Double, max: Double, percent: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueByPercent")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hasClass(elements: js.Any, cName: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(elements.asInstanceOf[js.Any], cName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectBBox(box1: BBox, box2: BBox): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectBBox")(box1.asInstanceOf[js.Any], box2.asInstanceOf[js.Any])).asInstanceOf[BBox]
  
  inline def mergeBBox(box1: BBox, box2: BBox): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeBBox")(box1.asInstanceOf[js.Any], box2.asInstanceOf[js.Any])).asInstanceOf[BBox]
  
  inline def near(x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("near")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def near(x: Double, y: Double, e: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("near")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pointsToBBox(points: js.Array[Point]): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("pointsToBBox")(points.asInstanceOf[js.Any]).asInstanceOf[BBox]
  
  inline def regionToBBox(region: Region): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("regionToBBox")(region.asInstanceOf[js.Any]).asInstanceOf[BBox]
  
  inline def toPx(number: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPx")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def updateClip(element: IElement, newElement: IElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClip")(element.asInstanceOf[js.Any], newElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def wait_(interval: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
