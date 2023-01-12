package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOriginAccessControlRequest extends StObject {
  
  /**
    * The unique identifier of the origin access control that you are deleting.
    */
  var Id: String
  
  /**
    * The current version (ETag value) of the origin access control that you are deleting.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object DeleteOriginAccessControlRequest {
  
  inline def apply(Id: String): DeleteOriginAccessControlRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOriginAccessControlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteOriginAccessControlRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
