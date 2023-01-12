package typings.athenajs.mod

import typings.athenajs.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationObject extends StObject {
  
  var frameDuration: js.UndefOr[Double] = js.undefined
  
  var frames: js.Array[Height]
  
  var loop: js.UndefOr[Double] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
}
object AnimationObject {
  
  inline def apply(frames: js.Array[Height]): AnimationObject = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationObject] (val x: Self) extends AnyVal {
    
    inline def setFrameDuration(value: Double): Self = StObject.set(x, "frameDuration", value.asInstanceOf[js.Any])
    
    inline def setFrameDurationUndefined: Self = StObject.set(x, "frameDuration", js.undefined)
    
    inline def setFrames(value: js.Array[Height]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesVarargs(value: Height*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
