package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleGetObject extends js.Object {
  
  /**
    * The attributes that should be returned with the object.
    */
  val attributesToRetrieve: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The index name.
    */
  val indexName: String = js.native
  
  /**
    * The object id.
    */
  val objectID: String = js.native
}
object MultipleGetObject {
  
  @scala.inline
  def apply(indexName: String, objectID: String): MultipleGetObject = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleGetObject]
  }
  
  @scala.inline
  implicit class MultipleGetObjectOps[Self <: MultipleGetObject] (val x: Self) extends AnyVal {
    
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
    def setIndexName(value: String): Self = this.set("indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectID(value: String): Self = this.set("objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToRetrieveVarargs(value: String*): Self = this.set("attributesToRetrieve", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToRetrieve(value: js.Array[String]): Self = this.set("attributesToRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToRetrieve: Self = this.set("attributesToRetrieve", js.undefined)
  }
}
