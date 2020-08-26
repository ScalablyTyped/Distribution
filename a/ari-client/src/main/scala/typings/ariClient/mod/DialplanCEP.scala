package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialplanCEP extends js.Object {
  /**
    * Parameter of current dialplan application.
    */
  var app_data: String = js.native
  /**
    * Name of current dialplan application.
    */
  var app_name: String = js.native
  /**
    * Context in the dialplan.
    */
  var context: String = js.native
  /**
    * Extension in the dialplan.
    */
  var exten: String = js.native
  /**
    * Priority in the dialplan.
    */
  var priority: Double = js.native
}

object DialplanCEP {
  @scala.inline
  def apply(app_data: String, app_name: String, context: String, exten: String, priority: Double): DialplanCEP = {
    val __obj = js.Dynamic.literal(app_data = app_data.asInstanceOf[js.Any], app_name = app_name.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], exten = exten.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialplanCEP]
  }
  @scala.inline
  implicit class DialplanCEPOps[Self <: DialplanCEP] (val x: Self) extends AnyVal {
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
    def setApp_data(value: String): Self = this.set("app_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setApp_name(value: String): Self = this.set("app_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setExten(value: String): Self = this.set("exten", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
  }
  
}

