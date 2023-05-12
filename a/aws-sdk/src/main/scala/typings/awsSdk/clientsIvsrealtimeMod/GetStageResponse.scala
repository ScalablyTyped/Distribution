package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStageResponse extends StObject {
  
  /**
    * The stage that is returned.
    */
  var stage: js.UndefOr[Stage] = js.undefined
}
object GetStageResponse {
  
  inline def apply(): GetStageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStageResponse] (val x: Self) extends AnyVal {
    
    inline def setStage(value: Stage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
  }
}
