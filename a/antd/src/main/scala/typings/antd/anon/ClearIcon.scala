package typings.antd.anon

import typings.antd.iconUtilMod.RenderNode
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearIcon extends StObject {
  
  var clearIcon: js.UndefOr[RenderNode] = js.undefined
  
  var feedbackIcon: js.UndefOr[ReactNode] = js.undefined
  
  var hasFeedback: js.UndefOr[Boolean] = js.undefined
  
  var loading: js.UndefOr[Boolean] = js.undefined
  
  var menuItemSelectedIcon: js.UndefOr[RenderNode] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var prefixCls: String
  
  var removeIcon: js.UndefOr[RenderNode] = js.undefined
  
  var showArrow: js.UndefOr[Boolean] = js.undefined
  
  var suffixIcon: js.UndefOr[ReactNode] = js.undefined
}
object ClearIcon {
  
  inline def apply(prefixCls: String): ClearIcon = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearIcon]
  }
  
  extension [Self <: ClearIcon](x: Self) {
    
    inline def setClearIcon(value: RenderNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    inline def setClearIconFunction1(value: /* props */ Any => ReactNode): Self = StObject.set(x, "clearIcon", js.Any.fromFunction1(value))
    
    inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    inline def setFeedbackIcon(value: ReactNode): Self = StObject.set(x, "feedbackIcon", value.asInstanceOf[js.Any])
    
    inline def setFeedbackIconUndefined: Self = StObject.set(x, "feedbackIcon", js.undefined)
    
    inline def setHasFeedback(value: Boolean): Self = StObject.set(x, "hasFeedback", value.asInstanceOf[js.Any])
    
    inline def setHasFeedbackUndefined: Self = StObject.set(x, "hasFeedback", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setMenuItemSelectedIcon(value: RenderNode): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
    
    inline def setMenuItemSelectedIconFunction1(value: /* props */ Any => ReactNode): Self = StObject.set(x, "menuItemSelectedIcon", js.Any.fromFunction1(value))
    
    inline def setMenuItemSelectedIconUndefined: Self = StObject.set(x, "menuItemSelectedIcon", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setRemoveIcon(value: RenderNode): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
    
    inline def setRemoveIconFunction1(value: /* props */ Any => ReactNode): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
    
    inline def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
    
    inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
    
    inline def setSuffixIcon(value: ReactNode): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
  }
}
