package typings.athenajs.mod

import typings.athenajs.AnonInstantiable
import typings.athenajs.AnonLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Drawable")
@js.native
class Drawable protected () extends js.Object {
  def this(`type`: String, options: DrawableOptions) = this()
  var behavior: Behavior = js.native
  var canCollide: Boolean = js.native
  var currentMap: Map = js.native
  var currentMovement: String = js.native
  var data: JSObject = js.native
  var height: Double = js.native
  var movable: Boolean = js.native
  var running: Boolean = js.native
  var `type`: String = js.native
  var visible: Boolean = js.native
  var vx: Double = js.native
  var vy: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def addChild(child: Drawable): Unit = js.native
  def animate(name: String, options: JSObject): Promise = js.native
  def center(): Drawable = js.native
  def destroy(): Unit = js.native
  def destroy(data: js.Any): Unit = js.native
  def getCurrentHeight(): Double = js.native
  def getCurrentWidth(): Double = js.native
  def getProperty(prop: String): js.Any = js.native
  def hide(): Unit = js.native
  def moveTo(x: Double, y: Double): Drawable = js.native
  def moveTo(x: Double, y: Double, duration: Double): Drawable = js.native
  def notify(id: String): Unit = js.native
  def notify(id: String, data: JSObject): Unit = js.native
  def onCollision(`object`: Drawable): Unit = js.native
  def onEvent(eventType: String): Unit = js.native
  def onEvent(eventType: String, data: JSObject): Unit = js.native
  def playSound(id: String): Unit = js.native
  def playSound(id: String, options: AnonLoop): Unit = js.native
  def reset(): Unit = js.native
  def setBehavior(behavior: String): Unit = js.native
  def setBehavior(behavior: String, options: JSObject): Unit = js.native
  def setBehavior(behavior: AnonInstantiable): Unit = js.native
  def setBehavior(behavior: AnonInstantiable, options: JSObject): Unit = js.native
  def setMask(): Unit = js.native
  def setMask(mask: Null, exclude: Boolean): Unit = js.native
  def setMask(mask: MaskOptions): Unit = js.native
  def setMask(mask: MaskOptions, exclude: Boolean): Unit = js.native
  def setProperty(prop: String, value: js.Any): Unit = js.native
  def setScale(scale: Double): Unit = js.native
  def show(): Unit = js.native
  def stopAnimate(): Unit = js.native
  def stopAnimate(endValue: Double): Unit = js.native
}

