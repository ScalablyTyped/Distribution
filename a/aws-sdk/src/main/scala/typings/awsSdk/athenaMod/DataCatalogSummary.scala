package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCatalogSummary extends js.Object {
  /**
    * The name of the data catalog.
    */
  var CatalogName: js.UndefOr[CatalogNameString] = js.native
  /**
    * The data catalog type.
    */
  var Type: js.UndefOr[DataCatalogType] = js.native
}

object DataCatalogSummary {
  @scala.inline
  def apply(CatalogName: CatalogNameString = null, Type: DataCatalogType = null): DataCatalogSummary = {
    val __obj = js.Dynamic.literal()
    if (CatalogName != null) __obj.updateDynamic("CatalogName")(CatalogName.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCatalogSummary]
  }
}

