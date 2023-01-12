package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDataConfig extends StObject {
  
  /**
    * The document reader config field applies only for InputDataConfig of StartEntitiesDetectionJob.  Use DocumentReaderConfig to provide specifications about how you want your inference documents read. Currently it applies for PDF documents in StartEntitiesDetectionJob custom inference.
    */
  var DocumentReaderConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.DocumentReaderConfig] = js.undefined
  
  /**
    * Specifies how the text in an input file should be processed:    ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when you are processing large documents, such as newspaper articles or scientific papers.    ONE_DOC_PER_LINE - Each line in a file is considered a separate document. Use this option when you are processing many short documents, such as text messages.  
    */
  var InputFormat: js.UndefOr[typings.awsSdk.clientsComprehendMod.InputFormat] = js.undefined
  
  /**
    * The Amazon S3 URI for the input data. The URI must be in same region as the API endpoint that you are calling. The URI can point to a single input file or it can provide the prefix for a collection of data files.  For example, if you use the URI S3://bucketName/prefix, if the prefix is a single file, Amazon Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend uses all of them as input.
    */
  var S3Uri: typings.awsSdk.clientsComprehendMod.S3Uri
}
object InputDataConfig {
  
  inline def apply(S3Uri: S3Uri): InputDataConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDataConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputDataConfig] (val x: Self) extends AnyVal {
    
    inline def setDocumentReaderConfig(value: DocumentReaderConfig): Self = StObject.set(x, "DocumentReaderConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentReaderConfigUndefined: Self = StObject.set(x, "DocumentReaderConfig", js.undefined)
    
    inline def setInputFormat(value: InputFormat): Self = StObject.set(x, "InputFormat", value.asInstanceOf[js.Any])
    
    inline def setInputFormatUndefined: Self = StObject.set(x, "InputFormat", js.undefined)
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
