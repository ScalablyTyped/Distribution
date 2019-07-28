package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  /**
    * A descriptive or arbitrary ID for the subscription. This value must be unique within the subscription definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: __string
  /**
    * The source of the subscription. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which represents the AWS IoT cloud), or 'GGShadowService'.
    */
  var Source: __string
  /**
    * The MQTT topic used to route the message.
    */
  var Subject: __string
  /**
    * Where the message is sent to. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which represents the AWS IoT cloud), or 'GGShadowService'.
    */
  var Target: __string
}

object Subscription {
  @scala.inline
  def apply(Id: __string, Source: __string, Subject: __string, Target: __string): Subscription = {
    val __obj = js.Dynamic.literal(Id = Id, Source = Source, Subject = Subject, Target = Target)
  
    __obj.asInstanceOf[Subscription]
  }
}

