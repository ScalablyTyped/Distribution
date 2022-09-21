package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BalloonCheckbox extends StObject {
  
  val Application: Any
  
  var Checked: Boolean
  
  val Creator: Double
  
  val Item: String
  
  val Name: String
  
  /* private */ @JSName("Office.BalloonCheckbox_typekey")
  var OfficeDotBalloonCheckbox_typekey: BalloonCheckbox
  
  val Parent: Any
  
  var Text: String
}
object BalloonCheckbox {
  
  inline def apply(
    Application: Any,
    Checked: Boolean,
    Creator: Double,
    Item: String,
    Name: String,
    OfficeDotBalloonCheckbox_typekey: BalloonCheckbox,
    Parent: Any,
    Text: String
  ): BalloonCheckbox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Checked = Checked.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.BalloonCheckbox_typekey")(OfficeDotBalloonCheckbox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalloonCheckbox]
  }
  
  extension [Self <: BalloonCheckbox](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "Checked", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotBalloonCheckbox_typekey(value: BalloonCheckbox): Self = StObject.set(x, "Office.BalloonCheckbox_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
