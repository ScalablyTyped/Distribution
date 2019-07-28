package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationVersionLifecycleConfig extends js.Object {
  /**
    * Specify a max age rule to restrict the length of time that application versions are retained for an application.
    */
  var MaxAgeRule: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.MaxAgeRule] = js.undefined
  /**
    * Specify a max count rule to restrict the number of application versions that are retained for an application.
    */
  var MaxCountRule: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.MaxCountRule] = js.undefined
}

object ApplicationVersionLifecycleConfig {
  @scala.inline
  def apply(MaxAgeRule: MaxAgeRule = null, MaxCountRule: MaxCountRule = null): ApplicationVersionLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    if (MaxAgeRule != null) __obj.updateDynamic("MaxAgeRule")(MaxAgeRule)
    if (MaxCountRule != null) __obj.updateDynamic("MaxCountRule")(MaxCountRule)
    __obj.asInstanceOf[ApplicationVersionLifecycleConfig]
  }
}

