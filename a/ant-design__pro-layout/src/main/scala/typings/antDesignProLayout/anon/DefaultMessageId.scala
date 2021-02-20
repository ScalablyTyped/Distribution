package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultMessageId extends StObject {
  
  var defaultMessage: js.UndefOr[String] = js.native
  
  var id: String = js.native
}
object DefaultMessageId {
  
  @scala.inline
  def apply(id: String): DefaultMessageId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMessageId]
  }
  
  @scala.inline
  implicit class DefaultMessageIdMutableBuilder[Self <: DefaultMessageId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultMessage(value: String): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
