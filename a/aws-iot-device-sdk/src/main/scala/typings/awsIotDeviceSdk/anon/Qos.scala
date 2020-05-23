package typings.awsIotDeviceSdk.anon

import typings.awsIotDeviceSdk.awsIotDeviceSdkNumbers.`0`
import typings.awsIotDeviceSdk.awsIotDeviceSdkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Qos extends js.Object {
  var qos: `0` | `1`
}

object Qos {
  @scala.inline
  def apply(qos: `0` | `1`): Qos = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Qos]
  }
}

