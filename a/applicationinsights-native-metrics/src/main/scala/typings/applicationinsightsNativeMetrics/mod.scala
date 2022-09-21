package typings.applicationinsightsNativeMetrics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("applicationinsights-native-metrics/out/main", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with NativeMetricEmitter {
    def this(options: Any) = this()
  }
  @JSImport("applicationinsights-native-metrics/out/main", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("applicationinsights-native-metrics/out/main", "DEFAULT_INTERVAL")
  @js.native
  def DEFAULT_INTERVAL: Any = js.native
  inline def DEFAULT_INTERVAL_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_INTERVAL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("applicationinsights-native-metrics/out/main", "GC_TYPES")
  @js.native
  def GC_TYPES: Any = js.native
  inline def GC_TYPES_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GC_TYPES")(x.asInstanceOf[js.Any])
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify events.EventEmitter * / any */ @js.native
  trait NativeMetricEmitter extends StObject {
    
    /* private */ var _emitUsage: Any = js.native
    
    /* private */ var _gcProfiler: Any = js.native
    
    /* private */ var _handle: Any = js.native
    
    /* private */ var _loopProfiler: Any = js.native
    
    /* private */ var _resourceProfiler: Any = js.native
    
    /* private */ var _start: Any = js.native
    
    /* private */ var _stop: Any = js.native
    
    def enable(): Unit = js.native
    def enable(enable: Boolean): Unit = js.native
    def enable(enable: Boolean, pollInterval: Double): Unit = js.native
    def enable(enable: Unit, pollInterval: Double): Unit = js.native
    
    /* private */ var enabled: Any = js.native
    
    def getGCData(): Any = js.native
    
    def getLoopData(): Any = js.native
  }
}
