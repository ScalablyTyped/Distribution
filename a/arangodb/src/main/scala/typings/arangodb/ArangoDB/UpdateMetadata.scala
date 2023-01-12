package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMetadata
  extends StObject
     with DocumentMetadata {
  
  var _oldRev: String
}
object UpdateMetadata {
  
  inline def apply(_id: String, _key: String, _oldRev: String, _rev: String): UpdateMetadata = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _oldRev = _oldRev.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMetadata] (val x: Self) extends AnyVal {
    
    inline def set_oldRev(value: String): Self = StObject.set(x, "_oldRev", value.asInstanceOf[js.Any])
  }
}
