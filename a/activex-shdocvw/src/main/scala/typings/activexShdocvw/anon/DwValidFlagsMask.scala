package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DwValidFlagsMask extends js.Object {
  val dwValidFlagsMask: Double = js.native
  val dwWindowStateFlags: Double = js.native
}

object DwValidFlagsMask {
  @scala.inline
  def apply(dwValidFlagsMask: Double, dwWindowStateFlags: Double): DwValidFlagsMask = {
    val __obj = js.Dynamic.literal(dwValidFlagsMask = dwValidFlagsMask.asInstanceOf[js.Any], dwWindowStateFlags = dwWindowStateFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DwValidFlagsMask]
  }
  @scala.inline
  implicit class DwValidFlagsMaskOps[Self <: DwValidFlagsMask] (val x: Self) extends AnyVal {
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
    def setDwValidFlagsMask(value: Double): Self = this.set("dwValidFlagsMask", value.asInstanceOf[js.Any])
    @scala.inline
    def setDwWindowStateFlags(value: Double): Self = this.set("dwWindowStateFlags", value.asInstanceOf[js.Any])
  }
  
}

