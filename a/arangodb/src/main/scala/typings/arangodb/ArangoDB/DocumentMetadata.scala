package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentMetadata extends StObject {
  
  var _id: String
  
  var _key: String
  
  var _rev: String
}
object DocumentMetadata {
  
  inline def apply(_id: String, _key: String, _rev: String): DocumentMetadata = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentMetadata] (val x: Self) extends AnyVal {
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_key(value: String): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
    
    inline def set_rev(value: String): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
  }
}
