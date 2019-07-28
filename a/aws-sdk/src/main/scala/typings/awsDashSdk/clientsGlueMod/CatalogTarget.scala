package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatalogTarget extends js.Object {
  /**
    * The name of the database to be synchronized.
    */
  var DatabaseName: NameString
  /**
    * A list of the tables to be synchronized.
    */
  var Tables: CatalogTablesList
}

object CatalogTarget {
  @scala.inline
  def apply(DatabaseName: NameString, Tables: CatalogTablesList): CatalogTarget = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, Tables = Tables)
  
    __obj.asInstanceOf[CatalogTarget]
  }
}

