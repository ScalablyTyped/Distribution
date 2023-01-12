package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOriginAccessControlRequest extends StObject {
  
  /**
    * The unique identifier of the origin access control.
    */
  var Id: String
}
object GetOriginAccessControlRequest {
  
  inline def apply(Id: String): GetOriginAccessControlRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOriginAccessControlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOriginAccessControlRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
