package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.algoliaClientSearch.anon.Position
  - typings.algoliaClientSearch.anon.ObjectIDs
*/
trait ConsequencePromote extends js.Object
object ConsequencePromote {
  
  @scala.inline
  def Position(objectID: String, position: Double): ConsequencePromote = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsequencePromote]
  }
  
  @scala.inline
  def ObjectIDs(objectIDs: js.Array[String], position: Double): ConsequencePromote = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsequencePromote]
  }
}
