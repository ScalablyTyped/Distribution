package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOriginAccessControlResult extends StObject {
  
  /**
    * The version identifier for the current version of the origin access control.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the origin access control.
    */
  var Location: js.UndefOr[String] = js.undefined
  
  /**
    * Contains an origin access control.
    */
  var OriginAccessControl: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.OriginAccessControl] = js.undefined
}
object CreateOriginAccessControlResult {
  
  inline def apply(): CreateOriginAccessControlResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOriginAccessControlResult]
  }
  
  extension [Self <: CreateOriginAccessControlResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setOriginAccessControl(value: OriginAccessControl): Self = StObject.set(x, "OriginAccessControl", value.asInstanceOf[js.Any])
    
    inline def setOriginAccessControlUndefined: Self = StObject.set(x, "OriginAccessControl", js.undefined)
  }
}
