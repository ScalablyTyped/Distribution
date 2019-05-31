package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBootstrapBrokersResponse extends js.Object {
  /**
    * 
    A string containing one or more hostname:port pairs.
    
    */
  var BootstrapBrokerString: js.UndefOr[__string] = js.undefined
  /**
    * 
    A string containing one or more DNS names (or IP) and TLS port pairs.
    
    */
  var BootstrapBrokerStringTls: js.UndefOr[__string] = js.undefined
}

object GetBootstrapBrokersResponse {
  @scala.inline
  def apply(BootstrapBrokerString: __string = null, BootstrapBrokerStringTls: __string = null): GetBootstrapBrokersResponse = {
    val __obj = js.Dynamic.literal()
    if (BootstrapBrokerString != null) __obj.updateDynamic("BootstrapBrokerString")(BootstrapBrokerString)
    if (BootstrapBrokerStringTls != null) __obj.updateDynamic("BootstrapBrokerStringTls")(BootstrapBrokerStringTls)
    __obj.asInstanceOf[GetBootstrapBrokersResponse]
  }
}

