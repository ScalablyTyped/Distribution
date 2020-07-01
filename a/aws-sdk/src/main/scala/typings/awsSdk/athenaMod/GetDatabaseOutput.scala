package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDatabaseOutput extends js.Object {
  /**
    * The database returned.
    */
  var Database: js.UndefOr[typings.awsSdk.athenaMod.Database] = js.native
}

object GetDatabaseOutput {
  @scala.inline
  def apply(Database: Database = null): GetDatabaseOutput = {
    val __obj = js.Dynamic.literal()
    if (Database != null) __obj.updateDynamic("Database")(Database.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatabaseOutput]
  }
}

