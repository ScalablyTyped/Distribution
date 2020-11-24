package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartFillFormat extends js.Object {
  
  val Application: js.Any = js.native
  
  val BackColor: ChartColorFormat = js.native
  
  val Creator: Double = js.native
  
  val ForeColor: ChartColorFormat = js.native
  
  val GradientColorType: Double = js.native
  
  val GradientDegree: Double = js.native
  
  val GradientStyle: Double = js.native
  
  val GradientVariant: Double = js.native
  
  @JSName("Office.ChartFillFormat_typekey")
  var OfficeDotChartFillFormat_typekey: ChartFillFormat = js.native
  
  def OneColorGradient(Style: Double, Variant: Double, Degree: Double): Unit = js.native
  
  val Parent: js.Any = js.native
  
  val Pattern: Double = js.native
  
  def Patterned(Pattern: Double): Unit = js.native
  
  def PresetGradient(Style: Double, Variant: Double, PresetGradientType: Double): Unit = js.native
  
  val PresetGradientType: Double = js.native
  
  val PresetTexture: Double = js.native
  
  def PresetTextured(PresetTexture: Double): Unit = js.native
  
  def Solid(): Unit = js.native
  
  val TextureName: String = js.native
  
  val TextureType: Double = js.native
  
  def TwoColorGradient(Style: Double, Variant: Double): Unit = js.native
  
  val Type: Double = js.native
  
  def UserPicture(PictureFile: String, PictureFormat: js.Any, PictureStackUnit: js.Any, PicturePlacement: js.Any): Unit = js.native
  
  def UserTextured(TextureFile: String): Unit = js.native
  
  var Visible: Double = js.native
}
object ChartFillFormat {
  
  @scala.inline
  def apply(
    Application: js.Any,
    BackColor: ChartColorFormat,
    Creator: Double,
    ForeColor: ChartColorFormat,
    GradientColorType: Double,
    GradientDegree: Double,
    GradientStyle: Double,
    GradientVariant: Double,
    OfficeDotChartFillFormat_typekey: ChartFillFormat,
    OneColorGradient: (Double, Double, Double) => Unit,
    Parent: js.Any,
    Pattern: Double,
    Patterned: Double => Unit,
    PresetGradient: (Double, Double, Double) => Unit,
    PresetGradientType: Double,
    PresetTexture: Double,
    PresetTextured: Double => Unit,
    Solid: () => Unit,
    TextureName: String,
    TextureType: Double,
    TwoColorGradient: (Double, Double) => Unit,
    Type: Double,
    UserPicture: (String, js.Any, js.Any, js.Any) => Unit,
    UserTextured: String => Unit,
    Visible: Double
  ): ChartFillFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], GradientColorType = GradientColorType.asInstanceOf[js.Any], GradientDegree = GradientDegree.asInstanceOf[js.Any], GradientStyle = GradientStyle.asInstanceOf[js.Any], GradientVariant = GradientVariant.asInstanceOf[js.Any], OneColorGradient = js.Any.fromFunction3(OneColorGradient), Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], Patterned = js.Any.fromFunction1(Patterned), PresetGradient = js.Any.fromFunction3(PresetGradient), PresetGradientType = PresetGradientType.asInstanceOf[js.Any], PresetTexture = PresetTexture.asInstanceOf[js.Any], PresetTextured = js.Any.fromFunction1(PresetTextured), Solid = js.Any.fromFunction0(Solid), TextureName = TextureName.asInstanceOf[js.Any], TextureType = TextureType.asInstanceOf[js.Any], TwoColorGradient = js.Any.fromFunction2(TwoColorGradient), Type = Type.asInstanceOf[js.Any], UserPicture = js.Any.fromFunction4(UserPicture), UserTextured = js.Any.fromFunction1(UserTextured), Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ChartFillFormat_typekey")(OfficeDotChartFillFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFillFormat]
  }
  
  @scala.inline
  implicit class ChartFillFormatOps[Self <: ChartFillFormat] (val x: Self) extends AnyVal {
    
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
    def setBackColor(value: ChartColorFormat): Self = this.set("BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: ChartColorFormat): Self = this.set("ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientColorType(value: Double): Self = this.set("GradientColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientDegree(value: Double): Self = this.set("GradientDegree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientStyle(value: Double): Self = this.set("GradientStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientVariant(value: Double): Self = this.set("GradientVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotChartFillFormat_typekey(value: ChartFillFormat): Self = this.set("Office.ChartFillFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneColorGradient(value: (Double, Double, Double) => Unit): Self = this.set("OneColorGradient", js.Any.fromFunction3(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: Double): Self = this.set("Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatterned(value: Double => Unit): Self = this.set("Patterned", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPresetGradient(value: (Double, Double, Double) => Unit): Self = this.set("PresetGradient", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPresetGradientType(value: Double): Self = this.set("PresetGradientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetTexture(value: Double): Self = this.set("PresetTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetTextured(value: Double => Unit): Self = this.set("PresetTextured", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSolid(value: () => Unit): Self = this.set("Solid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTextureName(value: String): Self = this.set("TextureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureType(value: Double): Self = this.set("TextureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoColorGradient(value: (Double, Double) => Unit): Self = this.set("TwoColorGradient", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPicture(value: (String, js.Any, js.Any, js.Any) => Unit): Self = this.set("UserPicture", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUserTextured(value: String => Unit): Self = this.set("UserTextured", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisible(value: Double): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
}
