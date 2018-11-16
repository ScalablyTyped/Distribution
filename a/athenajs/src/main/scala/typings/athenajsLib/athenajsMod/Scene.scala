package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Scene")
@js.native
class Scene () extends js.Object {
  def this(options: SceneOptions) = this()
  var hudScene: Scene | scala.Null = js.native
  var map: Map = js.native
  var opacity: scala.Double = js.native
  var running: scala.Boolean = js.native
  def addObject(`object`: Drawable): Scene = js.native
  def addObject(`object`: Drawable, layer: scala.Double): Scene = js.native
  def addObject(`object`: js.Array[Drawable]): Scene = js.native
  def addObject(`object`: js.Array[Drawable], layer: scala.Double): Scene = js.native
  def animate(fxName: java.lang.String, options: EffectOptions): Promise = js.native
  def bindEvents(eventList: java.lang.String): scala.Unit = js.native
  def debug(): scala.Unit = js.native
  def debug(bool: scala.Boolean): scala.Unit = js.native
  def fadeIn(duration: scala.Double): Promise = js.native
  def fadeInAndOut(inDuration: scala.Double, delay: scala.Double, outDuration: scala.Double): Promise = js.native
  def fadeOut(duration: scala.Double): Promise = js.native
  def getOpacity(): scala.Double = js.native
  def getPlayTime(): scala.Double = js.native
  def load(`type`: java.lang.String, src: java.lang.String): scala.Unit = js.native
  def load(`type`: java.lang.String, src: java.lang.String, id: java.lang.String): scala.Unit = js.native
  def loadAudio(src: java.lang.String): scala.Unit = js.native
  def loadAudio(src: java.lang.String, id: java.lang.String): scala.Unit = js.native
  def loadImage(src: java.lang.String): scala.Unit = js.native
  def loadImage(src: java.lang.String, id: java.lang.String): scala.Unit = js.native
  def loadMap(src: java.lang.String): scala.Unit = js.native
  def loadMap(src: java.lang.String, id: java.lang.String): scala.Unit = js.native
  def notify(name: java.lang.String): scala.Unit = js.native
  def notify(name: java.lang.String, data: JSObject): scala.Unit = js.native
  def removeObject(obj: Drawable): scala.Unit = js.native
  def setBackgroundImage(image: java.lang.String): scala.Unit = js.native
  def setBackgroundImage(image: stdLib.HTMLImageElement): scala.Unit = js.native
  def setLayerPriority(layer: scala.Double, background: scala.Boolean): scala.Unit = js.native
  def setMap(map: JSObject): scala.Unit = js.native
  def setMap(map: JSObject, x: scala.Double): scala.Unit = js.native
  def setMap(map: JSObject, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setMap(map: Map, x: scala.Double): scala.Unit = js.native
  def setMap(map: Map, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  def setup(): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

