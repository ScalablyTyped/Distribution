package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animating extends StObject {
  
  var animating: Boolean
  
  var panelColor: String
  
  var prefixCls: String
  
  var size: String
  
  var toast: Boolean
}
object Animating {
  
  @scala.inline
  def apply(animating: Boolean, panelColor: String, prefixCls: String, size: String, toast: Boolean): Animating = {
    val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], panelColor = panelColor.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animating]
  }
  
  @scala.inline
  implicit class AnimatingMutableBuilder[Self <: Animating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelColor(value: String): Self = StObject.set(x, "panelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToast(value: Boolean): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
  }
}
