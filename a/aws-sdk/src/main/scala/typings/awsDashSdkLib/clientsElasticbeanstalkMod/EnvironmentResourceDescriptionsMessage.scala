package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentResourceDescriptionsMessage extends js.Object {
  /**
    *  A list of EnvironmentResourceDescription. 
    */
  var EnvironmentResources: js.UndefOr[EnvironmentResourceDescription] = js.undefined
}

object EnvironmentResourceDescriptionsMessage {
  @scala.inline
  def apply(EnvironmentResources: EnvironmentResourceDescription = null): EnvironmentResourceDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentResources != null) __obj.updateDynamic("EnvironmentResources")(EnvironmentResources)
    __obj.asInstanceOf[EnvironmentResourceDescriptionsMessage]
  }
}

