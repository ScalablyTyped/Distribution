package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowFormat extends js.Object {
  
  val Application: js.Any = js.native
  
  var Blur: Double = js.native
  
  val Creator: Double = js.native
  
  var ForeColor: ColorFormat = js.native
  
  def IncrementOffsetX(Increment: Double): Unit = js.native
  
  def IncrementOffsetY(Increment: Double): Unit = js.native
  
  var Obscured: MsoTriState = js.native
  
  @JSName("Office.ShadowFormat_typekey")
  var OfficeDotShadowFormat_typekey: ShadowFormat = js.native
  
  var OffsetX: Double = js.native
  
  var OffsetY: Double = js.native
  
  val Parent: js.Any = js.native
  
  var RotateWithShape: MsoTriState = js.native
  
  var Size: Double = js.native
  
  var Style: MsoShadowStyle = js.native
  
  var Transparency: Double = js.native
  
  var Type: MsoShadowType = js.native
  
  var Visible: MsoTriState = js.native
}
object ShadowFormat {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Blur: Double,
    Creator: Double,
    ForeColor: ColorFormat,
    IncrementOffsetX: Double => Unit,
    IncrementOffsetY: Double => Unit,
    Obscured: MsoTriState,
    OfficeDotShadowFormat_typekey: ShadowFormat,
    OffsetX: Double,
    OffsetY: Double,
    Parent: js.Any,
    RotateWithShape: MsoTriState,
    Size: Double,
    Style: MsoShadowStyle,
    Transparency: Double,
    Type: MsoShadowType,
    Visible: MsoTriState
  ): ShadowFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Blur = Blur.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], IncrementOffsetX = js.Any.fromFunction1(IncrementOffsetX), IncrementOffsetY = js.Any.fromFunction1(IncrementOffsetY), Obscured = Obscured.asInstanceOf[js.Any], OffsetX = OffsetX.asInstanceOf[js.Any], OffsetY = OffsetY.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RotateWithShape = RotateWithShape.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ShadowFormat_typekey")(OfficeDotShadowFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowFormat]
  }
  
  @scala.inline
  implicit class ShadowFormatOps[Self <: ShadowFormat] (val x: Self) extends AnyVal {
    
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
    def setBlur(value: Double): Self = this.set("Blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: ColorFormat): Self = this.set("ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementOffsetX(value: Double => Unit): Self = this.set("IncrementOffsetX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncrementOffsetY(value: Double => Unit): Self = this.set("IncrementOffsetY", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObscured(value: MsoTriState): Self = this.set("Obscured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotShadowFormat_typekey(value: ShadowFormat): Self = this.set("Office.ShadowFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("OffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("OffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateWithShape(value: MsoTriState): Self = this.set("RotateWithShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: MsoShadowStyle): Self = this.set("Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparency(value: Double): Self = this.set("Transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoShadowType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: MsoTriState): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
}
