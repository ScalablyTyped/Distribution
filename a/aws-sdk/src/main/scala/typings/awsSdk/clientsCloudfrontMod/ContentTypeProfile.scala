package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTypeProfile extends StObject {
  
  /**
    * The content type for a field-level encryption content type-profile mapping. 
    */
  var ContentType: String
  
  /**
    * The format for a field-level encryption content type-profile mapping. 
    */
  var Format: typings.awsSdk.clientsCloudfrontMod.Format
  
  /**
    * The profile ID for a field-level encryption content type-profile mapping. 
    */
  var ProfileId: js.UndefOr[String] = js.undefined
}
object ContentTypeProfile {
  
  inline def apply(ContentType: String, Format: Format): ContentTypeProfile = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentTypeProfile] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setProfileId(value: String): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "ProfileId", js.undefined)
  }
}
