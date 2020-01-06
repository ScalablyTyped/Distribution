package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecutionContext extends js.Object {
  /**
    * The name of the database.
    */
  var Database: js.UndefOr[DatabaseString] = js.native
}

object QueryExecutionContext {
  @scala.inline
  def apply(Database: DatabaseString = null): QueryExecutionContext = {
    val __obj = js.Dynamic.literal()
    if (Database != null) __obj.updateDynamic("Database")(Database.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecutionContext]
  }
}

