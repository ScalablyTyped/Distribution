package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceActionDetail extends js.Object {
  /**
    * A map that defines the self-service action.
    */
  var Definition: js.UndefOr[ServiceActionDefinitionMap] = js.undefined
  /**
    * Summary information about the self-service action.
    */
  var ServiceActionSummary: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ServiceActionSummary] = js.undefined
}

object ServiceActionDetail {
  @scala.inline
  def apply(Definition: ServiceActionDefinitionMap = null, ServiceActionSummary: ServiceActionSummary = null): ServiceActionDetail = {
    val __obj = js.Dynamic.literal()
    if (Definition != null) __obj.updateDynamic("Definition")(Definition)
    if (ServiceActionSummary != null) __obj.updateDynamic("ServiceActionSummary")(ServiceActionSummary)
    __obj.asInstanceOf[ServiceActionDetail]
  }
}

