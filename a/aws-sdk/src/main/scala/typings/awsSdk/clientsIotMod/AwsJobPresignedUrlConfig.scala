package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsJobPresignedUrlConfig extends StObject {
  
  /**
    * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 1800 seconds. Pre-signed URLs are generated when a request for the job document is received.
    */
  var expiresInSec: js.UndefOr[ExpiresInSeconds] = js.undefined
}
object AwsJobPresignedUrlConfig {
  
  inline def apply(): AwsJobPresignedUrlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsJobPresignedUrlConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsJobPresignedUrlConfig] (val x: Self) extends AnyVal {
    
    inline def setExpiresInSec(value: ExpiresInSeconds): Self = StObject.set(x, "expiresInSec", value.asInstanceOf[js.Any])
    
    inline def setExpiresInSecUndefined: Self = StObject.set(x, "expiresInSec", js.undefined)
  }
}
