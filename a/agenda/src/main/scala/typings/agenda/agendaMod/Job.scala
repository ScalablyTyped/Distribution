package typings.agenda.agendaMod

import typings.agenda.Anon_InsertOnly
import typings.agenda.Anon_SkipImmediate
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A scheduled job.
  */
@js.native
trait Job[T /* <: JobAttributesData */] extends js.Object {
  /**
    * The agenda that created the job.
    */
  var agenda: Agenda = js.native
  /**
    * The database record associated with the job.
    */
  var attrs: JobAttributes[T] = js.native
  /**
    * Calculates next time the job should run
    */
  def computeNextRunAt(): this.type = js.native
  /**
    * Disables the job.
    */
  def disable(): this.type = js.native
  /**
    * Enables the job.
    */
  def enable(): this.type = js.native
  /**
    * Sets job.attrs.failedAt to now, and sets job.attrs.failReason to reason.
    * @param reason A message or Error object that indicates why the job failed.
    */
  def fail(reason: String): this.type = js.native
  def fail(reason: Error): this.type = js.native
  /**
    * Returns true if the job is running; otherwise, returns false.
    */
  def isRunning(): Boolean = js.native
  /**
    * Specifies the priority weighting of the job.
    * @param value The priority of the job (lowest|low|normal|high|highest|number).
    */
  def priority(value: String): this.type = js.native
  def priority(value: Double): this.type = js.native
  /**
    * Removes the job from the database and cancels the job.
    */
  def remove(): js.Promise[Unit] = js.native
  /**
    * Specifies a time when the job should repeat. [Possible values](https://github.com/matthewmueller/date#examples).
    * @param time
    */
  def repeatAt(time: String): this.type = js.native
  /**
    * Specifies an interval on which the job should repeat.
    * @param interval A human-readable format String, a cron format String, or a Number.
    * @param options An optional argument that can include a timezone field or skipImmediate field.
    * The timezone should be a string as accepted by moment-timezone and is considered when using an interval in the cron string format.
    * Setting skipImmediate as true will skip the immediate run. The first run will occur only in configured interval.
    */
  def repeatEvery(interval: String): this.type = js.native
  def repeatEvery(interval: String, options: Anon_SkipImmediate): this.type = js.native
  def repeatEvery(interval: Double): this.type = js.native
  def repeatEvery(interval: Double, options: Anon_SkipImmediate): this.type = js.native
  /**
    * Runs the given job and calls callback(err, job) upon completion. Normally you never need to call this manually
    */
  def run(): js.Promise[this.type] = js.native
  /**
    * Saves the job into the database.
    */
  def save(): js.Promise[this.type] = js.native
  /**
    * Specifies the next time at which the job should run.
    * @param time The next time at which the job should run.
    */
  def schedule(time: String): this.type = js.native
  def schedule(time: Date): this.type = js.native
  /**
    * Resets the lock on the job. Useful to indicate that the job hasn't timed out when you have very long running
    * jobs.
    */
  def touch(): js.Promise[this.type] = js.native
  /**
    * Ensure that only one instance of this job exists with the specified properties
    * @param value The properties associated with the job that must be unqiue.
    * @param opts
    */
  def unique(value: js.Any): this.type = js.native
  def unique(value: js.Any, opts: Anon_InsertOnly): this.type = js.native
}

