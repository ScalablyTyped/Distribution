package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationRequest extends js.Object {
  /**
    * Description of the application to be created.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Name of the application to be created.
    */
  var name: String
}

object CreateApplicationRequest {
  @scala.inline
  def apply(name: String, description: String = null): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[CreateApplicationRequest]
  }
}

