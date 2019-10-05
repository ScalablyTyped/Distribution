package typings.awsDashSdk.clientsDevicefarmMod

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
    errored: Int | scala.Double = null,
    failed: Int | scala.Double = null,
    passed: Int | scala.Double = null,
    skipped: Int | scala.Double = null,
    stopped: Int | scala.Double = null,
    total: Int | scala.Double = null,
    warned: Int | scala.Double = null
  ): Counters = {
    val __obj = js.Dynamic.literal()
    if (errored != null) __obj.updateDynamic("errored")(errored.asInstanceOf[js.Any])
    if (failed != null) __obj.updateDynamic("failed")(failed.asInstanceOf[js.Any])
    if (passed != null) __obj.updateDynamic("passed")(passed.asInstanceOf[js.Any])
    if (skipped != null) __obj.updateDynamic("skipped")(skipped.asInstanceOf[js.Any])
    if (stopped != null) __obj.updateDynamic("stopped")(stopped.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (warned != null) __obj.updateDynamic("warned")(warned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counters]
  }
}

