package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketOwner extends StObject {
  
  /**
    * The display name of the account that owns the bucket.
    */
  var displayName: js.UndefOr[string] = js.undefined
  
  /**
    * The canonical user ID for the account that owns the bucket.
    */
  var id: js.UndefOr[string] = js.undefined
}
object S3BucketOwner {
  
  inline def apply(): S3BucketOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketOwner]
  }
  
  extension [Self <: S3BucketOwner](x: Self) {
    
    inline def setDisplayName(value: string): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
