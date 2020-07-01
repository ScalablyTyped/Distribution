package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDataCatalogInput extends js.Object {
  /**
    * The name of the data catalog to delete.
    */
  var Name: CatalogNameString = js.native
}

object DeleteDataCatalogInput {
  @scala.inline
  def apply(Name: CatalogNameString): DeleteDataCatalogInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataCatalogInput]
  }
}

