package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPatchBaselineRequest extends StObject {
  
  /**
    * The ID of the patch baseline to retrieve.  To retrieve information about an Amazon Web Services managed patch baseline, specify the full Amazon Resource Name (ARN) of the baseline. For example, for the baseline AWS-AmazonLinuxDefaultPatchBaseline, specify arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0e392de35e7c563b7 instead of pb-0e392de35e7c563b7. 
    */
  var BaselineId: typings.awsSdk.clientsSsmMod.BaselineId
}
object GetPatchBaselineRequest {
  
  inline def apply(BaselineId: BaselineId): GetPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPatchBaselineRequest] (val x: Self) extends AnyVal {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
  }
}
