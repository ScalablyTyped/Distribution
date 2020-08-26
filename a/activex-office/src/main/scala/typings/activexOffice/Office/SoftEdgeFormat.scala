package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftEdgeFormat extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.SoftEdgeFormat_typekey")
  var OfficeDotSoftEdgeFormat_typekey: SoftEdgeFormat = js.native
  var Radius: Double = js.native
  var Type: MsoSoftEdgeType = js.native
}

object SoftEdgeFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    OfficeDotSoftEdgeFormat_typekey: SoftEdgeFormat,
    Radius: Double,
    Type: MsoSoftEdgeType
  ): SoftEdgeFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SoftEdgeFormat_typekey")(OfficeDotSoftEdgeFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftEdgeFormat]
  }
  @scala.inline
  implicit class SoftEdgeFormatOps[Self <: SoftEdgeFormat] (val x: Self) extends AnyVal {
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
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotSoftEdgeFormat_typekey(value: SoftEdgeFormat): Self = this.set("Office.SoftEdgeFormat_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("Radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MsoSoftEdgeType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

