package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverView
  extends StObject
     with EventBindable
     with MapControl {
  
  def close(): Unit
  
  def getTileLayer(): TileLayer
  
  def open(): Unit
  
  def setTileLayer(layer: TileLayer): Unit
}
object OverView {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: OverView] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setGetTileLayer(value: () => TileLayer): Self = StObject.set(x, "getTileLayer", js.Any.fromFunction0(value))
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setSetTileLayer(value: TileLayer => Unit): Self = StObject.set(x, "setTileLayer", js.Any.fromFunction1(value))
  }
}
