package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecutionContext extends js.Object {
  /**
    * The name of the data catalog used in the query execution.
    */
  var Catalog: js.UndefOr[CatalogNameString] = js.native
  /**
    * The name of the database used in the query execution.
    */
  var Database: js.UndefOr[DatabaseString] = js.native
}

object QueryExecutionContext {
  @scala.inline
  def apply(Catalog: CatalogNameString = null, Database: DatabaseString = null): QueryExecutionContext = {
    val __obj = js.Dynamic.literal()
    if (Catalog != null) __obj.updateDynamic("Catalog")(Catalog.asInstanceOf[js.Any])
    if (Database != null) __obj.updateDynamic("Database")(Database.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecutionContext]
  }
}

