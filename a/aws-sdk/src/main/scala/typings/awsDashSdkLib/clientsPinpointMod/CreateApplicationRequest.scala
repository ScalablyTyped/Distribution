package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationRequest extends js.Object {
  /**
    * The display name of the application. Used in the Amazon Pinpoint console.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The Tags for the app.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object CreateApplicationRequest {
  @scala.inline
  def apply(Name: __string = null, tags: MapOf__string = null): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateApplicationRequest]
  }
}

