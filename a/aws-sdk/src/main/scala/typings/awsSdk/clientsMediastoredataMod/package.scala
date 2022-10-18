package typings.awsSdk.clientsMediastoredataMod

import typings.awsSdk.awsSdkStrings.TEMPORAL
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ContentRangePattern = String

type ContentType = String

type ETag = String

type ItemList = js.Array[Item]

type ItemName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OBJECT
  - typings.awsSdk.awsSdkStrings.FOLDER
  - java.lang.String
*/
type ItemType = _ItemType | String

type ListLimit = Double

type ListPathNaming = String

type NonNegativeLong = Double

type PaginationToken = String

type PathNaming = String

type PayloadBlob = Buffer | js.typedarray.Uint8Array | Blob | String | Readable

type RangePattern = String

type SHA256Hash = String

type StorageClass = TEMPORAL | String

type StringPrimitive = String

type TimeStamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.STREAMING
  - java.lang.String
*/
type UploadAvailability = _UploadAvailability | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-09-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type statusCode = Double
