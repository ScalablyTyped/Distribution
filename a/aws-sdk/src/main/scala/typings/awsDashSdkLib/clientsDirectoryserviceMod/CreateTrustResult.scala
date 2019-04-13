package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrustResult extends js.Object {
  /**
    * A unique identifier for the trust relationship that was created.
    */
  var TrustId: js.UndefOr[TrustId] = js.undefined
}

object CreateTrustResult {
  @scala.inline
  def apply(TrustId: TrustId = null): CreateTrustResult = {
    val __obj = js.Dynamic.literal()
    if (TrustId != null) __obj.updateDynamic("TrustId")(TrustId)
    __obj.asInstanceOf[CreateTrustResult]
  }
}

