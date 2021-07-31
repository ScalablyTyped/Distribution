package typings.antd.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearIcon extends StObject {
  
  var clearIcon: js.UndefOr[ReactNode] = js.undefined
  
  var loading: js.UndefOr[Boolean] = js.undefined
  
  var menuItemSelectedIcon: js.UndefOr[ReactNode] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var prefixCls: String
  
  var removeIcon: js.UndefOr[ReactNode] = js.undefined
  
  var suffixIcon: js.UndefOr[ReactNode] = js.undefined
}
object ClearIcon {
  
  @scala.inline
  def apply(prefixCls: String): ClearIcon = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearIcon]
  }
  
  @scala.inline
  implicit class ClearIconMutableBuilder[Self <: ClearIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearIcon(value: ReactNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setMenuItemSelectedIcon(value: ReactNode): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemSelectedIconUndefined: Self = StObject.set(x, "menuItemSelectedIcon", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIcon(value: ReactNode): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
    
    @scala.inline
    def setSuffixIcon(value: ReactNode): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
  }
}
