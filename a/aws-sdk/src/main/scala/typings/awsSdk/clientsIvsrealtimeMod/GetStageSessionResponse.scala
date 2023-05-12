package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStageSessionResponse extends StObject {
  
  /**
    * The stage session that is returned.
    */
  var stageSession: js.UndefOr[StageSession] = js.undefined
}
object GetStageSessionResponse {
  
  inline def apply(): GetStageSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStageSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStageSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setStageSession(value: StageSession): Self = StObject.set(x, "stageSession", value.asInstanceOf[js.Any])
    
    inline def setStageSessionUndefined: Self = StObject.set(x, "stageSession", js.undefined)
  }
}
