package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexProgramServiceDescriptor extends js.Object {
  /**
    * Name of the provider.
    */
  var ProviderName: __stringMax256 = js.native
  /**
    * Name of the service.
    */
  var ServiceName: __stringMax256 = js.native
}

object MultiplexProgramServiceDescriptor {
  @scala.inline
  def apply(ProviderName: __stringMax256, ServiceName: __stringMax256): MultiplexProgramServiceDescriptor = {
    val __obj = js.Dynamic.literal(ProviderName = ProviderName.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiplexProgramServiceDescriptor]
  }
}

