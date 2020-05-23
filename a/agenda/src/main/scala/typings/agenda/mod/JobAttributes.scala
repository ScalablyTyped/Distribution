package typings.agenda.mod

import typings.mongodb.mod.ObjectID_
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The database record associated with a job.
  */
trait JobAttributes[T /* <: JobAttributesData */] extends js.Object {
  /**
    * The record identity.
    */
  var _id: ObjectID_
  /**
    * The job details.
    */
  var data: T
  /**
    * Job's state
    */
  var disabled: Boolean
  /**
    * The number of times the job has failed.
    */
  var failCount: Double
  /**
    * The reason the job failed.
    */
  var failReason: String
  /**
    * The date/time the job last failed.
    */
  var failedAt: Date
  /**
    * Date/time the job last finished running.
    */
  var lastFinishedAt: Date
  /**
    * Date/time the job was las modified.
    */
  var lastModifiedBy: String
  /**
    * Date/time the job was last run.
    */
  var lastRunAt: Date
  /**
    * Date/time the job was locked.
    */
  var lockedAt: Date
  /**
    * The name of the job.
    */
  var name: String
  /**
    * Date/time the job will run next.
    */
  var nextRunAt: Date
  /**
    * The priority of the job.
    */
  var priority: Double
  /**
    * How often the job is repeated using a human-readable or cron format.
    */
  var repeatInterval: String | Double
  /**
    * The timezone that conforms to [moment-timezone](http://momentjs.com/timezone/).
    */
  var repeatTimezone: String
  /**
    * The type of the job (single|normal).
    */
  var `type`: String
}

object JobAttributes {
  @scala.inline
  def apply[T](
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
}

