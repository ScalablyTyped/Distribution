package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  /**
    * A descriptive or arbitrary ID for the subscription. This value must be unique within the subscription definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The source of the subscription. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which represents the AWS IoT cloud), or 'GGShadowService'.
    */
  var Source: js.UndefOr[__string] = js.undefined
  /**
    * The MQTT topic used to route the message.
    */
  var Subject: js.UndefOr[__string] = js.undefined
  /**
    * Where the message is sent to. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which represents the AWS IoT cloud), or 'GGShadowService'.
    */
  var Target: js.UndefOr[__string] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(Id: __string = null, Source: __string = null, Subject: __string = null, Target: __string = null): Subscription = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Source != null) __obj.updateDynamic("Source")(Source)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (Target != null) __obj.updateDynamic("Target")(Target)
    __obj.asInstanceOf[Subscription]
  }
}

