package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetInputDataConfig extends StObject {
  
  /**
    * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth. 
    */
  var AugmentedManifests: js.UndefOr[DatasetAugmentedManifestsList] = js.undefined
  
  /**
    *  COMPREHEND_CSV: The data format is a two-column CSV file, where the first column contains labels and the second column contains documents.  AUGMENTED_MANIFEST: The data format 
    */
  var DataFormat: js.UndefOr[DatasetDataFormat] = js.undefined
  
  /**
    * The input properties for training a document classifier model.  For more information on how the input file is formatted, see Preparing training data in the Comprehend Developer Guide. 
    */
  var DocumentClassifierInputDataConfig: js.UndefOr[DatasetDocumentClassifierInputDataConfig] = js.undefined
  
  /**
    * The input properties for training an entity recognizer model.
    */
  var EntityRecognizerInputDataConfig: js.UndefOr[DatasetEntityRecognizerInputDataConfig] = js.undefined
}
object DatasetInputDataConfig {
  
  inline def apply(): DatasetInputDataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetInputDataConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetInputDataConfig] (val x: Self) extends AnyVal {
    
    inline def setAugmentedManifests(value: DatasetAugmentedManifestsList): Self = StObject.set(x, "AugmentedManifests", value.asInstanceOf[js.Any])
    
    inline def setAugmentedManifestsUndefined: Self = StObject.set(x, "AugmentedManifests", js.undefined)
    
    inline def setAugmentedManifestsVarargs(value: DatasetAugmentedManifestsListItem*): Self = StObject.set(x, "AugmentedManifests", js.Array(value*))
    
    inline def setDataFormat(value: DatasetDataFormat): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "DataFormat", js.undefined)
    
    inline def setDocumentClassifierInputDataConfig(value: DatasetDocumentClassifierInputDataConfig): Self = StObject.set(x, "DocumentClassifierInputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentClassifierInputDataConfigUndefined: Self = StObject.set(x, "DocumentClassifierInputDataConfig", js.undefined)
    
    inline def setEntityRecognizerInputDataConfig(value: DatasetEntityRecognizerInputDataConfig): Self = StObject.set(x, "EntityRecognizerInputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setEntityRecognizerInputDataConfigUndefined: Self = StObject.set(x, "EntityRecognizerInputDataConfig", js.undefined)
  }
}
