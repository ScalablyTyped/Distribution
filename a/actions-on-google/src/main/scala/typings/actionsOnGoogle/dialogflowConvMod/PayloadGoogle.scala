package typings.actionsOnGoogle.dialogflowConvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadGoogle extends js.Object {
  var google: GoogleAssistantResponse
}

object PayloadGoogle {
  @scala.inline
  def apply(google: GoogleAssistantResponse): PayloadGoogle = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PayloadGoogle]
  }
}

