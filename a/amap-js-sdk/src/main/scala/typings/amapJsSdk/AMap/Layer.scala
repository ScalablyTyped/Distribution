package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer
  extends StObject
     with EventBindable {
  
  def getTiles(): js.Array[String]
  
  def getZooms(): js.Array[Double]
  
  def hide(): Unit
  
  def reload(): Unit
  
  def setMap(map: Map): Unit
  
  def setOpacity(alpha: Double): Unit
  
  def setTileUrl(): Unit
  
  def setzIndex(index: Double): Unit
  
  def show(): Unit
}
object Layer {
  
  @scala.inline
  def apply(
    getTiles: () => js.Array[String],
    getZooms: () => js.Array[Double],
    hide: () => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    reload: () => Unit,
    setMap: Map => Unit,
    setOpacity: Double => Unit,
    setTileUrl: () => Unit,
    setzIndex: Double => Unit,
    show: () => Unit
  ): Layer = {
    val __obj = js.Dynamic.literal(getTiles = js.Any.fromFunction0(getTiles), getZooms = js.Any.fromFunction0(getZooms), hide = js.Any.fromFunction0(hide), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), reload = js.Any.fromFunction0(reload), setMap = js.Any.fromFunction1(setMap), setOpacity = js.Any.fromFunction1(setOpacity), setTileUrl = js.Any.fromFunction0(setTileUrl), setzIndex = js.Any.fromFunction1(setzIndex), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  implicit class LayerMutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTiles(value: () => js.Array[String]): Self = StObject.set(x, "getTiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetZooms(value: () => js.Array[Double]): Self = StObject.set(x, "getZooms", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetMap(value: Map => Unit): Self = StObject.set(x, "setMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpacity(value: Double => Unit): Self = StObject.set(x, "setOpacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTileUrl(value: () => Unit): Self = StObject.set(x, "setTileUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetzIndex(value: Double => Unit): Self = StObject.set(x, "setzIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
