package typings.awsIotDeviceSdk.anon

import typings.awsIotDeviceSdk.awsIotDeviceSdkNumbers.`0`
import typings.awsIotDeviceSdk.awsIotDeviceSdkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Qos extends js.Object {
  var qos: `0` | `1` = js.native
}

object Qos {
  @scala.inline
  def apply(qos: `0` | `1`): Qos = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Qos]
  }
  @scala.inline
  implicit class QosOps[Self <: Qos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQos(value: `0` | `1`): Self = this.set("qos", value.asInstanceOf[js.Any])
  }
  
}

