package typings.atomWatcher

import typings.atomWatcher.anon.PartialWatcherOptions
import typings.atomWatcher.anon.PartialWatcherSettings
import typings.atomWatcher.atomWatcherStrings.renamed
import typings.eventKit.mod.Disposable
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atom/watcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@atom/watcher", "DISABLE")
  @js.native
  val DISABLE: js.Symbol = js.native
  
  @JSImport("@atom/watcher", "PathWatcher")
  @js.native
  open class PathWatcher protected () extends StObject {
    /* private */ def this(nativeWatcherRegistry: Any, watchedPath: String, options: WatcherOptions) = this()
    
    /**
      * Release an event subscription. The event callback associated with this `PathWatcher` will not be called after
      * the watcher has been disposed, synchronously. Note that the native resources or polling root used to feed events
      * to this watcher may remain, if another active `PathWatcher` is consuming events from it, and even if they are
      * freed as a result of this disposal they will be freed asynchronously.
      *
      * Extended: Unsubscribe all subscribers from filesystem events. Native resources will be release asynchronously,
      * but this watcher will stop broadcasting events immediately.
      */
    def dispose(): Unit = js.native
    
    def getOptions(): WatcherOptions = js.native
    
    /**
      * Extended: Return a Promise that will resolve when the underlying native watcher is ready to begin sending
      * events. When testing filesystem watchers, it's important to await this promise before making filesystem changes
      * that you intend to assert about because there will be a delay between the instantiation of the watcher and
      * the activation of the underlying OS resources that feed it events.
      *
      * PathWatchers acquired through `watchPath` are already started.
      */
    def getStartPromise(): js.Promise[Unit] = js.native
    
    /**
      * Invoke a callback with any errors that occur after the watcher has been installed successfully.
      *
      * The `callback` argument will be invoked with an `Error` with a stack trace that likely isn't very
      * helpful and a message that hopefully is.
      */
    def onDidError(callback: js.Function1[/* err */ Any, Any]): Disposable = js.native
  }
  
  @JSImport("@atom/watcher", "STDERR")
  @js.native
  val STDERR: js.Symbol = js.native
  
  @JSImport("@atom/watcher", "STDOUT")
  @js.native
  val STDOUT: js.Symbol = js.native
  
  inline def configure(settings: PartialWatcherSettings): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def watchPath(path: String, options: PartialWatcherOptions, consumer: EventConsumer): js.Promise[PathWatcher] = (^.asInstanceOf[js.Dynamic].applyDynamic("watchPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PathWatcher]]
  
  trait BaseEvent extends StObject {
    
    /**
      * A string describing the filesystem action that occurred.
      */
    var action: EntryAction
    
    /**
      * A string distinguishing the type of filesystem entry that was acted upon, if known.
      */
    var kind: EntryType
    
    /**
      * A string containing the absolute path to the filesystem entry that was acted upon.
      * In the event of a rename, this is the *new* path of the entry.
      */
    var path: String
  }
  object BaseEvent {
    
    inline def apply(action: EntryAction, kind: EntryType, path: String): BaseEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseEvent] (val x: Self) extends AnyVal {
      
      inline def setAction(value: EntryAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setKind(value: EntryType): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atomWatcher.atomWatcherStrings.created
    - typings.atomWatcher.atomWatcherStrings.modified
    - typings.atomWatcher.atomWatcherStrings.deleted
    - typings.atomWatcher.atomWatcherStrings.renamed
  */
  trait EntryAction extends StObject
  object EntryAction {
    
    inline def created: typings.atomWatcher.atomWatcherStrings.created = "created".asInstanceOf[typings.atomWatcher.atomWatcherStrings.created]
    
    inline def deleted: typings.atomWatcher.atomWatcherStrings.deleted = "deleted".asInstanceOf[typings.atomWatcher.atomWatcherStrings.deleted]
    
    inline def modified: typings.atomWatcher.atomWatcherStrings.modified = "modified".asInstanceOf[typings.atomWatcher.atomWatcherStrings.modified]
    
    inline def renamed: typings.atomWatcher.atomWatcherStrings.renamed = "renamed".asInstanceOf[typings.atomWatcher.atomWatcherStrings.renamed]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atomWatcher.atomWatcherStrings.file
    - typings.atomWatcher.atomWatcherStrings.directory
    - typings.atomWatcher.atomWatcherStrings.symlink
    - typings.atomWatcher.atomWatcherStrings.unknown
  */
  trait EntryType extends StObject
  object EntryType {
    
    inline def directory: typings.atomWatcher.atomWatcherStrings.directory = "directory".asInstanceOf[typings.atomWatcher.atomWatcherStrings.directory]
    
    inline def file: typings.atomWatcher.atomWatcherStrings.file = "file".asInstanceOf[typings.atomWatcher.atomWatcherStrings.file]
    
    inline def symlink: typings.atomWatcher.atomWatcherStrings.symlink = "symlink".asInstanceOf[typings.atomWatcher.atomWatcherStrings.symlink]
    
    inline def unknown: typings.atomWatcher.atomWatcherStrings.unknown = "unknown".asInstanceOf[typings.atomWatcher.atomWatcherStrings.unknown]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atomWatcher.mod.RenamedEvent
    - typings.atomWatcher.mod.OtherEvent
  */
  trait Event extends StObject
  object Event {
    
    inline def OtherEvent(action: Exclude[EntryAction, renamed], kind: EntryType, path: String): typings.atomWatcher.mod.OtherEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.atomWatcher.mod.OtherEvent]
    }
    
    inline def RenamedEvent(kind: EntryType, oldPath: String, path: String): typings.atomWatcher.mod.RenamedEvent = {
      val __obj = js.Dynamic.literal(action = "renamed", kind = kind.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.atomWatcher.mod.RenamedEvent]
    }
  }
  
  type EventConsumer = js.Function1[/* events */ js.Array[Event], Any]
  
  type LogTarget = String | js.Symbol
  
  trait OtherEvent
    extends StObject
       with BaseEvent
       with Event {
    
    @JSName("action")
    var action_OtherEvent: Exclude[EntryAction, renamed]
  }
  object OtherEvent {
    
    inline def apply(action: Exclude[EntryAction, renamed], kind: EntryType, path: String): OtherEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[OtherEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OtherEvent] (val x: Self) extends AnyVal {
      
      inline def setAction(value: Exclude[EntryAction, renamed]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenamedEvent
    extends StObject
       with BaseEvent
       with Event {
    
    @JSName("action")
    var action_RenamedEvent: renamed
    
    /**
      * A string containing the former absolute path of a renamed filesystem entry.
      */
    var oldPath: String
  }
  object RenamedEvent {
    
    inline def apply(kind: EntryType, oldPath: String, path: String): RenamedEvent = {
      val __obj = js.Dynamic.literal(action = "renamed", kind = kind.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenamedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenamedEvent] (val x: Self) extends AnyVal {
      
      inline def setAction(value: renamed): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setOldPath(value: String): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait WatcherOptions extends StObject {
    
    /**
      * If `true`, filesystem events that occur within subdirectories will be reported as well.
      * If `false`, only changes to immediate children of the provided path will be reported.
      * Defaults to `true`.
      */
    var recursive: Boolean
  }
  object WatcherOptions {
    
    inline def apply(recursive: Boolean): WatcherOptions = {
      val __obj = js.Dynamic.literal(recursive = recursive.asInstanceOf[js.Any])
      __obj.asInstanceOf[WatcherOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatcherOptions] (val x: Self) extends AnyVal {
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    }
  }
  
  trait WatcherSettings extends StObject {
    
    /**
      * Configures the logging of events from the JavaScript layer. Defaults to {@link DISABLE}.
      */
    var jsLog: LogTarget
    
    /**
      * Configures the logging of events from the main thread, in line with `libuv`'s event loop.
      * The default is {@link DISABLE}.
      */
    var mainLog: LogTarget
    
    /**
      * Adjusts the time in milliseconds that the polling thread spends sleeping between polling cycles.
      * Decreasing the interval will improve the timeliness of polled events, but will consume more processor
      * cycles and I/O bandwidth. The interval defaults to `100`.
      */
    var pollingInterval: Double
    
    /**
      * Configures the logging for the polling thread, which polls the filesystem when the worker thread is unable to.
      * The default is {@link DISABLE}.
      */
    var pollingLog: LogTarget
    
    /**
      * Controls the rough number of filesystem-touching system calls (`lstat()` and `readdir()`)
      * performed by the polling thread on each polling cycle. Increasing the throttle will improve the timeliness
      * of polled events, especially when watching large directory trees, but will consume more processor cycles and
      * I/O bandwidth. The throttle defaults to `1000`.
      */
    var pollingThrottle: Double
    
    /**
      * Controls the number of recently seen stat results are cached within the worker thread.
      * Increasing the cache size will improve the reliability of rename correlation and the
      * entry kinds of deleted entries, but will consume more RAM. The default is `4096`.
      */
    var workerCacheSize: Double
    
    /**
      * Configures logging for the worker thread, which is used to interact with native operating system filesystem
      * watching APIs. The default is {@link DISABLE}.
      */
    var workerLog: LogTarget
  }
  object WatcherSettings {
    
    inline def apply(
      jsLog: LogTarget,
      mainLog: LogTarget,
      pollingInterval: Double,
      pollingLog: LogTarget,
      pollingThrottle: Double,
      workerCacheSize: Double,
      workerLog: LogTarget
    ): WatcherSettings = {
      val __obj = js.Dynamic.literal(jsLog = jsLog.asInstanceOf[js.Any], mainLog = mainLog.asInstanceOf[js.Any], pollingInterval = pollingInterval.asInstanceOf[js.Any], pollingLog = pollingLog.asInstanceOf[js.Any], pollingThrottle = pollingThrottle.asInstanceOf[js.Any], workerCacheSize = workerCacheSize.asInstanceOf[js.Any], workerLog = workerLog.asInstanceOf[js.Any])
      __obj.asInstanceOf[WatcherSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatcherSettings] (val x: Self) extends AnyVal {
      
      inline def setJsLog(value: LogTarget): Self = StObject.set(x, "jsLog", value.asInstanceOf[js.Any])
      
      inline def setMainLog(value: LogTarget): Self = StObject.set(x, "mainLog", value.asInstanceOf[js.Any])
      
      inline def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
      
      inline def setPollingLog(value: LogTarget): Self = StObject.set(x, "pollingLog", value.asInstanceOf[js.Any])
      
      inline def setPollingThrottle(value: Double): Self = StObject.set(x, "pollingThrottle", value.asInstanceOf[js.Any])
      
      inline def setWorkerCacheSize(value: Double): Self = StObject.set(x, "workerCacheSize", value.asInstanceOf[js.Any])
      
      inline def setWorkerLog(value: LogTarget): Self = StObject.set(x, "workerLog", value.asInstanceOf[js.Any])
    }
  }
}
