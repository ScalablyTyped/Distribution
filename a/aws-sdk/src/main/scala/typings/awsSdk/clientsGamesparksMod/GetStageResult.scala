package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStageResult extends StObject {
  
  /**
    * Properties that provide details of the stage.
    */
  var Stage: js.UndefOr[StageDetails] = js.undefined
}
object GetStageResult {
  
  inline def apply(): GetStageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStageResult] (val x: Self) extends AnyVal {
    
    inline def setStage(value: StageDetails): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "Stage", js.undefined)
  }
}
