package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animating extends StObject {
  
  var animating: Boolean
  
  var color: String
  
  var size: String
  
  var styles: StringDictionary[RegisteredStyle[js.Any]]
  
  var toast: Boolean
}
object Animating {
  
  @scala.inline
  def apply(
    animating: Boolean,
    color: String,
    size: String,
    styles: StringDictionary[RegisteredStyle[js.Any]],
    toast: Boolean
  ): Animating = {
    val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animating]
  }
  
  @scala.inline
  implicit class AnimatingMutableBuilder[Self <: Animating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[js.Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToast(value: Boolean): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
  }
}
