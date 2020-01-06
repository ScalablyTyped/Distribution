package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentationVersion extends js.Object {
  /**
    * The date when the API documentation snapshot is created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the API documentation snapshot.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The version identifier of the API documentation snapshot.
    */
  var version: js.UndefOr[String] = js.native
}

object DocumentationVersion {
  @scala.inline
  def apply(createdDate: Timestamp = null, description: String = null, version: String = null): DocumentationVersion = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationVersion]
  }
}

