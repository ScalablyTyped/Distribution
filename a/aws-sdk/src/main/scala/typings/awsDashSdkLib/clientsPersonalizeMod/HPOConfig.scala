package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HPOConfig extends js.Object {
  /**
    * The hyperparameters and their allowable ranges.
    */
  var algorithmHyperParameterRanges: js.UndefOr[HyperParameterRanges] = js.undefined
  /**
    * The metric to optimize during HPO.
    */
  var hpoObjective: js.UndefOr[HPOObjective] = js.undefined
  /**
    * Describes the resource configuration for HPO.
    */
  var hpoResourceConfig: js.UndefOr[HPOResourceConfig] = js.undefined
}

object HPOConfig {
  @scala.inline
  def apply(
    algorithmHyperParameterRanges: HyperParameterRanges = null,
    hpoObjective: HPOObjective = null,
    hpoResourceConfig: HPOResourceConfig = null
  ): HPOConfig = {
    val __obj = js.Dynamic.literal()
    if (algorithmHyperParameterRanges != null) __obj.updateDynamic("algorithmHyperParameterRanges")(algorithmHyperParameterRanges)
    if (hpoObjective != null) __obj.updateDynamic("hpoObjective")(hpoObjective)
    if (hpoResourceConfig != null) __obj.updateDynamic("hpoResourceConfig")(hpoResourceConfig)
    __obj.asInstanceOf[HPOConfig]
  }
}

