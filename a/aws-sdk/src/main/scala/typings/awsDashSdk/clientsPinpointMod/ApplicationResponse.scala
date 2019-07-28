package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var Arn: __string
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var Id: __string
  /**
    * The display name of the application. This name is displayed as the Project name on the Amazon Pinpoint console.
    */
  var Name: __string
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the application. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object ApplicationResponse {
  @scala.inline
  def apply(Arn: __string, Id: __string, Name: __string, tags: MapOf__string = null): ApplicationResponse = {
    val __obj = js.Dynamic.literal(Arn = Arn, Id = Id, Name = Name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ApplicationResponse]
  }
}

