package typings.antd.anon

import typings.antd.configProviderSizeContextMod.SizeType
import typings.antd.generatePickerMod.PickerLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bordered extends js.Object {
  
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
  implicit class BorderedOps[Self <: Bordered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    
    @scala.inline
    def setLocale(value: PickerLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
