package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circle extends StObject {
  
  def contains(point: LngLat): Boolean
  
  def getBounds(): Bounds
  
  def getCenter(): LngLat
  
  def getExtData(): Any
  
  def getOptions(): CircleOptions
  
  def getRadius(): Double
  
  def hide(): Unit
  
  def setCenter(lnglat: LngLat): Unit
  
  def setExtData(ext: Any): Unit
  
  def setMap(map: Map): Unit
  
  def setOptions(circleopt: CircleOptions): Unit
  
  def setRadius(radius: Double): Unit
  
  def show(): Unit
}
object Circle {
  
  inline def apply(
    contains: LngLat => Boolean,
    getBounds: () => Bounds,
    getCenter: () => LngLat,
    getExtData: () => Any,
    getOptions: () => CircleOptions,
    getRadius: () => Double,
    hide: () => Unit,
    setCenter: LngLat => Unit,
    setExtData: Any => Unit,
    setMap: Map => Unit,
    setOptions: CircleOptions => Unit,
    setRadius: Double => Unit,
    show: () => Unit
  ): Circle = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getBounds = js.Any.fromFunction0(getBounds), getCenter = js.Any.fromFunction0(getCenter), getExtData = js.Any.fromFunction0(getExtData), getOptions = js.Any.fromFunction0(getOptions), getRadius = js.Any.fromFunction0(getRadius), hide = js.Any.fromFunction0(hide), setCenter = js.Any.fromFunction1(setCenter), setExtData = js.Any.fromFunction1(setExtData), setMap = js.Any.fromFunction1(setMap), setOptions = js.Any.fromFunction1(setOptions), setRadius = js.Any.fromFunction1(setRadius), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Circle]
  }
  
  extension [Self <: Circle](x: Self) {
    
    inline def setContains(value: LngLat => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setGetBounds(value: () => Bounds): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    inline def setGetCenter(value: () => LngLat): Self = StObject.set(x, "getCenter", js.Any.fromFunction0(value))
    
    inline def setGetExtData(value: () => Any): Self = StObject.set(x, "getExtData", js.Any.fromFunction0(value))
    
    inline def setGetOptions(value: () => CircleOptions): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
    
    inline def setGetRadius(value: () => Double): Self = StObject.set(x, "getRadius", js.Any.fromFunction0(value))
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setSetCenter(value: LngLat => Unit): Self = StObject.set(x, "setCenter", js.Any.fromFunction1(value))
    
    inline def setSetExtData(value: Any => Unit): Self = StObject.set(x, "setExtData", js.Any.fromFunction1(value))
    
    inline def setSetMap(value: Map => Unit): Self = StObject.set(x, "setMap", js.Any.fromFunction1(value))
    
    inline def setSetOptions(value: CircleOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    
    inline def setSetRadius(value: Double => Unit): Self = StObject.set(x, "setRadius", js.Any.fromFunction1(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
