package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var app: String | js.Array[String] = js.native
  var subscribeAll: js.UndefOr[Boolean] = js.native
}

object App {
  @scala.inline
  def apply(app: String | js.Array[String]): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
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
    def setAppVarargs(value: String*): Self = this.set("app", js.Array(value :_*))
    @scala.inline
    def setApp(value: String | js.Array[String]): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscribeAll(value: Boolean): Self = this.set("subscribeAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscribeAll: Self = this.set("subscribeAll", js.undefined)
  }
  
}

