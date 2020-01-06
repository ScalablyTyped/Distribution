package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationRequest extends js.Object {
  /**
    * Description of the application to be created.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Name of the application to be created.
    */
  var name: String = js.native
}

object CreateApplicationRequest {
  @scala.inline
  def apply(name: String, description: String = null): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
}

