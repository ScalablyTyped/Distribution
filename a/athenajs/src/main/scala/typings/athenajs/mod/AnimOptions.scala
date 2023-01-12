package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimOptions extends StObject {
  
  var frameDuration: Double
  
  var frameHeight: Double
  
  var frameSpacing: js.UndefOr[Double] = js.undefined
  
  var frameWidth: Double
  
  var numFrames: Double
  
  var offsetX: js.UndefOr[Double] = js.undefined
  
  var offsetY: js.UndefOr[Double] = js.undefined
}
object AnimOptions {
  
  inline def apply(frameDuration: Double, frameHeight: Double, frameWidth: Double, numFrames: Double): AnimOptions = {
    val __obj = js.Dynamic.literal(frameDuration = frameDuration.asInstanceOf[js.Any], frameHeight = frameHeight.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], numFrames = numFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimOptions] (val x: Self) extends AnyVal {
    
    inline def setFrameDuration(value: Double): Self = StObject.set(x, "frameDuration", value.asInstanceOf[js.Any])
    
    inline def setFrameHeight(value: Double): Self = StObject.set(x, "frameHeight", value.asInstanceOf[js.Any])
    
    inline def setFrameSpacing(value: Double): Self = StObject.set(x, "frameSpacing", value.asInstanceOf[js.Any])
    
    inline def setFrameSpacingUndefined: Self = StObject.set(x, "frameSpacing", js.undefined)
    
    inline def setFrameWidth(value: Double): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
    
    inline def setNumFrames(value: Double): Self = StObject.set(x, "numFrames", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
  }
}
