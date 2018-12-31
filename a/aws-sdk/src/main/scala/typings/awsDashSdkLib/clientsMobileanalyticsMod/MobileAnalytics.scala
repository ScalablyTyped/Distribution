package typings
package awsDashSdkLib.clientsMobileanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileAnalytics
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MobileAnalytics: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMobileanalyticsMod.MobileAnalyticsNs.ClientConfiguration = js.native
  /**
    * The PutEvents operation records one or more events. You can have up to 1,500 unique custom events per app, any combination of up to 40 attributes and metrics per custom event, and any number of attribute or metric values.
    */
  def putEvents(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putEvents(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The PutEvents operation records one or more events. You can have up to 1,500 unique custom events per app, any combination of up to 40 attributes and metrics per custom event, and any number of attribute or metric values.
    */
  def putEvents(params: awsDashSdkLib.clientsMobileanalyticsMod.MobileAnalyticsNs.PutEventsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putEvents(
    params: awsDashSdkLib.clientsMobileanalyticsMod.MobileAnalyticsNs.PutEventsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

