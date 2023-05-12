package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStageRequest extends StObject {
  
  /**
    * ARN of the stage to be updated.
    */
  var arn: StageArn
  
  /**
    * Name of the stage to be updated.
    */
  var name: js.UndefOr[StageName] = js.undefined
}
object UpdateStageRequest {
  
  inline def apply(arn: StageArn): UpdateStageRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStageRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: StageArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: StageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
