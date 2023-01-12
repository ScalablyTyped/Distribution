package typings.amapJsSdk.AMap

import typings.amapJsSdk.anon.Lat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolBar
  extends StObject
     with EventBindable
     with MapControl {
  
  def doLocation(): Unit
  
  def getLocation(): Lat
  
  def getOffset(): Pixel
  
  def hideDirection(): Unit
  
  def hideLocation(): Unit
  
  def hideRuler(): Unit
  
  def setOffset(offset: Pixel): Unit
  
  def showDirection(): Unit
  
  def showLocation(): Unit
  
  def showRuler(): Unit
}
object ToolBar {
  
  inline def apply(
    doLocation: () => Unit,
    getLocation: () => Lat,
    getOffset: () => Pixel,
    hide: () => Unit,
    hideDirection: () => Unit,
    hideLocation: () => Unit,
    hideRuler: () => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    setOffset: Pixel => Unit,
    show: () => Unit,
    showDirection: () => Unit,
    showLocation: () => Unit,
    showRuler: () => Unit
  ): ToolBar = {
    val __obj = js.Dynamic.literal(doLocation = js.Any.fromFunction0(doLocation), getLocation = js.Any.fromFunction0(getLocation), getOffset = js.Any.fromFunction0(getOffset), hide = js.Any.fromFunction0(hide), hideDirection = js.Any.fromFunction0(hideDirection), hideLocation = js.Any.fromFunction0(hideLocation), hideRuler = js.Any.fromFunction0(hideRuler), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), setOffset = js.Any.fromFunction1(setOffset), show = js.Any.fromFunction0(show), showDirection = js.Any.fromFunction0(showDirection), showLocation = js.Any.fromFunction0(showLocation), showRuler = js.Any.fromFunction0(showRuler))
    __obj.asInstanceOf[ToolBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolBar] (val x: Self) extends AnyVal {
    
    inline def setDoLocation(value: () => Unit): Self = StObject.set(x, "doLocation", js.Any.fromFunction0(value))
    
    inline def setGetLocation(value: () => Lat): Self = StObject.set(x, "getLocation", js.Any.fromFunction0(value))
    
    inline def setGetOffset(value: () => Pixel): Self = StObject.set(x, "getOffset", js.Any.fromFunction0(value))
    
    inline def setHideDirection(value: () => Unit): Self = StObject.set(x, "hideDirection", js.Any.fromFunction0(value))
    
    inline def setHideLocation(value: () => Unit): Self = StObject.set(x, "hideLocation", js.Any.fromFunction0(value))
    
    inline def setHideRuler(value: () => Unit): Self = StObject.set(x, "hideRuler", js.Any.fromFunction0(value))
    
    inline def setSetOffset(value: Pixel => Unit): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
    
    inline def setShowDirection(value: () => Unit): Self = StObject.set(x, "showDirection", js.Any.fromFunction0(value))
    
    inline def setShowLocation(value: () => Unit): Self = StObject.set(x, "showLocation", js.Any.fromFunction0(value))
    
    inline def setShowRuler(value: () => Unit): Self = StObject.set(x, "showRuler", js.Any.fromFunction0(value))
  }
}
