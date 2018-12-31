package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/rdsdataservice", "RDSDataService")
@js.native
object RDSDataServiceNs extends js.Object {
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ColumnMetadata extends js.Object {
    /**
      * Homogenous array base SQL type from java.sql.Types.
      */
    var arrayBaseColumnType: js.UndefOr[Integer] = js.undefined
    /**
      * Whether the designated column is automatically numbered
      */
    var isAutoIncrement: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether values in the designated column's case matters
      */
    var isCaseSensitive: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether values in the designated column is a cash value
      */
    var isCurrency: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether values in the designated column are signed numbers
      */
    var isSigned: js.UndefOr[Boolean] = js.undefined
    /**
      * Usually specified by the SQL AS. If not specified, return column name.
      */
    var label: js.UndefOr[String] = js.undefined
    /**
      * Name of the column.
      */
    var name: js.UndefOr[String] = js.undefined
    /**
      * Indicates the nullability of values in the designated column. One of columnNoNulls (0), columnNullable (1), columnNullableUnknown (2)
      */
    var nullable: js.UndefOr[Integer] = js.undefined
    /**
      * Get the designated column's specified column size.For numeric data, this is the maximum precision.  For character data, this is the length in characters. For datetime datatypes, this is the length in characters of the String representation (assuming the maximum allowed precision of the fractional seconds component). For binary data, this is the length in bytes.  For the ROWID datatype, this is the length in bytes. 0 is returned for data types where the column size is not applicable.
      */
    var precision: js.UndefOr[Integer] = js.undefined
    /**
      * Designated column's number of digits to right of the decimal point. 0 is returned for data types where the scale is not applicable.
      */
    var scale: js.UndefOr[Integer] = js.undefined
    /**
      * Designated column's table's schema
      */
    var schemaName: js.UndefOr[String] = js.undefined
    /**
      * Designated column's table name
      */
    var tableName: js.UndefOr[String] = js.undefined
    /**
      * SQL type from java.sql.Types.
      */
    var `type`: js.UndefOr[Integer] = js.undefined
    /**
      * Database-specific type name.
      */
    var typeName: js.UndefOr[String] = js.undefined
  }
  
  trait ExecuteSqlRequest extends js.Object {
    /**
      * ARN of the db credentials in AWS Secret Store or the friendly secret name
      */
    var awsSecretStoreArn: String
    /**
      * Target DB name
      */
    var database: js.UndefOr[String] = js.undefined
    /**
      * ARN of the target db cluster or instance
      */
    var dbClusterOrInstanceArn: String
    /**
      * Target Schema name
      */
    var schema: js.UndefOr[String] = js.undefined
    /**
      * SQL statement(s) to be executed. Statements can be chained by using semicolons
      */
    var sqlStatements: String
  }
  
  trait ExecuteSqlResponse extends js.Object {
    /**
      * Results returned by executing the sql statement(s)
      */
    var sqlStatementResults: SqlStatementResults
  }
  
  trait Record extends js.Object {
    /**
      * Record
      */
    var values: js.UndefOr[Row] = js.undefined
  }
  
  trait ResultFrame extends js.Object {
    /**
      * ResultSet Metadata.
      */
    var records: js.UndefOr[Records] = js.undefined
    /**
      * ResultSet Metadata.
      */
    var resultSetMetadata: js.UndefOr[ResultSetMetadata] = js.undefined
  }
  
  trait ResultSetMetadata extends js.Object {
    /**
      * Number of columns
      */
    var columnCount: js.UndefOr[Long] = js.undefined
    /**
      * List of columns and their types
      */
    var columnMetadata: js.UndefOr[ColumnMetadataList] = js.undefined
  }
  
  trait SqlStatementResult extends js.Object {
    /**
      * Number of rows updated.
      */
    var numberOfRecordsUpdated: js.UndefOr[Long] = js.undefined
    /**
      * ResultFrame returned by executing the sql statement
      */
    var resultFrame: js.UndefOr[ResultFrame] = js.undefined
  }
  
  trait StructValue extends js.Object {
    /**
      * Struct or UDT
      */
    var attributes: js.UndefOr[ArrayValues] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Executes any SQL statement on the target database synchronously
      */
    def executeSql(): awsDashSdkLib.libRequestMod.Request[ExecuteSqlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def executeSql(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExecuteSqlResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExecuteSqlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Executes any SQL statement on the target database synchronously
      */
    def executeSql(params: ExecuteSqlRequest): awsDashSdkLib.libRequestMod.Request[ExecuteSqlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def executeSql(
      params: ExecuteSqlRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExecuteSqlResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExecuteSqlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait Value extends js.Object {
    /**
      * Arbitrarily nested arrays
      */
    var arrayValues: js.UndefOr[ArrayValues] = js.undefined
    /**
      * Long value
      */
    var bigIntValue: js.UndefOr[Long] = js.undefined
    /**
      * Bit value
      */
    var bitValue: js.UndefOr[Boolean] = js.undefined
    /**
      * Blob value
      */
    var blobValue: js.UndefOr[_Blob] = js.undefined
    /**
      * Double value
      */
    var doubleValue: js.UndefOr[Double] = js.undefined
    /**
      * Integer value
      */
    var intValue: js.UndefOr[Integer] = js.undefined
    /**
      * Is column null
      */
    var isNull: js.UndefOr[Boolean] = js.undefined
    /**
      * Float value
      */
    var realValue: js.UndefOr[Float] = js.undefined
    /**
      * String value
      */
    var stringValue: js.UndefOr[String] = js.undefined
    /**
      * Struct or UDT
      */
    var structValue: js.UndefOr[StructValue] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type ArrayValues = js.Array[Value]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ColumnMetadataList = js.Array[ColumnMetadata]
  type Double = scala.Double
  type Float = scala.Double
  type Integer = scala.Double
  type Long = scala.Double
  type Records = js.Array[Record]
  type Row = js.Array[Value]
  type SqlStatementResults = js.Array[SqlStatementResult]
  type String = java.lang.String
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsRdsdataserviceMod.Blob | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-08-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

