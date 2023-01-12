package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryArgProfileConfig extends StObject {
  
  /**
    * Flag to set if you want a request to be forwarded to the origin even if the profile specified by the field-level encryption query argument, fle-profile, is unknown.
    */
  var ForwardWhenQueryArgProfileIsUnknown: Boolean
  
  /**
    * Profiles specified for query argument-profile mapping for field-level encryption.
    */
  var QueryArgProfiles: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.QueryArgProfiles] = js.undefined
}
object QueryArgProfileConfig {
  
  inline def apply(ForwardWhenQueryArgProfileIsUnknown: Boolean): QueryArgProfileConfig = {
    val __obj = js.Dynamic.literal(ForwardWhenQueryArgProfileIsUnknown = ForwardWhenQueryArgProfileIsUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArgProfileConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryArgProfileConfig] (val x: Self) extends AnyVal {
    
    inline def setForwardWhenQueryArgProfileIsUnknown(value: Boolean): Self = StObject.set(x, "ForwardWhenQueryArgProfileIsUnknown", value.asInstanceOf[js.Any])
    
    inline def setQueryArgProfiles(value: QueryArgProfiles): Self = StObject.set(x, "QueryArgProfiles", value.asInstanceOf[js.Any])
    
    inline def setQueryArgProfilesUndefined: Self = StObject.set(x, "QueryArgProfiles", js.undefined)
  }
}
