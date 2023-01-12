package typings.awsSdk.clientsMacieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ResourceClassification extends StObject {
  
  /**
    * (Discontinued) The name of the S3 bucket that you want to associate with Amazon Macie Classic.
    */
  var bucketName: BucketName
  
  /**
    * (Discontinued) The classification type that you want to specify for the resource associated with Amazon Macie Classic. 
    */
  var classificationType: ClassificationType
  
  /**
    * (Discontinued) The prefix of the S3 bucket that you want to associate with Amazon Macie Classic.
    */
  var prefix: js.UndefOr[Prefix] = js.undefined
}
object S3ResourceClassification {
  
  inline def apply(bucketName: BucketName, classificationType: ClassificationType): S3ResourceClassification = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], classificationType = classificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ResourceClassification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ResourceClassification] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setClassificationType(value: ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
