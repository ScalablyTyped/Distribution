package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Destination extends StObject {
  
  /**
    * The name of the Amazon S3 bucket used as the destination of an export file.
    */
  var bucket: js.UndefOr[DestinationBucket] = js.undefined
  
  /**
    * The Amazon S3 bucket key of an export file. The key uniquely identifies the object, or export file, in the S3 bucket.
    */
  var key: js.UndefOr[DestinationKey] = js.undefined
  
  /**
    * The Amazon S3 bucket key of a metadata file. The key uniquely identifies the object, or metadata file, in the S3 bucket.
    */
  var metadataKey: js.UndefOr[MetadataKey] = js.undefined
}
object S3Destination {
  
  inline def apply(): S3Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Destination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Destination] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: DestinationBucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setKey(value: DestinationKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMetadataKey(value: MetadataKey): Self = StObject.set(x, "metadataKey", value.asInstanceOf[js.Any])
    
    inline def setMetadataKeyUndefined: Self = StObject.set(x, "metadataKey", js.undefined)
  }
}
