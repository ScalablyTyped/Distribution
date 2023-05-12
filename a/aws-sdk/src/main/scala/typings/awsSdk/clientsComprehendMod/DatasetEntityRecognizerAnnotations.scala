package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetEntityRecognizerAnnotations extends StObject {
  
  /**
    *  Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The URI must be in the same Region as the API endpoint that you are calling.
    */
  var S3Uri: typings.awsSdk.clientsComprehendMod.S3Uri
}
object DatasetEntityRecognizerAnnotations {
  
  inline def apply(S3Uri: S3Uri): DatasetEntityRecognizerAnnotations = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetEntityRecognizerAnnotations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetEntityRecognizerAnnotations] (val x: Self) extends AnyVal {
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
