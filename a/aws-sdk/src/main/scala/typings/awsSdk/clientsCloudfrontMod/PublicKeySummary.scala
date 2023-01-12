package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeySummary extends StObject {
  
  /**
    * A comment to describe the public key. The comment cannot be longer than 128 characters.
    */
  var Comment: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the public key was uploaded.
    */
  var CreatedTime: js.Date
  
  /**
    * The public key.
    */
  var EncodedKey: String
  
  /**
    * The identifier of the public key.
    */
  var Id: String
  
  /**
    * A name to help identify the public key.
    */
  var Name: String
}
object PublicKeySummary {
  
  inline def apply(CreatedTime: js.Date, EncodedKey: String, Id: String, Name: String): PublicKeySummary = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], EncodedKey = EncodedKey.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeySummary] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setEncodedKey(value: String): Self = StObject.set(x, "EncodedKey", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
