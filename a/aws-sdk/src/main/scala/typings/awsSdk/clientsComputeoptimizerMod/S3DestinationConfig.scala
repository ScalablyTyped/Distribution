package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DestinationConfig extends StObject {
  
  /**
    * The name of the Amazon S3 bucket to use as the destination for an export job.
    */
  var bucket: js.UndefOr[DestinationBucket] = js.undefined
  
  /**
    * The Amazon S3 bucket prefix for an export job.
    */
  var keyPrefix: js.UndefOr[DestinationKeyPrefix] = js.undefined
}
object S3DestinationConfig {
  
  inline def apply(): S3DestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3DestinationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3DestinationConfig] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: DestinationBucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setKeyPrefix(value: DestinationKeyPrefix): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
  }
}
