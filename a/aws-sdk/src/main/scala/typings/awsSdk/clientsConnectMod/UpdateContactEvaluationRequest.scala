package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactEvaluationRequest extends StObject {
  
  /**
    * A map of question identifiers to answer value.
    */
  var Answers: js.UndefOr[EvaluationAnswersInputMap] = js.undefined
  
  /**
    * A unique identifier for the contact evaluation.
    */
  var EvaluationId: ResourceId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * A map of question identifiers to note value.
    */
  var Notes: js.UndefOr[EvaluationNotesMap] = js.undefined
}
object UpdateContactEvaluationRequest {
  
  inline def apply(EvaluationId: ResourceId, InstanceId: InstanceId): UpdateContactEvaluationRequest = {
    val __obj = js.Dynamic.literal(EvaluationId = EvaluationId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactEvaluationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContactEvaluationRequest] (val x: Self) extends AnyVal {
    
    inline def setAnswers(value: EvaluationAnswersInputMap): Self = StObject.set(x, "Answers", value.asInstanceOf[js.Any])
    
    inline def setAnswersUndefined: Self = StObject.set(x, "Answers", js.undefined)
    
    inline def setEvaluationId(value: ResourceId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setNotes(value: EvaluationNotesMap): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "Notes", js.undefined)
  }
}
