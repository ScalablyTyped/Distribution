package typings.awsDashSdk.clientsPersonalizeeventsMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonalizeEvents extends Service {
  @JSName("config")
  var config_PersonalizeEvents: ConfigBase with ClientConfiguration = js.native
  /**
    * Records user interaction event data.
    */
  def putEvents(): Request[js.Object, AWSError] = js.native
  def putEvents(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Records user interaction event data.
    */
  def putEvents(params: PutEventsRequest): Request[js.Object, AWSError] = js.native
  def putEvents(params: PutEventsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
}

