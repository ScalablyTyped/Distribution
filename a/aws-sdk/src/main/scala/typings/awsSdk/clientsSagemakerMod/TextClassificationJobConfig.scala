package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextClassificationJobConfig extends StObject {
  
  /**
    * How long a job is allowed to run, or how many candidates a job is allowed to generate.
    */
  var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria] = js.undefined
  
  /**
    * The name of the column used to provide the sentences to be classified. It should not be the same as the target column.
    */
  var ContentColumn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ContentColumn] = js.undefined
  
  /**
    * The name of the column used to provide the class labels. It should not be same as the content column.
    */
  var TargetLabelColumn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TargetLabelColumn] = js.undefined
}
object TextClassificationJobConfig {
  
  inline def apply(): TextClassificationJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextClassificationJobConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextClassificationJobConfig] (val x: Self) extends AnyVal {
    
    inline def setCompletionCriteria(value: AutoMLJobCompletionCriteria): Self = StObject.set(x, "CompletionCriteria", value.asInstanceOf[js.Any])
    
    inline def setCompletionCriteriaUndefined: Self = StObject.set(x, "CompletionCriteria", js.undefined)
    
    inline def setContentColumn(value: ContentColumn): Self = StObject.set(x, "ContentColumn", value.asInstanceOf[js.Any])
    
    inline def setContentColumnUndefined: Self = StObject.set(x, "ContentColumn", js.undefined)
    
    inline def setTargetLabelColumn(value: TargetLabelColumn): Self = StObject.set(x, "TargetLabelColumn", value.asInstanceOf[js.Any])
    
    inline def setTargetLabelColumnUndefined: Self = StObject.set(x, "TargetLabelColumn", js.undefined)
  }
}
