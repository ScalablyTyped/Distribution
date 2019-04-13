package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApplicationsResponse extends js.Object {
  /**
    * List of ApplicationSummary objects. 
    */
  var ApplicationSummaries: awsDashSdkLib.clientsKinesisanalyticsMod.ApplicationSummaries
  /**
    * Returns true if there are more applications to retrieve.
    */
  var HasMoreApplications: BooleanObject
}

object ListApplicationsResponse {
  @scala.inline
  def apply(ApplicationSummaries: ApplicationSummaries, HasMoreApplications: BooleanObject): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSummaries = ApplicationSummaries, HasMoreApplications = HasMoreApplications)
  
    __obj.asInstanceOf[ListApplicationsResponse]
  }
}

