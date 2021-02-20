package typings.agenda

import org.scalablytyped.runtime.StringDictionary
import typings.agenda.anon.Address
import typings.agenda.anon.InsertOnly
import typings.agenda.anon.SkipImmediate
import typings.mongodb.mod.Collection
import typings.mongodb.mod.Db
import typings.mongodb.mod.DefaultSchema
import typings.mongodb.mod.ObjectID_
import typings.node.eventsMod.EventEmitter
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("agenda", JSImport.Namespace)
  @js.native
  /**
    * Constructs a new Agenda object.
    * @param config Optional configuration to initialize the Agenda.
    * @param cb Optional callback called with the MongoDB colleciton.
    */
  class ^ () extends Agenda {
    def this(config: AgendaConfiguration) = this()
    def this(config: js.UndefOr[scala.Nothing], cb: ResultCallback[Collection[DefaultSchema]]) = this()
    def this(config: AgendaConfiguration, cb: ResultCallback[Collection[DefaultSchema]]) = this()
  }
  
  @js.native
  trait Agenda extends EventEmitter {
    
    /**
      * Cancels any jobs matching the passed mongodb-native query, and removes them from the database.
      * @param query Mongodb native query.
      */
    def cancel(query: js.Any): js.Promise[Double] = js.native
    
    /**
      * Returns an instance of a jobName with data. This does NOT save the job in the database. See below to learn
      * how to manually work with jobs.
      * @param name The name of the job.
      * @param data Data to associated with the job.
      */
    def create[T /* <: JobAttributesData */](name: String): Job[T] = js.native
    def create[T /* <: JobAttributesData */](name: String, data: T): Job[T] = js.native
    
    /**
      * Connect to the specified MongoDB server and database.
      */
    def database(url: String): this.type = js.native
    def database(
      url: String,
      collection: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      cb: ResultCallback[Collection[DefaultSchema]]
    ): this.type = js.native
    def database(url: String, collection: js.UndefOr[scala.Nothing], options: js.Any): this.type = js.native
    def database(
      url: String,
      collection: js.UndefOr[scala.Nothing],
      options: js.Any,
      cb: ResultCallback[Collection[DefaultSchema]]
    ): this.type = js.native
    def database(url: String, collection: String): this.type = js.native
    def database(
      url: String,
      collection: String,
      options: js.UndefOr[scala.Nothing],
      cb: ResultCallback[Collection[DefaultSchema]]
    ): this.type = js.native
    def database(url: String, collection: String, options: js.Any): this.type = js.native
    def database(url: String, collection: String, options: js.Any, cb: ResultCallback[Collection[DefaultSchema]]): this.type = js.native
    
    /**
      * Takes a number which specifies the default number of a specific job that can be running at any given moment.
      * By default it is 5.
      * @param value The value to set.
      */
    def defaultConcurrency(value: Double): this.type = js.native
    
    /**
      * Takes a number which specifies the default lock lifetime in milliseconds. By default it is 10 minutes. This
      * can be overridden by specifying the lockLifetime option to a defined job.
      * @param value The value to set.
      */
    def defaultLockLifetime(value: Double): this.type = js.native
    
    /**
      * Takes a number which specifies the default number of a specific job that can be locked at any given moment.
      * By default it is 0 for no max.
      * @param value The value to set.
      */
    def defaultLockLimit(value: Double): this.type = js.native
    
    /**
      * Defines a job with the name of jobName. When a job of job name gets run, it will be passed to fn(job, done).
      * To maintain asynchronous behavior, you must call done() when you are processing the job. If your function is
      * synchronous, you may omit done from the signature.
      * @param name The name of the jobs.
      * @param options The options for the job.
      * @param handler The handler to execute.
      */
    def define[T /* <: JobAttributesData */](
      name: String,
      handler: js.Function2[/* job */ Job[T], /* done */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): Unit = js.native
    def define[T /* <: JobAttributesData */](
      name: String,
      options: JobOptions,
      handler: js.Function2[/* job */ Job[T], /* done */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): Unit = js.native
    
    def every[T /* <: JobAttributesData */](interval: String, names: String): js.Promise[Job[T]] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: String, data: T): js.Promise[Job[T]] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: String, data: T, options: js.Any): js.Promise[Job[T]] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: String, data: js.UndefOr[scala.Nothing], options: js.Any): js.Promise[Job[T]] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: js.Array[String]): js.Promise[js.Array[Job[T]]] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: js.Array[String], data: T): js.Promise[js.Array[Job[T]]] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: js.Array[String], data: T, options: js.Any): js.Promise[js.Array[Job[T]]] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: js.Array[String], data: js.UndefOr[scala.Nothing], options: js.Any): js.Promise[js.Array[Job[T]]] = js.native
    /**
      * Runs job name at the given interval. Optionally, data and options can be passed in.
      * @param interval Can be a human-readable format String, a cron format String, or a Number.
      * @param names The name or names of the job(s) to run.
      * @param data An optional argument that will be passed to the processing function under job.attrs.data.
      * @param options An optional argument that will be passed to job.repeatEvery.
      */
    def every[T /* <: JobAttributesData */](interval: Double, names: String): js.Promise[Job[T]] = js.native
    def every[T /* <: JobAttributesData */](interval: Double, names: String, data: T): js.Promise[Job[T]] = js.native
    def every[T /* <: JobAttributesData */](interval: Double, names: String, data: T, options: js.Any): js.Promise[Job[T]] = js.native
    def every[T /* <: JobAttributesData */](interval: Double, names: String, data: js.UndefOr[scala.Nothing], options: js.Any): js.Promise[Job[T]] = js.native
    def every[T /* <: JobAttributesData */](interval: Double, names: js.Array[String]): js.Promise[js.Array[Job[T]]] = js.native
    def every[T /* <: JobAttributesData */](interval: Double, names: js.Array[String], data: T): js.Promise[js.Array[Job[T]]] = js.native
    def every[T /* <: JobAttributesData */](interval: Double, names: js.Array[String], data: T, options: js.Any): js.Promise[js.Array[Job[T]]] = js.native
    def every[T /* <: JobAttributesData */](interval: Double, names: js.Array[String], data: js.UndefOr[scala.Nothing], options: js.Any): js.Promise[js.Array[Job[T]]] = js.native
    
    /**
      * Find all Jobs matching `query` and pass same back in cb().
      * @param query
      */
    def jobs[T /* <: JobAttributesData */](query: js.Any): js.Promise[js.Array[Job[T]]] = js.native
    
    /**
      * Takes a number which specifies the max number jobs that can be locked at any given moment. By default it is
      * 0 for no max.
      * @param value The value to set.
      */
    def lockLimit(value: Double): this.type = js.native
    
    /**
      * Takes a number which specifies the max number of jobs that can be running at any given moment. By default it
      * is 20.
      * @param value The value to set.
      */
    def maxConcurrency(value: Double): this.type = js.native
    
    /**
      * Initialize agenda with an existing MongoDB connection.
      */
    def mongo(db: Db): this.type = js.native
    def mongo(db: Db, collection: js.UndefOr[scala.Nothing], cb: ResultCallback[Collection[DefaultSchema]]): this.type = js.native
    def mongo(db: Db, collection: String): this.type = js.native
    def mongo(db: Db, collection: String, cb: ResultCallback[Collection[DefaultSchema]]): this.type = js.native
    
    /**
      * Sets the agenda name.
      */
    def name(value: String): this.type = js.native
    
    /**
      * Schedules a job to run name once immediately.
      * @param name The name of the job to run.
      * @param data An optional argument that will be passed to the processing function under job.attrs.data.
      */
    def now[T /* <: JobAttributesData */](name: String): js.Promise[Job[T]] = js.native
    def now[T /* <: JobAttributesData */](name: String, data: T): js.Promise[Job[T]] = js.native
    
    /**
      * Sets the interval with which the queue is checked. A number in milliseconds or a frequency string.
      */
    def processEvery(interval: String): this.type = js.native
    def processEvery(interval: Double): this.type = js.native
    
    /**
      * Removes all jobs in the database without defined behaviors. Useful if you change a definition name and want
      * to remove old jobs.
      */
    def purge(): js.Promise[Double] = js.native
    
    def schedule[T /* <: JobAttributesData */](when: String, names: String): js.Promise[Job[T]] = js.native
    def schedule[T /* <: JobAttributesData */](when: String, names: String, data: T): js.Promise[Job[T]] = js.native
    def schedule[T /* <: JobAttributesData */](when: String, names: js.Array[String]): js.Promise[js.Array[Job[T]]] = js.native
    def schedule[T /* <: JobAttributesData */](when: String, names: js.Array[String], data: T): js.Promise[js.Array[Job[T]]] = js.native
    /**
      * Schedules a job to run name once at a given time.
      * @param when A Date or a String such as tomorrow at 5pm.
      * @param names The name or names of the job(s) to run.
      * @param data An optional argument that will be passed to the processing function under job.attrs.data.
      */
    def schedule[T /* <: JobAttributesData */](when: Date, names: String): js.Promise[Job[T]] = js.native
    def schedule[T /* <: JobAttributesData */](when: Date, names: String, data: T): js.Promise[Job[T]] = js.native
    def schedule[T /* <: JobAttributesData */](when: Date, names: js.Array[String]): js.Promise[js.Array[Job[T]]] = js.native
    def schedule[T /* <: JobAttributesData */](when: Date, names: js.Array[String], data: T): js.Promise[js.Array[Job[T]]] = js.native
    
    /**
      * Starts the job queue processing, checking processEvery time to see if there are new jobs.
      */
    def start(): js.Promise[Unit] = js.native
    
    /**
      * Stops the job queue processing. Unlocks currently running jobs.
      */
    def stop(): js.Promise[Unit] = js.native
  }
  
  /**
    * Agenda Configuration.
    */
  @js.native
  trait AgendaConfiguration extends StObject {
    
    /**
      * Specifies that Agenda should connect to MongoDB.
      */
    var db: js.UndefOr[Address] = js.native
    
    /**
      * Takes a number which specifies the default number of a specific job that can be running at any given moment.
      * By default it is 5.
      */
    var defaultConcurrency: js.UndefOr[Double] = js.native
    
    /**
      * Takes a number which specifies the default lock lifetime in milliseconds. By default it is 10 minutes. This
      * can be overridden by specifying the lockLifetime option to a defined job.
      */
    var defaultLockLifetime: js.UndefOr[Double] = js.native
    
    /**
      * Takes a number which specifies the default number of a specific job that can be locked at any given moment.
      * By default it is 0 for no max.
      */
    var defaultLockLimit: js.UndefOr[Double] = js.native
    
    /**
      * Takes a number which specifies the max number jobs that can be locked at any given moment. By default it is
      * 0 for no max.
      */
    var lockLimit: js.UndefOr[Double] = js.native
    
    /**
      * Takes a number which specifies the max number of jobs that can be running at any given moment. By default it
      * is 20.
      */
    var maxConcurrency: js.UndefOr[Double] = js.native
    
    /**
      * Specifies that Agenda should be initialized using and existing MongoDB connection.
      */
    var mongo: js.UndefOr[Db] = js.native
    
    /**
      * Sets the `lastModifiedBy` field to `name` in the jobs collection. Useful if you have multiple job processors
      * (agendas) and want to see which job queue last ran the job.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Sets the interval with which the queue is checked. A number in milliseconds or a frequency string.
      */
    var processEvery: js.UndefOr[String | Double] = js.native
  }
  object AgendaConfiguration {
    
    @scala.inline
    def apply(): AgendaConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgendaConfiguration]
    }
    
    @scala.inline
    implicit class AgendaConfigurationMutableBuilder[Self <: AgendaConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDb(value: Address): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      @scala.inline
      def setDefaultConcurrency(value: Double): Self = StObject.set(x, "defaultConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultConcurrencyUndefined: Self = StObject.set(x, "defaultConcurrency", js.undefined)
      
      @scala.inline
      def setDefaultLockLifetime(value: Double): Self = StObject.set(x, "defaultLockLifetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLockLifetimeUndefined: Self = StObject.set(x, "defaultLockLifetime", js.undefined)
      
      @scala.inline
      def setDefaultLockLimit(value: Double): Self = StObject.set(x, "defaultLockLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLockLimitUndefined: Self = StObject.set(x, "defaultLockLimit", js.undefined)
      
      @scala.inline
      def setLockLimit(value: Double): Self = StObject.set(x, "lockLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockLimitUndefined: Self = StObject.set(x, "lockLimit", js.undefined)
      
      @scala.inline
      def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
      
      @scala.inline
      def setMongo(value: Db): Self = StObject.set(x, "mongo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMongoUndefined: Self = StObject.set(x, "mongo", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProcessEvery(value: String | Double): Self = StObject.set(x, "processEvery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessEveryUndefined: Self = StObject.set(x, "processEvery", js.undefined)
    }
  }
  
  type Callback = js.Function1[/* err */ js.UndefOr[Error], Unit]
  
  /**
    * A scheduled job.
    */
  @js.native
  trait Job[T /* <: JobAttributesData */] extends StObject {
    
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
    def remove(): js.Promise[Double] = js.native
    
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
    def repeatEvery(interval: String, options: SkipImmediate): this.type = js.native
    def repeatEvery(interval: Double): this.type = js.native
    def repeatEvery(interval: Double, options: SkipImmediate): this.type = js.native
    
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
    def unique(value: js.Any, opts: InsertOnly): this.type = js.native
  }
  
  /**
    * The database record associated with a job.
    */
  @js.native
  trait JobAttributes[T /* <: JobAttributesData */] extends StObject {
    
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
    def apply[T /* <: JobAttributesData */](
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
    implicit class JobAttributesMutableBuilder[Self <: JobAttributes[_], T /* <: JobAttributesData */] (val x: Self with JobAttributes[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailCount(value: Double): Self = StObject.set(x, "failCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailReason(value: String): Self = StObject.set(x, "failReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedAt(value: Date): Self = StObject.set(x, "failedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFinishedAt(value: Date): Self = StObject.set(x, "lastFinishedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedBy(value: String): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastRunAt(value: Date): Self = StObject.set(x, "lastRunAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockedAt(value: Date): Self = StObject.set(x, "lockedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextRunAt(value: Date): Self = StObject.set(x, "nextRunAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatInterval(value: String | Double): Self = StObject.set(x, "repeatInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatTimezone(value: String): Self = StObject.set(x, "repeatTimezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_id(value: ObjectID_): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  type JobAttributesData = StringDictionary[js.Any]
  
  @js.native
  trait JobOptions extends StObject {
    
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
    implicit class JobOptionsMutableBuilder[Self <: JobOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setLockLifetime(value: Double): Self = StObject.set(x, "lockLifetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockLifetimeUndefined: Self = StObject.set(x, "lockLifetime", js.undefined)
      
      @scala.inline
      def setLockLimit(value: Double): Self = StObject.set(x, "lockLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockLimitUndefined: Self = StObject.set(x, "lockLimit", js.undefined)
      
      @scala.inline
      def setPriority(value: String | Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  type ResultCallback[T] = js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[T], Unit]
}
