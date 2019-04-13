package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counters extends js.Object {
  /**
    * The number of errored entities.
    */
  var errored: js.UndefOr[Integer] = js.undefined
  /**
    * The number of failed entities.
    */
  var failed: js.UndefOr[Integer] = js.undefined
  /**
    * The number of passed entities.
    */
  var passed: js.UndefOr[Integer] = js.undefined
  /**
    * The number of skipped entities.
    */
  var skipped: js.UndefOr[Integer] = js.undefined
  /**
    * The number of stopped entities.
    */
  var stopped: js.UndefOr[Integer] = js.undefined
  /**
    * The total number of entities.
    */
  var total: js.UndefOr[Integer] = js.undefined
  /**
    * The number of warned entities.
    */
  var warned: js.UndefOr[Integer] = js.undefined
}

object Counters {
  @scala.inline
  def apply(
    errored: js.UndefOr[Integer] = js.undefined,
    failed: js.UndefOr[Integer] = js.undefined,
    passed: js.UndefOr[Integer] = js.undefined,
    skipped: js.UndefOr[Integer] = js.undefined,
    stopped: js.UndefOr[Integer] = js.undefined,
    total: js.UndefOr[Integer] = js.undefined,
    warned: js.UndefOr[Integer] = js.undefined
  ): Counters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errored)) __obj.updateDynamic("errored")(errored)
    if (!js.isUndefined(failed)) __obj.updateDynamic("failed")(failed)
    if (!js.isUndefined(passed)) __obj.updateDynamic("passed")(passed)
    if (!js.isUndefined(skipped)) __obj.updateDynamic("skipped")(skipped)
    if (!js.isUndefined(stopped)) __obj.updateDynamic("stopped")(stopped)
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total)
    if (!js.isUndefined(warned)) __obj.updateDynamic("warned")(warned)
    __obj.asInstanceOf[Counters]
  }
}

