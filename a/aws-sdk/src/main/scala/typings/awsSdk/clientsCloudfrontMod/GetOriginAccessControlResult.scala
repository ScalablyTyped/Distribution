package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOriginAccessControlResult extends StObject {
  
  /**
    * The version identifier for the current version of the origin access control.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * Contains an origin access control, including its unique identifier.
    */
  var OriginAccessControl: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.OriginAccessControl] = js.undefined
}
object GetOriginAccessControlResult {
  
  inline def apply(): GetOriginAccessControlResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOriginAccessControlResult]
  }
  
  extension [Self <: GetOriginAccessControlResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setOriginAccessControl(value: OriginAccessControl): Self = StObject.set(x, "OriginAccessControl", value.asInstanceOf[js.Any])
    
    inline def setOriginAccessControlUndefined: Self = StObject.set(x, "OriginAccessControl", js.undefined)
  }
}
