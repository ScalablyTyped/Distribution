package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentLink extends js.Object {
  /**
    * The name of the linked environment (the dependency).
    */
  var EnvironmentName: js.UndefOr[String] = js.undefined
  /**
    * The name of the link.
    */
  var LinkName: js.UndefOr[String] = js.undefined
}

object EnvironmentLink {
  @scala.inline
  def apply(EnvironmentName: String = null, LinkName: String = null): EnvironmentLink = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (LinkName != null) __obj.updateDynamic("LinkName")(LinkName)
    __obj.asInstanceOf[EnvironmentLink]
  }
}

