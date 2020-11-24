package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexDescription[T] extends js.Object {
  
  var deduplicate: js.UndefOr[Boolean] = js.native
  
  var expireAfter: js.UndefOr[Double] = js.native
  
  var fields: js.Array[/* keyof T */ String] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var sparse: js.UndefOr[Boolean] = js.native
  
  var `type`: IndexType = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
}
object IndexDescription {
  
  @scala.inline
  def apply[T](fields: js.Array[/* keyof T */ String], `type`: IndexType): IndexDescription[T] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDescription[T]]
  }
  
  @scala.inline
  implicit class IndexDescriptionOps[Self <: IndexDescription[_], T] (val x: Self with IndexDescription[T]) extends AnyVal {
    
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
    def setFieldsVarargs(value: (/* keyof T */ String)*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[/* keyof T */ String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IndexType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeduplicate(value: Boolean): Self = this.set("deduplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeduplicate: Self = this.set("deduplicate", js.undefined)
    
    @scala.inline
    def setExpireAfter(value: Double): Self = this.set("expireAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireAfter: Self = this.set("expireAfter", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSparse(value: Boolean): Self = this.set("sparse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSparse: Self = this.set("sparse", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
}
