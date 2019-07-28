package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamingDistributionsRequest extends js.Object {
  /**
    * The value that you provided for the Marker request parameter.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The value that you provided for the MaxItems request parameter.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
}

object ListStreamingDistributionsRequest {
  @scala.inline
  def apply(Marker: String = null, MaxItems: String = null): ListStreamingDistributionsRequest = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[ListStreamingDistributionsRequest]
  }
}

