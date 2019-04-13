package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lags extends js.Object {
  /**
    * The LAGs.
    */
  var lags: js.UndefOr[LagList] = js.undefined
}

object Lags {
  @scala.inline
  def apply(lags: LagList = null): Lags = {
    val __obj = js.Dynamic.literal()
    if (lags != null) __obj.updateDynamic("lags")(lags)
    __obj.asInstanceOf[Lags]
  }
}

