package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStageResponse extends StObject {
  
  /**
    * The updated stage.
    */
  var stage: js.UndefOr[Stage] = js.undefined
}
object UpdateStageResponse {
  
  inline def apply(): UpdateStageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStageResponse] (val x: Self) extends AnyVal {
    
    inline def setStage(value: Stage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
  }
}
