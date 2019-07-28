package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyProductOutput extends js.Object {
  /**
    * The token to use to track the progress of the operation.
    */
  var CopyProductToken: js.UndefOr[Id] = js.undefined
}

object CopyProductOutput {
  @scala.inline
  def apply(CopyProductToken: Id = null): CopyProductOutput = {
    val __obj = js.Dynamic.literal()
    if (CopyProductToken != null) __obj.updateDynamic("CopyProductToken")(CopyProductToken)
    __obj.asInstanceOf[CopyProductOutput]
  }
}

