package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemeHues extends js.Object {
  
  var default: js.UndefOr[String] = js.native
  
  var `hue-1`: js.UndefOr[String] = js.native
  
  var `hue-2`: js.UndefOr[String] = js.native
  
  var `hue-3`: js.UndefOr[String] = js.native
}
object IThemeHues {
  
  @scala.inline
  def apply(): IThemeHues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThemeHues]
  }
  
  @scala.inline
  implicit class IThemeHuesOps[Self <: IThemeHues] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def `setHue-1`(value: String): Self = this.set("hue-1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHue-1`: Self = this.set("hue-1", js.undefined)
    
    @scala.inline
    def `setHue-2`(value: String): Self = this.set("hue-2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHue-2`: Self = this.set("hue-2", js.undefined)
    
    @scala.inline
    def `setHue-3`(value: String): Self = this.set("hue-3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHue-3`: Self = this.set("hue-3", js.undefined)
  }
}
