package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.Delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsequenceQuery extends StObject {
  
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
  implicit class ConsequenceQueryMutableBuilder[Self <: ConsequenceQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdits(value: js.Array[Delete]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditsUndefined: Self = StObject.set(x, "edits", js.undefined)
    
    @scala.inline
    def setEditsVarargs(value: Delete*): Self = StObject.set(x, "edits", js.Array(value :_*))
    
    @scala.inline
    def setRemove(value: js.Array[String]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setRemoveVarargs(value: String*): Self = StObject.set(x, "remove", js.Array(value :_*))
  }
}
