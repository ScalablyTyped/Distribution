package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStageRequest extends StObject {
  
  /**
    * ARN of the stage to be deleted.
    */
  var arn: StageArn
}
object DeleteStageRequest {
  
  inline def apply(arn: StageArn): DeleteStageRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteStageRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: StageArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
