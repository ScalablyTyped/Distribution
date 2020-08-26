package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppString extends js.Object {
  var app: String = js.native
  var appArgs: js.UndefOr[String] = js.native
}

object AppString {
  @scala.inline
  def apply(app: String): AppString = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppString]
  }
  @scala.inline
  implicit class AppStringOps[Self <: AppString] (val x: Self) extends AnyVal {
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppArgs(value: String): Self = this.set("appArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppArgs: Self = this.set("appArgs", js.undefined)
  }
  
}

