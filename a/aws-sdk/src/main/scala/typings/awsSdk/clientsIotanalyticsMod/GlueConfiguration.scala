package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlueConfiguration extends StObject {
  
  /**
    * The name of the database in your Glue Data Catalog in which the table is located. An Glue Data Catalog database contains metadata tables.
    */
  var databaseName: GlueDatabaseName
  
  /**
    * The name of the table in your Glue Data Catalog that is used to perform the ETL operations. An Glue Data Catalog table contains partitioned data and descriptions of data sources and targets.
    */
  var tableName: GlueTableName
}
object GlueConfiguration {
  
  inline def apply(databaseName: GlueDatabaseName, tableName: GlueTableName): GlueConfiguration = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlueConfiguration]
  }
  
  extension [Self <: GlueConfiguration](x: Self) {
    
    inline def setDatabaseName(value: GlueDatabaseName): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: GlueTableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
