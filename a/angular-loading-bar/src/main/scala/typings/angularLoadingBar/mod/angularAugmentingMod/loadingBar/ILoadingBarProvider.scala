package typings.angularLoadingBar.mod.angularAugmentingMod.loadingBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoadingBarProvider extends js.Object {
  /**
    * Give illusion that there's always progress
    */
  var autoIncrement: js.UndefOr[Boolean] = js.undefined
  /**
    * Turn the loading bar on or off
    */
  var includeBar: js.UndefOr[Boolean] = js.undefined
  /**
    * Turn the spinner on or off
    */
  var includeSpinner: js.UndefOr[Boolean] = js.undefined
  /**
    * Latency Threshold
    */
  var latencyThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Loading bar template
    */
  var loadingBarTemplate: js.UndefOr[String] = js.undefined
  /**
    * HTML element selector of parent
    */
  var parentSelector: js.UndefOr[String] = js.undefined
  /**
    * HTML template
    */
  var spinnerTemplate: js.UndefOr[String] = js.undefined
  /**
    * Starting size
    */
  var startSize: js.UndefOr[Double] = js.undefined
  /**
    * Complete the loading bar
    */
  def complete(): Unit
  /**
    * Increment the loading bar
    */
  def inc(): Unit
  /**
    * Set the percentage completed
    * @param {number} n - number between 0 and 1
    */
  def set(n: Double): Unit
  /**
    * Broadcast the start event
    */
  def start(): Unit
  /**
    * Get the percentage completed
    * @returns {number}
    */
  def status(): Double
}

object ILoadingBarProvider {
  @scala.inline
  def apply(
    complete: () => Unit,
    inc: () => Unit,
    set: Double => Unit,
    start: () => Unit,
    status: () => Double,
    autoIncrement: js.UndefOr[Boolean] = js.undefined,
    includeBar: js.UndefOr[Boolean] = js.undefined,
    includeSpinner: js.UndefOr[Boolean] = js.undefined,
    latencyThreshold: Int | Double = null,
    loadingBarTemplate: String = null,
    parentSelector: String = null,
    spinnerTemplate: String = null,
    startSize: Int | Double = null
  ): ILoadingBarProvider = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), inc = js.Any.fromFunction0(inc), set = js.Any.fromFunction1(set), start = js.Any.fromFunction0(start), status = js.Any.fromFunction0(status))
    if (!js.isUndefined(autoIncrement)) __obj.updateDynamic("autoIncrement")(autoIncrement.asInstanceOf[js.Any])
    if (!js.isUndefined(includeBar)) __obj.updateDynamic("includeBar")(includeBar.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSpinner)) __obj.updateDynamic("includeSpinner")(includeSpinner.asInstanceOf[js.Any])
    if (latencyThreshold != null) __obj.updateDynamic("latencyThreshold")(latencyThreshold.asInstanceOf[js.Any])
    if (loadingBarTemplate != null) __obj.updateDynamic("loadingBarTemplate")(loadingBarTemplate.asInstanceOf[js.Any])
    if (parentSelector != null) __obj.updateDynamic("parentSelector")(parentSelector.asInstanceOf[js.Any])
    if (spinnerTemplate != null) __obj.updateDynamic("spinnerTemplate")(spinnerTemplate.asInstanceOf[js.Any])
    if (startSize != null) __obj.updateDynamic("startSize")(startSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadingBarProvider]
  }
}

