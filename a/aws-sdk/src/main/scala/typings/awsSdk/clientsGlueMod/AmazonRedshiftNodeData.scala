package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonRedshiftNodeData extends StObject {
  
  /**
    * The access type for the Redshift connection. Can be a direct connection or catalog connections.
    */
  var AccessType: js.UndefOr[GenericLimitedString] = js.undefined
  
  /**
    * Specifies how writing to a Redshift cluser will occur.
    */
  var Action: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Optional values when connecting to the Redshift cluster.
    */
  var AdvancedOptions: js.UndefOr[AmazonRedshiftAdvancedOptions] = js.undefined
  
  /**
    * The name of the Glue Data Catalog database when working with a data catalog.
    */
  var CatalogDatabase: js.UndefOr[Option] = js.undefined
  
  /**
    * The Redshift schema name when working with a data catalog.
    */
  var CatalogRedshiftSchema: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The database table to read from.
    */
  var CatalogRedshiftTable: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Glue Data Catalog table name when working with a data catalog.
    */
  var CatalogTable: js.UndefOr[Option] = js.undefined
  
  /**
    * The Glue connection to the Redshift cluster.
    */
  var Connection: js.UndefOr[Option] = js.undefined
  
  /**
    * Specifies the name of the connection that is associated with the catalog table used.
    */
  var CrawlerConnection: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Optional. The role name use when connection to S3. The IAM role ill default to the role on the job when left blank.
    */
  var IamRole: js.UndefOr[Option] = js.undefined
  
  /**
    * The action used when to detemine how a MERGE in a Redshift sink will be handled.
    */
  var MergeAction: js.UndefOr[GenericLimitedString] = js.undefined
  
  /**
    * The SQL used in a custom merge to deal with matching records.
    */
  var MergeClause: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record matches a new record.
    */
  var MergeWhenMatched: js.UndefOr[GenericLimitedString] = js.undefined
  
  /**
    * The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record doesn't match a new record.
    */
  var MergeWhenNotMatched: js.UndefOr[GenericLimitedString] = js.undefined
  
  /**
    * The SQL used before a MERGE or APPEND with upsert is run.
    */
  var PostAction: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The SQL used before a MERGE or APPEND with upsert is run.
    */
  var PreAction: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The SQL used to fetch the data from a Redshift sources when the SourceType is 'query'.
    */
  var SampleQuery: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Redshift schema name when working with a direct connection.
    */
  var Schema: js.UndefOr[Option] = js.undefined
  
  /**
    * The list of column names used to determine a matching record when doing a MERGE or APPEND with upsert.
    */
  var SelectedColumns: js.UndefOr[OptionList] = js.undefined
  
  /**
    * The source type to specify whether a specific table is the source or a custom query.
    */
  var SourceType: js.UndefOr[GenericLimitedString] = js.undefined
  
  /**
    * The name of the temporary staging table that is used when doing a MERGE or APPEND with upsert.
    */
  var StagingTable: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Redshift table name when working with a direct connection.
    */
  var Table: js.UndefOr[Option] = js.undefined
  
  /**
    * Specifies the prefix to a table.
    */
  var TablePrefix: js.UndefOr[GenericLimitedString] = js.undefined
  
  /**
    * The array of schema output for a given node.
    */
  var TableSchema: js.UndefOr[OptionList] = js.undefined
  
  /**
    * The Amazon S3 path where temporary data can be staged when copying out of the database.
    */
  var TempDir: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The action used on Redshift sinks when doing an APPEND.
    */
  var Upsert: js.UndefOr[BooleanValue] = js.undefined
}
object AmazonRedshiftNodeData {
  
  inline def apply(): AmazonRedshiftNodeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonRedshiftNodeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonRedshiftNodeData] (val x: Self) extends AnyVal {
    
    inline def setAccessType(value: GenericLimitedString): Self = StObject.set(x, "AccessType", value.asInstanceOf[js.Any])
    
    inline def setAccessTypeUndefined: Self = StObject.set(x, "AccessType", js.undefined)
    
    inline def setAction(value: GenericString): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setAdvancedOptions(value: AmazonRedshiftAdvancedOptions): Self = StObject.set(x, "AdvancedOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedOptionsUndefined: Self = StObject.set(x, "AdvancedOptions", js.undefined)
    
    inline def setAdvancedOptionsVarargs(value: AmazonRedshiftAdvancedOption*): Self = StObject.set(x, "AdvancedOptions", js.Array(value*))
    
    inline def setCatalogDatabase(value: Option): Self = StObject.set(x, "CatalogDatabase", value.asInstanceOf[js.Any])
    
    inline def setCatalogDatabaseUndefined: Self = StObject.set(x, "CatalogDatabase", js.undefined)
    
    inline def setCatalogRedshiftSchema(value: GenericString): Self = StObject.set(x, "CatalogRedshiftSchema", value.asInstanceOf[js.Any])
    
    inline def setCatalogRedshiftSchemaUndefined: Self = StObject.set(x, "CatalogRedshiftSchema", js.undefined)
    
    inline def setCatalogRedshiftTable(value: GenericString): Self = StObject.set(x, "CatalogRedshiftTable", value.asInstanceOf[js.Any])
    
    inline def setCatalogRedshiftTableUndefined: Self = StObject.set(x, "CatalogRedshiftTable", js.undefined)
    
    inline def setCatalogTable(value: Option): Self = StObject.set(x, "CatalogTable", value.asInstanceOf[js.Any])
    
    inline def setCatalogTableUndefined: Self = StObject.set(x, "CatalogTable", js.undefined)
    
    inline def setConnection(value: Option): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
    
    inline def setCrawlerConnection(value: GenericString): Self = StObject.set(x, "CrawlerConnection", value.asInstanceOf[js.Any])
    
    inline def setCrawlerConnectionUndefined: Self = StObject.set(x, "CrawlerConnection", js.undefined)
    
    inline def setIamRole(value: Option): Self = StObject.set(x, "IamRole", value.asInstanceOf[js.Any])
    
    inline def setIamRoleUndefined: Self = StObject.set(x, "IamRole", js.undefined)
    
    inline def setMergeAction(value: GenericLimitedString): Self = StObject.set(x, "MergeAction", value.asInstanceOf[js.Any])
    
    inline def setMergeActionUndefined: Self = StObject.set(x, "MergeAction", js.undefined)
    
    inline def setMergeClause(value: GenericString): Self = StObject.set(x, "MergeClause", value.asInstanceOf[js.Any])
    
    inline def setMergeClauseUndefined: Self = StObject.set(x, "MergeClause", js.undefined)
    
    inline def setMergeWhenMatched(value: GenericLimitedString): Self = StObject.set(x, "MergeWhenMatched", value.asInstanceOf[js.Any])
    
    inline def setMergeWhenMatchedUndefined: Self = StObject.set(x, "MergeWhenMatched", js.undefined)
    
    inline def setMergeWhenNotMatched(value: GenericLimitedString): Self = StObject.set(x, "MergeWhenNotMatched", value.asInstanceOf[js.Any])
    
    inline def setMergeWhenNotMatchedUndefined: Self = StObject.set(x, "MergeWhenNotMatched", js.undefined)
    
    inline def setPostAction(value: GenericString): Self = StObject.set(x, "PostAction", value.asInstanceOf[js.Any])
    
    inline def setPostActionUndefined: Self = StObject.set(x, "PostAction", js.undefined)
    
    inline def setPreAction(value: GenericString): Self = StObject.set(x, "PreAction", value.asInstanceOf[js.Any])
    
    inline def setPreActionUndefined: Self = StObject.set(x, "PreAction", js.undefined)
    
    inline def setSampleQuery(value: GenericString): Self = StObject.set(x, "SampleQuery", value.asInstanceOf[js.Any])
    
    inline def setSampleQueryUndefined: Self = StObject.set(x, "SampleQuery", js.undefined)
    
    inline def setSchema(value: Option): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    inline def setSelectedColumns(value: OptionList): Self = StObject.set(x, "SelectedColumns", value.asInstanceOf[js.Any])
    
    inline def setSelectedColumnsUndefined: Self = StObject.set(x, "SelectedColumns", js.undefined)
    
    inline def setSelectedColumnsVarargs(value: Option*): Self = StObject.set(x, "SelectedColumns", js.Array(value*))
    
    inline def setSourceType(value: GenericLimitedString): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    inline def setStagingTable(value: GenericString): Self = StObject.set(x, "StagingTable", value.asInstanceOf[js.Any])
    
    inline def setStagingTableUndefined: Self = StObject.set(x, "StagingTable", js.undefined)
    
    inline def setTable(value: Option): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTablePrefix(value: GenericLimitedString): Self = StObject.set(x, "TablePrefix", value.asInstanceOf[js.Any])
    
    inline def setTablePrefixUndefined: Self = StObject.set(x, "TablePrefix", js.undefined)
    
    inline def setTableSchema(value: OptionList): Self = StObject.set(x, "TableSchema", value.asInstanceOf[js.Any])
    
    inline def setTableSchemaUndefined: Self = StObject.set(x, "TableSchema", js.undefined)
    
    inline def setTableSchemaVarargs(value: Option*): Self = StObject.set(x, "TableSchema", js.Array(value*))
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    
    inline def setTempDir(value: EnclosedInStringProperty): Self = StObject.set(x, "TempDir", value.asInstanceOf[js.Any])
    
    inline def setTempDirUndefined: Self = StObject.set(x, "TempDir", js.undefined)
    
    inline def setUpsert(value: BooleanValue): Self = StObject.set(x, "Upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "Upsert", js.undefined)
  }
}
