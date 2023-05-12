package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLProblemTypeConfig extends StObject {
  
  /**
    * Settings used to configure an AutoML job using the V2 API for the image classification problem type.
    */
  var ImageClassificationJobConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ImageClassificationJobConfig] = js.undefined
  
  /**
    * Settings used to configure an AutoML job using the V2 API for the text classification problem type.
    */
  var TextClassificationJobConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TextClassificationJobConfig] = js.undefined
}
object AutoMLProblemTypeConfig {
  
  inline def apply(): AutoMLProblemTypeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLProblemTypeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoMLProblemTypeConfig] (val x: Self) extends AnyVal {
    
    inline def setImageClassificationJobConfig(value: ImageClassificationJobConfig): Self = StObject.set(x, "ImageClassificationJobConfig", value.asInstanceOf[js.Any])
    
    inline def setImageClassificationJobConfigUndefined: Self = StObject.set(x, "ImageClassificationJobConfig", js.undefined)
    
    inline def setTextClassificationJobConfig(value: TextClassificationJobConfig): Self = StObject.set(x, "TextClassificationJobConfig", value.asInstanceOf[js.Any])
    
    inline def setTextClassificationJobConfigUndefined: Self = StObject.set(x, "TextClassificationJobConfig", js.undefined)
  }
}
