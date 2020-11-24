package typings.activexWord.Word

import typings.activexOffice.Office.MsoColorType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorFormat extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Black: Double = js.native
  
  var Brightness: Double = js.native
  
  val Creator: Double = js.native
  
  var Cyan: Double = js.native
  
  def Ink(Index: Double): Double = js.native
  
  var Magenta: Double = js.native
  
  var Name: String = js.native
  
  var ObjectThemeColor: WdThemeColorIndex = js.native
  
  var OverPrint: MsoTriState = js.native
  
  val Parent: js.Any = js.native
  
  var RGB: Double = js.native
  
  var SchemeColor: Double = js.native
  
  def SetCMYK(Cyan: Double, Magenta: Double, Yellow: Double, Black: Double): Unit = js.native
  
  var TintAndShade: Double = js.native
  
  val Type: MsoColorType = js.native
  
  @JSName("Word.ColorFormat_typekey")
  var WordDotColorFormat_typekey: ColorFormat = js.native
  
  var Yellow: Double = js.native
}
object ColorFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    Black: Double,
    Brightness: Double,
    Creator: Double,
    Cyan: Double,
    Ink: Double => Double,
    Magenta: Double,
    Name: String,
    ObjectThemeColor: WdThemeColorIndex,
    OverPrint: MsoTriState,
    Parent: js.Any,
    RGB: Double,
    SchemeColor: Double,
    SetCMYK: (Double, Double, Double, Double) => Unit,
    TintAndShade: Double,
    Type: MsoColorType,
    WordDotColorFormat_typekey: ColorFormat,
    Yellow: Double
  ): ColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Black = Black.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Cyan = Cyan.asInstanceOf[js.Any], Ink = js.Any.fromFunction1(Ink), Magenta = Magenta.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectThemeColor = ObjectThemeColor.asInstanceOf[js.Any], OverPrint = OverPrint.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], SetCMYK = js.Any.fromFunction4(SetCMYK), TintAndShade = TintAndShade.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Yellow = Yellow.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ColorFormat_typekey")(WordDotColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFormat]
  }
  
  @scala.inline
  implicit class ColorFormatOps[Self <: ColorFormat] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlack(value: Double): Self = this.set("Black", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightness(value: Double): Self = this.set("Brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyan(value: Double): Self = this.set("Cyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInk(value: Double => Double): Self = this.set("Ink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMagenta(value: Double): Self = this.set("Magenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectThemeColor(value: WdThemeColorIndex): Self = this.set("ObjectThemeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverPrint(value: MsoTriState): Self = this.set("OverPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGB(value: Double): Self = this.set("RGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeColor(value: Double): Self = this.set("SchemeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCMYK(value: (Double, Double, Double, Double) => Unit): Self = this.set("SetCMYK", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTintAndShade(value: Double): Self = this.set("TintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoColorType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotColorFormat_typekey(value: ColorFormat): Self = this.set("Word.ColorFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellow(value: Double): Self = this.set("Yellow", value.asInstanceOf[js.Any])
  }
}
