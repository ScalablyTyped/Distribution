package typings
package agendaLib.agendaMod

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
  var _id: mongodbLib.mongodbMod.ObjectID
  /**
    * The job details.
    */
  var data: T
  /**
    * Job's state
    */
  var disabled: scala.Boolean
  /**
    * The number of times the job has failed.
    */
  var failCount: scala.Double
  /**
    * The reason the job failed.
    */
  var failReason: java.lang.String
  /**
    * The date/time the job last failed.
    */
  var failedAt: stdLib.Date
  /**
    * Date/time the job last finished running.
    */
  var lastFinishedAt: stdLib.Date
  /**
    * Date/time the job was las modified.
    */
  var lastModifiedBy: java.lang.String
  /**
    * Date/time the job was last run.
    */
  var lastRunAt: stdLib.Date
  /**
    * Date/time the job was locked.
    */
  var lockedAt: stdLib.Date
  /**
    * The name of the job.
    */
  var name: java.lang.String
  /**
    * Date/time the job will run next.
    */
  var nextRunAt: stdLib.Date
  /**
    * The priority of the job.
    */
  var priority: scala.Double
  /**
    * How often the job is repeated using a human-readable or cron format.
    */
  var repeatInterval: java.lang.String | scala.Double
  /**
    * The timezone that conforms to [moment-timezone](http://momentjs.com/timezone/).
    */
  var repeatTimezone: java.lang.String
  /**
    * The type of the job (single|normal).
    */
  var `type`: java.lang.String
}

object JobAttributes {
  @scala.inline
  def apply[T /* <: JobAttributesData */](
    _id: mongodbLib.mongodbMod.ObjectID,
    data: T,
    disabled: scala.Boolean,
    failCount: scala.Double,
    failReason: java.lang.String,
    failedAt: stdLib.Date,
    lastFinishedAt: stdLib.Date,
    lastModifiedBy: java.lang.String,
    lastRunAt: stdLib.Date,
    lockedAt: stdLib.Date,
    name: java.lang.String,
    nextRunAt: stdLib.Date,
    priority: scala.Double,
    repeatInterval: java.lang.String | scala.Double,
    repeatTimezone: java.lang.String,
    `type`: java.lang.String
  ): JobAttributes[T] = {
    val __obj = js.Dynamic.literal(_id = _id, data = data.asInstanceOf[js.Any], disabled = disabled, failCount = failCount, failReason = failReason, failedAt = failedAt, lastFinishedAt = lastFinishedAt, lastModifiedBy = lastModifiedBy, lastRunAt = lastRunAt, lockedAt = lockedAt, name = name, nextRunAt = nextRunAt, priority = priority, repeatInterval = repeatInterval.asInstanceOf[js.Any], repeatTimezone = repeatTimezone)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JobAttributes[T]]
  }
}

