package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExecutionContext extends js.Object {
  /**
    * The name of the database.
    */
  var Database: js.UndefOr[DatabaseString] = js.undefined
}

object QueryExecutionContext {
  @scala.inline
  def apply(Database: DatabaseString = null): QueryExecutionContext = {
    val __obj = js.Dynamic.literal()
    if (Database != null) __obj.updateDynamic("Database")(Database)
    __obj.asInstanceOf[QueryExecutionContext]
  }
}

