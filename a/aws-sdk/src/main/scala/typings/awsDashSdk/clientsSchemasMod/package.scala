package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSchemasMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.OpenApi3
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type Body = Buffer | Uint8Array | Blob | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - java.lang.String
  */
  type CodeGenerationStatus = _CodeGenerationStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STARTED
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - java.lang.String
  */
  type DiscovererState = _DiscovererState | String
  type GetDiscoveredSchemaVersionItemInput = String
  type Tags = StringDictionary[__string]
  type Type = OpenApi3 | String
  type __boolean = Boolean
  type __integer = Double
  type __integerMin1Max29000 = Double
  type __listOfDiscovererSummary = js.Array[DiscovererSummary]
  type __listOfGetDiscoveredSchemaVersionItemInput = js.Array[GetDiscoveredSchemaVersionItemInput]
  type __listOfRegistrySummary = js.Array[RegistrySummary]
  type __listOfSchemaSummary = js.Array[SchemaSummary]
  type __listOfSchemaVersionSummary = js.Array[SchemaVersionSummary]
  type __listOfSearchSchemaSummary = js.Array[SearchSchemaSummary]
  type __listOfSearchSchemaVersionSummary = js.Array[SearchSchemaVersionSummary]
  type __listOf__string = js.Array[__string]
  type __long = Double
  type __string = String
  type __stringMin0Max256 = String
  type __stringMin0Max36 = String
  type __stringMin1Max100000 = String
  type __stringMin1Max1600 = String
  type __stringMin20Max1600 = String
  type __timestampIso8601 = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-12-02`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
