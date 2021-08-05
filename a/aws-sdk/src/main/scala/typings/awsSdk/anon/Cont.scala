package typings.awsSdk.anon

import typings.awsSdk.s3Mod.ContinuationEvent
import typings.awsSdk.s3Mod.EndEvent
import typings.awsSdk.s3Mod.ProgressEvent
import typings.awsSdk.s3Mod.RecordsEvent
import typings.awsSdk.s3Mod.StatsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cont extends StObject {
  
  var Cont: js.UndefOr[ContinuationEvent] = js.undefined
  
  var End: js.UndefOr[EndEvent] = js.undefined
  
  var Progress: js.UndefOr[ProgressEvent] = js.undefined
  
  var Records: js.UndefOr[RecordsEvent] = js.undefined
  
  var Stats: js.UndefOr[StatsEvent] = js.undefined
}
object Cont {
  
  inline def apply(): Cont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cont]
  }
  
  extension [Self <: Cont](x: Self) {
    
    inline def setCont(value: ContinuationEvent): Self = StObject.set(x, "Cont", value.asInstanceOf[js.Any])
    
    inline def setContUndefined: Self = StObject.set(x, "Cont", js.undefined)
    
    inline def setEnd(value: EndEvent): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    inline def setProgress(value: ProgressEvent): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    inline def setRecords(value: RecordsEvent): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
    
    inline def setStats(value: StatsEvent): Self = StObject.set(x, "Stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "Stats", js.undefined)
  }
}
