package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DwUniqueID extends js.Object {
  val dwUniqueID: Double = js.native
}

object DwUniqueID {
  @scala.inline
  def apply(dwUniqueID: Double): DwUniqueID = {
    val __obj = js.Dynamic.literal(dwUniqueID = dwUniqueID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DwUniqueID]
  }
  @scala.inline
  implicit class DwUniqueIDOps[Self <: DwUniqueID] (val x: Self) extends AnyVal {
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
    def setDwUniqueID(value: Double): Self = this.set("dwUniqueID", value.asInstanceOf[js.Any])
  }
  
}

