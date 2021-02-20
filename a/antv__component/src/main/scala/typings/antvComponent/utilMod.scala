package typings.antvComponent

import typings.antvComponent.anon.X
import typings.antvComponent.typesMod.Region
import typings.antvGBase.interfacesMod.IElement
import typings.antvGBase.typesMod.BBox
import typings.antvGBase.typesMod.Point
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@antv/component/lib/util/util", "clearDom")
  @js.native
  def clearDom(container: HTMLElement): Unit = js.native
  
  @JSImport("@antv/component/lib/util/util", "createBBox")
  @js.native
  def createBBox(x: Double, y: Double, width: Double, height: Double): BBox = js.native
  
  @JSImport("@antv/component/lib/util/util", "distance")
  @js.native
  def distance(p1: Point, p2: Point): Double = js.native
  
  @JSImport("@antv/component/lib/util/util", "formatPadding")
  @js.native
  def formatPadding(padding: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("@antv/component/lib/util/util", "formatPadding")
  @js.native
  def formatPadding(padding: Double): js.Array[Double] = js.native
  
  @JSImport("@antv/component/lib/util/util", "getBBoxWithClip")
  @js.native
  def getBBoxWithClip(element: IElement): BBox = js.native
  
  @JSImport("@antv/component/lib/util/util", "getCirclePoint")
  @js.native
  def getCirclePoint(center: Point, radius: Double, angle: Double): X = js.native
  
  @JSImport("@antv/component/lib/util/util", "getTextPoint")
  @js.native
  def getTextPoint(start: Point, end: Point, position: String, offset: Double): Point = js.native
  
  @JSImport("@antv/component/lib/util/util", "getValueByPercent")
  @js.native
  def getValueByPercent(min: Double, max: Double, percent: Double): Double = js.native
  
  @JSImport("@antv/component/lib/util/util", "hasClass")
  @js.native
  def hasClass(elements: js.Any, cName: js.Any): Boolean = js.native
  
  @JSImport("@antv/component/lib/util/util", "intersectBBox")
  @js.native
  def intersectBBox(box1: BBox, box2: BBox): BBox = js.native
  
  @JSImport("@antv/component/lib/util/util", "mergeBBox")
  @js.native
  def mergeBBox(box1: BBox, box2: BBox): BBox = js.native
  
  @JSImport("@antv/component/lib/util/util", "near")
  @js.native
  def near(x: Double, y: Double): Boolean = js.native
  @JSImport("@antv/component/lib/util/util", "near")
  @js.native
  def near(x: Double, y: Double, e: Double): Boolean = js.native
  
  @JSImport("@antv/component/lib/util/util", "pointsToBBox")
  @js.native
  def pointsToBBox(points: js.Array[Point]): BBox = js.native
  
  @JSImport("@antv/component/lib/util/util", "regionToBBox")
  @js.native
  def regionToBBox(region: Region): BBox = js.native
  
  @JSImport("@antv/component/lib/util/util", "toPx")
  @js.native
  def toPx(number: js.Any): String = js.native
  
  @JSImport("@antv/component/lib/util/util", "updateClip")
  @js.native
  def updateClip(element: IElement, newElement: IElement): Unit = js.native
  
  @JSImport("@antv/component/lib/util/util", "wait")
  @js.native
  def wait_(interval: Double): js.Promise[Unit] = js.native
}
