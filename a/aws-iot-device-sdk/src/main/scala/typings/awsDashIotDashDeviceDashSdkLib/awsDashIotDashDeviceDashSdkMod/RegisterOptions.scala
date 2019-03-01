package typings
package awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOptions extends js.Object {
  /**
    * set to false to allow receiving messages with old version
    * numbers (default true)
    */
  var discardStale: js.UndefOr[scala.Boolean] = js.undefined
  /** set to true to send version numbers with shadow updates (default true) */
  var enableVersioning: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * set to true to not subscribe to the delta sub-topic for this
    * Thing Shadow; used in cases where the application is not interested in
    * changes (e.g. update only.) (default false)
    */
  var ignoreDeltas: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * set to false to unsubscribe from all operation sub-topics while not
    * performing an operation (default true)
    */
  var persistentSubscribe: js.UndefOr[scala.Boolean] = js.undefined
}

object RegisterOptions {
  @scala.inline
  def apply(
    discardStale: js.UndefOr[scala.Boolean] = js.undefined,
    enableVersioning: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDeltas: js.UndefOr[scala.Boolean] = js.undefined,
    persistentSubscribe: js.UndefOr[scala.Boolean] = js.undefined
  ): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(discardStale)) __obj.updateDynamic("discardStale")(discardStale)
    if (!js.isUndefined(enableVersioning)) __obj.updateDynamic("enableVersioning")(enableVersioning)
    if (!js.isUndefined(ignoreDeltas)) __obj.updateDynamic("ignoreDeltas")(ignoreDeltas)
    if (!js.isUndefined(persistentSubscribe)) __obj.updateDynamic("persistentSubscribe")(persistentSubscribe)
    __obj.asInstanceOf[RegisterOptions]
  }
}

