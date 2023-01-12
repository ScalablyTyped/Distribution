package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libLocaleProviderMod.Locale
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLocaleProviderContextMod extends Shortcut {
  
  @JSImport("antd/lib/locale-provider/context", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[LocaleContextProps]] = js.native
  
  trait LocaleContextProps
    extends StObject
       with Locale {
    
    var exist: js.UndefOr[Boolean] = js.undefined
  }
  object LocaleContextProps {
    
    inline def apply(locale: String): LocaleContextProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleContextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocaleContextProps] (val x: Self) extends AnyVal {
      
      inline def setExist(value: Boolean): Self = StObject.set(x, "exist", value.asInstanceOf[js.Any])
      
      inline def setExistUndefined: Self = StObject.set(x, "exist", js.undefined)
    }
  }
  
  type _To = Context[js.UndefOr[LocaleContextProps]]
  
  /* This means you don't have to write `default`, but can instead just say `libLocaleProviderContextMod.foo` */
  override def _to: Context[js.UndefOr[LocaleContextProps]] = default
}
