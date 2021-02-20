package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle extends StObject {
  
  def contains(point: LngLat): Boolean = js.native
  
  def getBounds(): Bounds = js.native
  
  def getCenter(): LngLat = js.native
  
  def getExtData(): js.Any = js.native
  
  def getOptions(): CircleOptions = js.native
  
  def getRadius(): Double = js.native
  
  def hide(): Unit = js.native
  
  def setCenter(lnglat: LngLat): Unit = js.native
  
  def setExtData(ext: js.Any): Unit = js.native
  
  def setMap(map: Map): Unit = js.native
  
  def setOptions(circleopt: CircleOptions): Unit = js.native
  
  def setRadius(radius: Double): Unit = js.native
  
  def show(): Unit = js.native
}
object Circle {
  
  @scala.inline
  def apply(
    contains: LngLat => Boolean,
    getBounds: () => Bounds,
    getCenter: () => LngLat,
    getExtData: () => js.Any,
    getOptions: () => CircleOptions,
    getRadius: () => Double,
    hide: () => Unit,
    setCenter: LngLat => Unit,
    setExtData: js.Any => Unit,
    setMap: Map => Unit,
    setOptions: CircleOptions => Unit,
    setRadius: Double => Unit,
    show: () => Unit
  ): Circle = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getBounds = js.Any.fromFunction0(getBounds), getCenter = js.Any.fromFunction0(getCenter), getExtData = js.Any.fromFunction0(getExtData), getOptions = js.Any.fromFunction0(getOptions), getRadius = js.Any.fromFunction0(getRadius), hide = js.Any.fromFunction0(hide), setCenter = js.Any.fromFunction1(setCenter), setExtData = js.Any.fromFunction1(setExtData), setMap = js.Any.fromFunction1(setMap), setOptions = js.Any.fromFunction1(setOptions), setRadius = js.Any.fromFunction1(setRadius), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Circle]
  }
  
  @scala.inline
  implicit class CircleMutableBuilder[Self <: Circle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: LngLat => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBounds(value: () => Bounds): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCenter(value: () => LngLat): Self = StObject.set(x, "getCenter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExtData(value: () => js.Any): Self = StObject.set(x, "getExtData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOptions(value: () => CircleOptions): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRadius(value: () => Double): Self = StObject.set(x, "getRadius", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCenter(value: LngLat => Unit): Self = StObject.set(x, "setCenter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExtData(value: js.Any => Unit): Self = StObject.set(x, "setExtData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMap(value: Map => Unit): Self = StObject.set(x, "setMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptions(value: CircleOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRadius(value: Double => Unit): Self = StObject.set(x, "setRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
