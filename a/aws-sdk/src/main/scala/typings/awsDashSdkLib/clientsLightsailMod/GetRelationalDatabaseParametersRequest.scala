package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseParametersRequest extends js.Object {
  /**
    * A token used for advancing to a specific page of results for your get relational database parameters request.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of your database for which to get parameters.
    */
  var relationalDatabaseName: ResourceName
}

object GetRelationalDatabaseParametersRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName, pageToken: java.lang.String = null): GetRelationalDatabaseParametersRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetRelationalDatabaseParametersRequest]
  }
}

