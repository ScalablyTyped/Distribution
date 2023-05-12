package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageClassificationJobConfig extends StObject {
  
  /**
    * How long a job is allowed to run, or how many candidates a job is allowed to generate.
    */
  var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria] = js.undefined
}
object ImageClassificationJobConfig {
  
  inline def apply(): ImageClassificationJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageClassificationJobConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageClassificationJobConfig] (val x: Self) extends AnyVal {
    
    inline def setCompletionCriteria(value: AutoMLJobCompletionCriteria): Self = StObject.set(x, "CompletionCriteria", value.asInstanceOf[js.Any])
    
    inline def setCompletionCriteriaUndefined: Self = StObject.set(x, "CompletionCriteria", js.undefined)
  }
}
