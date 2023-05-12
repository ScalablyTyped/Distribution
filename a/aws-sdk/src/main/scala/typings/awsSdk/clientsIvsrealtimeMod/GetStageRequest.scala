package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStageRequest extends StObject {
  
  /**
    * ARN of the stage for which the information is to be retrieved.
    */
  var arn: StageArn
}
object GetStageRequest {
  
  inline def apply(arn: StageArn): GetStageRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStageRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: StageArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
