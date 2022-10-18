package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketVersioningOutput extends StObject {
  
  /**
    * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.
    */
  var MFADelete: js.UndefOr[MFADeleteStatus] = js.undefined
  
  /**
    * The versioning state of the bucket.
    */
  var Status: js.UndefOr[BucketVersioningStatus] = js.undefined
}
object GetBucketVersioningOutput {
  
  inline def apply(): GetBucketVersioningOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketVersioningOutput]
  }
  
  extension [Self <: GetBucketVersioningOutput](x: Self) {
    
    inline def setMFADelete(value: MFADeleteStatus): Self = StObject.set(x, "MFADelete", value.asInstanceOf[js.Any])
    
    inline def setMFADeleteUndefined: Self = StObject.set(x, "MFADelete", js.undefined)
    
    inline def setStatus(value: BucketVersioningStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
