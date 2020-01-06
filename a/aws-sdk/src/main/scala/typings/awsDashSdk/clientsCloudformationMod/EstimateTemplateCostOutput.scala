package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EstimateTemplateCostOutput extends js.Object {
  /**
    * An AWS Simple Monthly Calculator URL with a query string that describes the resources required to run the template.
    */
  var Url: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Url] = js.native
}

object EstimateTemplateCostOutput {
  @scala.inline
  def apply(Url: Url = null): EstimateTemplateCostOutput = {
    val __obj = js.Dynamic.literal()
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EstimateTemplateCostOutput]
  }
}

