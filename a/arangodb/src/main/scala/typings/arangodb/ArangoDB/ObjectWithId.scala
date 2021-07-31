package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Document
trait ObjectWithId
  extends StObject
     with /* key */ StringDictionary[js.Any]
     with DocumentLike {
  
  var _id: String
}
object ObjectWithId {
  
  @scala.inline
  def apply(_id: String): ObjectWithId = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithId]
  }
  
  @scala.inline
  implicit class ObjectWithIdMutableBuilder[Self <: ObjectWithId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
