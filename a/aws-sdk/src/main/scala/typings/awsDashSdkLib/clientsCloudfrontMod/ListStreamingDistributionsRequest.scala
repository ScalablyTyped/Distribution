package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamingDistributionsRequest extends js.Object {
  /**
    * The value that you provided for the Marker request parameter.
    */
  var Marker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The value that you provided for the MaxItems request parameter.
    */
  var MaxItems: js.UndefOr[java.lang.String] = js.undefined
}

object ListStreamingDistributionsRequest {
  @scala.inline
  def apply(Marker: java.lang.String = null, MaxItems: java.lang.String = null): ListStreamingDistributionsRequest = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[ListStreamingDistributionsRequest]
  }
}

