package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ContentBaseLocationUpdate extends StObject {
  
  /**
    * The updated S3 bucket path.
    */
  var BasePathUpdate: js.UndefOr[BasePath] = js.undefined
  
  /**
    * The updated Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARNUpdate: js.UndefOr[BucketARN] = js.undefined
}
object S3ContentBaseLocationUpdate {
  
  inline def apply(): S3ContentBaseLocationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ContentBaseLocationUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ContentBaseLocationUpdate] (val x: Self) extends AnyVal {
    
    inline def setBasePathUpdate(value: BasePath): Self = StObject.set(x, "BasePathUpdate", value.asInstanceOf[js.Any])
    
    inline def setBasePathUpdateUndefined: Self = StObject.set(x, "BasePathUpdate", js.undefined)
    
    inline def setBucketARNUpdate(value: BucketARN): Self = StObject.set(x, "BucketARNUpdate", value.asInstanceOf[js.Any])
    
    inline def setBucketARNUpdateUndefined: Self = StObject.set(x, "BucketARNUpdate", js.undefined)
  }
}
