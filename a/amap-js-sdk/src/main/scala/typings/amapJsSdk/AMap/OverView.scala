package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverView
  extends EventBindable
     with MapControl {
  
  def close(): Unit = js.native
  
  def getTileLayer(): TileLayer = js.native
  
  def open(): Unit = js.native
  
  def setTileLayer(layer: TileLayer): Unit = js.native
}
object OverView {
  
  @scala.inline
  def apply(
    close: () => Unit,
    getTileLayer: () => TileLayer,
    hide: () => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    open: () => Unit,
    setTileLayer: TileLayer => Unit,
    show: () => Unit
  ): OverView = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getTileLayer = js.Any.fromFunction0(getTileLayer), hide = js.Any.fromFunction0(hide), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), open = js.Any.fromFunction0(open), setTileLayer = js.Any.fromFunction1(setTileLayer), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[OverView]
  }
  
  @scala.inline
  implicit class OverViewMutableBuilder[Self <: OverView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTileLayer(value: () => TileLayer): Self = StObject.set(x, "getTileLayer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTileLayer(value: TileLayer => Unit): Self = StObject.set(x, "setTileLayer", js.Any.fromFunction1(value))
  }
}
