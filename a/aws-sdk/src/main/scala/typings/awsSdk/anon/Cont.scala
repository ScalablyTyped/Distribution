package typings.awsSdk.anon

import typings.awsSdk.s3Mod.ContinuationEvent
import typings.awsSdk.s3Mod.EndEvent
import typings.awsSdk.s3Mod.ProgressEvent
import typings.awsSdk.s3Mod.RecordsEvent
import typings.awsSdk.s3Mod.StatsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cont extends StObject {
  
  var Cont: js.UndefOr[ContinuationEvent] = js.native
  
  var End: js.UndefOr[EndEvent] = js.native
  
  var Progress: js.UndefOr[ProgressEvent] = js.native
  
  var Records: js.UndefOr[RecordsEvent] = js.native
  
  var Stats: js.UndefOr[StatsEvent] = js.native
}
object Cont {
  
  @scala.inline
  def apply(): Cont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cont]
  }
  
  @scala.inline
  implicit class ContMutableBuilder[Self <: Cont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCont(value: ContinuationEvent): Self = StObject.set(x, "Cont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContUndefined: Self = StObject.set(x, "Cont", js.undefined)
    
    @scala.inline
    def setEnd(value: EndEvent): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    @scala.inline
    def setProgress(value: ProgressEvent): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    @scala.inline
    def setRecords(value: RecordsEvent): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
    
    @scala.inline
    def setStats(value: StatsEvent): Self = StObject.set(x, "Stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "Stats", js.undefined)
  }
}
