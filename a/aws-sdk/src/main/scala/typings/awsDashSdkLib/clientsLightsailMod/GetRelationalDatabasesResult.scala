package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabasesResult extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get relational databases request.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An object describing the result of your get relational databases request.
    */
  var relationalDatabases: js.UndefOr[RelationalDatabaseList] = js.undefined
}

object GetRelationalDatabasesResult {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, relationalDatabases: RelationalDatabaseList = null): GetRelationalDatabasesResult = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (relationalDatabases != null) __obj.updateDynamic("relationalDatabases")(relationalDatabases)
    __obj.asInstanceOf[GetRelationalDatabasesResult]
  }
}

