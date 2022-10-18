package typings.awsSdk.clientsIotdataMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type JsonDocument = Buffer | js.typedarray.Uint8Array | Blob | String

type MaxResults = Double

type NamedShadowList = js.Array[ShadowName]

type NextToken = String

type PageSize = Double

type Payload = Buffer | js.typedarray.Uint8Array | Blob | String

type PayloadSize = Double

type Qos = Double

type Retain = Boolean

type RetainedMessageList = js.Array[RetainedMessageSummary]

type ShadowName = String

type ThingName = String

type Timestamp = Double

type Topic = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-05-28`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
