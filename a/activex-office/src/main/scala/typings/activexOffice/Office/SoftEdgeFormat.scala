package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftEdgeFormat extends js.Object {
  val Application: js.Any
  val Creator: Double
  @JSName("Office.SoftEdgeFormat_typekey")
  var OfficeDotSoftEdgeFormat_typekey: SoftEdgeFormat
  var Radius: Double
  var Type: MsoSoftEdgeType
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
}

