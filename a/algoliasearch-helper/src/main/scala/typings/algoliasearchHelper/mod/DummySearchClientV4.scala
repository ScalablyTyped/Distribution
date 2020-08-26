package typings.algoliasearchHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DummySearchClientV4 extends js.Object {
  var transporter: js.Any = js.native
}

object DummySearchClientV4 {
  @scala.inline
  def apply(transporter: js.Any): DummySearchClientV4 = {
    val __obj = js.Dynamic.literal(transporter = transporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DummySearchClientV4]
  }
  @scala.inline
  implicit class DummySearchClientV4Ops[Self <: DummySearchClientV4] (val x: Self) extends AnyVal {
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
    def setTransporter(value: js.Any): Self = this.set("transporter", value.asInstanceOf[js.Any])
  }
  
}

