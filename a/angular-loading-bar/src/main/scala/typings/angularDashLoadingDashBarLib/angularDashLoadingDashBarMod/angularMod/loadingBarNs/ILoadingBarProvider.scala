package typings
package angularDashLoadingDashBarLib.angularDashLoadingDashBarMod.angularMod.loadingBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoadingBarProvider extends js.Object {
  /**
    * Give illusion that there's always progress
    */
  var autoIncrement: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Turn the loading bar on or off
    */
  var includeBar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Turn the spinner on or off
    */
  var includeSpinner: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Latency Threshold
    */
  var latencyThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Loading bar template
    */
  var loadingBarTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * HTML element selector of parent
    */
  var parentSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * HTML template
    */
  var spinnerTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Starting size
    */
  var startSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Complete the loading bar
    */
  def complete(): scala.Unit
  /**
    * Increment the loading bar
    */
  def inc(): scala.Unit
  /**
    * Set the percentage completed
    * @param {number} n - number between 0 and 1
    */
  def set(n: scala.Double): scala.Unit
  /**
    * Broadcast the start event
    */
  def start(): scala.Unit
  /**
    * Get the percentage completed
    * @returns {number}
    */
  def status(): scala.Double
}

object ILoadingBarProvider {
  @scala.inline
  def apply(
    complete: () => scala.Unit,
    inc: () => scala.Unit,
    set: scala.Double => scala.Unit,
    start: () => scala.Unit,
    status: () => scala.Double,
    autoIncrement: js.UndefOr[scala.Boolean] = js.undefined,
    includeBar: js.UndefOr[scala.Boolean] = js.undefined,
    includeSpinner: js.UndefOr[scala.Boolean] = js.undefined,
    latencyThreshold: scala.Int | scala.Double = null,
    loadingBarTemplate: java.lang.String = null,
    parentSelector: java.lang.String = null,
    spinnerTemplate: java.lang.String = null,
    startSize: scala.Int | scala.Double = null
  ): ILoadingBarProvider = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), inc = js.Any.fromFunction0(inc), set = js.Any.fromFunction1(set), start = js.Any.fromFunction0(start), status = js.Any.fromFunction0(status))
    if (!js.isUndefined(autoIncrement)) __obj.updateDynamic("autoIncrement")(autoIncrement)
    if (!js.isUndefined(includeBar)) __obj.updateDynamic("includeBar")(includeBar)
    if (!js.isUndefined(includeSpinner)) __obj.updateDynamic("includeSpinner")(includeSpinner)
    if (latencyThreshold != null) __obj.updateDynamic("latencyThreshold")(latencyThreshold.asInstanceOf[js.Any])
    if (loadingBarTemplate != null) __obj.updateDynamic("loadingBarTemplate")(loadingBarTemplate)
    if (parentSelector != null) __obj.updateDynamic("parentSelector")(parentSelector)
    if (spinnerTemplate != null) __obj.updateDynamic("spinnerTemplate")(spinnerTemplate)
    if (startSize != null) __obj.updateDynamic("startSize")(startSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadingBarProvider]
  }
}

