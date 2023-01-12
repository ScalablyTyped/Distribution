package typings.awsSdk.clientsMacieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ResourceClassificationUpdate extends StObject {
  
  /**
    * (Discontinued) The name of the S3 bucket whose classification types you want to update.
    */
  var bucketName: BucketName
  
  /**
    * (Discontinued) The classification type that you want to update for the resource associated with Amazon Macie Classic. 
    */
  var classificationTypeUpdate: ClassificationTypeUpdate
  
  /**
    * (Discontinued) The prefix of the S3 bucket whose classification types you want to update.
    */
  var prefix: js.UndefOr[Prefix] = js.undefined
}
object S3ResourceClassificationUpdate {
  
  inline def apply(bucketName: BucketName, classificationTypeUpdate: ClassificationTypeUpdate): S3ResourceClassificationUpdate = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], classificationTypeUpdate = classificationTypeUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ResourceClassificationUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ResourceClassificationUpdate] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setClassificationTypeUpdate(value: ClassificationTypeUpdate): Self = StObject.set(x, "classificationTypeUpdate", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
