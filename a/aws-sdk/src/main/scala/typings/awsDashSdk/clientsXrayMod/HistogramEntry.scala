package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramEntry extends js.Object {
  /**
    * The prevalence of the entry.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  /**
    * The value of the entry.
    */
  var Value: js.UndefOr[Double] = js.undefined
}

object HistogramEntry {
  @scala.inline
  def apply(Count: js.UndefOr[Integer] = js.undefined, Value: js.UndefOr[Double] = js.undefined): HistogramEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count)
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[HistogramEntry]
  }
}

