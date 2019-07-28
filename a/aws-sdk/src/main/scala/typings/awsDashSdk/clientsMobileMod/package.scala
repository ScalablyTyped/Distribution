package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMobileMod {
  type AttributeKey = String
  type AttributeValue = String
  type Attributes = StringDictionary[AttributeValue]
  type Boolean = scala.Boolean
  type BundleDescription = String
  type BundleId = String
  type BundleList = js.Array[BundleDetails]
  type BundleTitle = String
  type BundleVersion = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ConsoleUrl = String
  type Contents = Buffer | Uint8Array | Blob | String
  type DownloadUrl = String
  type Feature = String
  type IconUrl = String
  type MaxResults = Double
  type NextToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OSX
    - typings.awsDashSdk.awsDashSdkStrings.WINDOWS
    - typings.awsDashSdk.awsDashSdkStrings.LINUX
    - typings.awsDashSdk.awsDashSdkStrings.OBJC
    - typings.awsDashSdk.awsDashSdkStrings.SWIFT
    - typings.awsDashSdk.awsDashSdkStrings.ANDROID
    - typings.awsDashSdk.awsDashSdkStrings.JAVASCRIPT
    - java.lang.String
  */
  type Platform = _Platform | String
  type Platforms = js.Array[Platform]
  type ProjectId = String
  type ProjectName = String
  type ProjectRegion = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NORMAL
    - typings.awsDashSdk.awsDashSdkStrings.SYNCING
    - typings.awsDashSdk.awsDashSdkStrings.IMPORTING
    - java.lang.String
  */
  type ProjectState = _ProjectState | String
  type ProjectSummaries = js.Array[ProjectSummary]
  type ResourceArn = String
  type ResourceName = String
  type ResourceType = String
  type Resources = js.Array[Resource]
  type ShareUrl = String
  type SnapshotId = String
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-07-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
