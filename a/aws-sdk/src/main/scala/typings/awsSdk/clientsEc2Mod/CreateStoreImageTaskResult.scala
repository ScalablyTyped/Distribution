package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStoreImageTaskResult extends StObject {
  
  /**
    * The name of the stored AMI object in the S3 bucket.
    */
  var ObjectKey: js.UndefOr[String] = js.undefined
}
object CreateStoreImageTaskResult {
  
  inline def apply(): CreateStoreImageTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStoreImageTaskResult]
  }
  
  extension [Self <: CreateStoreImageTaskResult](x: Self) {
    
    inline def setObjectKey(value: String): Self = StObject.set(x, "ObjectKey", value.asInstanceOf[js.Any])
    
    inline def setObjectKeyUndefined: Self = StObject.set(x, "ObjectKey", js.undefined)
  }
}
