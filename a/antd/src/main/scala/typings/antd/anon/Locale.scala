package typings.antd.anon

import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.libDatePickerGeneratePickerMod.PickerLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var locale: js.UndefOr[PickerLocale] = js.undefined
  
  var size: js.UndefOr[large | default | small] = js.undefined
}
object Locale {
  
  inline def apply(): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setSize(value: large | default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
