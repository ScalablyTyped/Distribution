package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer extends EventBindable {
  
  def getTiles(): js.Array[String] = js.native
  
  def getZooms(): js.Array[Double] = js.native
  
  def hide(): Unit = js.native
  
  def reload(): Unit = js.native
  
  def setMap(map: Map): Unit = js.native
  
  def setOpacity(alpha: Double): Unit = js.native
  
  def setTileUrl(): Unit = js.native
  
  def setzIndex(index: Double): Unit = js.native
  
  def show(): Unit = js.native
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
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetTiles(value: () => js.Array[String]): Self = this.set("getTiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetZooms(value: () => js.Array[Double]): Self = this.set("getZooms", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReload(value: () => Unit): Self = this.set("reload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetMap(value: Map => Unit): Self = this.set("setMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpacity(value: Double => Unit): Self = this.set("setOpacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTileUrl(value: () => Unit): Self = this.set("setTileUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetzIndex(value: Double => Unit): Self = this.set("setzIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
}
