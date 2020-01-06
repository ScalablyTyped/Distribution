package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentLink extends js.Object {
  /**
    * The name of the linked environment (the dependency).
    */
  var EnvironmentName: js.UndefOr[String] = js.native
  /**
    * The name of the link.
    */
  var LinkName: js.UndefOr[String] = js.native
}

object EnvironmentLink {
  @scala.inline
  def apply(EnvironmentName: String = null, LinkName: String = null): EnvironmentLink = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    if (LinkName != null) __obj.updateDynamic("LinkName")(LinkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentLink]
  }
}

