package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlowFormat extends js.Object {
  
  val Application: js.Any = js.native
  
  val Color: ColorFormat = js.native
  
  val Creator: Double = js.native
  
  @JSName("Office.GlowFormat_typekey")
  var OfficeDotGlowFormat_typekey: GlowFormat = js.native
  
  var Radius: Double = js.native
  
  var Transparency: Double = js.native
}
object GlowFormat {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Color: ColorFormat,
    Creator: Double,
    OfficeDotGlowFormat_typekey: GlowFormat,
    Radius: Double,
    Transparency: Double
  ): GlowFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.GlowFormat_typekey")(OfficeDotGlowFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlowFormat]
  }
  
  @scala.inline
  implicit class GlowFormatOps[Self <: GlowFormat] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: ColorFormat): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotGlowFormat_typekey(value: GlowFormat): Self = this.set("Office.GlowFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("Radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparency(value: Double): Self = this.set("Transparency", value.asInstanceOf[js.Any])
  }
}
