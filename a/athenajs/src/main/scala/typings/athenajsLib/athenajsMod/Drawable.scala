package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Drawable")
@js.native
class Drawable protected () extends js.Object {
  def this(`type`: java.lang.String, options: DrawableOptions) = this()
  var behavior: Behavior = js.native
  var canCollide: scala.Boolean = js.native
  var currentMap: Map = js.native
  var currentMovement: java.lang.String = js.native
  var data: JSObject = js.native
  var height: scala.Double = js.native
  var movable: scala.Boolean = js.native
  var running: scala.Boolean = js.native
  var `type`: java.lang.String = js.native
  var visible: scala.Boolean = js.native
  var vx: scala.Double = js.native
  var vy: scala.Double = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def addChild(child: Drawable): scala.Unit = js.native
  def animate(name: java.lang.String, options: JSObject): Promise = js.native
  def center(): Drawable = js.native
  def destroy(): scala.Unit = js.native
  def destroy(data: js.Any): scala.Unit = js.native
  def getCurrentHeight(): scala.Double = js.native
  def getCurrentWidth(): scala.Double = js.native
  def getProperty(prop: java.lang.String): js.Any = js.native
  def hide(): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): Drawable = js.native
  def moveTo(x: scala.Double, y: scala.Double, duration: scala.Double): Drawable = js.native
  def notify(id: java.lang.String): scala.Unit = js.native
  def notify(id: java.lang.String, data: JSObject): scala.Unit = js.native
  def onCollision(`object`: Drawable): scala.Unit = js.native
  def onEvent(eventType: java.lang.String): scala.Unit = js.native
  def onEvent(eventType: java.lang.String, data: JSObject): scala.Unit = js.native
  def playSound(id: java.lang.String): scala.Unit = js.native
  def playSound(id: java.lang.String, options: athenajsLib.Anon_False): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def setBehavior(behavior: athenajsLib.Anon_Options): scala.Unit = js.native
  def setBehavior(behavior: athenajsLib.Anon_Options, options: JSObject): scala.Unit = js.native
  def setBehavior(behavior: java.lang.String): scala.Unit = js.native
  def setBehavior(behavior: java.lang.String, options: JSObject): scala.Unit = js.native
  def setMask(): scala.Unit = js.native
  def setMask(mask: MaskOptions): scala.Unit = js.native
  def setMask(mask: MaskOptions, exclude: scala.Boolean): scala.Unit = js.native
  def setMask(mask: scala.Null, exclude: scala.Boolean): scala.Unit = js.native
  def setProperty(prop: java.lang.String, value: js.Any): scala.Unit = js.native
  def setScale(scale: scala.Double): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def stopAnimate(): scala.Unit = js.native
  def stopAnimate(endValue: scala.Double): scala.Unit = js.native
}

