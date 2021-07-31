package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectID extends StObject {
  
  val objectID: String
}
object ObjectID {
  
  @scala.inline
  def apply(objectID: String): ObjectID = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectID]
  }
  
  @scala.inline
  implicit class ObjectIDMutableBuilder[Self <: ObjectID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
  }
}
