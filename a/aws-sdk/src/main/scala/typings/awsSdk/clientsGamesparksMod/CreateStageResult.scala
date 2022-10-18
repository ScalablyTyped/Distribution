package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStageResult extends StObject {
  
  /**
    * Properties that describe the stage.
    */
  var Stage: js.UndefOr[StageDetails] = js.undefined
}
object CreateStageResult {
  
  inline def apply(): CreateStageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStageResult]
  }
  
  extension [Self <: CreateStageResult](x: Self) {
    
    inline def setStage(value: StageDetails): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "Stage", js.undefined)
  }
}
