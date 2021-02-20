package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyleLevel extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Font: typings.activexPowerpoint.PowerPoint.Font = js.native
  
  val ParagraphFormat: typings.activexPowerpoint.PowerPoint.ParagraphFormat = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.TextStyleLevel_typekey")
  var PowerPointDotTextStyleLevel_typekey: TextStyleLevel = js.native
}
object TextStyleLevel {
  
  @scala.inline
  def apply(
    Application: Application,
    Font: Font,
    ParagraphFormat: ParagraphFormat,
    Parent: js.Any,
    PowerPointDotTextStyleLevel_typekey: TextStyleLevel
  ): TextStyleLevel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ParagraphFormat = ParagraphFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyleLevel_typekey")(PowerPointDotTextStyleLevel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleLevel]
  }
  
  @scala.inline
  implicit class TextStyleLevelMutableBuilder[Self <: TextStyleLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphFormat(value: ParagraphFormat): Self = StObject.set(x, "ParagraphFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTextStyleLevel_typekey(value: TextStyleLevel): Self = StObject.set(x, "PowerPoint.TextStyleLevel_typekey", value.asInstanceOf[js.Any])
  }
}
