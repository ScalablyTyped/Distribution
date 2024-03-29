package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOriginAccessControlRequest extends StObject {
  
  /**
    * Contains the origin access control.
    */
  var OriginAccessControlConfig: typings.awsSdk.clientsCloudfrontMod.OriginAccessControlConfig
}
object CreateOriginAccessControlRequest {
  
  inline def apply(OriginAccessControlConfig: OriginAccessControlConfig): CreateOriginAccessControlRequest = {
    val __obj = js.Dynamic.literal(OriginAccessControlConfig = OriginAccessControlConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOriginAccessControlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOriginAccessControlRequest] (val x: Self) extends AnyVal {
    
    inline def setOriginAccessControlConfig(value: OriginAccessControlConfig): Self = StObject.set(x, "OriginAccessControlConfig", value.asInstanceOf[js.Any])
  }
}
