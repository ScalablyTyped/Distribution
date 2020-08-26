package typings.ariClient.anon

import typings.ariClient.mod.Containers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  var application: String = js.native
  var eventName: String = js.native
  var source: js.UndefOr[String | js.Array[String]] = js.native
  var variables: js.UndefOr[Containers] = js.native
}

object Application {
  @scala.inline
  def apply(application: String, eventName: String): Application = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
  @scala.inline
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
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
    def setApplication(value: String): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceVarargs(value: String*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(value: String | js.Array[String]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setVariables(value: Containers): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

