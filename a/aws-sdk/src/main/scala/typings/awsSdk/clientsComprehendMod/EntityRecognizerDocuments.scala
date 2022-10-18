package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityRecognizerDocuments extends StObject {
  
  /**
    *  Specifies how the text in an input file should be processed. This is optional, and the default is ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when you are processing large documents, such as newspaper articles or scientific papers. ONE_DOC_PER_LINE - Each line in a file is considered a separate document. Use this option when you are processing many short documents, such as text messages.
    */
  var InputFormat: js.UndefOr[typings.awsSdk.clientsComprehendMod.InputFormat] = js.undefined
  
  /**
    *  Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The URI must be in the same region as the API endpoint that you are calling.
    */
  var S3Uri: typings.awsSdk.clientsComprehendMod.S3Uri
  
  /**
    *  Specifies the Amazon S3 location where the test documents for an entity recognizer are located. The URI must be in the same AWS Region as the API endpoint that you are calling.
    */
  var TestS3Uri: js.UndefOr[S3Uri] = js.undefined
}
object EntityRecognizerDocuments {
  
  inline def apply(S3Uri: S3Uri): EntityRecognizerDocuments = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerDocuments]
  }
  
  extension [Self <: EntityRecognizerDocuments](x: Self) {
    
    inline def setInputFormat(value: InputFormat): Self = StObject.set(x, "InputFormat", value.asInstanceOf[js.Any])
    
    inline def setInputFormatUndefined: Self = StObject.set(x, "InputFormat", js.undefined)
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    inline def setTestS3Uri(value: S3Uri): Self = StObject.set(x, "TestS3Uri", value.asInstanceOf[js.Any])
    
    inline def setTestS3UriUndefined: Self = StObject.set(x, "TestS3Uri", js.undefined)
  }
}
