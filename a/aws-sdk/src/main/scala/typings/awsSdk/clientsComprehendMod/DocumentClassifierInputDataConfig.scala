package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentClassifierInputDataConfig extends StObject {
  
  /**
    * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth. This parameter is required if you set DataFormat to AUGMENTED_MANIFEST.
    */
  var AugmentedManifests: js.UndefOr[DocumentClassifierAugmentedManifestsList] = js.undefined
  
  /**
    * The format of your training data:    COMPREHEND_CSV: A two-column CSV file, where labels are provided in the first column, and documents are provided in the second. If you use this value, you must provide the S3Uri parameter in your request.    AUGMENTED_MANIFEST: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file is in JSON lines format. Each line is a complete JSON object that contains a training document and its associated labels.  If you use this value, you must provide the AugmentedManifests parameter in your request.   If you don't specify a value, Amazon Comprehend uses COMPREHEND_CSV as the default.
    */
  var DataFormat: js.UndefOr[DocumentClassifierDataFormat] = js.undefined
  
  var DocumentReaderConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.DocumentReaderConfig] = js.undefined
  
  /**
    * The type of input documents for training the model. Provide plain-text documents to create a plain-text model, and provide semi-structured documents to create a native model.
    */
  var DocumentType: js.UndefOr[DocumentClassifierDocumentTypeFormat] = js.undefined
  
  /**
    * The S3 location of the training documents. This parameter is required in a request to create a native classifier model.
    */
  var Documents: js.UndefOr[DocumentClassifierDocuments] = js.undefined
  
  /**
    * Indicates the delimiter used to separate each label for training a multi-label classifier. The default delimiter between labels is a pipe (|). You can use a different character as a delimiter (if it's an allowed character) by specifying it under Delimiter for labels. If the training documents use a delimiter other than the default or the delimiter you specify, the labels on that line will be combined to make a single unique label, such as LABELLABELLABEL.
    */
  var LabelDelimiter: js.UndefOr[typings.awsSdk.clientsComprehendMod.LabelDelimiter] = js.undefined
  
  /**
    * The Amazon S3 URI for the input data. The S3 bucket must be in the same Region as the API endpoint that you are calling. The URI can point to a single input file or it can provide the prefix for a collection of input files. For example, if you use the URI S3://bucketName/prefix, if the prefix is a single file, Amazon Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend uses all of them as input. This parameter is required if you set DataFormat to COMPREHEND_CSV.
    */
  var S3Uri: js.UndefOr[typings.awsSdk.clientsComprehendMod.S3Uri] = js.undefined
  
  /**
    * This specifies the Amazon S3 location where the test annotations for an entity recognizer are located. The URI must be in the same Amazon Web Services Region as the API endpoint that you are calling. 
    */
  var TestS3Uri: js.UndefOr[S3Uri] = js.undefined
}
object DocumentClassifierInputDataConfig {
  
  inline def apply(): DocumentClassifierInputDataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentClassifierInputDataConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentClassifierInputDataConfig] (val x: Self) extends AnyVal {
    
    inline def setAugmentedManifests(value: DocumentClassifierAugmentedManifestsList): Self = StObject.set(x, "AugmentedManifests", value.asInstanceOf[js.Any])
    
    inline def setAugmentedManifestsUndefined: Self = StObject.set(x, "AugmentedManifests", js.undefined)
    
    inline def setAugmentedManifestsVarargs(value: AugmentedManifestsListItem*): Self = StObject.set(x, "AugmentedManifests", js.Array(value*))
    
    inline def setDataFormat(value: DocumentClassifierDataFormat): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "DataFormat", js.undefined)
    
    inline def setDocumentReaderConfig(value: DocumentReaderConfig): Self = StObject.set(x, "DocumentReaderConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentReaderConfigUndefined: Self = StObject.set(x, "DocumentReaderConfig", js.undefined)
    
    inline def setDocumentType(value: DocumentClassifierDocumentTypeFormat): Self = StObject.set(x, "DocumentType", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypeUndefined: Self = StObject.set(x, "DocumentType", js.undefined)
    
    inline def setDocuments(value: DocumentClassifierDocuments): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "Documents", js.undefined)
    
    inline def setLabelDelimiter(value: LabelDelimiter): Self = StObject.set(x, "LabelDelimiter", value.asInstanceOf[js.Any])
    
    inline def setLabelDelimiterUndefined: Self = StObject.set(x, "LabelDelimiter", js.undefined)
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    inline def setS3UriUndefined: Self = StObject.set(x, "S3Uri", js.undefined)
    
    inline def setTestS3Uri(value: S3Uri): Self = StObject.set(x, "TestS3Uri", value.asInstanceOf[js.Any])
    
    inline def setTestS3UriUndefined: Self = StObject.set(x, "TestS3Uri", js.undefined)
  }
}
