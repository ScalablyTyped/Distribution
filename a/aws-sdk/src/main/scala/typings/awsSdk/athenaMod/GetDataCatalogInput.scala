package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataCatalogInput extends js.Object {
  /**
    * The name of the data catalog to return.
    */
  var Name: CatalogNameString = js.native
}

object GetDataCatalogInput {
  @scala.inline
  def apply(Name: CatalogNameString): GetDataCatalogInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataCatalogInput]
  }
}

