package typings.auth0

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  /**
    * The id of the client grant.
    */
  var id: js.UndefOr[String] = js.undefined
}

object AnonId {
  @scala.inline
  def apply(id: String = null): AnonId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

