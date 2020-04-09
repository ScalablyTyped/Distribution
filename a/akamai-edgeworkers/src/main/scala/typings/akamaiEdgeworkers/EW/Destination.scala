package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  /**
    * The identifier of the pre-configured origin to send the outgoing request to.
    */
  var origin: js.UndefOr[String] = js.undefined
  /**
    * The new path to use in the outgoing request.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The new query string to use in the outgoing request.
    */
  var query: js.UndefOr[String] = js.undefined
}

object Destination {
  @scala.inline
  def apply(origin: String = null, path: String = null, query: String = null): Destination = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
}

