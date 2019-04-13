package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationResponse extends js.Object {
  /**
    * The arn for the application.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The unique application ID.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The display name of the application.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The Tags for the application.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object ApplicationResponse {
  @scala.inline
  def apply(Arn: __string = null, Id: __string = null, Name: __string = null, tags: MapOf__string = null): ApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ApplicationResponse]
  }
}

