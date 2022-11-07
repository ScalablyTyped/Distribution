package typings.agenda

import typings.agenda.anon.Address
import typings.agenda.anon.FnCall
import typings.agenda.anon.FnCallThisIntervalNamesDataOptions
import typings.agenda.anon.FnCallThisNameData
import typings.agenda.anon.FnCallThisNameOptionsProcessor
import typings.agenda.anon.FnCallThisWhenNamesData
import typings.agenda.anon.Force
import typings.agenda.distAgendaDefineMod.DefineOptions
import typings.agenda.distAgendaDefineMod.Processor
import typings.agenda.distAgendaJobProcessingQueueMod.JobProcessingQueue
import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributesData
import typings.agenda.distJobRepeatEveryMod.JobOptions
import typings.bson.mod.Document
import typings.mongodb.mod.AnyError
import typings.mongodb.mod.Collection
import typings.mongodb.mod.Db
import typings.mongodb.mod.Filter
import typings.mongodb.mod.MongoClient
import typings.mongodb.mod.MongoClientOptions
import typings.node.eventsMod.EventEmitter
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaMod {
  
  /**
    * @class Agenda
    * @param {Object} config - Agenda Config
    * @param {Function} cb - Callback after Agenda has started and connected to mongo
    * @property {Object} _name - Name of the current Agenda queue
    * @property {Number} _processEvery
    * @property {Number} _defaultConcurrency
    * @property {Number} _maxConcurrency
    * @property {Number} _defaultLockLimit
    * @property {Number} _lockLimit
    * @property {Object} _definitions
    * @property {Object} _runningJobs
    * @property {Object} _lockedJobs
    * @property {Object} _jobQueue
    * @property {Number} _defaultLockLifetime
    * @property {Object} _sort
    * @property {Object} _indices
    * @property {Boolean} _isLockingOnTheFly - true if 'lockingOnTheFly' is currently running. Prevent concurrent execution of this method.
    * @property {Map} _isJobQueueFilling - A map of jobQueues and if the 'jobQueueFilling' method is currently running for a given map. 'lockingOnTheFly' and 'jobQueueFilling' should not run concurrently for the same jobQueue. It can cause that lock limits aren't honored.
    * @property {Array} _jobsToLock
    */
  @JSImport("agenda/dist/agenda", "Agenda")
  @js.native
  /**
    * Constructs a new Agenda object.
    * @param config Optional configuration to initialize the Agenda.
    * @param cb Optional callback called with the MongoDB collection.
    */
  open class Agenda () extends EventEmitter {
    def this(config: AgendaConfig) = this()
    def this(
      config: Unit,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ) = this()
    def this(
      config: AgendaConfig,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ) = this()
    
    var _collection: Collection[Document] = js.native
    
    var _db: MongoClient = js.native
    
    var _defaultConcurrency: Any = js.native
    
    var _defaultLockLifetime: Any = js.native
    
    var _defaultLockLimit: Any = js.native
    
    var _definitions: Any = js.native
    
    var _disableAutoIndex: Boolean = js.native
    
    def _findAndLockNextJob(jobName: String, definition: Any): js.Promise[js.UndefOr[Job[JobAttributesData]]] = js.native
    
    var _indices: Any = js.native
    
    var _isJobQueueFilling: Map[String, Boolean] = js.native
    
    var _isLockingOnTheFly: Boolean = js.native
    
    var _jobQueue: JobProcessingQueue = js.native
    
    var _jobsToLock: js.Array[Job[JobAttributesData]] = js.native
    
    var _lockLimit: Any = js.native
    
    var _lockedJobs: js.Array[Job[JobAttributesData]] = js.native
    
    var _maxConcurrency: Any = js.native
    
    var _mdb: Db = js.native
    
    var _mongoUseUnifiedTopology: js.UndefOr[Boolean] = js.native
    
    var _name: Any = js.native
    
    var _nextScanAt: Any = js.native
    
    var _processEvery: Double = js.native
    
    var _processInterval: Any = js.native
    
    var _ready: js.Promise[Any] = js.native
    
    var _runningJobs: js.Array[Job[JobAttributesData]] = js.native
    
    var _sort: Any = js.native
    
    def cancel(query: Filter[Document]): js.Promise[js.UndefOr[Double]] = js.native
    @JSName("cancel")
    var cancel_Original: js.ThisFunction1[/* this */ this.type, /* query */ Filter[Document], js.Promise[js.UndefOr[Double]]] = js.native
    
    def close(): js.Promise[this.type] = js.native
    def close(option: Force): js.Promise[this.type] = js.native
    @JSName("close")
    var close_Original: js.ThisFunction1[/* this */ this.type, /* option */ js.UndefOr[Force], js.Promise[this.type]] = js.native
    
    def create[T /* <: JobAttributesData */](name: String, data: T): Job[JobAttributesData] = js.native
    @JSName("create")
    var create_Original: FnCall = js.native
    
    def database(url: String): this.type | Unit = js.native
    def database(url: String, collection: String): this.type | Unit = js.native
    def database(
      url: String,
      collection: String,
      options: Unit,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ): this.type | Unit = js.native
    def database(url: String, collection: String, options: MongoClientOptions): this.type | Unit = js.native
    def database(
      url: String,
      collection: String,
      options: MongoClientOptions,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ): this.type | Unit = js.native
    def database(
      url: String,
      collection: Unit,
      options: Unit,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ): this.type | Unit = js.native
    def database(url: String, collection: Unit, options: MongoClientOptions): this.type | Unit = js.native
    def database(
      url: String,
      collection: Unit,
      options: MongoClientOptions,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ): this.type | Unit = js.native
    @JSName("database")
    var database_Original: js.ThisFunction4[
        /* this */ this.type, 
        /* url */ String, 
        /* collection */ js.UndefOr[String], 
        /* options */ js.UndefOr[MongoClientOptions], 
        /* cb */ js.UndefOr[
          js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
        ], 
        this.type | Unit
      ] = js.native
    
    def db_init(): Unit = js.native
    def db_init(collection: String): Unit = js.native
    def db_init(
      collection: String,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ): Unit = js.native
    def db_init(
      collection: Unit,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ): Unit = js.native
    @JSName("db_init")
    var db_init_Original: js.ThisFunction2[
        /* this */ this.type, 
        /* collection */ js.UndefOr[String], 
        /* cb */ js.UndefOr[
          js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
        ], 
        Unit
      ] = js.native
    
    def defaultConcurrency(concurrency: Double): this.type = js.native
    @JSName("defaultConcurrency")
    var defaultConcurrency_Original: js.ThisFunction1[/* this */ this.type, /* concurrency */ Double, this.type] = js.native
    
    def defaultLockLifetime(ms: Double): this.type = js.native
    @JSName("defaultLockLifetime")
    var defaultLockLifetime_Original: js.ThisFunction1[/* this */ this.type, /* ms */ Double, this.type] = js.native
    
    def defaultLockLimit(times: Double): this.type = js.native
    @JSName("defaultLockLimit")
    var defaultLockLimit_Original: js.ThisFunction1[/* this */ this.type, /* times */ Double, this.type] = js.native
    
    def define[T](name: String, options: DefineOptions): Unit = js.native
    def define[T](name: String, options: DefineOptions, processor: Processor[T]): Unit = js.native
    def define[T](name: String, options: Processor[T]): Unit = js.native
    def define[T](name: String, options: Processor[T], processor: Processor[T]): Unit = js.native
    @JSName("define")
    var define_Original: FnCallThisNameOptionsProcessor = js.native
    
    def disable(): js.Promise[Double] = js.native
    def disable(query: Filter[Any]): js.Promise[Double] = js.native
    @JSName("disable")
    var disable_Original: js.ThisFunction1[/* this */ this.type, /* query */ js.UndefOr[Filter[Any]], js.Promise[Double]] = js.native
    
    def drain(): js.Promise[Unit] = js.native
    @JSName("drain")
    var drain_Original: js.ThisFunction0[/* this */ this.type, js.Promise[Unit]] = js.native
    
    def enable(): js.Promise[Double] = js.native
    def enable(query: Filter[Any]): js.Promise[Double] = js.native
    @JSName("enable")
    var enable_Original: js.ThisFunction1[/* this */ this.type, /* query */ js.UndefOr[Filter[Any]], js.Promise[Double]] = js.native
    
    def every[T /* <: JobAttributesData */](interval: String, names: String): js.Promise[Any] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: String, data: T): js.Promise[Any] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: String, data: T, options: JobOptions): js.Promise[Any] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: String, data: Unit, options: JobOptions): js.Promise[Any] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: js.Array[String]): js.Promise[Any] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: js.Array[String], data: T): js.Promise[Any] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: js.Array[String], data: T, options: JobOptions): js.Promise[Any] = js.native
    def every[T /* <: JobAttributesData */](interval: String, names: js.Array[String], data: Unit, options: JobOptions): js.Promise[Any] = js.native
    @JSName("every")
    var every_Original: FnCallThisIntervalNamesDataOptions = js.native
    
    def jobs(): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Unit, sort: js.Object): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Unit, sort: js.Object, limit: Double): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Unit, sort: js.Object, limit: Double, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Unit, sort: js.Object, limit: Unit, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Unit, sort: Unit, limit: Double): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Unit, sort: Unit, limit: Double, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Unit, sort: Unit, limit: Unit, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Filter[Any]): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Filter[Any], sort: js.Object): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Filter[Any], sort: js.Object, limit: Double): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Filter[Any], sort: js.Object, limit: Double, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Filter[Any], sort: js.Object, limit: Unit, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Filter[Any], sort: Unit, limit: Double): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Filter[Any], sort: Unit, limit: Double, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def jobs(query: Filter[Any], sort: Unit, limit: Unit, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    @JSName("jobs")
    var jobs_Original: js.ThisFunction4[
        /* this */ this.type, 
        /* query */ js.UndefOr[Filter[Any]], 
        /* sort */ js.UndefOr[js.Object], 
        /* limit */ js.UndefOr[Double], 
        /* skip */ js.UndefOr[Double], 
        js.Promise[js.Array[Job[JobAttributesData]]]
      ] = js.native
    
    def lockLimit(limit: Double): this.type = js.native
    @JSName("lockLimit")
    var lockLimit_Original: js.ThisFunction1[/* this */ this.type, /* limit */ Double, this.type] = js.native
    
    def maxConcurrency(concurrency: Double): this.type = js.native
    @JSName("maxConcurrency")
    var maxConcurrency_Original: js.ThisFunction1[/* this */ this.type, /* concurrency */ Double, this.type] = js.native
    
    def mongo(mdb: Db): this.type = js.native
    def mongo(mdb: Db, collection: String): this.type = js.native
    def mongo(
      mdb: Db,
      collection: String,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ): this.type = js.native
    def mongo(
      mdb: Db,
      collection: Unit,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ): this.type = js.native
    @JSName("mongo")
    var mongo_Original: js.ThisFunction3[
        /* this */ this.type, 
        /* mdb */ Db, 
        /* collection */ js.UndefOr[String], 
        /* cb */ js.UndefOr[
          js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
        ], 
        this.type
      ] = js.native
    
    def name(name: String): this.type = js.native
    @JSName("name")
    var name_Original: js.ThisFunction1[/* this */ this.type, /* name */ String, this.type] = js.native
    
    def now[T /* <: JobAttributesData */](name: String, data: T): js.Promise[Job[JobAttributesData]] = js.native
    @JSName("now")
    var now_Original: FnCallThisNameData = js.native
    
    def processEvery(time: String): this.type = js.native
    @JSName("processEvery")
    var processEvery_Original: js.ThisFunction1[/* this */ this.type, /* time */ String, this.type] = js.native
    
    def purge(): js.Promise[js.UndefOr[Double]] = js.native
    @JSName("purge")
    var purge_Original: js.ThisFunction0[/* this */ this.type, js.Promise[js.UndefOr[Double]]] = js.native
    
    def saveJob(job: Job[JobAttributesData]): js.Promise[Job[JobAttributesData]] = js.native
    @JSName("saveJob")
    var saveJob_Original: js.ThisFunction1[
        /* this */ this.type, 
        /* job */ Job[JobAttributesData], 
        js.Promise[Job[JobAttributesData]]
      ] = js.native
    
    def schedule[T /* <: JobAttributesData */](when: String, names: String, data: T): js.Promise[Job[JobAttributesData]] = js.native
    def schedule[T /* <: JobAttributesData */](when: String, names: js.Array[String], data: T): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def schedule[T /* <: JobAttributesData */](when: js.Date, names: String, data: T): js.Promise[Job[JobAttributesData]] = js.native
    def schedule[T /* <: JobAttributesData */](when: js.Date, names: js.Array[String], data: T): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    @JSName("schedule")
    var schedule_Original: FnCallThisWhenNamesData = js.native
    
    def sort(query: Any): this.type = js.native
    @JSName("sort")
    var sort_Original: js.ThisFunction1[/* this */ this.type, /* query */ Any, this.type] = js.native
    
    def start(): js.Promise[Unit | Any] = js.native
    @JSName("start")
    var start_Original: js.ThisFunction0[/* this */ this.type, js.Promise[Unit | Any]] = js.native
    
    def stop(): js.Promise[Unit] = js.native
    @JSName("stop")
    var stop_Original: js.ThisFunction0[/* this */ this.type, js.Promise[Unit]] = js.native
  }
  
  trait AgendaConfig extends StObject {
    
    var db: js.UndefOr[Address] = js.undefined
    
    var defaultConcurrency: js.UndefOr[Double] = js.undefined
    
    var defaultLockLifetime: js.UndefOr[Double] = js.undefined
    
    var defaultLockLimit: js.UndefOr[Double] = js.undefined
    
    var disableAutoIndex: js.UndefOr[Boolean] = js.undefined
    
    var lockLimit: js.UndefOr[Double] = js.undefined
    
    var maxConcurrency: js.UndefOr[Double] = js.undefined
    
    var mongo: js.UndefOr[Db] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var processEvery: js.UndefOr[String] = js.undefined
    
    var sort: js.UndefOr[Any] = js.undefined
  }
  object AgendaConfig {
    
    inline def apply(): AgendaConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgendaConfig]
    }
    
    extension [Self <: AgendaConfig](x: Self) {
      
      inline def setDb(value: Address): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      inline def setDefaultConcurrency(value: Double): Self = StObject.set(x, "defaultConcurrency", value.asInstanceOf[js.Any])
      
      inline def setDefaultConcurrencyUndefined: Self = StObject.set(x, "defaultConcurrency", js.undefined)
      
      inline def setDefaultLockLifetime(value: Double): Self = StObject.set(x, "defaultLockLifetime", value.asInstanceOf[js.Any])
      
      inline def setDefaultLockLifetimeUndefined: Self = StObject.set(x, "defaultLockLifetime", js.undefined)
      
      inline def setDefaultLockLimit(value: Double): Self = StObject.set(x, "defaultLockLimit", value.asInstanceOf[js.Any])
      
      inline def setDefaultLockLimitUndefined: Self = StObject.set(x, "defaultLockLimit", js.undefined)
      
      inline def setDisableAutoIndex(value: Boolean): Self = StObject.set(x, "disableAutoIndex", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoIndexUndefined: Self = StObject.set(x, "disableAutoIndex", js.undefined)
      
      inline def setLockLimit(value: Double): Self = StObject.set(x, "lockLimit", value.asInstanceOf[js.Any])
      
      inline def setLockLimitUndefined: Self = StObject.set(x, "lockLimit", js.undefined)
      
      inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
      
      inline def setMongo(value: Db): Self = StObject.set(x, "mongo", value.asInstanceOf[js.Any])
      
      inline def setMongoUndefined: Self = StObject.set(x, "mongo", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProcessEvery(value: String): Self = StObject.set(x, "processEvery", value.asInstanceOf[js.Any])
      
      inline def setProcessEveryUndefined: Self = StObject.set(x, "processEvery", js.undefined)
      
      inline def setSort(value: Any): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
}
