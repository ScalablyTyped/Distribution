package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicalTable extends js.Object {
  /**
    * A physical table type built from the results of the custom SQL query.
    */
  var CustomSql: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.CustomSql] = js.native
  /**
    * A physical table type for relational data sources.
    */
  var RelationalTable: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.RelationalTable] = js.native
  /**
    * A physical table type for as S3 data source.
    */
  var S3Source: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.S3Source] = js.native
}

object PhysicalTable {
  @scala.inline
  def apply(CustomSql: CustomSql = null, RelationalTable: RelationalTable = null, S3Source: S3Source = null): PhysicalTable = {
    val __obj = js.Dynamic.literal()
    if (CustomSql != null) __obj.updateDynamic("CustomSql")(CustomSql.asInstanceOf[js.Any])
    if (RelationalTable != null) __obj.updateDynamic("RelationalTable")(RelationalTable.asInstanceOf[js.Any])
    if (S3Source != null) __obj.updateDynamic("S3Source")(S3Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicalTable]
  }
}

