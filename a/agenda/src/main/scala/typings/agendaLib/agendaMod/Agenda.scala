package typings
package agendaLib.agendaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agenda
  extends nodeLib.eventsMod.EventEmitter {
  /**
       * Cancels any jobs matching the passed mongodb-native query, and removes them from the database.
       * @param query Mongodb native query.
       */
  def cancel(query: js.Any): js.Promise[scala.Double] = js.native
  /**
       * Returns an instance of a jobName with data. This does NOT save the job in the database. See below to learn
       * how to manually work with jobs.
       * @param name The name of the job.
       * @param data Data to associated with the job.
       */
  def create[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](name: java.lang.String): agendaLib.agendaMod.AgendaNs.Job[T] = js.native
  /**
       * Returns an instance of a jobName with data. This does NOT save the job in the database. See below to learn
       * how to manually work with jobs.
       * @param name The name of the job.
       * @param data Data to associated with the job.
       */
  def create[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](name: java.lang.String, data: T): agendaLib.agendaMod.AgendaNs.Job[T] = js.native
  /**
       * Connect to the specified MongoDB server and database.
       */
  def database(url: java.lang.String): this.type = js.native
  /**
       * Connect to the specified MongoDB server and database.
       */
  def database(url: java.lang.String, collection: java.lang.String): this.type = js.native
  /**
       * Connect to the specified MongoDB server and database.
       */
  def database(url: java.lang.String, collection: java.lang.String, options: js.Any): this.type = js.native
  /**
       * Connect to the specified MongoDB server and database.
       */
  def database(
    url: java.lang.String,
    collection: java.lang.String,
    options: js.Any,
    cb: ResultCallback[mongodbLib.mongodbMod.Collection[mongodbLib.Default]]
  ): this.type = js.native
  /**
       * Takes a number which specifies the default number of a specific job that can be running at any given moment.
       * By default it is 5.
       * @param value The value to set.
       */
  def defaultConcurrency(value: scala.Double): this.type = js.native
  /**
       * Takes a number which specifies the default lock lifetime in milliseconds. By default it is 10 minutes. This
       * can be overridden by specifying the lockLifetime option to a defined job.
       * @param value The value to set.
       */
  def defaultLockLifetime(value: scala.Double): this.type = js.native
  /**
       * Takes a number which specifies the default number of a specific job that can be locked at any given moment.
       * By default it is 0 for no max.
       * @param value The value to set.
       */
  def defaultLockLimit(value: scala.Double): this.type = js.native
  /**
       * Defines a job with the name of jobName. When a job of job name gets run, it will be passed to fn(job, done).
       * To maintain asynchronous behavior, you must call done() when you are processing the job. If your function is
       * synchronous, you may omit done from the signature.
       * @param name The name of the jobs.
       * @param options The options for the job.
       * @param handler The handler to execute.
       */
  def define[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](
    name: java.lang.String,
    handler: js.Function2[
      /* job */ agendaLib.agendaMod.AgendaNs.Job[T], 
      /* done */ js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def define[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](
    name: java.lang.String,
    options: agendaLib.agendaMod.AgendaNs.JobOptions,
    handler: js.Function2[
      /* job */ agendaLib.agendaMod.AgendaNs.Job[T], 
      /* done */ js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Runs job name at the given interval. Optionally, data and options can be passed in.
       * @param interval Can be a human-readable format String, a cron format String, or a Number.
       * @param names The name or names of the job(s) to run.
       * @param data An optional argument that will be passed to the processing function under job.attrs.data.
       * @param options An optional argument that will be passed to job.repeatEvery.
       */
  def every[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](interval: java.lang.String, names: java.lang.String): js.Promise[agendaLib.agendaMod.AgendaNs.Job[T]] = js.native
  /**
       * Runs job name at the given interval. Optionally, data and options can be passed in.
       * @param interval Can be a human-readable format String, a cron format String, or a Number.
       * @param names The name or names of the job(s) to run.
       * @param data An optional argument that will be passed to the processing function under job.attrs.data.
       * @param options An optional argument that will be passed to job.repeatEvery.
       */
  def every[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](interval: java.lang.String, names: java.lang.String, data: T): js.Promise[agendaLib.agendaMod.AgendaNs.Job[T]] = js.native
  /**
       * Runs job name at the given interval. Optionally, data and options can be passed in.
       * @param interval Can be a human-readable format String, a cron format String, or a Number.
       * @param names The name or names of the job(s) to run.
       * @param data An optional argument that will be passed to the processing function under job.attrs.data.
       * @param options An optional argument that will be passed to job.repeatEvery.
       */
  def every[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](interval: java.lang.String, names: java.lang.String, data: T, options: js.Any): js.Promise[agendaLib.agendaMod.AgendaNs.Job[T]] = js.native
  def every[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](interval: java.lang.String, names: js.Array[java.lang.String]): js.Promise[js.Array[agendaLib.agendaMod.AgendaNs.Job[T]]] = js.native
  def every[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](interval: java.lang.String, names: js.Array[java.lang.String], data: T): js.Promise[js.Array[agendaLib.agendaMod.AgendaNs.Job[T]]] = js.native
  def every[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](interval: java.lang.String, names: js.Array[java.lang.String], data: T, options: js.Any): js.Promise[js.Array[agendaLib.agendaMod.AgendaNs.Job[T]]] = js.native
  /**
       * Runs job name at the given interval. Optionally, data and options can be passed in.
       * @param interval Can be a human-readable format String, a cron format String, or a Number.
       * @param names The name or names of the job(s) to run.
       * @param data An optional argument that will be passed to the processing function under job.attrs.data.
       * @param options An optional argument that will be passed to job.repeatEvery.
       */
  def every[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](interval: scala.Double, names: java.lang.String): js.Promise[agendaLib.agendaMod.AgendaNs.Job[T]] = js.native
  /**
       * Runs job name at the given interval. Optionally, data and options can be passed in.
       * @param interval Can be a human-readable format String, a cron format String, or a Number.
       * @param names The name or names of the job(s) to run.
       * @param data An optional argument that will be passed to the processing function under job.attrs.data.
       * @param options An optional argument that will be passed to job.repeatEvery.
       */
  def every[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](interval: scala.Double, names: java.lang.String, data: T): js.Promise[agendaLib.agendaMod.AgendaNs.Job[T]] = js.native
  /**
       * Runs job name at the given interval. Optionally, data and options can be passed in.
       * @param interval Can be a human-readable format String, a cron format String, or a Number.
       * @param names The name or names of the job(s) to run.
       * @param data An optional argument that will be passed to the processing function under job.attrs.data.
       * @param options An optional argument that will be passed to job.repeatEvery.
       */
  def every[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](interval: scala.Double, names: java.lang.String, data: T, options: js.Any): js.Promise[agendaLib.agendaMod.AgendaNs.Job[T]] = js.native
  def every[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](interval: scala.Double, names: js.Array[java.lang.String]): js.Promise[js.Array[agendaLib.agendaMod.AgendaNs.Job[T]]] = js.native
  def every[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](interval: scala.Double, names: js.Array[java.lang.String], data: T): js.Promise[js.Array[agendaLib.agendaMod.AgendaNs.Job[T]]] = js.native
  def every[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](interval: scala.Double, names: js.Array[java.lang.String], data: T, options: js.Any): js.Promise[js.Array[agendaLib.agendaMod.AgendaNs.Job[T]]] = js.native
  /**
       * Find all Jobs matching `query` and pass same back in cb().
       * @param query
       */
  def jobs[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](query: js.Any): js.Promise[js.Array[agendaLib.agendaMod.AgendaNs.Job[T]]] = js.native
  /**
       * Takes a number which specifies the max number jobs that can be locked at any given moment. By default it is
       * 0 for no max.
       * @param value The value to set.
       */
  def lockLimit(value: scala.Double): this.type = js.native
  /**
       * Takes a number which specifies the max number of jobs that can be running at any given moment. By default it
       * is 20.
       * @param value The value to set.
       */
  def maxConcurrency(value: scala.Double): this.type = js.native
  /**
       * Initialize agenda with an existing MongoDB connection.
       */
  def mongo(db: mongodbLib.mongodbMod.Db): this.type = js.native
  /**
       * Initialize agenda with an existing MongoDB connection.
       */
  def mongo(db: mongodbLib.mongodbMod.Db, collection: java.lang.String): this.type = js.native
  /**
       * Initialize agenda with an existing MongoDB connection.
       */
  def mongo(
    db: mongodbLib.mongodbMod.Db,
    collection: java.lang.String,
    cb: ResultCallback[mongodbLib.mongodbMod.Collection[mongodbLib.Default]]
  ): this.type = js.native
  /**
       * Sets the agenda name.
       */
  def name(value: java.lang.String): this.type = js.native
  /**
       * Schedules a job to run name once immediately.
       * @param name The name of the job to run.
       * @param data An optional argument that will be passed to the processing function under job.attrs.data.
       */
  def now[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](name: java.lang.String): js.Promise[agendaLib.agendaMod.AgendaNs.Job[T]] = js.native
  /**
       * Schedules a job to run name once immediately.
       * @param name The name of the job to run.
       * @param data An optional argument that will be passed to the processing function under job.attrs.data.
       */
  def now[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](name: java.lang.String, data: T): js.Promise[agendaLib.agendaMod.AgendaNs.Job[T]] = js.native
  /**
       * Sets the interval with which the queue is checked. A number in milliseconds or a frequency string.
       */
  def processEvery(interval: java.lang.String): this.type = js.native
  /**
       * Sets the interval with which the queue is checked. A number in milliseconds or a frequency string.
       */
  def processEvery(interval: scala.Double): this.type = js.native
  /**
       * Removes all jobs in the database without defined behaviors. Useful if you change a definition name and want
       * to remove old jobs.
       */
  def purge(): js.Promise[scala.Double] = js.native
  /**
       * Schedules a job to run name once at a given time.
       * @param when A Date or a String such as tomorrow at 5pm.
       * @param names The name or names of the job(s) to run.
       * @param data An optional argument that will be passed to the processing function under job.attrs.data.
       */
  def schedule[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](when: java.lang.String, names: java.lang.String): js.Promise[agendaLib.agendaMod.AgendaNs.Job[T]] = js.native
  /**
       * Schedules a job to run name once at a given time.
       * @param when A Date or a String such as tomorrow at 5pm.
       * @param names The name or names of the job(s) to run.
       * @param data An optional argument that will be passed to the processing function under job.attrs.data.
       */
  def schedule[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](when: java.lang.String, names: java.lang.String, data: T): js.Promise[agendaLib.agendaMod.AgendaNs.Job[T]] = js.native
  def schedule[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](when: java.lang.String, names: js.Array[java.lang.String]): js.Promise[js.Array[agendaLib.agendaMod.AgendaNs.Job[T]]] = js.native
  def schedule[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](when: java.lang.String, names: js.Array[java.lang.String], data: T): js.Promise[js.Array[agendaLib.agendaMod.AgendaNs.Job[T]]] = js.native
  /**
       * Schedules a job to run name once at a given time.
       * @param when A Date or a String such as tomorrow at 5pm.
       * @param names The name or names of the job(s) to run.
       * @param data An optional argument that will be passed to the processing function under job.attrs.data.
       */
  def schedule[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](when: stdLib.Date, names: java.lang.String): js.Promise[agendaLib.agendaMod.AgendaNs.Job[T]] = js.native
  /**
       * Schedules a job to run name once at a given time.
       * @param when A Date or a String such as tomorrow at 5pm.
       * @param names The name or names of the job(s) to run.
       * @param data An optional argument that will be passed to the processing function under job.attrs.data.
       */
  def schedule[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](when: stdLib.Date, names: java.lang.String, data: T): js.Promise[agendaLib.agendaMod.AgendaNs.Job[T]] = js.native
  def schedule[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](when: stdLib.Date, names: js.Array[java.lang.String]): js.Promise[js.Array[agendaLib.agendaMod.AgendaNs.Job[T]]] = js.native
  def schedule[T /* <: agendaLib.agendaMod.AgendaNs.JobAttributesData */](when: stdLib.Date, names: js.Array[java.lang.String], data: T): js.Promise[js.Array[agendaLib.agendaMod.AgendaNs.Job[T]]] = js.native
  /**
       * Starts the job queue processing, checking processEvery time to see if there are new jobs.
       */
  def start(): js.Promise[scala.Unit] = js.native
  /**
       * Stops the job queue processing. Unlocks currently running jobs.
       */
  def stop(): js.Promise[scala.Unit] = js.native
}

