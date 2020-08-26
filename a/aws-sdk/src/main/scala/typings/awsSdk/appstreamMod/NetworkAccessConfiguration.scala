package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAccessConfiguration extends js.Object {
  /**
    * The resource identifier of the elastic network interface that is attached to instances in your VPC. All network interfaces have the eni-xxxxxxxx resource identifier.
    */
  var EniId: js.UndefOr[String] = js.native
  /**
    * The private IP address of the elastic network interface that is attached to instances in your VPC.
    */
  var EniPrivateIpAddress: js.UndefOr[String] = js.native
}

object NetworkAccessConfiguration {
  @scala.inline
  def apply(): NetworkAccessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAccessConfiguration]
  }
  @scala.inline
  implicit class NetworkAccessConfigurationOps[Self <: NetworkAccessConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEniId(value: String): Self = this.set("EniId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEniId: Self = this.set("EniId", js.undefined)
    @scala.inline
    def setEniPrivateIpAddress(value: String): Self = this.set("EniPrivateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEniPrivateIpAddress: Self = this.set("EniPrivateIpAddress", js.undefined)
  }
  
}

