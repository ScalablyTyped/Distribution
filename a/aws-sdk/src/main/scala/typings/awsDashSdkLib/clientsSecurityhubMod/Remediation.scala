package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Remediation extends js.Object {
  /**
    * A recommendation on the steps to take to remediate the issue identified by a finding.
    */
  var Recommendation: js.UndefOr[Recommendation] = js.undefined
}

object Remediation {
  @scala.inline
  def apply(Recommendation: Recommendation = null): Remediation = {
    val __obj = js.Dynamic.literal()
    if (Recommendation != null) __obj.updateDynamic("Recommendation")(Recommendation)
    __obj.asInstanceOf[Remediation]
  }
}

