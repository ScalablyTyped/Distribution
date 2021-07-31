package typings.athenajs.mod

import typings.athenajs.anon.Instantiable
import typings.athenajs.anon.Loop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("athenajs", "Drawable")
@js.native
class Drawable protected () extends StObject {
  def this(`type`: String, options: DrawableOptions) = this()
  
  def addChild(child: Drawable): Unit = js.native
  
  def animate(name: String, options: JSObject): Promise = js.native
  
  var behavior: Behavior = js.native
  
  var canCollide: Boolean = js.native
  
  def center(): Drawable = js.native
  
  var currentMap: Map = js.native
  
  var currentMovement: String = js.native
  
  var data: JSObject = js.native
  
  def destroy(): Unit = js.native
  def destroy(data: js.Any): Unit = js.native
  
  def getCurrentHeight(): Double = js.native
  
  def getCurrentWidth(): Double = js.native
  
  def getProperty(prop: String): js.Any = js.native
  
  var height: Double = js.native
  
  def hide(): Unit = js.native
  
  var movable: Boolean = js.native
  
  def moveTo(x: Double, y: Double): Drawable = js.native
  def moveTo(x: Double, y: Double, duration: Double): Drawable = js.native
  
  def notify(id: String): Unit = js.native
  def notify(id: String, data: JSObject): Unit = js.native
  
  def onCollision(`object`: Drawable): Unit = js.native
  
  def onEvent(eventType: String): Unit = js.native
  def onEvent(eventType: String, data: JSObject): Unit = js.native
  
  def playSound(id: String): Unit = js.native
  def playSound(id: String, options: Loop): Unit = js.native
  
  def reset(): Unit = js.native
  
  var running: Boolean = js.native
  
  def setBehavior(behavior: String): Unit = js.native
  def setBehavior(behavior: String, options: JSObject): Unit = js.native
  def setBehavior(behavior: Instantiable): Unit = js.native
  def setBehavior(behavior: Instantiable, options: JSObject): Unit = js.native
  
  def setMask(): Unit = js.native
  def setMask(mask: Null, exclude: Boolean): Unit = js.native
  def setMask(mask: MaskOptions): Unit = js.native
  def setMask(mask: MaskOptions, exclude: Boolean): Unit = js.native
  
  def setProperty(prop: String, value: js.Any): Unit = js.native
  
  def setScale(scale: Double): Unit = js.native
  
  def show(): Unit = js.native
  
  def stopAnimate(): Unit = js.native
  def stopAnimate(endValue: Double): Unit = js.native
  
  var `type`: String = js.native
  
  var visible: Boolean = js.native
  
  var vx: Double = js.native
  
  var vy: Double = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
