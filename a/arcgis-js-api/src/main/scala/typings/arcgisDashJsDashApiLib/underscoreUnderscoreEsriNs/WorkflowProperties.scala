package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowProperties extends js.Object {
  /**
    * Indicates whether the workflow is considered active.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#started)
    *
    * @default false
    */
  var started: js.UndefOr[scala.Boolean] = js.undefined
}

object WorkflowProperties {
  @scala.inline
  def apply(started: js.UndefOr[scala.Boolean] = js.undefined): WorkflowProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(started)) __obj.updateDynamic("started")(started)
    __obj.asInstanceOf[WorkflowProperties]
  }
}

