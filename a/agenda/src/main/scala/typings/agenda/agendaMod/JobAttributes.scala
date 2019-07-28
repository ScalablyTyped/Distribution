package typings.agenda.agendaMod

import typings.mongodb.mongodbMod.ObjectID
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
  var _id: ObjectID
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
  def apply[T /* <: JobAttributesData */](
    _id: ObjectID,
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
    val __obj = js.Dynamic.literal(_id = _id, data = data.asInstanceOf[js.Any], disabled = disabled, failCount = failCount, failReason = failReason, failedAt = failedAt, lastFinishedAt = lastFinishedAt, lastModifiedBy = lastModifiedBy, lastRunAt = lastRunAt, lockedAt = lockedAt, name = name, nextRunAt = nextRunAt, priority = priority, repeatInterval = repeatInterval.asInstanceOf[js.Any], repeatTimezone = repeatTimezone)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JobAttributes[T]]
  }
}

