package typings.asyncWriter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginAsyncOptions extends js.Object {
  var last: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object BeginAsyncOptions {
  @scala.inline
  def apply(): BeginAsyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginAsyncOptions]
  }
  @scala.inline
  implicit class BeginAsyncOptionsOps[Self <: BeginAsyncOptions] (val x: Self) extends AnyVal {
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
    def setLast(value: Boolean): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

