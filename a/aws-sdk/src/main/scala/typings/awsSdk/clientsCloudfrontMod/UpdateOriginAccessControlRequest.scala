package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOriginAccessControlRequest extends StObject {
  
  /**
    * The unique identifier of the origin access control that you are updating.
    */
  var Id: String
  
  /**
    * The current version (ETag value) of the origin access control that you are updating.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
  
  /**
    * An origin access control.
    */
  var OriginAccessControlConfig: typings.awsSdk.clientsCloudfrontMod.OriginAccessControlConfig
}
object UpdateOriginAccessControlRequest {
  
  inline def apply(Id: String, OriginAccessControlConfig: OriginAccessControlConfig): UpdateOriginAccessControlRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], OriginAccessControlConfig = OriginAccessControlConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOriginAccessControlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOriginAccessControlRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
    
    inline def setOriginAccessControlConfig(value: OriginAccessControlConfig): Self = StObject.set(x, "OriginAccessControlConfig", value.asInstanceOf[js.Any])
  }
}
