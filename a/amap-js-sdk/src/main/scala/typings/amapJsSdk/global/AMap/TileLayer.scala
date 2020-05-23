package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.AMap.EventCallback
import typings.amapJsSdk.anon.AutoRefresh
import typings.amapJsSdk.anon.DetectRetina
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.TileLayer")
@js.native
class TileLayer ()
  extends typings.amapJsSdk.AMap.Layer {
  def this(tileOpt: DetectRetina) = this()
  /* CompleteClass */
  override def getTiles(): js.Array[String] = js.native
  /* CompleteClass */
  override def getZooms(): js.Array[Double] = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def off(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def reload(): Unit = js.native
  /* CompleteClass */
  override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
  /* CompleteClass */
  override def setOpacity(alpha: Double): Unit = js.native
  /* CompleteClass */
  override def setTileUrl(): Unit = js.native
  /* CompleteClass */
  override def setzIndex(index: Double): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
}

@JSGlobal("AMap.TileLayer")
@js.native
object TileLayer extends js.Object {
  @js.native
  abstract class MapTypeLayer ()
    extends typings.amapJsSdk.AMap.Layer {
    def this(options: typings.amapJsSdk.anon.Map) = this()
    /* CompleteClass */
    override def getTiles(): js.Array[String] = js.native
    /* CompleteClass */
    override def getZooms(): js.Array[Double] = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def off(eventName: String, callback: EventCallback): Unit = js.native
    /* CompleteClass */
    override def on(eventName: String, callback: EventCallback): Unit = js.native
    /* CompleteClass */
    override def reload(): Unit = js.native
    /* CompleteClass */
    override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
    /* CompleteClass */
    override def setOpacity(alpha: Double): Unit = js.native
    /* CompleteClass */
    override def setTileUrl(): Unit = js.native
    /* CompleteClass */
    override def setzIndex(index: Double): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  class RoadNet ()
    extends typings.amapJsSdk.AMap.Layer {
    /* CompleteClass */
    override def getTiles(): js.Array[String] = js.native
    /* CompleteClass */
    override def getZooms(): js.Array[Double] = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def off(eventName: String, callback: EventCallback): Unit = js.native
    /* CompleteClass */
    override def on(eventName: String, callback: EventCallback): Unit = js.native
    /* CompleteClass */
    override def reload(): Unit = js.native
    /* CompleteClass */
    override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
    /* CompleteClass */
    override def setOpacity(alpha: Double): Unit = js.native
    /* CompleteClass */
    override def setTileUrl(): Unit = js.native
    /* CompleteClass */
    override def setzIndex(index: Double): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  class Satellite ()
    extends typings.amapJsSdk.AMap.Layer {
    /* CompleteClass */
    override def getTiles(): js.Array[String] = js.native
    /* CompleteClass */
    override def getZooms(): js.Array[Double] = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def off(eventName: String, callback: EventCallback): Unit = js.native
    /* CompleteClass */
    override def on(eventName: String, callback: EventCallback): Unit = js.native
    /* CompleteClass */
    override def reload(): Unit = js.native
    /* CompleteClass */
    override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
    /* CompleteClass */
    override def setOpacity(alpha: Double): Unit = js.native
    /* CompleteClass */
    override def setTileUrl(): Unit = js.native
    /* CompleteClass */
    override def setzIndex(index: Double): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  class Traffic ()
    extends typings.amapJsSdk.AMap.TileLayer.Traffic {
    def this(options: AutoRefresh) = this()
    /* CompleteClass */
    override var autoRefresh: Boolean = js.native
    /* CompleteClass */
    override var interval: Double = js.native
    /* CompleteClass */
    override def getTiles(): js.Array[String] = js.native
    /* CompleteClass */
    override def getZooms(): js.Array[Double] = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def off(eventName: String, callback: EventCallback): Unit = js.native
    /* CompleteClass */
    override def on(eventName: String, callback: EventCallback): Unit = js.native
    /* CompleteClass */
    override def reload(): Unit = js.native
    /* CompleteClass */
    override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
    /* CompleteClass */
    override def setOpacity(alpha: Double): Unit = js.native
    /* CompleteClass */
    override def setTileUrl(): Unit = js.native
    /* CompleteClass */
    override def setzIndex(index: Double): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
}

