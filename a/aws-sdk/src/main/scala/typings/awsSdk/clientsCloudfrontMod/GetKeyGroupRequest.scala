package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyGroupRequest extends StObject {
  
  /**
    * The identifier of the key group that you are getting. To get the identifier, use ListKeyGroups.
    */
  var Id: String
}
object GetKeyGroupRequest {
  
  inline def apply(Id: String): GetKeyGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetKeyGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
