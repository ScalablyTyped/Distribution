package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  /**
    * The job arguments used when this trigger fires. For this job run, they replace the default arguments set in the job definition itself. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
    */
  var Arguments: js.UndefOr[GenericMap] = js.native
  /**
    * The name of the crawler to be used with this action.
    */
  var CrawlerName: js.UndefOr[NameString] = js.native
  /**
    * The name of a job to be executed.
    */
  var JobName: js.UndefOr[NameString] = js.native
  /**
    * Specifies configuration properties of a job run notification.
    */
  var NotificationProperty: js.UndefOr[typings.awsDashSdk.clientsGlueMod.NotificationProperty] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used with this action.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  /**
    * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout value set in the parent job.
    */
  var Timeout: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Timeout] = js.native
}

object Action {
  @scala.inline
  def apply(
    Arguments: GenericMap = null,
    CrawlerName: NameString = null,
    JobName: NameString = null,
    NotificationProperty: NotificationProperty = null,
    SecurityConfiguration: NameString = null,
    Timeout: Int | Double = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    if (Arguments != null) __obj.updateDynamic("Arguments")(Arguments.asInstanceOf[js.Any])
    if (CrawlerName != null) __obj.updateDynamic("CrawlerName")(CrawlerName.asInstanceOf[js.Any])
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    if (NotificationProperty != null) __obj.updateDynamic("NotificationProperty")(NotificationProperty.asInstanceOf[js.Any])
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration.asInstanceOf[js.Any])
    if (Timeout != null) __obj.updateDynamic("Timeout")(Timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

