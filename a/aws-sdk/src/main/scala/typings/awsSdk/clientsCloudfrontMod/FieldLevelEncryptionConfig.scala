package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldLevelEncryptionConfig extends StObject {
  
  /**
    * A unique number that ensures the request can't be replayed.
    */
  var CallerReference: String
  
  /**
    * An optional comment about the configuration. The comment cannot be longer than 128 characters.
    */
  var Comment: js.UndefOr[String] = js.undefined
  
  /**
    * A complex data type that specifies when to forward content if a content type isn't recognized and profiles to use as by default in a request if a query argument doesn't specify a profile to use.
    */
  var ContentTypeProfileConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.ContentTypeProfileConfig] = js.undefined
  
  /**
    * A complex data type that specifies when to forward content if a profile isn't found and the profile that can be provided as a query argument in a request.
    */
  var QueryArgProfileConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.QueryArgProfileConfig] = js.undefined
}
object FieldLevelEncryptionConfig {
  
  inline def apply(CallerReference: String): FieldLevelEncryptionConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionConfig]
  }
  
  extension [Self <: FieldLevelEncryptionConfig](x: Self) {
    
    inline def setCallerReference(value: String): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setContentTypeProfileConfig(value: ContentTypeProfileConfig): Self = StObject.set(x, "ContentTypeProfileConfig", value.asInstanceOf[js.Any])
    
    inline def setContentTypeProfileConfigUndefined: Self = StObject.set(x, "ContentTypeProfileConfig", js.undefined)
    
    inline def setQueryArgProfileConfig(value: QueryArgProfileConfig): Self = StObject.set(x, "QueryArgProfileConfig", value.asInstanceOf[js.Any])
    
    inline def setQueryArgProfileConfigUndefined: Self = StObject.set(x, "QueryArgProfileConfig", js.undefined)
  }
}
