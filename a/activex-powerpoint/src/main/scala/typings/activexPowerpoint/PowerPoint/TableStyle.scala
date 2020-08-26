package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableStyle extends js.Object {
  val Id: String = js.native
  val Name: String = js.native
  @JSName("PowerPoint.TableStyle_typekey")
  var PowerPointDotTableStyle_typekey: TableStyle = js.native
}

object TableStyle {
  @scala.inline
  def apply(Id: String, Name: String, PowerPointDotTableStyle_typekey: TableStyle): TableStyle = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TableStyle_typekey")(PowerPointDotTableStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyle]
  }
  @scala.inline
  implicit class TableStyleOps[Self <: TableStyle] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotTableStyle_typekey(value: TableStyle): Self = this.set("PowerPoint.TableStyle_typekey", value.asInstanceOf[js.Any])
  }
  
}

