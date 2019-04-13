package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationVersion extends js.Object {
  /**
    * The date when the API documentation snapshot is created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description of the API documentation snapshot.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The version identifier of the API documentation snapshot.
    */
  var version: js.UndefOr[String] = js.undefined
}

object DocumentationVersion {
  @scala.inline
  def apply(createdDate: Timestamp = null, description: String = null, version: String = null): DocumentationVersion = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DocumentationVersion]
  }
}

