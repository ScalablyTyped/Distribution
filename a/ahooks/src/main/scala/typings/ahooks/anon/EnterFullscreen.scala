package typings.ahooks.anon

import typings.ahooks.ahooksBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterFullscreen extends StObject {
  
  def enterFullscreen(): Unit
  
  def exitFullscreen(): Unit
  
  val isEnabled: `true`
  
  def toggleFullscreen(): Unit
}
object EnterFullscreen {
  
  inline def apply(enterFullscreen: () => Unit, exitFullscreen: () => Unit, toggleFullscreen: () => Unit): EnterFullscreen = {
    val __obj = js.Dynamic.literal(enterFullscreen = js.Any.fromFunction0(enterFullscreen), exitFullscreen = js.Any.fromFunction0(exitFullscreen), isEnabled = true, toggleFullscreen = js.Any.fromFunction0(toggleFullscreen))
    __obj.asInstanceOf[EnterFullscreen]
  }
  
  extension [Self <: EnterFullscreen](x: Self) {
    
    inline def setEnterFullscreen(value: () => Unit): Self = StObject.set(x, "enterFullscreen", js.Any.fromFunction0(value))
    
    inline def setExitFullscreen(value: () => Unit): Self = StObject.set(x, "exitFullscreen", js.Any.fromFunction0(value))
    
    inline def setIsEnabled(value: `true`): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setToggleFullscreen(value: () => Unit): Self = StObject.set(x, "toggleFullscreen", js.Any.fromFunction0(value))
  }
}
