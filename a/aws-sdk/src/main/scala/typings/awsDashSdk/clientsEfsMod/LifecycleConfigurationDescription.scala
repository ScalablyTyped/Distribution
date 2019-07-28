package typings.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleConfigurationDescription extends js.Object {
  /**
    * An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file system.
    */
  var LifecyclePolicies: js.UndefOr[typings.awsDashSdk.clientsEfsMod.LifecyclePolicies] = js.undefined
}

object LifecycleConfigurationDescription {
  @scala.inline
  def apply(LifecyclePolicies: LifecyclePolicies = null): LifecycleConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (LifecyclePolicies != null) __obj.updateDynamic("LifecyclePolicies")(LifecyclePolicies)
    __obj.asInstanceOf[LifecycleConfigurationDescription]
  }
}

