package typings.awsSdk.clientsMobileMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AttributeKey = String

type AttributeValue = String

type Attributes = StringDictionary[AttributeValue]

type Boolean = scala.Boolean

type BundleDescription = String

type BundleId = String

type BundleList = js.Array[BundleDetails]

type BundleTitle = String

type BundleVersion = String

type ConsoleUrl = String

type Contents = Buffer | js.typedarray.Uint8Array | Blob | String

type Date = js.Date

type DownloadUrl = String

type Feature = String

type IconUrl = String

type MaxResults = Double

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OSX
  - typings.awsSdk.awsSdkStrings.WINDOWS
  - typings.awsSdk.awsSdkStrings.LINUX
  - typings.awsSdk.awsSdkStrings.OBJC
  - typings.awsSdk.awsSdkStrings.SWIFT
  - typings.awsSdk.awsSdkStrings.ANDROID
  - typings.awsSdk.awsSdkStrings.JAVASCRIPT
  - java.lang.String
*/
type Platform = _Platform | String

type Platforms = js.Array[Platform]

type ProjectId = String

type ProjectName = String

type ProjectRegion = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NORMAL
  - typings.awsSdk.awsSdkStrings.SYNCING
  - typings.awsSdk.awsSdkStrings.IMPORTING
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

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-07-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
