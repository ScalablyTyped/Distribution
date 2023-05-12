package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationForm extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user who created the evaluation form.
    */
  var CreatedBy: ARN
  
  /**
    * The timestamp for when the evaluation form was created.
    */
  var CreatedTime: js.Date
  
  /**
    * The description of the evaluation form.
    */
  var Description: js.UndefOr[EvaluationFormDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the evaluation form resource.
    */
  var EvaluationFormArn: ARN
  
  /**
    * The unique identifier for the evaluation form.
    */
  var EvaluationFormId: ResourceId
  
  /**
    * A version of the evaluation form.
    */
  var EvaluationFormVersion: VersionNumber
  
  /**
    * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each. Questions must be contained in a section.
    */
  var Items: EvaluationFormItemsList
  
  /**
    * The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
    */
  var LastModifiedBy: ARN
  
  /**
    * The timestamp for when the evaluation form was last updated.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The flag indicating whether the evaluation form is locked for changes.
    */
  var Locked: EvaluationFormVersionIsLocked
  
  /**
    * A scoring strategy of the evaluation form.
    */
  var ScoringStrategy: js.UndefOr[EvaluationFormScoringStrategy] = js.undefined
  
  /**
    * The status of the evaluation form.
    */
  var Status: EvaluationFormVersionStatus
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * A title of the evaluation form.
    */
  var Title: EvaluationFormTitle
}
object EvaluationForm {
  
  inline def apply(
    CreatedBy: ARN,
    CreatedTime: js.Date,
    EvaluationFormArn: ARN,
    EvaluationFormId: ResourceId,
    EvaluationFormVersion: VersionNumber,
    Items: EvaluationFormItemsList,
    LastModifiedBy: ARN,
    LastModifiedTime: js.Date,
    Locked: EvaluationFormVersionIsLocked,
    Status: EvaluationFormVersionStatus,
    Title: EvaluationFormTitle
  ): EvaluationForm = {
    val __obj = js.Dynamic.literal(CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], EvaluationFormArn = EvaluationFormArn.asInstanceOf[js.Any], EvaluationFormId = EvaluationFormId.asInstanceOf[js.Any], EvaluationFormVersion = EvaluationFormVersion.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], LastModifiedBy = LastModifiedBy.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationForm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationForm] (val x: Self) extends AnyVal {
    
    inline def setCreatedBy(value: ARN): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: EvaluationFormDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEvaluationFormArn(value: ARN): Self = StObject.set(x, "EvaluationFormArn", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormId(value: ResourceId): Self = StObject.set(x, "EvaluationFormId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormVersion(value: VersionNumber): Self = StObject.set(x, "EvaluationFormVersion", value.asInstanceOf[js.Any])
    
    inline def setItems(value: EvaluationFormItemsList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: EvaluationFormItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setLastModifiedBy(value: ARN): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: EvaluationFormVersionIsLocked): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setScoringStrategy(value: EvaluationFormScoringStrategy): Self = StObject.set(x, "ScoringStrategy", value.asInstanceOf[js.Any])
    
    inline def setScoringStrategyUndefined: Self = StObject.set(x, "ScoringStrategy", js.undefined)
    
    inline def setStatus(value: EvaluationFormVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTitle(value: EvaluationFormTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
