package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseResult extends js.Object {
  /**
    * An object describing the specified database.
    */
  var relationalDatabase: js.UndefOr[RelationalDatabase] = js.undefined
}

object GetRelationalDatabaseResult {
  @scala.inline
  def apply(relationalDatabase: RelationalDatabase = null): GetRelationalDatabaseResult = {
    val __obj = js.Dynamic.literal()
    if (relationalDatabase != null) __obj.updateDynamic("relationalDatabase")(relationalDatabase)
    __obj.asInstanceOf[GetRelationalDatabaseResult]
  }
}

