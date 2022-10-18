package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyGroupConfig extends StObject {
  
  /**
    * A comment to describe the key group. The comment cannot be longer than 128 characters.
    */
  var Comment: js.UndefOr[String] = js.undefined
  
  /**
    * A list of the identifiers of the public keys in the key group.
    */
  var Items: PublicKeyIdList
  
  /**
    * A name to identify the key group.
    */
  var Name: String
}
object KeyGroupConfig {
  
  inline def apply(Items: PublicKeyIdList, Name: String): KeyGroupConfig = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyGroupConfig]
  }
  
  extension [Self <: KeyGroupConfig](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setItems(value: PublicKeyIdList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
