package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.Delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsequenceQuery extends StObject {
  
  /**
    * List of edits.
    */
  val edits: js.UndefOr[js.Array[Delete]] = js.undefined
  
  /**
    * List of removes.
    */
  val remove: js.UndefOr[js.Array[String]] = js.undefined
}
object ConsequenceQuery {
  
  inline def apply(): ConsequenceQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsequenceQuery]
  }
  
  extension [Self <: ConsequenceQuery](x: Self) {
    
    inline def setEdits(value: js.Array[Delete]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsUndefined: Self = StObject.set(x, "edits", js.undefined)
    
    inline def setEditsVarargs(value: Delete*): Self = StObject.set(x, "edits", js.Array(value*))
    
    inline def setRemove(value: js.Array[String]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRemoveVarargs(value: String*): Self = StObject.set(x, "remove", js.Array(value*))
  }
}
