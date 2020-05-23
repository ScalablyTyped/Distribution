package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OLEControl extends js.Object {
  var AltHTML: String
  val Automation: js.Any
  var Height: Double
  var Left: Double
  var Name: String
  var Top: Double
  var Width: Double
  @JSName("Word.OLEControl_typekey")
  var WordDotOLEControl_typekey: OLEControl
  def Activate(): Unit
  def Copy(): Unit
  def Cut(): Unit
  def Delete(): Unit
  def Select(): Unit
}

object OLEControl {
  @scala.inline
  def apply(
    Activate: () => Unit,
    AltHTML: String,
    Automation: js.Any,
    Copy: () => Unit,
    Cut: () => Unit,
    Delete: () => Unit,
    Height: Double,
    Left: Double,
    Name: String,
    Select: () => Unit,
    Top: Double,
    Width: Double,
    WordDotOLEControl_typekey: OLEControl
  ): OLEControl = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), AltHTML = AltHTML.asInstanceOf[js.Any], Automation = Automation.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OLEControl_typekey")(WordDotOLEControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OLEControl]
  }
}

