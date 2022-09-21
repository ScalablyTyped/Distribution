package typings.airbnbNodeMemwatch

import typings.airbnbNodeMemwatch.airbnbNodeMemwatchStrings.stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@airbnb/node-memwatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@airbnb/node-memwatch", "HeapDiff")
  @js.native
  open class HeapDiff () extends StObject {
    
    def end(): HeapDiffResult = js.native
  }
  
  inline def on_stats(event: stats, callback: js.Function1[/* stats */ GcStats, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait GcStats extends StObject {
    
    // nanoseconds
    var gcIncrementalMarkingCount: Double
    
    var gcIncrementalMarkingTime: Double
    
    // nanoseconds
    var gcMarkSweepCompactCount: Double
    
    var gcMarkSweepCompactTime: Double
    
    // nanoseconds
    var gcProcessWeakCallbacksCount: Double
    
    var gcProcessWeakCallbacksTime: Double
    
    var gcScavengeCount: Double
    
    var gcScavengeTime: Double
    
    var gc_time: Double
    
    // bytes
    var heap_size_limit: Double
    
    // bytes
    var malloced_memory: Double
    
    var peak_malloced_memory: Double
    
    // bytes
    var total_available_size: Double
    
    // nanoseconds
    var total_heap_size: Double
    
    // bytes
    var total_heap_size_executable: Double
    
    // bytes
    var total_physical_size: Double
    
    // bytes
    var used_heap_size: Double
  }
  object GcStats {
    
    inline def apply(
      gcIncrementalMarkingCount: Double,
      gcIncrementalMarkingTime: Double,
      gcMarkSweepCompactCount: Double,
      gcMarkSweepCompactTime: Double,
      gcProcessWeakCallbacksCount: Double,
      gcProcessWeakCallbacksTime: Double,
      gcScavengeCount: Double,
      gcScavengeTime: Double,
      gc_time: Double,
      heap_size_limit: Double,
      malloced_memory: Double,
      peak_malloced_memory: Double,
      total_available_size: Double,
      total_heap_size: Double,
      total_heap_size_executable: Double,
      total_physical_size: Double,
      used_heap_size: Double
    ): GcStats = {
      val __obj = js.Dynamic.literal(gcIncrementalMarkingCount = gcIncrementalMarkingCount.asInstanceOf[js.Any], gcIncrementalMarkingTime = gcIncrementalMarkingTime.asInstanceOf[js.Any], gcMarkSweepCompactCount = gcMarkSweepCompactCount.asInstanceOf[js.Any], gcMarkSweepCompactTime = gcMarkSweepCompactTime.asInstanceOf[js.Any], gcProcessWeakCallbacksCount = gcProcessWeakCallbacksCount.asInstanceOf[js.Any], gcProcessWeakCallbacksTime = gcProcessWeakCallbacksTime.asInstanceOf[js.Any], gcScavengeCount = gcScavengeCount.asInstanceOf[js.Any], gcScavengeTime = gcScavengeTime.asInstanceOf[js.Any], gc_time = gc_time.asInstanceOf[js.Any], heap_size_limit = heap_size_limit.asInstanceOf[js.Any], malloced_memory = malloced_memory.asInstanceOf[js.Any], peak_malloced_memory = peak_malloced_memory.asInstanceOf[js.Any], total_available_size = total_available_size.asInstanceOf[js.Any], total_heap_size = total_heap_size.asInstanceOf[js.Any], total_heap_size_executable = total_heap_size_executable.asInstanceOf[js.Any], total_physical_size = total_physical_size.asInstanceOf[js.Any], used_heap_size = used_heap_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[GcStats]
    }
    
    extension [Self <: GcStats](x: Self) {
      
      inline def setGcIncrementalMarkingCount(value: Double): Self = StObject.set(x, "gcIncrementalMarkingCount", value.asInstanceOf[js.Any])
      
      inline def setGcIncrementalMarkingTime(value: Double): Self = StObject.set(x, "gcIncrementalMarkingTime", value.asInstanceOf[js.Any])
      
      inline def setGcMarkSweepCompactCount(value: Double): Self = StObject.set(x, "gcMarkSweepCompactCount", value.asInstanceOf[js.Any])
      
      inline def setGcMarkSweepCompactTime(value: Double): Self = StObject.set(x, "gcMarkSweepCompactTime", value.asInstanceOf[js.Any])
      
      inline def setGcProcessWeakCallbacksCount(value: Double): Self = StObject.set(x, "gcProcessWeakCallbacksCount", value.asInstanceOf[js.Any])
      
      inline def setGcProcessWeakCallbacksTime(value: Double): Self = StObject.set(x, "gcProcessWeakCallbacksTime", value.asInstanceOf[js.Any])
      
      inline def setGcScavengeCount(value: Double): Self = StObject.set(x, "gcScavengeCount", value.asInstanceOf[js.Any])
      
      inline def setGcScavengeTime(value: Double): Self = StObject.set(x, "gcScavengeTime", value.asInstanceOf[js.Any])
      
      inline def setGc_time(value: Double): Self = StObject.set(x, "gc_time", value.asInstanceOf[js.Any])
      
      inline def setHeap_size_limit(value: Double): Self = StObject.set(x, "heap_size_limit", value.asInstanceOf[js.Any])
      
      inline def setMalloced_memory(value: Double): Self = StObject.set(x, "malloced_memory", value.asInstanceOf[js.Any])
      
      inline def setPeak_malloced_memory(value: Double): Self = StObject.set(x, "peak_malloced_memory", value.asInstanceOf[js.Any])
      
      inline def setTotal_available_size(value: Double): Self = StObject.set(x, "total_available_size", value.asInstanceOf[js.Any])
      
      inline def setTotal_heap_size(value: Double): Self = StObject.set(x, "total_heap_size", value.asInstanceOf[js.Any])
      
      inline def setTotal_heap_size_executable(value: Double): Self = StObject.set(x, "total_heap_size_executable", value.asInstanceOf[js.Any])
      
      inline def setTotal_physical_size(value: Double): Self = StObject.set(x, "total_physical_size", value.asInstanceOf[js.Any])
      
      inline def setUsed_heap_size(value: Double): Self = StObject.set(x, "used_heap_size", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeapChange extends StObject {
    
    var allocated_nodes: Double
    
    var details: js.Array[HeapChangeDetails]
    
    var freed_nodes: Double
    
    var size: String
    
    var size_bytes: Double
  }
  object HeapChange {
    
    inline def apply(
      allocated_nodes: Double,
      details: js.Array[HeapChangeDetails],
      freed_nodes: Double,
      size: String,
      size_bytes: Double
    ): HeapChange = {
      val __obj = js.Dynamic.literal(allocated_nodes = allocated_nodes.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], freed_nodes = freed_nodes.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapChange]
    }
    
    extension [Self <: HeapChange](x: Self) {
      
      inline def setAllocated_nodes(value: Double): Self = StObject.set(x, "allocated_nodes", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: js.Array[HeapChangeDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsVarargs(value: HeapChangeDetails*): Self = StObject.set(x, "details", js.Array(value*))
      
      inline def setFreed_nodes(value: Double): Self = StObject.set(x, "freed_nodes", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSize_bytes(value: Double): Self = StObject.set(x, "size_bytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeapChangeDetails extends StObject {
    
    @JSName("+")
    var Plussign: Double
    
    @JSName("-")
    var _dash: Double
    
    var size: String
    
    var size_bytes: Double
    
    var what: String
  }
  object HeapChangeDetails {
    
    inline def apply(Plussign: Double, _dash: Double, size: String, size_bytes: Double, what: String): HeapChangeDetails = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any], what = what.asInstanceOf[js.Any])
      __obj.updateDynamic("+")(Plussign.asInstanceOf[js.Any])
      __obj.updateDynamic("-")(_dash.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapChangeDetails]
    }
    
    extension [Self <: HeapChangeDetails](x: Self) {
      
      inline def setPlussign(value: Double): Self = StObject.set(x, "+", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSize_bytes(value: Double): Self = StObject.set(x, "size_bytes", value.asInstanceOf[js.Any])
      
      inline def setWhat(value: String): Self = StObject.set(x, "what", value.asInstanceOf[js.Any])
      
      inline def set_dash(value: Double): Self = StObject.set(x, "-", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeapDiffResult extends StObject {
    
    var after: HeapInfo
    
    var before: HeapInfo
    
    var change: HeapChange
  }
  object HeapDiffResult {
    
    inline def apply(after: HeapInfo, before: HeapInfo, change: HeapChange): HeapDiffResult = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapDiffResult]
    }
    
    extension [Self <: HeapDiffResult](x: Self) {
      
      inline def setAfter(value: HeapInfo): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: HeapInfo): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setChange(value: HeapChange): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeapInfo extends StObject {
    
    var nodes: Double
    
    var size: String
    
    var size_bytes: Double
  }
  object HeapInfo {
    
    inline def apply(nodes: Double, size: String, size_bytes: Double): HeapInfo = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapInfo]
    }
    
    extension [Self <: HeapInfo](x: Self) {
      
      inline def setNodes(value: Double): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSize_bytes(value: Double): Self = StObject.set(x, "size_bytes", value.asInstanceOf[js.Any])
    }
  }
}
