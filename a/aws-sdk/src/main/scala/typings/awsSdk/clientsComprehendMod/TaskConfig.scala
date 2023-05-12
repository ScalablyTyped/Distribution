package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskConfig extends StObject {
  
  /**
    * Configuration required for a classification model.
    */
  var DocumentClassificationConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.DocumentClassificationConfig] = js.undefined
  
  /**
    * Configuration required for an entity recognition model.
    */
  var EntityRecognitionConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.EntityRecognitionConfig] = js.undefined
  
  /**
    * Language code for the language that the model supports.
    */
  var LanguageCode: typings.awsSdk.clientsComprehendMod.LanguageCode
}
object TaskConfig {
  
  inline def apply(LanguageCode: LanguageCode): TaskConfig = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskConfig] (val x: Self) extends AnyVal {
    
    inline def setDocumentClassificationConfig(value: DocumentClassificationConfig): Self = StObject.set(x, "DocumentClassificationConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentClassificationConfigUndefined: Self = StObject.set(x, "DocumentClassificationConfig", js.undefined)
    
    inline def setEntityRecognitionConfig(value: EntityRecognitionConfig): Self = StObject.set(x, "EntityRecognitionConfig", value.asInstanceOf[js.Any])
    
    inline def setEntityRecognitionConfigUndefined: Self = StObject.set(x, "EntityRecognitionConfig", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
  }
}
