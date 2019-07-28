package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAuthorizersResponse extends js.Object {
  /**
    * The authorizers.
    */
  var authorizers: js.UndefOr[Authorizers] = js.undefined
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
}

object ListAuthorizersResponse {
  @scala.inline
  def apply(authorizers: Authorizers = null, nextMarker: Marker = null): ListAuthorizersResponse = {
    val __obj = js.Dynamic.literal()
    if (authorizers != null) __obj.updateDynamic("authorizers")(authorizers)
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker)
    __obj.asInstanceOf[ListAuthorizersResponse]
  }
}

