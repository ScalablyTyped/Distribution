package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseResource extends js.Object {
  /**
    * The name of the database resource. Unique to the Data Catalog.
    */
  var Name: NameString
}

object DatabaseResource {
  @scala.inline
  def apply(Name: NameString): DatabaseResource = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DatabaseResource]
  }
}

