package typings.archiver

import typings.node.fsMod.Stats
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined archiver.archiver.Partial<archiver.archiver.EntryData> */
  trait PartialEntryData extends StObject {
    
    var date: js.UndefOr[Date | String] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var stats: js.UndefOr[Stats] = js.undefined
  }
  object PartialEntryData {
    
    inline def apply(): PartialEntryData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEntryData]
    }
    
    extension [Self <: PartialEntryData](x: Self) {
      
      inline def setDate(value: Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
  
  trait Processed extends StObject {
    
    var processed: Double
    
    var total: Double
  }
  object Processed {
    
    inline def apply(processed: Double, total: Double): Processed = {
      val __obj = js.Dynamic.literal(processed = processed.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Processed]
    }
    
    extension [Self <: Processed](x: Self) {
      
      inline def setProcessed(value: Double): Self = StObject.set(x, "processed", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcessedBytes extends StObject {
    
    var processedBytes: Double
    
    var totalBytes: Double
  }
  object ProcessedBytes {
    
    inline def apply(processedBytes: Double, totalBytes: Double): ProcessedBytes = {
      val __obj = js.Dynamic.literal(processedBytes = processedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessedBytes]
    }
    
    extension [Self <: ProcessedBytes](x: Self) {
      
      inline def setProcessedBytes(value: Double): Self = StObject.set(x, "processedBytes", value.asInstanceOf[js.Any])
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
}
