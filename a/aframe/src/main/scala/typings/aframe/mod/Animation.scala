package typings.aframe.mod

import typings.aframe.aframeStrings.alternate
import typings.aframe.aframeStrings.alternateReverse
import typings.aframe.aframeStrings.backwards
import typings.aframe.aframeStrings.both
import typings.aframe.aframeStrings.forwards
import typings.aframe.aframeStrings.indefinite
import typings.aframe.aframeStrings.none
import typings.aframe.aframeStrings.normal
import typings.aframe.aframeStrings.reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  var attribute: String
  
  var begin: String | Double
  
  var delay: Double
  
  var direction: alternate | alternateReverse | normal | reverse
  
  var dur: Double
  
  def easing(): Unit
  
  var end: String
  
  var fill: backwards | both | forwards | none
  
  var from: js.Any
  
  // TODO type
  var repeat: Double | indefinite
  
  var to: Double
}
object Animation {
  
  @scala.inline
  def apply(
    attribute: String,
    begin: String | Double,
    delay: Double,
    direction: alternate | alternateReverse | normal | reverse,
    dur: Double,
    easing: () => Unit,
    end: String,
    fill: backwards | both | forwards | none,
    from: js.Any,
    repeat: Double | indefinite,
    to: Double
  ): Animation = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], begin = begin.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], easing = js.Any.fromFunction0(easing), end = end.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBegin(value: String | Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: alternate | alternateReverse | normal | reverse): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: () => Unit): Self = StObject.set(x, "easing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: backwards | both | forwards | none): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: js.Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeat(value: Double | indefinite): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
