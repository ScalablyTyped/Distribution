package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceToIndexFieldMapping extends js.Object {
  /**
    * The name of the column or attribute in the data source.
    */
  var DataSourceFieldName: typings.awsDashSdk.clientsKendraMod.DataSourceFieldName = js.native
  /**
    * The type of data stored in the column or attribute.
    */
  var DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat] = js.native
  /**
    * The name of the field in the index.
    */
  var IndexFieldName: typings.awsDashSdk.clientsKendraMod.IndexFieldName = js.native
}

object DataSourceToIndexFieldMapping {
  @scala.inline
  def apply(
    DataSourceFieldName: DataSourceFieldName,
    IndexFieldName: IndexFieldName,
    DateFieldFormat: DataSourceDateFieldFormat = null
  ): DataSourceToIndexFieldMapping = {
    val __obj = js.Dynamic.literal(DataSourceFieldName = DataSourceFieldName.asInstanceOf[js.Any], IndexFieldName = IndexFieldName.asInstanceOf[js.Any])
    if (DateFieldFormat != null) __obj.updateDynamic("DateFieldFormat")(DateFieldFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceToIndexFieldMapping]
  }
}

