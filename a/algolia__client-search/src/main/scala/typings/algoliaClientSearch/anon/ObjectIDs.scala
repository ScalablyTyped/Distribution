package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.ConsequencePromote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectIDs
  extends StObject
     with ConsequencePromote {
  
  /**
    * List of unique identifiers for the objects to promote.
    */
  val objectIDs: js.Array[String]
  
  /**
    * Promoted start rank for the objects (zero-based).
    */
  val position: Double
}
object ObjectIDs {
  
  inline def apply(objectIDs: js.Array[String], position: Double): ObjectIDs = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIDs]
  }
  
  extension [Self <: ObjectIDs](x: Self) {
    
    inline def setObjectIDs(value: js.Array[String]): Self = StObject.set(x, "objectIDs", value.asInstanceOf[js.Any])
    
    inline def setObjectIDsVarargs(value: String*): Self = StObject.set(x, "objectIDs", js.Array(value :_*))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
