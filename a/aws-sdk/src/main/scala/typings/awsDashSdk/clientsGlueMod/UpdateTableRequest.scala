package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString
  /**
    * By default, UpdateTable always creates an archived version of the table before updating it. If skipArchive is set to true, however, UpdateTable does not create the archived version.
    */
  var SkipArchive: js.UndefOr[BooleanNullable] = js.undefined
  /**
    * An updated TableInput object to define the metadata table in the catalog.
    */
  var TableInput: typings.awsDashSdk.clientsGlueMod.TableInput
}

object UpdateTableRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    TableInput: TableInput,
    CatalogId: CatalogIdString = null,
    SkipArchive: js.UndefOr[BooleanNullable] = js.undefined
  ): UpdateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, TableInput = TableInput)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    if (!js.isUndefined(SkipArchive)) __obj.updateDynamic("SkipArchive")(SkipArchive)
    __obj.asInstanceOf[UpdateTableRequest]
  }
}

