package typings.activexWord.Word

import typings.activexOffice.Office.MsoColorType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorFormat extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var Black: Double
  
  var Brightness: Double
  
  val Creator: Double
  
  var Cyan: Double
  
  def Ink(Index: Double): Double
  
  var Magenta: Double
  
  var Name: String
  
  var ObjectThemeColor: WdThemeColorIndex
  
  var OverPrint: MsoTriState
  
  val Parent: js.Any
  
  var RGB: Double
  
  var SchemeColor: Double
  
  def SetCMYK(Cyan: Double, Magenta: Double, Yellow: Double, Black: Double): Unit
  
  var TintAndShade: Double
  
  val Type: MsoColorType
  
  @JSName("Word.ColorFormat_typekey")
  var WordDotColorFormat_typekey: ColorFormat
  
  var Yellow: Double
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
  implicit class ColorFormatMutableBuilder[Self <: ColorFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlack(value: Double): Self = StObject.set(x, "Black", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "Brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyan(value: Double): Self = StObject.set(x, "Cyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInk(value: Double => Double): Self = StObject.set(x, "Ink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMagenta(value: Double): Self = StObject.set(x, "Magenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectThemeColor(value: WdThemeColorIndex): Self = StObject.set(x, "ObjectThemeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverPrint(value: MsoTriState): Self = StObject.set(x, "OverPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGB(value: Double): Self = StObject.set(x, "RGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeColor(value: Double): Self = StObject.set(x, "SchemeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCMYK(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "SetCMYK", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTintAndShade(value: Double): Self = StObject.set(x, "TintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoColorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotColorFormat_typekey(value: ColorFormat): Self = StObject.set(x, "Word.ColorFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellow(value: Double): Self = StObject.set(x, "Yellow", value.asInstanceOf[js.Any])
  }
}
