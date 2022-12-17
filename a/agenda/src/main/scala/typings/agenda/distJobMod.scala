package typings.agenda

import org.scalablytyped.runtime.StringDictionary
import typings.agenda.anon.Id
import typings.agenda.anon.InsertOnly
import typings.agenda.anon.PartialJobAttributesJobAt
import typings.agenda.distAgendaMod.Agenda
import typings.agenda.distJobRepeatEveryMod.JobOptions
import typings.mongodb.mod.ObjectId
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJobMod {
  
  /**
    * @class
    * @param {Object} args - Job Options
    * @property {Object} agenda - The Agenda instance
    * @property {Object} attrs
    */
  @JSImport("agenda/dist/job", "Job")
  @js.native
  open class Job[T /* <: JobAttributesData */] protected () extends StObject {
    def this(options: Modify[JobAttributes[T], Id]) = this()
    
    /**
      * The agenda that created the job.
      */
    var agenda: Agenda = js.native
    
    /**
      * The database record associated with the job.
      */
    var attrs: JobAttributes[T] = js.native
    
    def computeNextRunAt(): Job[JobAttributesData] = js.native
    @JSName("computeNextRunAt")
    var computeNextRunAt_Original: js.ThisFunction0[/* this */ Job[JobAttributesData], Job[JobAttributesData]] = js.native
    
    def disable(): Job[JobAttributesData] = js.native
    @JSName("disable")
    var disable_Original: js.ThisFunction0[/* this */ Job[JobAttributesData], Job[JobAttributesData]] = js.native
    
    def enable(): Job[JobAttributesData] = js.native
    @JSName("enable")
    var enable_Original: js.ThisFunction0[/* this */ Job[JobAttributesData], Job[JobAttributesData]] = js.native
    
    def fail(reason: String): Job[JobAttributesData] = js.native
    def fail(reason: js.Error): Job[JobAttributesData] = js.native
    @JSName("fail")
    var fail_Original: js.ThisFunction1[
        /* this */ Job[JobAttributesData], 
        /* reason */ String | js.Error, 
        Job[JobAttributesData]
      ] = js.native
    
    def isRunning(): Boolean = js.native
    @JSName("isRunning")
    var isRunning_Original: js.ThisFunction0[/* this */ Job[JobAttributesData], Boolean] = js.native
    
    def priority(priority: String): Job[JobAttributesData] = js.native
    @JSName("priority")
    var priority_Original: js.ThisFunction1[/* this */ Job[JobAttributesData], /* priority */ String, Job[JobAttributesData]] = js.native
    
    def remove(): js.Promise[js.UndefOr[Double]] = js.native
    @JSName("remove")
    var remove_Original: js.ThisFunction0[/* this */ Job[JobAttributesData], js.Promise[js.UndefOr[Double]]] = js.native
    
    def repeatAt(time: String): Job[JobAttributesData] = js.native
    @JSName("repeatAt")
    var repeatAt_Original: js.ThisFunction1[/* this */ Job[JobAttributesData], /* time */ String, Job[JobAttributesData]] = js.native
    
    def repeatEvery(interval: String): Job[JobAttributesData] = js.native
    def repeatEvery(interval: String, options: JobOptions): Job[JobAttributesData] = js.native
    @JSName("repeatEvery")
    var repeatEvery_Original: js.ThisFunction2[
        /* this */ Job[JobAttributesData], 
        /* interval */ String, 
        /* options */ js.UndefOr[JobOptions], 
        Job[JobAttributesData]
      ] = js.native
    
    def run(): js.Promise[Job[JobAttributesData]] = js.native
    @JSName("run")
    var run_Original: js.ThisFunction0[/* this */ Job[JobAttributesData], js.Promise[Job[JobAttributesData]]] = js.native
    
    def save(): js.Promise[Job[JobAttributesData]] = js.native
    @JSName("save")
    var save_Original: js.ThisFunction0[/* this */ Job[JobAttributesData], js.Promise[Job[JobAttributesData]]] = js.native
    
    def schedule(time: String): Job[JobAttributesData] = js.native
    def schedule(time: js.Date): Job[JobAttributesData] = js.native
    @JSName("schedule")
    var schedule_Original: js.ThisFunction1[
        /* this */ Job[JobAttributesData], 
        /* time */ String | js.Date, 
        Job[JobAttributesData]
      ] = js.native
    
    def setShouldSaveResult(shouldSaveResult: Boolean): Job[JobAttributesData] = js.native
    @JSName("setShouldSaveResult")
    var setShouldSaveResult_Original: js.ThisFunction1[
        /* this */ Job[JobAttributesData], 
        /* shouldSaveResult */ Boolean, 
        Job[JobAttributesData]
      ] = js.native
    
    def toJSON(): PartialJobAttributesJobAt = js.native
    @JSName("toJSON")
    var toJSON_Original: js.ThisFunction0[/* this */ Job[JobAttributesData], PartialJobAttributesJobAt] = js.native
    
    def touch(): js.Promise[Job[JobAttributesData]] = js.native
    @JSName("touch")
    var touch_Original: js.ThisFunction0[/* this */ Job[JobAttributesData], js.Promise[Job[JobAttributesData]]] = js.native
    
    def unique(unique: Any): Job[JobAttributesData] = js.native
    def unique(unique: Any, options: InsertOnly): Job[JobAttributesData] = js.native
    @JSName("unique")
    var unique_Original: js.ThisFunction2[
        /* this */ Job[JobAttributesData], 
        /* unique */ Any, 
        /* options */ js.UndefOr[InsertOnly], 
        Job[JobAttributesData]
      ] = js.native
  }
  
  trait JobAttributes[T /* <: JobAttributesData */] extends StObject {
    
    /**
      * The record identity.
      */
    var _id: ObjectId
    
    var agenda: Agenda
    
    /**
      * The job details.
      */
    var data: T
    
    /**
      * Job's state
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var endDate: js.UndefOr[js.Date | Double | Null] = js.undefined
    
    /**
      * The number of times the job has failed.
      */
    var failCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The reason the job failed.
      */
    var failReason: js.UndefOr[String] = js.undefined
    
    /**
      * The date/time the job last failed.
      */
    var failedAt: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Date/time the job last finished running.
      */
    var lastFinishedAt: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Date/time the job was last modified.
      */
    var lastModifiedBy: js.UndefOr[String] = js.undefined
    
    /**
      * Date/time the job was last run.
      */
    var lastRunAt: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Date/time the job was locked.
      */
    var lockedAt: js.UndefOr[js.Date | Null] = js.undefined
    
    /**
      * The name of the job.
      */
    var name: String
    
    /**
      * Date/time the job will run next.
      */
    var nextRunAt: js.UndefOr[js.Date | Null] = js.undefined
    
    /**
      * The priority of the job.
      */
    var priority: Double | String
    
    var repeatAt: js.UndefOr[String] = js.undefined
    
    /**
      * How often the job is repeated using a human-readable or cron format.
      */
    var repeatInterval: js.UndefOr[String] = js.undefined
    
    /**
      * The timezone that conforms to [moment-timezone](http://momentjs.com/timezone/).
      */
    var repeatTimezone: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Result of the finished job.
      */
    var result: js.UndefOr[Any] = js.undefined
    
    /**
      * Should the return value of the job be persisted.
      */
    var shouldSaveResult: js.UndefOr[Boolean] = js.undefined
    
    var skipDays: js.UndefOr[String | Null] = js.undefined
    
    var startDate: js.UndefOr[js.Date | Double | Null] = js.undefined
    
    /**
      * The type of the job (single|normal).
      */
    var `type`: String
    
    var unique: js.UndefOr[Any] = js.undefined
    
    var uniqueOpts: js.UndefOr[InsertOnly] = js.undefined
  }
  object JobAttributes {
    
    inline def apply[T /* <: JobAttributesData */](_id: ObjectId, agenda: Agenda, data: T, name: String, priority: Double | String, `type`: String): JobAttributes[T] = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], agenda = agenda.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobAttributes[T]]
    }
    
    extension [Self <: JobAttributes[?], T /* <: JobAttributesData */](x: Self & JobAttributes[T]) {
      
      inline def setAgenda(value: Agenda): Self = StObject.set(x, "agenda", value.asInstanceOf[js.Any])
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndDate(value: js.Date | Double): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setFailCount(value: Double): Self = StObject.set(x, "failCount", value.asInstanceOf[js.Any])
      
      inline def setFailCountUndefined: Self = StObject.set(x, "failCount", js.undefined)
      
      inline def setFailReason(value: String): Self = StObject.set(x, "failReason", value.asInstanceOf[js.Any])
      
      inline def setFailReasonUndefined: Self = StObject.set(x, "failReason", js.undefined)
      
      inline def setFailedAt(value: js.Date): Self = StObject.set(x, "failedAt", value.asInstanceOf[js.Any])
      
      inline def setFailedAtUndefined: Self = StObject.set(x, "failedAt", js.undefined)
      
      inline def setLastFinishedAt(value: js.Date): Self = StObject.set(x, "lastFinishedAt", value.asInstanceOf[js.Any])
      
      inline def setLastFinishedAtUndefined: Self = StObject.set(x, "lastFinishedAt", js.undefined)
      
      inline def setLastModifiedBy(value: String): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
      
      inline def setLastRunAt(value: js.Date): Self = StObject.set(x, "lastRunAt", value.asInstanceOf[js.Any])
      
      inline def setLastRunAtUndefined: Self = StObject.set(x, "lastRunAt", js.undefined)
      
      inline def setLockedAt(value: js.Date): Self = StObject.set(x, "lockedAt", value.asInstanceOf[js.Any])
      
      inline def setLockedAtNull: Self = StObject.set(x, "lockedAt", null)
      
      inline def setLockedAtUndefined: Self = StObject.set(x, "lockedAt", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNextRunAt(value: js.Date): Self = StObject.set(x, "nextRunAt", value.asInstanceOf[js.Any])
      
      inline def setNextRunAtNull: Self = StObject.set(x, "nextRunAt", null)
      
      inline def setNextRunAtUndefined: Self = StObject.set(x, "nextRunAt", js.undefined)
      
      inline def setPriority(value: Double | String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setRepeatAt(value: String): Self = StObject.set(x, "repeatAt", value.asInstanceOf[js.Any])
      
      inline def setRepeatAtUndefined: Self = StObject.set(x, "repeatAt", js.undefined)
      
      inline def setRepeatInterval(value: String): Self = StObject.set(x, "repeatInterval", value.asInstanceOf[js.Any])
      
      inline def setRepeatIntervalUndefined: Self = StObject.set(x, "repeatInterval", js.undefined)
      
      inline def setRepeatTimezone(value: String): Self = StObject.set(x, "repeatTimezone", value.asInstanceOf[js.Any])
      
      inline def setRepeatTimezoneNull: Self = StObject.set(x, "repeatTimezone", null)
      
      inline def setRepeatTimezoneUndefined: Self = StObject.set(x, "repeatTimezone", js.undefined)
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setShouldSaveResult(value: Boolean): Self = StObject.set(x, "shouldSaveResult", value.asInstanceOf[js.Any])
      
      inline def setShouldSaveResultUndefined: Self = StObject.set(x, "shouldSaveResult", js.undefined)
      
      inline def setSkipDays(value: String): Self = StObject.set(x, "skipDays", value.asInstanceOf[js.Any])
      
      inline def setSkipDaysNull: Self = StObject.set(x, "skipDays", null)
      
      inline def setSkipDaysUndefined: Self = StObject.set(x, "skipDays", js.undefined)
      
      inline def setStartDate(value: js.Date | Double): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: Any): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueOpts(value: InsertOnly): Self = StObject.set(x, "uniqueOpts", value.asInstanceOf[js.Any])
      
      inline def setUniqueOptsUndefined: Self = StObject.set(x, "uniqueOpts", js.undefined)
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      
      inline def set_id(value: ObjectId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  type JobAttributesData = StringDictionary[Any]
  
  type Modify[T, R] = (Omit[T, /* keyof R */ String]) & R
}
