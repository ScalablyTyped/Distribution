package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectWithObjectID extends StObject {
  
  /**
    * The object id of the object.
    */
  val objectID: String
}
object ObjectWithObjectID {
  
  inline def apply(objectID: String): ObjectWithObjectID = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithObjectID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectWithObjectID] (val x: Self) extends AnyVal {
    
    inline def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
  }
}
