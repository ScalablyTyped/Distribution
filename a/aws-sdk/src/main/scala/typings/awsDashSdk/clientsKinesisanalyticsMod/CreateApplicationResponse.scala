package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationResponse extends js.Object {
  /**
    * In response to your CreateApplication request, Amazon Kinesis Analytics returns a response with a summary of the application it created, including the application Amazon Resource Name (ARN), name, and status.
    */
  var ApplicationSummary: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationSummary
}

object CreateApplicationResponse {
  @scala.inline
  def apply(ApplicationSummary: ApplicationSummary): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationSummary = ApplicationSummary)
  
    __obj.asInstanceOf[CreateApplicationResponse]
  }
}

