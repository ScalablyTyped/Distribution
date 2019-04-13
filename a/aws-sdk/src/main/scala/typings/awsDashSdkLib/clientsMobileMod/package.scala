package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMobileMod {
  type AttributeKey = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type Boolean = scala.Boolean
  type BundleDescription = java.lang.String
  type BundleId = java.lang.String
  type BundleList = js.Array[BundleDetails]
  type BundleTitle = java.lang.String
  type BundleVersion = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConsoleUrl = java.lang.String
  type Contents = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type DownloadUrl = java.lang.String
  type Feature = java.lang.String
  type IconUrl = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OSX
    - awsDashSdkLib.awsDashSdkLibStrings.WINDOWS
    - awsDashSdkLib.awsDashSdkLibStrings.LINUX
    - awsDashSdkLib.awsDashSdkLibStrings.OBJC
    - awsDashSdkLib.awsDashSdkLibStrings.SWIFT
    - awsDashSdkLib.awsDashSdkLibStrings.ANDROID
    - awsDashSdkLib.awsDashSdkLibStrings.JAVASCRIPT
    - java.lang.String
  */
  type Platform = _Platform | java.lang.String
  type Platforms = js.Array[Platform]
  type ProjectId = java.lang.String
  type ProjectName = java.lang.String
  type ProjectRegion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NORMAL
    - awsDashSdkLib.awsDashSdkLibStrings.SYNCING
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORTING
    - java.lang.String
  */
  type ProjectState = _ProjectState | java.lang.String
  type ProjectSummaries = js.Array[ProjectSummary]
  type ResourceArn = java.lang.String
  type ResourceName = java.lang.String
  type ResourceType = java.lang.String
  type Resources = js.Array[Resource]
  type ShareUrl = java.lang.String
  type SnapshotId = java.lang.String
  type _Date = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-07-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
