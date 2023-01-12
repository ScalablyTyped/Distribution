package typings.awsLambda.triggerSesMod

import typings.awsLambda.awsLambdaStrings.S3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESReceiptS3Action extends StObject {
  
  var bucketName: String
  
  var objectKey: String
  
  var topicArn: js.UndefOr[String] = js.undefined
  
  var `type`: S3
}
object SESReceiptS3Action {
  
  inline def apply(bucketName: String, objectKey: String): SESReceiptS3Action = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("S3")
    __obj.asInstanceOf[SESReceiptS3Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SESReceiptS3Action] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setObjectKey(value: String): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
    
    inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    
    inline def setType(value: S3): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
