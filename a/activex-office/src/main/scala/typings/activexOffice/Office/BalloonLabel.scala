package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BalloonLabel extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  val Item: String
  
  val Name: String
  
  /* private */ @JSName("Office.BalloonLabel_typekey")
  var OfficeDotBalloonLabel_typekey: BalloonLabel
  
  val Parent: Any
  
  var Text: String
}
object BalloonLabel {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Item: String,
    Name: String,
    OfficeDotBalloonLabel_typekey: BalloonLabel,
    Parent: Any,
    Text: String
  ): BalloonLabel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.BalloonLabel_typekey")(OfficeDotBalloonLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalloonLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BalloonLabel] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotBalloonLabel_typekey(value: BalloonLabel): Self = StObject.set(x, "Office.BalloonLabel_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
