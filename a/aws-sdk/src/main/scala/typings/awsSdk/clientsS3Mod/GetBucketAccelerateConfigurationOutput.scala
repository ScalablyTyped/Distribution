package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketAccelerateConfigurationOutput extends StObject {
  
  /**
    * The accelerate configuration of the bucket.
    */
  var Status: js.UndefOr[BucketAccelerateStatus] = js.undefined
}
object GetBucketAccelerateConfigurationOutput {
  
  inline def apply(): GetBucketAccelerateConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketAccelerateConfigurationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketAccelerateConfigurationOutput] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: BucketAccelerateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
