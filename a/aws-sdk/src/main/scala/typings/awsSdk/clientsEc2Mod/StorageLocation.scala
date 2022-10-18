package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageLocation extends StObject {
  
  /**
    * The name of the S3 bucket.
    */
  var Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The key.
    */
  var Key: js.UndefOr[String] = js.undefined
}
object StorageLocation {
  
  inline def apply(): StorageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageLocation]
  }
  
  extension [Self <: StorageLocation](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
