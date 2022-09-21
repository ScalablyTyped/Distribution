package typings.atomWatcher

import typings.atomWatcher.mod.LogTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@atom/watcher.@atom/watcher.WatcherOptions> */
  trait PartialWatcherOptions extends StObject {
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object PartialWatcherOptions {
    
    inline def apply(): PartialWatcherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWatcherOptions]
    }
    
    extension [Self <: PartialWatcherOptions](x: Self) {
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@atom/watcher.@atom/watcher.WatcherSettings> */
  trait PartialWatcherSettings extends StObject {
    
    var jsLog: js.UndefOr[LogTarget] = js.undefined
    
    var mainLog: js.UndefOr[LogTarget] = js.undefined
    
    var pollingInterval: js.UndefOr[Double] = js.undefined
    
    var pollingLog: js.UndefOr[LogTarget] = js.undefined
    
    var pollingThrottle: js.UndefOr[Double] = js.undefined
    
    var workerCacheSize: js.UndefOr[Double] = js.undefined
    
    var workerLog: js.UndefOr[LogTarget] = js.undefined
  }
  object PartialWatcherSettings {
    
    inline def apply(): PartialWatcherSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWatcherSettings]
    }
    
    extension [Self <: PartialWatcherSettings](x: Self) {
      
      inline def setJsLog(value: LogTarget): Self = StObject.set(x, "jsLog", value.asInstanceOf[js.Any])
      
      inline def setJsLogUndefined: Self = StObject.set(x, "jsLog", js.undefined)
      
      inline def setMainLog(value: LogTarget): Self = StObject.set(x, "mainLog", value.asInstanceOf[js.Any])
      
      inline def setMainLogUndefined: Self = StObject.set(x, "mainLog", js.undefined)
      
      inline def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
      
      inline def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
      
      inline def setPollingLog(value: LogTarget): Self = StObject.set(x, "pollingLog", value.asInstanceOf[js.Any])
      
      inline def setPollingLogUndefined: Self = StObject.set(x, "pollingLog", js.undefined)
      
      inline def setPollingThrottle(value: Double): Self = StObject.set(x, "pollingThrottle", value.asInstanceOf[js.Any])
      
      inline def setPollingThrottleUndefined: Self = StObject.set(x, "pollingThrottle", js.undefined)
      
      inline def setWorkerCacheSize(value: Double): Self = StObject.set(x, "workerCacheSize", value.asInstanceOf[js.Any])
      
      inline def setWorkerCacheSizeUndefined: Self = StObject.set(x, "workerCacheSize", js.undefined)
      
      inline def setWorkerLog(value: LogTarget): Self = StObject.set(x, "workerLog", value.asInstanceOf[js.Any])
      
      inline def setWorkerLogUndefined: Self = StObject.set(x, "workerLog", js.undefined)
    }
  }
}
