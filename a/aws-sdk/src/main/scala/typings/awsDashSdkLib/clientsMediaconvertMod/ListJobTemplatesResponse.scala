package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobTemplatesResponse extends js.Object {
  /**
    * List of Job templates.
    */
  var JobTemplates: js.UndefOr[__listOfJobTemplate] = js.undefined
  /**
    * Use this string to request the next batch of job templates.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListJobTemplatesResponse {
  @scala.inline
  def apply(JobTemplates: __listOfJobTemplate = null, NextToken: __string = null): ListJobTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    if (JobTemplates != null) __obj.updateDynamic("JobTemplates")(JobTemplates)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListJobTemplatesResponse]
  }
}

