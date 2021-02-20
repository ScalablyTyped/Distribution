package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectWithIdentifier extends StObject {
  
  var identifier: String = js.native
}
object ObjectWithIdentifier {
  
  @scala.inline
  def apply(identifier: String): ObjectWithIdentifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithIdentifier]
  }
  
  @scala.inline
  implicit class ObjectWithIdentifierMutableBuilder[Self <: ObjectWithIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
