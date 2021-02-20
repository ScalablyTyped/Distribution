package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMetadata extends DocumentMetadata {
  
  var _oldRev: String = js.native
}
object UpdateMetadata {
  
  @scala.inline
  def apply(_id: String, _key: String, _oldRev: String, _rev: String): UpdateMetadata = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _oldRev = _oldRev.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMetadata]
  }
  
  @scala.inline
  implicit class UpdateMetadataMutableBuilder[Self <: UpdateMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_oldRev(value: String): Self = StObject.set(x, "_oldRev", value.asInstanceOf[js.Any])
  }
}
