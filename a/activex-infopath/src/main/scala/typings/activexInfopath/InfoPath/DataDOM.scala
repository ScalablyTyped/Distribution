package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataDOM extends js.Object {
  @JSName("InfoPath.DataDOM_typekey")
  var InfoPathDotDataDOM_typekey: DataDOM = js.native
}

object DataDOM {
  @scala.inline
  def apply(InfoPathDotDataDOM_typekey: DataDOM): DataDOM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InfoPath.DataDOM_typekey")(InfoPathDotDataDOM_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDOM]
  }
  @scala.inline
  implicit class DataDOMOps[Self <: DataDOM] (val x: Self) extends AnyVal {
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
    def setInfoPathDotDataDOM_typekey(value: DataDOM): Self = this.set("InfoPath.DataDOM_typekey", value.asInstanceOf[js.Any])
  }
  
}

