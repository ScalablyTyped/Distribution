package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationRequest extends js.Object {
  /**
    * The display name of the application. This name is displayed as the Project name on the Amazon Pinpoint console.
    */
  var Name: __string
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the application. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object CreateApplicationRequest {
  @scala.inline
  def apply(Name: __string, tags: MapOf__string = null): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateApplicationRequest]
  }
}

