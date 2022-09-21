package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderFooter extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var Format: PpDateTimeFormat
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.HeaderFooter_typekey")
  var PowerPointDotHeaderFooter_typekey: HeaderFooter
  
  var Text: String
  
  var UseFormat: MsoTriState
  
  var Visible: MsoTriState
}
object HeaderFooter {
  
  inline def apply(
    Application: Application,
    Format: PpDateTimeFormat,
    Parent: Any,
    PowerPointDotHeaderFooter_typekey: HeaderFooter,
    Text: String,
    UseFormat: MsoTriState,
    Visible: MsoTriState
  ): HeaderFooter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], UseFormat = UseFormat.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.HeaderFooter_typekey")(PowerPointDotHeaderFooter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
  
  extension [Self <: HeaderFooter](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: PpDateTimeFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotHeaderFooter_typekey(value: HeaderFooter): Self = StObject.set(x, "PowerPoint.HeaderFooter_typekey", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setUseFormat(value: MsoTriState): Self = StObject.set(x, "UseFormat", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
