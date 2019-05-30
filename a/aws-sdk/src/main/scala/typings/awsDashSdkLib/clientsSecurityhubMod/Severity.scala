package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Severity extends js.Object {
  /**
    * The normalized severity of a finding.
    */
  var Normalized: Integer
  /**
    * The native severity as defined by the security-findings provider's solution that generated the finding.
    */
  var Product: js.UndefOr[Double] = js.undefined
}

object Severity {
  @scala.inline
  def apply(Normalized: Integer, Product: js.UndefOr[Double] = js.undefined): Severity = {
    val __obj = js.Dynamic.literal(Normalized = Normalized)
    if (!js.isUndefined(Product)) __obj.updateDynamic("Product")(Product)
    __obj.asInstanceOf[Severity]
  }
}

