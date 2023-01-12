package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStageResult extends StObject {
  
  /**
    * Properties that provide details of the updated stage.
    */
  var Stage: js.UndefOr[StageDetails] = js.undefined
}
object UpdateStageResult {
  
  inline def apply(): UpdateStageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStageResult] (val x: Self) extends AnyVal {
    
    inline def setStage(value: StageDetails): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "Stage", js.undefined)
  }
}
