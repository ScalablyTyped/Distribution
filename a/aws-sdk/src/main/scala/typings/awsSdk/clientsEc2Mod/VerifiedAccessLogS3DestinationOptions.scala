package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessLogS3DestinationOptions extends StObject {
  
  /**
    * The bucket name.
    */
  var BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the Amazon S3 bucket.
    */
  var BucketOwner: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether logging is enabled.
    */
  var Enabled: Boolean
  
  /**
    * The bucket prefix.
    */
  var Prefix: js.UndefOr[String] = js.undefined
}
object VerifiedAccessLogS3DestinationOptions {
  
  inline def apply(Enabled: Boolean): VerifiedAccessLogS3DestinationOptions = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifiedAccessLogS3DestinationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessLogS3DestinationOptions] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setBucketOwner(value: String): Self = StObject.set(x, "BucketOwner", value.asInstanceOf[js.Any])
    
    inline def setBucketOwnerUndefined: Self = StObject.set(x, "BucketOwner", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
