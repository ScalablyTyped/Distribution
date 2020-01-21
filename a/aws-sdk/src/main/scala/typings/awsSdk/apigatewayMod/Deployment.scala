package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployment extends js.Object {
  /**
    * A summary of the RestApi at the date and time that the deployment resource was created.
    */
  var apiSummary: js.UndefOr[PathToMapOfMethodSnapshot] = js.native
  /**
    * The date and time that the deployment resource was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * The description for the deployment resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The identifier for the deployment resource.
    */
  var id: js.UndefOr[String] = js.native
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
    if (apiSummary != null) __obj.updateDynamic("apiSummary")(apiSummary.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
}

