package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseConfiguration extends StObject {
  
  /**
    * Information about the database column that provides information for user context filtering.
    */
  var AclConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.AclConfiguration] = js.undefined
  
  /**
    * Information about where the index should get the document information from the database.
    */
  var ColumnConfiguration: typings.awsSdk.clientsKendraMod.ColumnConfiguration
  
  /**
    * Configuration information that's required to connect to a database.
    */
  var ConnectionConfiguration: typings.awsSdk.clientsKendraMod.ConnectionConfiguration
  
  /**
    * The type of database engine that runs the database.
    */
  var DatabaseEngineType: typings.awsSdk.clientsKendraMod.DatabaseEngineType
  
  /**
    * Provides information about how Amazon Kendra uses quote marks around SQL identifiers when querying a database data source.
    */
  var SqlConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.SqlConfiguration] = js.undefined
  
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
}
object DatabaseConfiguration {
  
  inline def apply(
    ColumnConfiguration: ColumnConfiguration,
    ConnectionConfiguration: ConnectionConfiguration,
    DatabaseEngineType: DatabaseEngineType
  ): DatabaseConfiguration = {
    val __obj = js.Dynamic.literal(ColumnConfiguration = ColumnConfiguration.asInstanceOf[js.Any], ConnectionConfiguration = ConnectionConfiguration.asInstanceOf[js.Any], DatabaseEngineType = DatabaseEngineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseConfiguration]
  }
  
  extension [Self <: DatabaseConfiguration](x: Self) {
    
    inline def setAclConfiguration(value: AclConfiguration): Self = StObject.set(x, "AclConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAclConfigurationUndefined: Self = StObject.set(x, "AclConfiguration", js.undefined)
    
    inline def setColumnConfiguration(value: ColumnConfiguration): Self = StObject.set(x, "ColumnConfiguration", value.asInstanceOf[js.Any])
    
    inline def setConnectionConfiguration(value: ConnectionConfiguration): Self = StObject.set(x, "ConnectionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDatabaseEngineType(value: DatabaseEngineType): Self = StObject.set(x, "DatabaseEngineType", value.asInstanceOf[js.Any])
    
    inline def setSqlConfiguration(value: SqlConfiguration): Self = StObject.set(x, "SqlConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSqlConfigurationUndefined: Self = StObject.set(x, "SqlConfiguration", js.undefined)
    
    inline def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
