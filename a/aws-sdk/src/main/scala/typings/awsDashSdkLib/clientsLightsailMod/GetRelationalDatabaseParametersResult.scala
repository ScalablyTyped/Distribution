package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseParametersResult extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get static IPs request.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An object describing the result of your get relational database parameters request.
    */
  var parameters: js.UndefOr[RelationalDatabaseParameterList] = js.undefined
}

object GetRelationalDatabaseParametersResult {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, parameters: RelationalDatabaseParameterList = null): GetRelationalDatabaseParametersResult = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[GetRelationalDatabaseParametersResult]
  }
}

