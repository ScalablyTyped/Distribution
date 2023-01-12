package typings.antd.anon

import typings.antd.libConfigProviderContextMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<antd.antd/lib/config-provider.ConfigProviderProps, 'prefixCls' | 'iconPrefixCls'> & {  theme :antd.antd/lib/config-provider/context.Theme | undefined} */
trait PickConfigProviderPropspr extends StObject {
  
  var iconPrefixCls: js.UndefOr[String] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
}
object PickConfigProviderPropspr {
  
  inline def apply(): PickConfigProviderPropspr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickConfigProviderPropspr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickConfigProviderPropspr] (val x: Self) extends AnyVal {
    
    inline def setIconPrefixCls(value: String): Self = StObject.set(x, "iconPrefixCls", value.asInstanceOf[js.Any])
    
    inline def setIconPrefixClsUndefined: Self = StObject.set(x, "iconPrefixCls", js.undefined)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
