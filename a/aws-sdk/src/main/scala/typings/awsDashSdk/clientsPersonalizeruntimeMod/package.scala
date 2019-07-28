package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPersonalizeruntimeMod {
  type Arn = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type InputList = js.Array[ItemID]
  type ItemID = String
  type ItemList = js.Array[PredictedItem]
  type NumResults = Double
  type UserID = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-05-22`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
