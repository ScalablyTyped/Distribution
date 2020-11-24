package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.ConsequencePromote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectIDs extends ConsequencePromote {
  
  /**
    * List of unique identifiers for the objects to promote.
    */
  val objectIDs: js.Array[String] = js.native
  
  /**
    * Promoted start rank for the objects (zero-based).
    */
  val position: Double = js.native
}
object ObjectIDs {
  
  @scala.inline
  def apply(objectIDs: js.Array[String], position: Double): ObjectIDs = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIDs]
  }
  
  @scala.inline
  implicit class ObjectIDsOps[Self <: ObjectIDs] (val x: Self) extends AnyVal {
    
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
    def setObjectIDsVarargs(value: String*): Self = this.set("objectIDs", js.Array(value :_*))
    
    @scala.inline
    def setObjectIDs(value: js.Array[String]): Self = this.set("objectIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
