package typings.agenda.mod

import typings.mongodb.mod.ObjectID_
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The database record associated with a job.
  */
@js.native
trait JobAttributes[T /* <: JobAttributesData */] extends js.Object {
  /**
    * The record identity.
    */
  var _id: ObjectID_ = js.native
  /**
    * The job details.
    */
  var data: T = js.native
  /**
    * Job's state
    */
  var disabled: Boolean = js.native
  /**
    * The number of times the job has failed.
    */
  var failCount: Double = js.native
  /**
    * The reason the job failed.
    */
  var failReason: String = js.native
  /**
    * The date/time the job last failed.
    */
  var failedAt: Date = js.native
  /**
    * Date/time the job last finished running.
    */
  var lastFinishedAt: Date = js.native
  /**
    * Date/time the job was las modified.
    */
  var lastModifiedBy: String = js.native
  /**
    * Date/time the job was last run.
    */
  var lastRunAt: Date = js.native
  /**
    * Date/time the job was locked.
    */
  var lockedAt: Date = js.native
  /**
    * The name of the job.
    */
  var name: String = js.native
  /**
    * Date/time the job will run next.
    */
  var nextRunAt: Date = js.native
  /**
    * The priority of the job.
    */
  var priority: Double = js.native
  /**
    * How often the job is repeated using a human-readable or cron format.
    */
  var repeatInterval: String | Double = js.native
  /**
    * The timezone that conforms to [moment-timezone](http://momentjs.com/timezone/).
    */
  var repeatTimezone: String = js.native
  /**
    * The type of the job (single|normal).
    */
  var `type`: String = js.native
}

object JobAttributes {
  @scala.inline
  def apply[/* <: typings.agenda.mod.JobAttributesData */ T](
    _id: ObjectID_,
    data: T,
    disabled: Boolean,
    failCount: Double,
    failReason: String,
    failedAt: Date,
    lastFinishedAt: Date,
    lastModifiedBy: String,
    lastRunAt: Date,
    lockedAt: Date,
    name: String,
    nextRunAt: Date,
    priority: Double,
    repeatInterval: String | Double,
    repeatTimezone: String,
    `type`: String
  ): JobAttributes[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], failCount = failCount.asInstanceOf[js.Any], failReason = failReason.asInstanceOf[js.Any], failedAt = failedAt.asInstanceOf[js.Any], lastFinishedAt = lastFinishedAt.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastRunAt = lastRunAt.asInstanceOf[js.Any], lockedAt = lockedAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextRunAt = nextRunAt.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], repeatInterval = repeatInterval.asInstanceOf[js.Any], repeatTimezone = repeatTimezone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobAttributes[T]]
  }
  @scala.inline
  implicit class JobAttributesOps[Self <: JobAttributes[_], /* <: typings.agenda.mod.JobAttributesData */ T] (val x: Self with JobAttributes[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_id(value: ObjectID_): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailCount(value: Double): Self = this.set("failCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailReason(value: String): Self = this.set("failReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailedAt(value: Date): Self = this.set("failedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastFinishedAt(value: Date): Self = this.set("lastFinishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedBy(value: String): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastRunAt(value: Date): Self = this.set("lastRunAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockedAt(value: Date): Self = this.set("lockedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextRunAt(value: Date): Self = this.set("nextRunAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeatInterval(value: String | Double): Self = this.set("repeatInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeatTimezone(value: String): Self = this.set("repeatTimezone", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

