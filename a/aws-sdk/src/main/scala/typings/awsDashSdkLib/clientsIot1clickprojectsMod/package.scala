package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIot1clickprojectsMod {
  type AttributeDefaultValue = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DefaultPlacementAttributeMap = org.scalablytyped.runtime.StringDictionary[AttributeDefaultValue]
  type Description = java.lang.String
  type DeviceCallbackKey = java.lang.String
  type DeviceCallbackOverrideMap = org.scalablytyped.runtime.StringDictionary[DeviceCallbackValue]
  type DeviceCallbackValue = java.lang.String
  type DeviceId = java.lang.String
  type DeviceMap = org.scalablytyped.runtime.StringDictionary[DeviceId]
  type DeviceTemplateMap = org.scalablytyped.runtime.StringDictionary[DeviceTemplate]
  type DeviceTemplateName = java.lang.String
  type DeviceType = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type PlacementAttributeMap = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type PlacementName = java.lang.String
  type PlacementSummaryList = js.Array[PlacementSummary]
  type ProjectArn = java.lang.String
  type ProjectName = java.lang.String
  type ProjectSummaryList = js.Array[ProjectSummary]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[TagValue]
  type TagValue = java.lang.String
  type Time = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-05-14`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
