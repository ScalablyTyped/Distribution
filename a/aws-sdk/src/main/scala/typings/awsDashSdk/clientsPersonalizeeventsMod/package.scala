package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPersonalizeeventsMod {
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type EventList = js.Array[Event]
  type EventPropertiesJSON = String
  type StringType = String
  type UserId = String
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-03-22`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
