package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketOwnershipControlsOutput extends StObject {
  
  /**
    * The OwnershipControls (BucketOwnerEnforced, BucketOwnerPreferred, or ObjectWriter) currently in effect for this Amazon S3 bucket.
    */
  var OwnershipControls: js.UndefOr[typings.awsSdk.clientsS3Mod.OwnershipControls] = js.undefined
}
object GetBucketOwnershipControlsOutput {
  
  inline def apply(): GetBucketOwnershipControlsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketOwnershipControlsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketOwnershipControlsOutput] (val x: Self) extends AnyVal {
    
    inline def setOwnershipControls(value: OwnershipControls): Self = StObject.set(x, "OwnershipControls", value.asInstanceOf[js.Any])
    
    inline def setOwnershipControlsUndefined: Self = StObject.set(x, "OwnershipControls", js.undefined)
  }
}
