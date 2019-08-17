package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIot1clickprojectsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AttributeDefaultValue = String
  type AttributeName = String
  type AttributeValue = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DefaultPlacementAttributeMap = StringDictionary[AttributeDefaultValue]
  type Description = String
  type DeviceCallbackKey = String
  type DeviceCallbackOverrideMap = StringDictionary[DeviceCallbackValue]
  type DeviceCallbackValue = String
  type DeviceId = String
  type DeviceMap = StringDictionary[DeviceId]
  type DeviceTemplateMap = StringDictionary[DeviceTemplate]
  type DeviceTemplateName = String
  type DeviceType = String
  type MaxResults = Double
  type NextToken = String
  type PlacementAttributeMap = StringDictionary[AttributeValue]
  type PlacementName = String
  type PlacementSummaryList = js.Array[PlacementSummary]
  type ProjectArn = String
  type ProjectName = String
  type ProjectSummaryList = js.Array[ProjectSummary]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = String
  type Time = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-05-14`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
