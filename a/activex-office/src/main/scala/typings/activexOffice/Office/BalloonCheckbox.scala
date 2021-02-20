package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BalloonCheckbox extends StObject {
  
  val Application: js.Any = js.native
  
  var Checked: Boolean = js.native
  
  val Creator: Double = js.native
  
  val Item: String = js.native
  
  val Name: String = js.native
  
  @JSName("Office.BalloonCheckbox_typekey")
  var OfficeDotBalloonCheckbox_typekey: BalloonCheckbox = js.native
  
  val Parent: js.Any = js.native
  
  var Text: String = js.native
}
object BalloonCheckbox {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Checked: Boolean,
    Creator: Double,
    Item: String,
    Name: String,
    OfficeDotBalloonCheckbox_typekey: BalloonCheckbox,
    Parent: js.Any,
    Text: String
  ): BalloonCheckbox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Checked = Checked.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.BalloonCheckbox_typekey")(OfficeDotBalloonCheckbox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalloonCheckbox]
  }
  
  @scala.inline
  implicit class BalloonCheckboxMutableBuilder[Self <: BalloonCheckbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "Checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotBalloonCheckbox_typekey(value: BalloonCheckbox): Self = StObject.set(x, "Office.BalloonCheckbox_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
