package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeBatch extends StObject {
  
  /**
    * Information about the changes to make to the record sets.
    */
  var Changes: typings.awsSdk.clientsRoute53Mod.Changes
  
  /**
    *  Optional: Any comments you want to include about a change batch request.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.undefined
}
object ChangeBatch {
  
  inline def apply(Changes: Changes): ChangeBatch = {
    val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeBatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeBatch] (val x: Self) extends AnyVal {
    
    inline def setChanges(value: Changes): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: Change*): Self = StObject.set(x, "Changes", js.Array(value*))
    
    inline def setComment(value: ResourceDescription): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
  }
}
