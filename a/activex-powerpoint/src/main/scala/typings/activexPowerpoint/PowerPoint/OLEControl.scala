package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OLEControl extends js.Object {
  var AltHTML: String = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  var Name: String = js.native
  @JSName("PowerPoint.OLEControl_typekey")
  var PowerPointDotOLEControl_typekey: OLEControl = js.native
  var Top: Double = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  val ZOrderPosition: Double = js.native
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
  @scala.inline
  implicit class OLEControlOps[Self <: OLEControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAltHTML(value: String): Self = this.set("AltHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotOLEControl_typekey(value: OLEControl): Self = this.set("PowerPoint.OLEControl_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("Top", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    @scala.inline
    def setZOrderPosition(value: Double): Self = this.set("ZOrderPosition", value.asInstanceOf[js.Any])
  }
  
}

