package typings.agenda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobOptions extends js.Object {
  /**
    * Maximum number of that job that can be running at once (per instance of agenda)
    */
  var concurrency: js.UndefOr[Double] = js.native
  /**
    * Interval in ms of how long the job stays locked for (see multiple job processors for more info). A job will
    * automatically unlock if done() is called.
    */
  var lockLifetime: js.UndefOr[Double] = js.native
  /**
    * Maximum number of that job that can be locked at once (per instance of agenda)
    */
  var lockLimit: js.UndefOr[Double] = js.native
  /**
    * (lowest|low|normal|high|highest|number) specifies the priority of the job. Higher priority jobs will run
    * first.
    */
  var priority: js.UndefOr[String | Double] = js.native
}

object JobOptions {
  @scala.inline
  def apply(): JobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobOptions]
  }
  @scala.inline
  implicit class JobOptionsOps[Self <: JobOptions] (val x: Self) extends AnyVal {
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
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    @scala.inline
    def setLockLifetime(value: Double): Self = this.set("lockLifetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockLifetime: Self = this.set("lockLifetime", js.undefined)
    @scala.inline
    def setLockLimit(value: Double): Self = this.set("lockLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockLimit: Self = this.set("lockLimit", js.undefined)
    @scala.inline
    def setPriority(value: String | Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
  
}

