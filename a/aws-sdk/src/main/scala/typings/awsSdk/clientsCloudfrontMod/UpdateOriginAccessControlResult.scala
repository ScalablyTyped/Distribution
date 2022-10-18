package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOriginAccessControlResult extends StObject {
  
  /**
    * The new version of the origin access control after it has been updated.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The origin access control after it has been updated.
    */
  var OriginAccessControl: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.OriginAccessControl] = js.undefined
}
object UpdateOriginAccessControlResult {
  
  inline def apply(): UpdateOriginAccessControlResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOriginAccessControlResult]
  }
  
  extension [Self <: UpdateOriginAccessControlResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setOriginAccessControl(value: OriginAccessControl): Self = StObject.set(x, "OriginAccessControl", value.asInstanceOf[js.Any])
    
    inline def setOriginAccessControlUndefined: Self = StObject.set(x, "OriginAccessControl", js.undefined)
  }
}
