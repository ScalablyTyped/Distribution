package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationResponse extends js.Object {
  /**
    * In response to your CreateApplication request, Kinesis Data Analytics returns a response with details of the application it created.
    */
  var ApplicationDetail: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ApplicationDetail
}

object CreateApplicationResponse {
  @scala.inline
  def apply(ApplicationDetail: ApplicationDetail): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationDetail = ApplicationDetail)
  
    __obj.asInstanceOf[CreateApplicationResponse]
  }
}

