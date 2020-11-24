package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResult[T /* <: js.Object */] extends UpdateMetadata {
  
  var `new`: js.UndefOr[Document[T]] = js.native
  
  var old: js.UndefOr[Document[T]] = js.native
}
object UpdateResult {
  
  @scala.inline
  def apply[T /* <: js.Object */](_id: String, _key: String, _oldRev: String, _rev: String): UpdateResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _oldRev = _oldRev.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResult[T]]
  }
  
  @scala.inline
  implicit class UpdateResultOps[Self <: UpdateResult[_], T /* <: js.Object */] (val x: Self with UpdateResult[T]) extends AnyVal {
    
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
    def setNew(value: Document[T]): Self = this.set("new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew: Self = this.set("new", js.undefined)
    
    @scala.inline
    def setOld(value: Document[T]): Self = this.set("old", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOld: Self = this.set("old", js.undefined)
  }
}
