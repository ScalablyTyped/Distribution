package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMsoChartArea extends js.Object {
  val Application: js.Any = js.native
  var AutoScaleFont: js.Any = js.native
  val Border: IMsoBorder = js.native
  val Creator: Double = js.native
  val Fill: ChartFillFormat = js.native
  val Font: ChartFont = js.native
  val Format: IMsoChartFormat = js.native
  var Height: Double = js.native
  val Interior: IMsoInterior = js.native
  var Left: Double = js.native
  val Name: String = js.native
  @JSName("Office.IMsoChartArea_typekey")
  var OfficeDotIMsoChartArea_typekey: IMsoChartArea = js.native
  val Parent: js.Any = js.native
  var RoundedCorners: Boolean = js.native
  var Shadow: Boolean = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  def Clear(): js.Any = js.native
  def ClearContents(): js.Any = js.native
  def ClearFormats(): js.Any = js.native
  def Copy(): js.Any = js.native
  def Select(): js.Any = js.native
}

object IMsoChartArea {
  @scala.inline
  def apply(
    Application: js.Any,
    AutoScaleFont: js.Any,
    Border: IMsoBorder,
    Clear: () => js.Any,
    ClearContents: () => js.Any,
    ClearFormats: () => js.Any,
    Copy: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Font: ChartFont,
    Format: IMsoChartFormat,
    Height: Double,
    Interior: IMsoInterior,
    Left: Double,
    Name: String,
    OfficeDotIMsoChartArea_typekey: IMsoChartArea,
    Parent: js.Any,
    RoundedCorners: Boolean,
    Select: () => js.Any,
    Shadow: Boolean,
    Top: Double,
    Width: Double
  ): IMsoChartArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), ClearContents = js.Any.fromFunction0(ClearContents), ClearFormats = js.Any.fromFunction0(ClearFormats), Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RoundedCorners = RoundedCorners.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoChartArea_typekey")(OfficeDotIMsoChartArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoChartArea]
  }
  @scala.inline
  implicit class IMsoChartAreaOps[Self <: IMsoChartArea] (val x: Self) extends AnyVal {
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoScaleFont(value: js.Any): Self = this.set("AutoScaleFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorder(value: IMsoBorder): Self = this.set("Border", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: () => js.Any): Self = this.set("Clear", js.Any.fromFunction0(value))
    @scala.inline
    def setClearContents(value: () => js.Any): Self = this.set("ClearContents", js.Any.fromFunction0(value))
    @scala.inline
    def setClearFormats(value: () => js.Any): Self = this.set("ClearFormats", js.Any.fromFunction0(value))
    @scala.inline
    def setCopy(value: () => js.Any): Self = this.set("Copy", js.Any.fromFunction0(value))
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFill(value: ChartFillFormat): Self = this.set("Fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: ChartFont): Self = this.set("Font", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: IMsoChartFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterior(value: IMsoInterior): Self = this.set("Interior", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotIMsoChartArea_typekey(value: IMsoChartArea): Self = this.set("Office.IMsoChartArea_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoundedCorners(value: Boolean): Self = this.set("RoundedCorners", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => js.Any): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("Shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("Top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
  
}

