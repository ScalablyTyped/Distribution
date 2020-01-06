package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogEntry extends js.Object {
  /**
    * The database in which the table metadata resides.
    */
  var DatabaseName: NameString = js.native
  /**
    * The name of the table in question.
    */
  var TableName: NameString = js.native
}

object CatalogEntry {
  @scala.inline
  def apply(DatabaseName: NameString, TableName: NameString): CatalogEntry = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CatalogEntry]
  }
}

