package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsImportexportMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type APIVersion = String
  type ArtifactList = js.Array[Artifact]
  type Carrier = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CreationDate = Date
  type CurrentManifest = String
  type Description = String
  type ErrorCount = Double
  type GenericString = String
  type IsCanceled = Boolean
  type IsTruncated = Boolean
  type JobId = String
  type JobIdList = js.Array[GenericString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Import_
    - typings.awsDashSdk.awsDashSdkStrings.Export_
    - java.lang.String
  */
  type JobType = _JobType | String
  type JobsList = js.Array[Job]
  type LocationCode = String
  type LocationMessage = String
  type LogBucket = String
  type LogKey = String
  type Manifest = String
  type ManifestAddendum = String
  type Marker = String
  type MaxJobs = Double
  type ProgressCode = String
  type ProgressMessage = String
  type Signature = String
  type SignatureFileContents = String
  type Success = Boolean
  type TrackingNumber = String
  type URL = String
  type ValidateOnly = Boolean
  type WarningMessage = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2010-06-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type city = String
  type company = String
  type country = String
  type name = String
  type phoneNumber = String
  type postalCode = String
  type stateOrProvince = String
  type street1 = String
  type street2 = String
  type street3 = String
}
