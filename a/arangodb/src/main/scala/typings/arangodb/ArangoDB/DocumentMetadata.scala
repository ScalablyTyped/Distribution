package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentMetadata extends js.Object {
  
  var _id: String = js.native
  
  var _key: String = js.native
  
  var _rev: String = js.native
}
object DocumentMetadata {
  
  @scala.inline
  def apply(_id: String, _key: String, _rev: String): DocumentMetadata = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetadata]
  }
  
  @scala.inline
  implicit class DocumentMetadataOps[Self <: DocumentMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_key(value: String): Self = this.set("_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_rev(value: String): Self = this.set("_rev", value.asInstanceOf[js.Any])
  }
}
