package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDatabaseResponse extends js.Object {
  /**
    * The definition of the specified database in the catalog.
    */
  var Database: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Database] = js.undefined
}

object GetDatabaseResponse {
  @scala.inline
  def apply(Database: Database = null): GetDatabaseResponse = {
    val __obj = js.Dynamic.literal()
    if (Database != null) __obj.updateDynamic("Database")(Database)
    __obj.asInstanceOf[GetDatabaseResponse]
  }
}

