package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataRetrievalPolicyOutput extends js.Object {
  /**
    * Contains the returned data retrieval policy in JSON format.
    */
  var Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined
}

object GetDataRetrievalPolicyOutput {
  @scala.inline
  def apply(Policy: DataRetrievalPolicy = null): GetDataRetrievalPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[GetDataRetrievalPolicyOutput]
  }
}

