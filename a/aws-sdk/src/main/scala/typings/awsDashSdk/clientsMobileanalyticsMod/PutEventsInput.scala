package typings.awsDashSdk.clientsMobileanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventsInput extends js.Object {
  /**
    * The client context including the client ID, app title, app version and package name.
    */
  var clientContext: String
  /**
    * The encoding used for the client context.
    */
  var clientContextEncoding: js.UndefOr[String] = js.undefined
  /**
    * An array of Event JSON objects
    */
  var events: EventListDefinition
}

object PutEventsInput {
  @scala.inline
  def apply(clientContext: String, events: EventListDefinition, clientContextEncoding: String = null): PutEventsInput = {
    val __obj = js.Dynamic.literal(clientContext = clientContext, events = events)
    if (clientContextEncoding != null) __obj.updateDynamic("clientContextEncoding")(clientContextEncoding)
    __obj.asInstanceOf[PutEventsInput]
  }
}

