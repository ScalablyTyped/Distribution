package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalTable extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the data source.
    */
  var DataSourceArn: Arn = js.native
  /**
    * The column schema of the table.
    */
  var InputColumns: InputColumnList = js.native
  /**
    * The name of the relational table.
    */
  var Name: RelationalTableName = js.native
  /**
    * The schema name. This name applies to certain relational database engines.
    */
  var Schema: js.UndefOr[RelationalTableSchema] = js.native
}

object RelationalTable {
  @scala.inline
  def apply(
    DataSourceArn: Arn,
    InputColumns: InputColumnList,
    Name: RelationalTableName,
    Schema: RelationalTableSchema = null
  ): RelationalTable = {
    val __obj = js.Dynamic.literal(DataSourceArn = DataSourceArn.asInstanceOf[js.Any], InputColumns = InputColumns.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Schema != null) __obj.updateDynamic("Schema")(Schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalTable]
  }
}

