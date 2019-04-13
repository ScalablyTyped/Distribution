package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCurMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`us-east-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-central-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-north-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-3`
    - java.lang.String
  */
  type AWSRegion = _AWSRegion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REDSHIFT
    - awsDashSdkLib.awsDashSdkLibStrings.QUICKSIGHT
    - awsDashSdkLib.awsDashSdkLibStrings.ATHENA
    - java.lang.String
  */
  type AdditionalArtifact = _AdditionalArtifact | java.lang.String
  type AdditionalArtifactList = js.Array[AdditionalArtifact]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ZIP
    - awsDashSdkLib.awsDashSdkLibStrings.GZIP
    - awsDashSdkLib.awsDashSdkLibStrings.Parquet
    - java.lang.String
  */
  type CompressionFormat = _CompressionFormat | java.lang.String
  type DeleteResponseMessage = java.lang.String
  type GenericString = java.lang.String
  type MaxResults = scala.Double
  type RefreshClosedReports = scala.Boolean
  type ReportDefinitionList = js.Array[ReportDefinition]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.textORcsv
    - awsDashSdkLib.awsDashSdkLibStrings.Parquet
    - java.lang.String
  */
  type ReportFormat = _ReportFormat | java.lang.String
  type ReportName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_NEW_REPORT
    - awsDashSdkLib.awsDashSdkLibStrings.OVERWRITE_REPORT
    - java.lang.String
  */
  type ReportVersioning = _ReportVersioning | java.lang.String
  type S3Bucket = java.lang.String
  type S3Prefix = java.lang.String
  type SchemaElement = awsDashSdkLib.awsDashSdkLibStrings.RESOURCES | java.lang.String
  type SchemaElementList = js.Array[SchemaElement]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HOURLY
    - awsDashSdkLib.awsDashSdkLibStrings.DAILY
    - java.lang.String
  */
  type TimeUnit = _TimeUnit | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-01-06`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
