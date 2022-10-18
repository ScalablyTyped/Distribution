package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOriginAccessControlConfigRequest extends StObject {
  
  /**
    * The unique identifier of the origin access control.
    */
  var Id: String
}
object GetOriginAccessControlConfigRequest {
  
  inline def apply(Id: String): GetOriginAccessControlConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOriginAccessControlConfigRequest]
  }
  
  extension [Self <: GetOriginAccessControlConfigRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
