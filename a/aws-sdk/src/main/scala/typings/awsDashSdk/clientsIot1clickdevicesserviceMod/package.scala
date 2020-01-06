package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIot1clickdevicesserviceMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DeviceAttributes = StringDictionary[__string]
  type MaxResults = Double
  type __boolean = Boolean
  type __doubleMin0Max100 = Double
  type __integer = Double
  type __listOfDeviceDescription = js.Array[DeviceDescription]
  type __listOfDeviceEvent = js.Array[DeviceEvent]
  type __listOfDeviceMethod = js.Array[DeviceMethod]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = StringDictionary[__string]
  type __string = String
  type __stringMin12Max40 = String
  type __timestampIso8601 = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-05-14`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
