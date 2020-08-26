package typings.awsLambda.connectContactFlowMod

import typings.awsLambda.anon.ContactData
import typings.awsLambda.awsLambdaStrings.ContactFlowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectContactFlowEvent extends js.Object {
  var Details: ContactData = js.native
  var Name: ContactFlowEvent = js.native
}

object ConnectContactFlowEvent {
  @scala.inline
  def apply(Details: ContactData, Name: ContactFlowEvent): ConnectContactFlowEvent = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectContactFlowEvent]
  }
  @scala.inline
  implicit class ConnectContactFlowEventOps[Self <: ConnectContactFlowEvent] (val x: Self) extends AnyVal {
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
    def setDetails(value: ContactData): Self = this.set("Details", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ContactFlowEvent): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

