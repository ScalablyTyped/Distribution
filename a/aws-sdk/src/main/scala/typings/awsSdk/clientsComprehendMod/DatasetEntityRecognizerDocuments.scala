package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetEntityRecognizerDocuments extends StObject {
  
  /**
    *  Specifies how the text in an input file should be processed. This is optional, and the default is ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when you are processing large documents, such as newspaper articles or scientific papers. ONE_DOC_PER_LINE - Each line in a file is considered a separate document. Use this option when you are processing many short documents, such as text messages.
    */
  var InputFormat: js.UndefOr[typings.awsSdk.clientsComprehendMod.InputFormat] = js.undefined
  
  /**
    *  Specifies the Amazon S3 location where the documents for the dataset are located. 
    */
  var S3Uri: typings.awsSdk.clientsComprehendMod.S3Uri
}
object DatasetEntityRecognizerDocuments {
  
  inline def apply(S3Uri: S3Uri): DatasetEntityRecognizerDocuments = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetEntityRecognizerDocuments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetEntityRecognizerDocuments] (val x: Self) extends AnyVal {
    
    inline def setInputFormat(value: InputFormat): Self = StObject.set(x, "InputFormat", value.asInstanceOf[js.Any])
    
    inline def setInputFormatUndefined: Self = StObject.set(x, "InputFormat", js.undefined)
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
