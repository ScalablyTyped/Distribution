package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRdsdataserviceMod {
  type Arn = java.lang.String
  type ArrayValueList = js.Array[Value]
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type BoxedDouble = scala.Double
  type BoxedFloat = scala.Double
  type BoxedInteger = scala.Double
  type BoxedLong = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DbName = java.lang.String
  type FieldList = js.Array[Field]
  type Id = java.lang.String
  type Integer = scala.Double
  type Long = scala.Double
  type Metadata = js.Array[ColumnMetadata]
  type ParameterName = java.lang.String
  type Records = js.Array[Record]
  type RecordsUpdated = scala.Double
  type Row = js.Array[Value]
  type SqlParameterSets = js.Array[SqlParametersList]
  type SqlParametersList = js.Array[SqlParameter]
  type SqlRecords = js.Array[FieldList]
  type SqlStatement = java.lang.String
  type SqlStatementResults = js.Array[SqlStatementResult]
  type String = java.lang.String
  type TransactionStatus = java.lang.String
  type UpdateResults = js.Array[UpdateResult]
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-08-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
