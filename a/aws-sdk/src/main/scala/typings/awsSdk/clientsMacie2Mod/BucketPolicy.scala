package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketPolicy extends StObject {
  
  /**
    * Specifies whether the bucket policy allows the general public to have read access to the bucket.
    */
  var allowsPublicReadAccess: js.UndefOr[boolean] = js.undefined
  
  /**
    * Specifies whether the bucket policy allows the general public to have write access to the bucket.
    */
  var allowsPublicWriteAccess: js.UndefOr[boolean] = js.undefined
}
object BucketPolicy {
  
  inline def apply(): BucketPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPolicy]
  }
  
  extension [Self <: BucketPolicy](x: Self) {
    
    inline def setAllowsPublicReadAccess(value: boolean): Self = StObject.set(x, "allowsPublicReadAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowsPublicReadAccessUndefined: Self = StObject.set(x, "allowsPublicReadAccess", js.undefined)
    
    inline def setAllowsPublicWriteAccess(value: boolean): Self = StObject.set(x, "allowsPublicWriteAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowsPublicWriteAccessUndefined: Self = StObject.set(x, "allowsPublicWriteAccess", js.undefined)
  }
}
