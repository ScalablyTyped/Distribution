package typings.antvComponent

import typings.antvComponent.anon.X
import typings.antvComponent.typesMod.Region
import typings.antvGBase.interfacesMod.IElement
import typings.antvGBase.typesMod.BBox
import typings.antvGBase.typesMod.Point
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/util/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def clearDom(container: HTMLElement): Unit = js.native
  
  def createBBox(x: Double, y: Double, width: Double, height: Double): BBox = js.native
  
  def distance(p1: Point, p2: Point): Double = js.native
  
  def formatPadding(padding: js.Array[Double]): js.Array[Double] = js.native
  def formatPadding(padding: Double): js.Array[Double] = js.native
  
  def getBBoxWithClip(element: IElement): BBox = js.native
  
  def getCirclePoint(center: Point, radius: Double, angle: Double): X = js.native
  
  def getTextPoint(start: Point, end: Point, position: String, offset: Double): Point = js.native
  
  def getValueByPercent(min: Double, max: Double, percent: Double): Double = js.native
  
  def hasClass(elements: js.Any, cName: js.Any): Boolean = js.native
  
  def intersectBBox(box1: BBox, box2: BBox): BBox = js.native
  
  def mergeBBox(box1: BBox, box2: BBox): BBox = js.native
  
  def near(x: Double, y: Double): Boolean = js.native
  def near(x: Double, y: Double, e: Double): Boolean = js.native
  
  def pointsToBBox(points: js.Array[Point]): BBox = js.native
  
  def regionToBBox(region: Region): BBox = js.native
  
  def toPx(number: js.Any): String = js.native
  
  def updateClip(element: IElement, newElement: IElement): Unit = js.native
  
  def wait(interval: Double): js.Promise[Unit] = js.native
}
