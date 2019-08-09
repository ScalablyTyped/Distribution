package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableResource extends js.Object {
  /**
    * The name of the database for the table. Unique to a Data Catalog. A database is a set of associated table definitions organized into a logical group. You can Grant and Revoke database privileges to a principal. 
    */
  var DatabaseName: NameString
  /**
    * The name of the table.
    */
  var Name: NameString
}

object TableResource {
  @scala.inline
  def apply(DatabaseName: NameString, Name: NameString): TableResource = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, Name = Name)
  
    __obj.asInstanceOf[TableResource]
  }
}

