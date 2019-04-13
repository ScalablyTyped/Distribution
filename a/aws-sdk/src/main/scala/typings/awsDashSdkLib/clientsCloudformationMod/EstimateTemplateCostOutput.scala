package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EstimateTemplateCostOutput extends js.Object {
  /**
    * An AWS Simple Monthly Calculator URL with a query string that describes the resources required to run the template.
    */
  var Url: js.UndefOr[Url] = js.undefined
}

object EstimateTemplateCostOutput {
  @scala.inline
  def apply(Url: Url = null): EstimateTemplateCostOutput = {
    val __obj = js.Dynamic.literal()
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[EstimateTemplateCostOutput]
  }
}

