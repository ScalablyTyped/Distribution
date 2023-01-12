package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProfileResponse extends StObject {
  
  /**
    * The content encoding of the profile.
    */
  var contentEncoding: js.UndefOr[String] = js.undefined
  
  /**
    * The content type of the profile in the payload. It is either application/json or the default application/x-amzn-ion.
    */
  var contentType: String
  
  /**
    * Information about the profile.
    */
  var profile: AggregatedProfile
}
object GetProfileResponse {
  
  inline def apply(contentType: String, profile: AggregatedProfile): GetProfileResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: AggregatedProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
