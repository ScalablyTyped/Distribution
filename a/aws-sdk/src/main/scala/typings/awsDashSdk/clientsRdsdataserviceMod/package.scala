package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRdsdataserviceMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Uint8Array

  type Arn = java.lang.String
  type ArrayOfArray = js.Array[ArrayValue]
  type ArrayValueList = js.Array[Value]
  type Boolean = scala.Boolean
  type BooleanArray = js.Array[BoxedBoolean]
  type BoxedBoolean = scala.Boolean
  type BoxedDouble = Double
  type BoxedFloat = Double
  type BoxedInteger = Double
  type BoxedLong = Double
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DbName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DOUBLE_OR_LONG
    - typings.awsDashSdk.awsDashSdkStrings.STRING
    - java.lang.String
  */
  type DecimalReturnType = _DecimalReturnType | java.lang.String
  type DoubleArray = js.Array[BoxedDouble]
  type FieldList = js.Array[Field]
  type Id = java.lang.String
  type Integer = Double
  type Long = Double
  type LongArray = js.Array[BoxedLong]
  type Metadata = js.Array[ColumnMetadata]
  type ParameterName = java.lang.String
  type Records = js.Array[Record]
  type RecordsUpdated = Double
  type Row = js.Array[Value]
  type SqlParameterSets = js.Array[SqlParametersList]
  type SqlParametersList = js.Array[SqlParameter]
  type SqlRecords = js.Array[FieldList]
  type SqlStatement = java.lang.String
  type SqlStatementResults = js.Array[SqlStatementResult]
  type String = java.lang.String
  type StringArray = js.Array[String]
  type TransactionStatus = java.lang.String
  type UpdateResults = js.Array[UpdateResult]
  type _Blob = Buffer | Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-08-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
