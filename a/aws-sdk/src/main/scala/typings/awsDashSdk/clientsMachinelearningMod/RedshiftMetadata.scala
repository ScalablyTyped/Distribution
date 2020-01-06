package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftMetadata extends js.Object {
  var DatabaseUserName: js.UndefOr[RedshiftDatabaseUsername] = js.native
  var RedshiftDatabase: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.RedshiftDatabase] = js.native
  /**
    *  The SQL query that is specified during CreateDataSourceFromRedshift. Returns only if Verbose is true in GetDataSourceInput. 
    */
  var SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery] = js.native
}

object RedshiftMetadata {
  @scala.inline
  def apply(
    DatabaseUserName: RedshiftDatabaseUsername = null,
    RedshiftDatabase: RedshiftDatabase = null,
    SelectSqlQuery: RedshiftSelectSqlQuery = null
  ): RedshiftMetadata = {
    val __obj = js.Dynamic.literal()
    if (DatabaseUserName != null) __obj.updateDynamic("DatabaseUserName")(DatabaseUserName.asInstanceOf[js.Any])
    if (RedshiftDatabase != null) __obj.updateDynamic("RedshiftDatabase")(RedshiftDatabase.asInstanceOf[js.Any])
    if (SelectSqlQuery != null) __obj.updateDynamic("SelectSqlQuery")(SelectSqlQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftMetadata]
  }
}

