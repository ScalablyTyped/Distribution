package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeApplicationsMessage extends js.Object {
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to only include those with the specified names.
    */
  var ApplicationNames: js.UndefOr[ApplicationNamesList] = js.undefined
}

object DescribeApplicationsMessage {
  @scala.inline
  def apply(ApplicationNames: ApplicationNamesList = null): DescribeApplicationsMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationNames != null) __obj.updateDynamic("ApplicationNames")(ApplicationNames)
    __obj.asInstanceOf[DescribeApplicationsMessage]
  }
}

