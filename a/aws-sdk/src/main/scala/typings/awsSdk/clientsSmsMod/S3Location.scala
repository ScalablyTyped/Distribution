package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    * The Amazon S3 bucket name.
    */
  var bucket: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * The Amazon S3 bucket key.
    */
  var key: js.UndefOr[S3KeyName] = js.undefined
}
object S3Location {
  
  inline def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Location]
  }
  
  extension [Self <: S3Location](x: Self) {
    
    inline def setBucket(value: S3BucketName): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setKey(value: S3KeyName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
