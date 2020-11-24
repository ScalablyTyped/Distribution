package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.Delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsequenceQuery extends js.Object {
  
  /**
    * List of edits.
    */
  val edits: js.UndefOr[js.Array[Delete]] = js.native
  
  /**
    * List of removes.
    */
  val remove: js.UndefOr[js.Array[String]] = js.native
}
object ConsequenceQuery {
  
  @scala.inline
  def apply(): ConsequenceQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsequenceQuery]
  }
  
  @scala.inline
  implicit class ConsequenceQueryOps[Self <: ConsequenceQuery] (val x: Self) extends AnyVal {
    
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
    def setEditsVarargs(value: Delete*): Self = this.set("edits", js.Array(value :_*))
    
    @scala.inline
    def setEdits(value: js.Array[Delete]): Self = this.set("edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdits: Self = this.set("edits", js.undefined)
    
    @scala.inline
    def setRemoveVarargs(value: String*): Self = this.set("remove", js.Array(value :_*))
    
    @scala.inline
    def setRemove(value: js.Array[String]): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
  }
}
