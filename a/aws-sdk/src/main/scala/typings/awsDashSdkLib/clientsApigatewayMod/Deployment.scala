package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployment extends js.Object {
  /**
    * A summary of the RestApi at the date and time that the deployment resource was created.
    */
  var apiSummary: js.UndefOr[PathToMapOfMethodSnapshot] = js.undefined
  /**
    * The date and time that the deployment resource was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description for the deployment resource.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The identifier for the deployment resource.
    */
  var id: js.UndefOr[String] = js.undefined
}

object Deployment {
  @scala.inline
  def apply(
    apiSummary: PathToMapOfMethodSnapshot = null,
    createdDate: Timestamp = null,
    description: String = null,
    id: String = null
  ): Deployment = {
    val __obj = js.Dynamic.literal()
    if (apiSummary != null) __obj.updateDynamic("apiSummary")(apiSummary)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Deployment]
  }
}

