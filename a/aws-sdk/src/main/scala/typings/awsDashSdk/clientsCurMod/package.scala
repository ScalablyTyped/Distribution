package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCurMod {
  import typings.awsDashSdk.awsDashSdkStrings.RESOURCES
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`us-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-2`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-central-1`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-2`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-north-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-3`
    - java.lang.String
  */
  type AWSRegion = _AWSRegion | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REDSHIFT
    - typings.awsDashSdk.awsDashSdkStrings.QUICKSIGHT
    - typings.awsDashSdk.awsDashSdkStrings.ATHENA
    - java.lang.String
  */
  type AdditionalArtifact = _AdditionalArtifact | String
  type AdditionalArtifactList = js.Array[AdditionalArtifact]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ZIP
    - typings.awsDashSdk.awsDashSdkStrings.GZIP
    - typings.awsDashSdk.awsDashSdkStrings.Parquet
    - java.lang.String
  */
  type CompressionFormat = _CompressionFormat | String
  type DeleteResponseMessage = String
  type GenericString = String
  type MaxResults = Double
  type RefreshClosedReports = Boolean
  type ReportDefinitionList = js.Array[ReportDefinition]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.textORcsv
    - typings.awsDashSdk.awsDashSdkStrings.Parquet
    - java.lang.String
  */
  type ReportFormat = _ReportFormat | String
  type ReportName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_NEW_REPORT
    - typings.awsDashSdk.awsDashSdkStrings.OVERWRITE_REPORT
    - java.lang.String
  */
  type ReportVersioning = _ReportVersioning | String
  type S3Bucket = String
  type S3Prefix = String
  type SchemaElement = RESOURCES | String
  type SchemaElementList = js.Array[SchemaElement]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HOURLY
    - typings.awsDashSdk.awsDashSdkStrings.DAILY
    - java.lang.String
  */
  type TimeUnit = _TimeUnit | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-01-06`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
