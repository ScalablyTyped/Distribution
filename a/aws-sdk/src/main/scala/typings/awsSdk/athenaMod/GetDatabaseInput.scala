package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDatabaseInput extends js.Object {
  /**
    * The name of the data catalog that contains the database to return.
    */
  var CatalogName: CatalogNameString = js.native
  /**
    * The name of the database to return.
    */
  var DatabaseName: NameString = js.native
}

object GetDatabaseInput {
  @scala.inline
  def apply(CatalogName: CatalogNameString, DatabaseName: NameString): GetDatabaseInput = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatabaseInput]
  }
}

