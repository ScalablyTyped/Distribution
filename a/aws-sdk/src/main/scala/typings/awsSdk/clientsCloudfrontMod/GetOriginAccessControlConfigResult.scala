package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOriginAccessControlConfigResult extends StObject {
  
  /**
    * The version identifier for the current version of the origin access control.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * Contains an origin access control configuration.
    */
  var OriginAccessControlConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.OriginAccessControlConfig] = js.undefined
}
object GetOriginAccessControlConfigResult {
  
  inline def apply(): GetOriginAccessControlConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOriginAccessControlConfigResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOriginAccessControlConfigResult] (val x: Self) extends AnyVal {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setOriginAccessControlConfig(value: OriginAccessControlConfig): Self = StObject.set(x, "OriginAccessControlConfig", value.asInstanceOf[js.Any])
    
    inline def setOriginAccessControlConfigUndefined: Self = StObject.set(x, "OriginAccessControlConfig", js.undefined)
  }
}
