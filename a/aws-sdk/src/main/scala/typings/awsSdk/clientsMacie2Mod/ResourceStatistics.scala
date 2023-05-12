package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceStatistics extends StObject {
  
  /**
    * The total amount of data, in bytes, that Amazon Macie has analyzed in the bucket.
    */
  var totalBytesClassified: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of occurrences of sensitive data that Amazon Macie has found in the bucket's objects. This includes occurrences that are currently suppressed by the sensitivity scoring settings for the bucket (totalDetectionsSuppressed).
    */
  var totalDetections: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of occurrences of sensitive data that are currently suppressed by the sensitivity scoring settings for the bucket. These represent occurrences of sensitive data that Amazon Macie found in the bucket's objects, but the occurrences were manually suppressed. By default, suppressed occurrences are excluded from the bucket's sensitivity score.
    */
  var totalDetectionsSuppressed: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie has analyzed in the bucket.
    */
  var totalItemsClassified: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of the bucket's objects that Amazon Macie has found sensitive data in.
    */
  var totalItemsSensitive: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie hasn't analyzed in the bucket due to an error or issue. For example, the object is a malformed file. This value includes objects that Macie hasn't analyzed for reasons reported by other statistics in the ResourceStatistics object. 
    */
  var totalItemsSkipped: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are encrypted with a key that Macie isn't allowed to use.
    */
  var totalItemsSkippedInvalidEncryption: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are encrypted with an KMS key that was disabled or deleted.
    */
  var totalItemsSkippedInvalidKms: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie hasn't analyzed in the bucket because Macie isn't allowed to access the objects.
    */
  var totalItemsSkippedPermissionDenied: js.UndefOr[long] = js.undefined
}
object ResourceStatistics {
  
  inline def apply(): ResourceStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceStatistics] (val x: Self) extends AnyVal {
    
    inline def setTotalBytesClassified(value: long): Self = StObject.set(x, "totalBytesClassified", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesClassifiedUndefined: Self = StObject.set(x, "totalBytesClassified", js.undefined)
    
    inline def setTotalDetections(value: long): Self = StObject.set(x, "totalDetections", value.asInstanceOf[js.Any])
    
    inline def setTotalDetectionsSuppressed(value: long): Self = StObject.set(x, "totalDetectionsSuppressed", value.asInstanceOf[js.Any])
    
    inline def setTotalDetectionsSuppressedUndefined: Self = StObject.set(x, "totalDetectionsSuppressed", js.undefined)
    
    inline def setTotalDetectionsUndefined: Self = StObject.set(x, "totalDetections", js.undefined)
    
    inline def setTotalItemsClassified(value: long): Self = StObject.set(x, "totalItemsClassified", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsClassifiedUndefined: Self = StObject.set(x, "totalItemsClassified", js.undefined)
    
    inline def setTotalItemsSensitive(value: long): Self = StObject.set(x, "totalItemsSensitive", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsSensitiveUndefined: Self = StObject.set(x, "totalItemsSensitive", js.undefined)
    
    inline def setTotalItemsSkipped(value: long): Self = StObject.set(x, "totalItemsSkipped", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsSkippedInvalidEncryption(value: long): Self = StObject.set(x, "totalItemsSkippedInvalidEncryption", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsSkippedInvalidEncryptionUndefined: Self = StObject.set(x, "totalItemsSkippedInvalidEncryption", js.undefined)
    
    inline def setTotalItemsSkippedInvalidKms(value: long): Self = StObject.set(x, "totalItemsSkippedInvalidKms", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsSkippedInvalidKmsUndefined: Self = StObject.set(x, "totalItemsSkippedInvalidKms", js.undefined)
    
    inline def setTotalItemsSkippedPermissionDenied(value: long): Self = StObject.set(x, "totalItemsSkippedPermissionDenied", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsSkippedPermissionDeniedUndefined: Self = StObject.set(x, "totalItemsSkippedPermissionDenied", js.undefined)
    
    inline def setTotalItemsSkippedUndefined: Self = StObject.set(x, "totalItemsSkipped", js.undefined)
  }
}
