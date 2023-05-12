package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.Available_
import typings.awsSdk.awsSdkStrings.PUBLISHED_TIME
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALLOW
  - typings.awsSdk.awsSdkStrings.BLOCK
  - java.lang.String
*/
type AllowPublish = _AllowPublish | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALLOW
  - typings.awsSdk.awsSdkStrings.BLOCK
  - java.lang.String
*/
type AllowUpstream = _AllowUpstream | java.lang.String

type Arn = java.lang.String

type Asset = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String | Readable

type AssetHashes = StringDictionary[HashValue]

type AssetName = java.lang.String

type AssetSummaryList = js.Array[AssetSummary]

type AuthorizationTokenDurationSeconds = Double

type BooleanOptional = Boolean

type Description = java.lang.String

type DomainName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Deleted_
  - java.lang.String
*/
type DomainStatus = _DomainStatus | java.lang.String

type DomainSummaryList = js.Array[DomainSummary]

type ErrorMessage = java.lang.String

type ExternalConnectionName = java.lang.String

type ExternalConnectionStatus = Available_ | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MD5
  - typings.awsSdk.awsSdkStrings.`SHA-1`
  - typings.awsSdk.awsSdkStrings.`SHA-256`
  - typings.awsSdk.awsSdkStrings.`SHA-512`
  - java.lang.String
*/
type HashAlgorithm = _HashAlgorithm | java.lang.String

type HashValue = java.lang.String

type Integer = Double

type LicenseInfoList = js.Array[LicenseInfo]

type ListDomainsMaxResults = Double

type ListPackageVersionAssetsMaxResults = Double

type ListPackageVersionsMaxResults = Double

type ListPackagesMaxResults = Double

type ListRepositoriesInDomainMaxResults = Double

type ListRepositoriesMaxResults = Double

type Long = Double

type LongOptional = Double

type PackageDependencyList = js.Array[PackageDependency]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.npm_
  - typings.awsSdk.awsSdkStrings.pypi
  - typings.awsSdk.awsSdkStrings.maven
  - typings.awsSdk.awsSdkStrings.nuget_
  - typings.awsSdk.awsSdkStrings.generic_
  - java.lang.String
*/
type PackageFormat = _PackageFormat | java.lang.String

type PackageName = java.lang.String

type PackageNamespace = java.lang.String

type PackageSummaryList = js.Array[PackageSummary]

type PackageVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALREADY_EXISTS
  - typings.awsSdk.awsSdkStrings.MISMATCHED_REVISION
  - typings.awsSdk.awsSdkStrings.MISMATCHED_STATUS
  - typings.awsSdk.awsSdkStrings.NOT_ALLOWED
  - typings.awsSdk.awsSdkStrings.NOT_FOUND
  - typings.awsSdk.awsSdkStrings.SKIPPED
  - java.lang.String
*/
type PackageVersionErrorCode = _PackageVersionErrorCode | java.lang.String

type PackageVersionErrorMap = StringDictionary[PackageVersionError]

type PackageVersionList = js.Array[PackageVersion]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INTERNAL
  - typings.awsSdk.awsSdkStrings.EXTERNAL
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type PackageVersionOriginType = _PackageVersionOriginType | java.lang.String

type PackageVersionRevision = java.lang.String

type PackageVersionRevisionMap = StringDictionary[PackageVersionRevision]

type PackageVersionSortType = PUBLISHED_TIME | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Published_
  - typings.awsSdk.awsSdkStrings.Unfinished
  - typings.awsSdk.awsSdkStrings.Unlisted
  - typings.awsSdk.awsSdkStrings.Archived_
  - typings.awsSdk.awsSdkStrings.Disposed
  - typings.awsSdk.awsSdkStrings.Deleted_
  - java.lang.String
*/
type PackageVersionStatus = _PackageVersionStatus | java.lang.String

type PackageVersionSummaryList = js.Array[PackageVersionSummary]

type PaginationToken = java.lang.String

type PolicyDocument = java.lang.String

type PolicyRevision = java.lang.String

type RepositoryExternalConnectionInfoList = js.Array[RepositoryExternalConnectionInfo]

type RepositoryName = java.lang.String

type RepositorySummaryList = js.Array[RepositorySummary]

type SHA256 = java.lang.String

type String = java.lang.String

type String255 = java.lang.String

type SuccessfulPackageVersionInfoMap = StringDictionary[SuccessfulPackageVersionInfo]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

type UpstreamRepositoryInfoList = js.Array[UpstreamRepositoryInfo]

type UpstreamRepositoryList = js.Array[UpstreamRepository]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-09-22`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
