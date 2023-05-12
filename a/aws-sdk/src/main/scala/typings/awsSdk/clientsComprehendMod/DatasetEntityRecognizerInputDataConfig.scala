package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetEntityRecognizerInputDataConfig extends StObject {
  
  /**
    * The S3 location of the annotation documents for your custom entity recognizer.
    */
  var Annotations: js.UndefOr[DatasetEntityRecognizerAnnotations] = js.undefined
  
  /**
    * The format and location of the training documents for your custom entity recognizer.
    */
  var Documents: DatasetEntityRecognizerDocuments
  
  /**
    * The S3 location of the entity list for your custom entity recognizer.
    */
  var EntityList: js.UndefOr[DatasetEntityRecognizerEntityList] = js.undefined
}
object DatasetEntityRecognizerInputDataConfig {
  
  inline def apply(Documents: DatasetEntityRecognizerDocuments): DatasetEntityRecognizerInputDataConfig = {
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetEntityRecognizerInputDataConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetEntityRecognizerInputDataConfig] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: DatasetEntityRecognizerAnnotations): Self = StObject.set(x, "Annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "Annotations", js.undefined)
    
    inline def setDocuments(value: DatasetEntityRecognizerDocuments): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    inline def setEntityList(value: DatasetEntityRecognizerEntityList): Self = StObject.set(x, "EntityList", value.asInstanceOf[js.Any])
    
    inline def setEntityListUndefined: Self = StObject.set(x, "EntityList", js.undefined)
  }
}
