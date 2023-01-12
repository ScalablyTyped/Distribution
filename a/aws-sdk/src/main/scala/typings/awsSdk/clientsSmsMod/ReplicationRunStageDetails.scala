package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationRunStageDetails extends StObject {
  
  /**
    * The current stage of a replication run.
    */
  var stage: js.UndefOr[ReplicationRunStage] = js.undefined
  
  /**
    * The progress of the current stage of a replication run.
    */
  var stageProgress: js.UndefOr[ReplicationRunStageProgress] = js.undefined
}
object ReplicationRunStageDetails {
  
  inline def apply(): ReplicationRunStageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationRunStageDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationRunStageDetails] (val x: Self) extends AnyVal {
    
    inline def setStage(value: ReplicationRunStage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageProgress(value: ReplicationRunStageProgress): Self = StObject.set(x, "stageProgress", value.asInstanceOf[js.Any])
    
    inline def setStageProgressUndefined: Self = StObject.set(x, "stageProgress", js.undefined)
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
  }
}
