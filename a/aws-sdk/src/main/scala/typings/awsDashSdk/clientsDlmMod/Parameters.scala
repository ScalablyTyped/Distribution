package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  /**
    * When executing an EBS Snapshot Management – Instance policy, execute all CreateSnapshots calls with the excludeBootVolume set to the supplied field. Defaults to false. Only valid for EBS Snapshot Management – Instance policies.
    */
  var ExcludeBootVolume: js.UndefOr[typings.awsDashSdk.clientsDlmMod.ExcludeBootVolume] = js.undefined
}

object Parameters {
  @scala.inline
  def apply(ExcludeBootVolume: js.UndefOr[Boolean] = js.undefined): Parameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ExcludeBootVolume)) __obj.updateDynamic("ExcludeBootVolume")(ExcludeBootVolume)
    __obj.asInstanceOf[Parameters]
  }
}

