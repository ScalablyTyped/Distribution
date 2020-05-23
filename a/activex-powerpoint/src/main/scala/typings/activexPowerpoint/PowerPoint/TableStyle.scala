package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableStyle extends js.Object {
  val Id: String
  val Name: String
  @JSName("PowerPoint.TableStyle_typekey")
  var PowerPointDotTableStyle_typekey: TableStyle
}

object TableStyle {
  @scala.inline
  def apply(Id: String, Name: String, PowerPointDotTableStyle_typekey: TableStyle): TableStyle = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TableStyle_typekey")(PowerPointDotTableStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyle]
  }
}

