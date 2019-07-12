package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeServiceActionExecutionParametersInput extends js.Object {
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  var ProvisionedProductId: Id
  var ServiceActionId: Id
}

object DescribeServiceActionExecutionParametersInput {
  @scala.inline
  def apply(ProvisionedProductId: Id, ServiceActionId: Id, AcceptLanguage: AcceptLanguage = null): DescribeServiceActionExecutionParametersInput = {
    val __obj = js.Dynamic.literal(ProvisionedProductId = ProvisionedProductId, ServiceActionId = ServiceActionId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[DescribeServiceActionExecutionParametersInput]
  }
}

