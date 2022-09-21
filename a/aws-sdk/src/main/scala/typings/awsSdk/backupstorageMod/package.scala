package typings.awsSdk.backupstorageMod

import typings.awsSdk.awsSdkStrings.SHA256
import typings.awsSdk.awsSdkStrings.SUMMARY
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ChunkList = js.Array[Chunk]

type DataChecksumAlgorithm = SHA256 | String

type MaxResults = Double

type MetadataString = String

type ObjectList = js.Array[BackupObject]

type OptionalLong = Double

type PayloadBlob = Buffer | js.typedarray.Uint8Array | Blob | String | Readable

type SummaryChecksumAlgorithm = SUMMARY | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-04-10`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type long = Double

type timestamp = js.Date
