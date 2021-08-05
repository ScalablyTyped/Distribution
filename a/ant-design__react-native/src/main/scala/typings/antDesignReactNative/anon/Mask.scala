package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mask extends StObject {
  
  var duration: Double
  
  var mask: Boolean
  
  def onClose(): Unit
}
object Mask {
  
  inline def apply(duration: Double, mask: Boolean, onClose: () => Unit): Mask = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[Mask]
  }
  
  extension [Self <: Mask](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
  }
}
