package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartCharacters extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var Caption: String
  
  val Count: Double
  
  val Creator: Double
  
  def Delete(): js.Any
  
  val Font: ChartFont
  
  def Insert(String: String): js.Any
  
  val Parent: js.Any
  
  var PhoneticCharacters: String
  
  @JSName("PowerPoint.ChartCharacters_typekey")
  var PowerPointDotChartCharacters_typekey: ChartCharacters
  
  var Text: String
}
object ChartCharacters {
  
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Count: Double,
    Creator: Double,
    Delete: () => js.Any,
    Font: ChartFont,
    Insert: String => js.Any,
    Parent: js.Any,
    PhoneticCharacters: String,
    PowerPointDotChartCharacters_typekey: ChartCharacters,
    Text: String
  ): ChartCharacters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Insert = js.Any.fromFunction1(Insert), Parent = Parent.asInstanceOf[js.Any], PhoneticCharacters = PhoneticCharacters.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartCharacters_typekey")(PowerPointDotChartCharacters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCharacters]
  }
  
  @scala.inline
  implicit class ChartCharactersMutableBuilder[Self <: ChartCharacters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFont(value: ChartFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsert(value: String => js.Any): Self = StObject.set(x, "Insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticCharacters(value: String): Self = StObject.set(x, "PhoneticCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotChartCharacters_typekey(value: ChartCharacters): Self = StObject.set(x, "PowerPoint.ChartCharacters_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
