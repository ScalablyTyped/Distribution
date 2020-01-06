package typings.awsDashSdk.clientsMobileanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventsInput extends js.Object {
  /**
    * The client context including the client ID, app title, app version and package name.
    */
  var clientContext: String = js.native
  /**
    * The encoding used for the client context.
    */
  var clientContextEncoding: js.UndefOr[String] = js.native
  /**
    * An array of Event JSON objects
    */
  var events: EventListDefinition = js.native
}

object PutEventsInput {
  @scala.inline
  def apply(clientContext: String, events: EventListDefinition, clientContextEncoding: String = null): PutEventsInput = {
    val __obj = js.Dynamic.literal(clientContext = clientContext.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    if (clientContextEncoding != null) __obj.updateDynamic("clientContextEncoding")(clientContextEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsInput]
  }
}

