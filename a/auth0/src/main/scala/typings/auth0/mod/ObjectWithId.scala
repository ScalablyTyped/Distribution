package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectWithId extends StObject {
  
  var id: String
}
object ObjectWithId {
  
  @scala.inline
  def apply(id: String): ObjectWithId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithId]
  }
  
  @scala.inline
  implicit class ObjectWithIdMutableBuilder[Self <: ObjectWithId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
