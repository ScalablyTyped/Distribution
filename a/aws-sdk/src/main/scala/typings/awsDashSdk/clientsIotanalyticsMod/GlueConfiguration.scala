package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlueConfiguration extends js.Object {
  /**
    * The name of the database in your AWS Glue Data Catalog in which the table is located. (An AWS Glue Data Catalog database contains Glue Data tables.)
    */
  var databaseName: GlueDatabaseName
  /**
    * The name of the table in your AWS Glue Data Catalog which is used to perform the ETL (extract, transform and load) operations. (An AWS Glue Data Catalog table contains partitioned data and descriptions of data sources and targets.)
    */
  var tableName: GlueTableName
}

object GlueConfiguration {
  @scala.inline
  def apply(databaseName: GlueDatabaseName, tableName: GlueTableName): GlueConfiguration = {
    val __obj = js.Dynamic.literal(databaseName = databaseName, tableName = tableName)
  
    __obj.asInstanceOf[GlueConfiguration]
  }
}

