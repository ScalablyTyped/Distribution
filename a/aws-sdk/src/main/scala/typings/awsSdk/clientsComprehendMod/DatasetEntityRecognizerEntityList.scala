package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetEntityRecognizerEntityList extends StObject {
  
  /**
    * Specifies the Amazon S3 location where the entity list is located.
    */
  var S3Uri: typings.awsSdk.clientsComprehendMod.S3Uri
}
object DatasetEntityRecognizerEntityList {
  
  inline def apply(S3Uri: S3Uri): DatasetEntityRecognizerEntityList = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetEntityRecognizerEntityList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetEntityRecognizerEntityList] (val x: Self) extends AnyVal {
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
