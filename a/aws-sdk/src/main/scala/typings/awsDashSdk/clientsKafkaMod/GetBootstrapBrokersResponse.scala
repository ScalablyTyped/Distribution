package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBootstrapBrokersResponse extends js.Object {
  /**
    * 
    A string containing one or more hostname:port pairs.
    
    */
  var BootstrapBrokerString: js.UndefOr[__string] = js.native
  /**
    * 
    A string containing one or more DNS names (or IP) and TLS port pairs.
    
    */
  var BootstrapBrokerStringTls: js.UndefOr[__string] = js.native
}

object GetBootstrapBrokersResponse {
  @scala.inline
  def apply(BootstrapBrokerString: __string = null, BootstrapBrokerStringTls: __string = null): GetBootstrapBrokersResponse = {
    val __obj = js.Dynamic.literal()
    if (BootstrapBrokerString != null) __obj.updateDynamic("BootstrapBrokerString")(BootstrapBrokerString.asInstanceOf[js.Any])
    if (BootstrapBrokerStringTls != null) __obj.updateDynamic("BootstrapBrokerStringTls")(BootstrapBrokerStringTls.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBootstrapBrokersResponse]
  }
}

