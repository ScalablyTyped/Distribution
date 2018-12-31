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

