package typings.antd.anon

import typings.antd.configProviderSizeContextMod.SizeType
import typings.antd.generatePickerMod.PickerLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bordered extends StObject {
  
  var bordered: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[PickerLocale] = js.undefined
  
  var size: js.UndefOr[SizeType] = js.undefined
}
object Bordered {
  
  inline def apply(): Bordered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bordered]
  }
  
  extension [Self <: Bordered](x: Self) {
    
    inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    inline def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
