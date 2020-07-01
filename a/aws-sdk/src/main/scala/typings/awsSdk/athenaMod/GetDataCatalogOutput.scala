package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataCatalogOutput extends js.Object {
  /**
    * The data catalog returned.
    */
  var DataCatalog: js.UndefOr[typings.awsSdk.athenaMod.DataCatalog] = js.native
}

object GetDataCatalogOutput {
  @scala.inline
  def apply(DataCatalog: DataCatalog = null): GetDataCatalogOutput = {
    val __obj = js.Dynamic.literal()
    if (DataCatalog != null) __obj.updateDynamic("DataCatalog")(DataCatalog.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataCatalogOutput]
  }
}

