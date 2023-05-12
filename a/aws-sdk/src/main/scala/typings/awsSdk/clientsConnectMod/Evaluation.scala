package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Evaluation extends StObject {
  
  /**
    * A map of question identifiers to answer value.
    */
  var Answers: EvaluationAnswersOutputMap
  
  /**
    * The timestamp for when the evaluation was created.
    */
  var CreatedTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) for the contact evaluation resource.
    */
  var EvaluationArn: ARN
  
  /**
    * A unique identifier for the contact evaluation.
    */
  var EvaluationId: ResourceId
  
  /**
    * The timestamp for when the evaluation was last updated.
    */
  var LastModifiedTime: js.Date
  
  /**
    * Metadata about the contact evaluation.
    */
  var Metadata: EvaluationMetadata
  
  /**
    * A map of question identifiers to note value.
    */
  var Notes: EvaluationNotesMap
  
  /**
    * A map of item (section or question) identifiers to score value.
    */
  var Scores: js.UndefOr[EvaluationScoresMap] = js.undefined
  
  /**
    * The status of the contact evaluation.
    */
  var Status: EvaluationStatus
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object Evaluation {
  
  inline def apply(
    Answers: EvaluationAnswersOutputMap,
    CreatedTime: js.Date,
    EvaluationArn: ARN,
    EvaluationId: ResourceId,
    LastModifiedTime: js.Date,
    Metadata: EvaluationMetadata,
    Notes: EvaluationNotesMap,
    Status: EvaluationStatus
  ): Evaluation = {
    val __obj = js.Dynamic.literal(Answers = Answers.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], EvaluationArn = EvaluationArn.asInstanceOf[js.Any], EvaluationId = EvaluationId.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], Notes = Notes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evaluation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Evaluation] (val x: Self) extends AnyVal {
    
    inline def setAnswers(value: EvaluationAnswersOutputMap): Self = StObject.set(x, "Answers", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setEvaluationArn(value: ARN): Self = StObject.set(x, "EvaluationArn", value.asInstanceOf[js.Any])
    
    inline def setEvaluationId(value: ResourceId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: EvaluationMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setNotes(value: EvaluationNotesMap): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setScores(value: EvaluationScoresMap): Self = StObject.set(x, "Scores", value.asInstanceOf[js.Any])
    
    inline def setScoresUndefined: Self = StObject.set(x, "Scores", js.undefined)
    
    inline def setStatus(value: EvaluationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
