package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormSummary extends StObject {
  
  /**
    * The version of the active evaluation form version.
    */
  var ActiveVersion: js.UndefOr[VersionNumber] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who created the evaluation form.
    */
  var CreatedBy: ARN
  
  /**
    * The timestamp for when the evaluation form was created.
    */
  var CreatedTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) for the evaluation form resource.
    */
  var EvaluationFormArn: ARN
  
  /**
    * The unique identifier for the evaluation form.
    */
  var EvaluationFormId: ResourceId
  
  /**
    *  The Amazon Resource Name (ARN) of the user who last activated the evaluation form.
    */
  var LastActivatedBy: js.UndefOr[ARN] = js.undefined
  
  /**
    * The timestamp for when the evaluation form was last activated.
    */
  var LastActivatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
    */
  var LastModifiedBy: ARN
  
  /**
    * The timestamp for when the evaluation form was last updated.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The version number of the latest evaluation form version.
    */
  var LatestVersion: VersionNumber
  
  /**
    * A title of the evaluation form.
    */
  var Title: EvaluationFormTitle
}
object EvaluationFormSummary {
  
  inline def apply(
    CreatedBy: ARN,
    CreatedTime: js.Date,
    EvaluationFormArn: ARN,
    EvaluationFormId: ResourceId,
    LastModifiedBy: ARN,
    LastModifiedTime: js.Date,
    LatestVersion: VersionNumber,
    Title: EvaluationFormTitle
  ): EvaluationFormSummary = {
    val __obj = js.Dynamic.literal(CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], EvaluationFormArn = EvaluationFormArn.asInstanceOf[js.Any], EvaluationFormId = EvaluationFormId.asInstanceOf[js.Any], LastModifiedBy = LastModifiedBy.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], LatestVersion = LatestVersion.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationFormSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormSummary] (val x: Self) extends AnyVal {
    
    inline def setActiveVersion(value: VersionNumber): Self = StObject.set(x, "ActiveVersion", value.asInstanceOf[js.Any])
    
    inline def setActiveVersionUndefined: Self = StObject.set(x, "ActiveVersion", js.undefined)
    
    inline def setCreatedBy(value: ARN): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormArn(value: ARN): Self = StObject.set(x, "EvaluationFormArn", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormId(value: ResourceId): Self = StObject.set(x, "EvaluationFormId", value.asInstanceOf[js.Any])
    
    inline def setLastActivatedBy(value: ARN): Self = StObject.set(x, "LastActivatedBy", value.asInstanceOf[js.Any])
    
    inline def setLastActivatedByUndefined: Self = StObject.set(x, "LastActivatedBy", js.undefined)
    
    inline def setLastActivatedTime(value: js.Date): Self = StObject.set(x, "LastActivatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastActivatedTimeUndefined: Self = StObject.set(x, "LastActivatedTime", js.undefined)
    
    inline def setLastModifiedBy(value: ARN): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLatestVersion(value: VersionNumber): Self = StObject.set(x, "LatestVersion", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: EvaluationFormTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
