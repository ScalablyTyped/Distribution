package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryArgProfile extends StObject {
  
  /**
    * ID of profile to use for field-level encryption query argument-profile mapping
    */
  var ProfileId: String
  
  /**
    * Query argument for field-level encryption query argument-profile mapping.
    */
  var QueryArg: String
}
object QueryArgProfile {
  
  inline def apply(ProfileId: String, QueryArg: String): QueryArgProfile = {
    val __obj = js.Dynamic.literal(ProfileId = ProfileId.asInstanceOf[js.Any], QueryArg = QueryArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArgProfile]
  }
  
  extension [Self <: QueryArgProfile](x: Self) {
    
    inline def setProfileId(value: String): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
    
    inline def setQueryArg(value: String): Self = StObject.set(x, "QueryArg", value.asInstanceOf[js.Any])
  }
}
