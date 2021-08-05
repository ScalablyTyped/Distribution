package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animated extends StObject {
  
  var animated: Boolean
  
  var animationType: String
  
  var closable: Boolean
  
  var footer: js.Array[scala.Nothing]
  
  def onShow(): Unit
  
  var operation: Boolean
  
  var platform: String
  
  var popup: Boolean
  
  var prefixCls: String
  
  var transparent: Boolean
}
object Animated {
  
  inline def apply(
    animated: Boolean,
    animationType: String,
    closable: Boolean,
    footer: js.Array[scala.Nothing],
    onShow: () => Unit,
    operation: Boolean,
    platform: String,
    popup: Boolean,
    prefixCls: String,
    transparent: Boolean
  ): Animated = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], animationType = animationType.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], onShow = js.Any.fromFunction0(onShow), operation = operation.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animated]
  }
  
  extension [Self <: Animated](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimationType(value: String): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
    
    inline def setFooter(value: js.Array[scala.Nothing]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterVarargs(value: scala.Nothing*): Self = StObject.set(x, "footer", js.Array(value :_*))
    
    inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOperation(value: Boolean): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
  }
}
