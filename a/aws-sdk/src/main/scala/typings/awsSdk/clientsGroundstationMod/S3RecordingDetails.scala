package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3RecordingDetails extends StObject {
  
  /**
    * ARN of the bucket used.
    */
  var bucketArn: js.UndefOr[BucketArn] = js.undefined
  
  /**
    * Key template used for the S3 Recording Configuration
    */
  var keyTemplate: js.UndefOr[String] = js.undefined
}
object S3RecordingDetails {
  
  inline def apply(): S3RecordingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3RecordingDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3RecordingDetails] (val x: Self) extends AnyVal {
    
    inline def setBucketArn(value: BucketArn): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    inline def setBucketArnUndefined: Self = StObject.set(x, "bucketArn", js.undefined)
    
    inline def setKeyTemplate(value: String): Self = StObject.set(x, "keyTemplate", value.asInstanceOf[js.Any])
    
    inline def setKeyTemplateUndefined: Self = StObject.set(x, "keyTemplate", js.undefined)
  }
}
