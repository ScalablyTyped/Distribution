package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline extends EventBindable {
  
  def getBounds(): Bounds = js.native
  
  def getExtData(): js.Any = js.native
  
  def getLength(): Double = js.native
  
  def getOptions(): PolylineOptions = js.native
  
  def getPath(): js.Array[LngLat] = js.native
  
  def hide(): Unit = js.native
  
  def setExtData(ext: js.Any): Unit = js.native
  
  def setMap(map: Map): Unit = js.native
  
  def setOptions(opt: PolylineOptions): Unit = js.native
  
  def setPath(path: js.Array[LngLat]): Unit = js.native
  
  def show(): Unit = js.native
}
object Polyline {
  
  @scala.inline
  def apply(
    getBounds: () => Bounds,
    getExtData: () => js.Any,
    getLength: () => Double,
    getOptions: () => PolylineOptions,
    getPath: () => js.Array[LngLat],
    hide: () => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    setExtData: js.Any => Unit,
    setMap: Map => Unit,
    setOptions: PolylineOptions => Unit,
    setPath: js.Array[LngLat] => Unit,
    show: () => Unit
  ): Polyline = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), getExtData = js.Any.fromFunction0(getExtData), getLength = js.Any.fromFunction0(getLength), getOptions = js.Any.fromFunction0(getOptions), getPath = js.Any.fromFunction0(getPath), hide = js.Any.fromFunction0(hide), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), setExtData = js.Any.fromFunction1(setExtData), setMap = js.Any.fromFunction1(setMap), setOptions = js.Any.fromFunction1(setOptions), setPath = js.Any.fromFunction1(setPath), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Polyline]
  }
  
  @scala.inline
  implicit class PolylineMutableBuilder[Self <: Polyline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBounds(value: () => Bounds): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExtData(value: () => js.Any): Self = StObject.set(x, "getExtData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOptions(value: () => PolylineOptions): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPath(value: () => js.Array[LngLat]): Self = StObject.set(x, "getPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetExtData(value: js.Any => Unit): Self = StObject.set(x, "setExtData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMap(value: Map => Unit): Self = StObject.set(x, "setMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptions(value: PolylineOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPath(value: js.Array[LngLat] => Unit): Self = StObject.set(x, "setPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
