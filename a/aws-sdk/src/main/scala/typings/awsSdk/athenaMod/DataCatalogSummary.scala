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
  def apply(): DataCatalogSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCatalogSummary]
  }
  @scala.inline
  implicit class DataCatalogSummaryOps[Self <: DataCatalogSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCatalogName(value: CatalogNameString): Self = this.set("CatalogName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogName: Self = this.set("CatalogName", js.undefined)
    @scala.inline
    def setType(value: DataCatalogType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

