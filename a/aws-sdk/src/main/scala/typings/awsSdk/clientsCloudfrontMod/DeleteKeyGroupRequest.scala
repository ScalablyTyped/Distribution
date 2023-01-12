package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteKeyGroupRequest extends StObject {
  
  /**
    * The identifier of the key group that you are deleting. To get the identifier, use ListKeyGroups.
    */
  var Id: String
  
  /**
    * The version of the key group that you are deleting. The version is the key group’s ETag value. To get the ETag, use GetKeyGroup or GetKeyGroupConfig.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object DeleteKeyGroupRequest {
  
  inline def apply(Id: String): DeleteKeyGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKeyGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteKeyGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
