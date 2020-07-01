package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableMetadataInput extends js.Object {
  /**
    * The name of the data catalog that contains the database and table metadata to return.
    */
  var CatalogName: CatalogNameString = js.native
  /**
    * The name of the database that contains the table metadata to return.
    */
  var DatabaseName: NameString = js.native
  /**
    * The name of the table for which metadata is returned.
    */
  var TableName: NameString = js.native
}

object GetTableMetadataInput {
  @scala.inline
  def apply(CatalogName: CatalogNameString, DatabaseName: NameString, TableName: NameString): GetTableMetadataInput = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableMetadataInput]
  }
}

