package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobProcessDetails extends js.Object {
  /**
    * The number of things that cancelled the job.
    */
  var numberOfCanceledThings: js.UndefOr[CanceledThings] = js.undefined
  /**
    * The number of things that failed executing the job.
    */
  var numberOfFailedThings: js.UndefOr[FailedThings] = js.undefined
  /**
    * The number of things currently executing the job.
    */
  var numberOfInProgressThings: js.UndefOr[InProgressThings] = js.undefined
  /**
    * The number of things that are awaiting execution of the job.
    */
  var numberOfQueuedThings: js.UndefOr[QueuedThings] = js.undefined
  /**
    * The number of things that rejected the job.
    */
  var numberOfRejectedThings: js.UndefOr[RejectedThings] = js.undefined
  /**
    * The number of things that are no longer scheduled to execute the job because they have been deleted or have been removed from the group that was a target of the job.
    */
  var numberOfRemovedThings: js.UndefOr[RemovedThings] = js.undefined
  /**
    * The number of things which successfully completed the job.
    */
  var numberOfSucceededThings: js.UndefOr[SucceededThings] = js.undefined
  /**
    * The number of things whose job execution status is TIMED_OUT.
    */
  var numberOfTimedOutThings: js.UndefOr[TimedOutThings] = js.undefined
  /**
    * The target devices to which the job execution is being rolled out. This value will be null after the job execution has finished rolling out to all the target devices.
    */
  var processingTargets: js.UndefOr[ProcessingTargetNameList] = js.undefined
}

object JobProcessDetails {
  @scala.inline
  def apply(
    numberOfCanceledThings: Int | Double = null,
    numberOfFailedThings: Int | Double = null,
    numberOfInProgressThings: Int | Double = null,
    numberOfQueuedThings: Int | Double = null,
    numberOfRejectedThings: Int | Double = null,
    numberOfRemovedThings: Int | Double = null,
    numberOfSucceededThings: Int | Double = null,
    numberOfTimedOutThings: Int | Double = null,
    processingTargets: ProcessingTargetNameList = null
  ): JobProcessDetails = {
    val __obj = js.Dynamic.literal()
    if (numberOfCanceledThings != null) __obj.updateDynamic("numberOfCanceledThings")(numberOfCanceledThings.asInstanceOf[js.Any])
    if (numberOfFailedThings != null) __obj.updateDynamic("numberOfFailedThings")(numberOfFailedThings.asInstanceOf[js.Any])
    if (numberOfInProgressThings != null) __obj.updateDynamic("numberOfInProgressThings")(numberOfInProgressThings.asInstanceOf[js.Any])
    if (numberOfQueuedThings != null) __obj.updateDynamic("numberOfQueuedThings")(numberOfQueuedThings.asInstanceOf[js.Any])
    if (numberOfRejectedThings != null) __obj.updateDynamic("numberOfRejectedThings")(numberOfRejectedThings.asInstanceOf[js.Any])
    if (numberOfRemovedThings != null) __obj.updateDynamic("numberOfRemovedThings")(numberOfRemovedThings.asInstanceOf[js.Any])
    if (numberOfSucceededThings != null) __obj.updateDynamic("numberOfSucceededThings")(numberOfSucceededThings.asInstanceOf[js.Any])
    if (numberOfTimedOutThings != null) __obj.updateDynamic("numberOfTimedOutThings")(numberOfTimedOutThings.asInstanceOf[js.Any])
    if (processingTargets != null) __obj.updateDynamic("processingTargets")(processingTargets)
    __obj.asInstanceOf[JobProcessDetails]
  }
}

