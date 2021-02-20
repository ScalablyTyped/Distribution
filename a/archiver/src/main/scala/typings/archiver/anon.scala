package typings.archiver

import typings.node.fsMod.Stats
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined archiver.archiver.Partial<archiver.archiver.EntryData> */
  @js.native
  trait PartialEntryData extends StObject {
    
    var date: js.UndefOr[Date | String] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var stats: js.UndefOr[Stats] = js.native
  }
  object PartialEntryData {
    
    @scala.inline
    def apply(): PartialEntryData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEntryData]
    }
    
    @scala.inline
    implicit class PartialEntryDataMutableBuilder[Self <: PartialEntryData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
  
  @js.native
  trait Processed extends StObject {
    
    var processed: Double = js.native
    
    var total: Double = js.native
  }
  object Processed {
    
    @scala.inline
    def apply(processed: Double, total: Double): Processed = {
      val __obj = js.Dynamic.literal(processed = processed.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Processed]
    }
    
    @scala.inline
    implicit class ProcessedMutableBuilder[Self <: Processed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcessed(value: Double): Self = StObject.set(x, "processed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProcessedBytes extends StObject {
    
    var processedBytes: Double = js.native
    
    var totalBytes: Double = js.native
  }
  object ProcessedBytes {
    
    @scala.inline
    def apply(processedBytes: Double, totalBytes: Double): ProcessedBytes = {
      val __obj = js.Dynamic.literal(processedBytes = processedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessedBytes]
    }
    
    @scala.inline
    implicit class ProcessedBytesMutableBuilder[Self <: ProcessedBytes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcessedBytes(value: Double): Self = StObject.set(x, "processedBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
}
