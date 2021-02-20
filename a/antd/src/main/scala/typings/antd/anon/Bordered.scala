package typings.antd.anon

import typings.antd.configProviderSizeContextMod.SizeType
import typings.antd.generatePickerMod.PickerLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bordered extends StObject {
  
  var bordered: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[PickerLocale] = js.native
  
  var size: js.UndefOr[SizeType] = js.native
}
object Bordered {
  
  @scala.inline
  def apply(): Bordered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bordered]
  }
  
  @scala.inline
  implicit class BorderedMutableBuilder[Self <: Bordered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    @scala.inline
    def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
