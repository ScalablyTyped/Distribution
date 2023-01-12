package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceS3InputConfiguration extends StObject {
  
  /**
    * The bucket containing the input dataset for the inference. 
    */
  var Bucket: S3Bucket
  
  /**
    * The prefix for the S3 bucket used for the input data for the inference. 
    */
  var Prefix: js.UndefOr[S3Prefix] = js.undefined
}
object InferenceS3InputConfiguration {
  
  inline def apply(Bucket: S3Bucket): InferenceS3InputConfiguration = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceS3InputConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferenceS3InputConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: S3Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
