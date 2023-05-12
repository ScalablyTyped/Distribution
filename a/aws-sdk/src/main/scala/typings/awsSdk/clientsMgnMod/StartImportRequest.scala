package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartImportRequest extends StObject {
  
  /**
    * Start import request client token.
    */
  var clientToken: js.UndefOr[ClientIdempotencyToken] = js.undefined
  
  /**
    * Start import request s3 bucket source.
    */
  var s3BucketSource: S3BucketSource
}
object StartImportRequest {
  
  inline def apply(s3BucketSource: S3BucketSource): StartImportRequest = {
    val __obj = js.Dynamic.literal(s3BucketSource = s3BucketSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartImportRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientIdempotencyToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setS3BucketSource(value: S3BucketSource): Self = StObject.set(x, "s3BucketSource", value.asInstanceOf[js.Any])
  }
}
