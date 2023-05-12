package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentClassifierDocuments extends StObject {
  
  /**
    * The S3 URI location of the training documents specified in the S3Uri CSV file.
    */
  var S3Uri: typings.awsSdk.clientsComprehendMod.S3Uri
  
  /**
    * The S3 URI location of the test documents included in the TestS3Uri CSV file. This field is not required if you do not specify a test CSV file.
    */
  var TestS3Uri: js.UndefOr[S3Uri] = js.undefined
}
object DocumentClassifierDocuments {
  
  inline def apply(S3Uri: S3Uri): DocumentClassifierDocuments = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentClassifierDocuments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentClassifierDocuments] (val x: Self) extends AnyVal {
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    inline def setTestS3Uri(value: S3Uri): Self = StObject.set(x, "TestS3Uri", value.asInstanceOf[js.Any])
    
    inline def setTestS3UriUndefined: Self = StObject.set(x, "TestS3Uri", js.undefined)
  }
}
