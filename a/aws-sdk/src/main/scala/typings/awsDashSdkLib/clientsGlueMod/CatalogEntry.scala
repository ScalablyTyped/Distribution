package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatalogEntry extends js.Object {
  /**
    * The database in which the table metadata resides.
    */
  var DatabaseName: NameString
  /**
    * The name of the table in question.
    */
  var TableName: NameString
}

object CatalogEntry {
  @scala.inline
  def apply(DatabaseName: NameString, TableName: NameString): CatalogEntry = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, TableName = TableName)
  
    __obj.asInstanceOf[CatalogEntry]
  }
}

