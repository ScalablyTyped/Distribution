package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedshiftMetadata extends js.Object {
  var DatabaseUserName: js.UndefOr[RedshiftDatabaseUsername] = js.undefined
  var RedshiftDatabase: js.UndefOr[RedshiftDatabase] = js.undefined
  /**
    *  The SQL query that is specified during CreateDataSourceFromRedshift. Returns only if Verbose is true in GetDataSourceInput. 
    */
  var SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery] = js.undefined
}

object RedshiftMetadata {
  @scala.inline
  def apply(
    DatabaseUserName: RedshiftDatabaseUsername = null,
    RedshiftDatabase: RedshiftDatabase = null,
    SelectSqlQuery: RedshiftSelectSqlQuery = null
  ): RedshiftMetadata = {
    val __obj = js.Dynamic.literal()
    if (DatabaseUserName != null) __obj.updateDynamic("DatabaseUserName")(DatabaseUserName)
    if (RedshiftDatabase != null) __obj.updateDynamic("RedshiftDatabase")(RedshiftDatabase)
    if (SelectSqlQuery != null) __obj.updateDynamic("SelectSqlQuery")(SelectSqlQuery)
    __obj.asInstanceOf[RedshiftMetadata]
  }
}

