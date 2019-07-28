package typings.awsDashSdk.clientsMobileanalyticsMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileAnalytics extends Service {
  @JSName("config")
  var config_MobileAnalytics: ConfigBase with ClientConfiguration = js.native
  /**
    * The PutEvents operation records one or more events. You can have up to 1,500 unique custom events per app, any combination of up to 40 attributes and metrics per custom event, and any number of attribute or metric values.
    */
  def putEvents(): Request[js.Object, AWSError] = js.native
  def putEvents(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * The PutEvents operation records one or more events. You can have up to 1,500 unique custom events per app, any combination of up to 40 attributes and metrics per custom event, and any number of attribute or metric values.
    */
  def putEvents(params: PutEventsInput): Request[js.Object, AWSError] = js.native
  def putEvents(params: PutEventsInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
}

