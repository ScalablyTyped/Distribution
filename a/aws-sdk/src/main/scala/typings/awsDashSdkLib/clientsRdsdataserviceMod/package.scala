package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRdsdataserviceMod {
  type Arn = java.lang.String
  type ArrayValues = js.Array[Value]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ColumnMetadataList = js.Array[ColumnMetadata]
  type DbName = java.lang.String
  type Double = scala.Double
  type Float = scala.Double
  type Integer = scala.Double
  type Long = scala.Double
  type Records = js.Array[Record]
  type Row = js.Array[Value]
  type SqlStatement = java.lang.String
  type SqlStatementResults = js.Array[SqlStatementResult]
  type String = java.lang.String
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-08-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
