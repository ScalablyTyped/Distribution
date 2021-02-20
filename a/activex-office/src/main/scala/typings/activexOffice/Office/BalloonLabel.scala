package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BalloonLabel extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  val Item: String = js.native
  
  val Name: String = js.native
  
  @JSName("Office.BalloonLabel_typekey")
  var OfficeDotBalloonLabel_typekey: BalloonLabel = js.native
  
  val Parent: js.Any = js.native
  
  var Text: String = js.native
}
object BalloonLabel {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Item: String,
    Name: String,
    OfficeDotBalloonLabel_typekey: BalloonLabel,
    Parent: js.Any,
    Text: String
  ): BalloonLabel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.BalloonLabel_typekey")(OfficeDotBalloonLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalloonLabel]
  }
  
  @scala.inline
  implicit class BalloonLabelMutableBuilder[Self <: BalloonLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotBalloonLabel_typekey(value: BalloonLabel): Self = StObject.set(x, "Office.BalloonLabel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
