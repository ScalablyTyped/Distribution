package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEvaluationFormRequest extends StObject {
  
  /**
    * A unique identifier for the contact evaluation.
    */
  var EvaluationFormId: ResourceId
  
  /**
    * A version of the evaluation form.
    */
  var EvaluationFormVersion: js.UndefOr[VersionNumber] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
}
object DescribeEvaluationFormRequest {
  
  inline def apply(EvaluationFormId: ResourceId, InstanceId: InstanceId): DescribeEvaluationFormRequest = {
    val __obj = js.Dynamic.literal(EvaluationFormId = EvaluationFormId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEvaluationFormRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEvaluationFormRequest] (val x: Self) extends AnyVal {
    
    inline def setEvaluationFormId(value: ResourceId): Self = StObject.set(x, "EvaluationFormId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormVersion(value: VersionNumber): Self = StObject.set(x, "EvaluationFormVersion", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormVersionUndefined: Self = StObject.set(x, "EvaluationFormVersion", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
