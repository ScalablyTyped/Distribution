package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OLEControl extends js.Object {
  var AltHTML: String
  var Height: Double
  var Left: Double
  var Name: String
  @JSName("PowerPoint.OLEControl_typekey")
  var PowerPointDotOLEControl_typekey: OLEControl
  var Top: Double
  var Visible: Boolean
  var Width: Double
  val ZOrderPosition: Double
}

object OLEControl {
  @scala.inline
  def apply(
    AltHTML: String,
    Height: Double,
    Left: Double,
    Name: String,
    PowerPointDotOLEControl_typekey: OLEControl,
    Top: Double,
    Visible: Boolean,
    Width: Double,
    ZOrderPosition: Double
  ): OLEControl = {
    val __obj = js.Dynamic.literal(AltHTML = AltHTML.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], ZOrderPosition = ZOrderPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.OLEControl_typekey")(PowerPointDotOLEControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OLEControl]
  }
}

