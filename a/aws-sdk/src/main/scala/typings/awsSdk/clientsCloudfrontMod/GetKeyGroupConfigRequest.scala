package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyGroupConfigRequest extends StObject {
  
  /**
    * The identifier of the key group whose configuration you are getting. To get the identifier, use ListKeyGroups.
    */
  var Id: String
}
object GetKeyGroupConfigRequest {
  
  inline def apply(Id: String): GetKeyGroupConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyGroupConfigRequest]
  }
  
  extension [Self <: GetKeyGroupConfigRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
