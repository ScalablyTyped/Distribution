package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Descendants extends StObject {
  
  var descendants: js.UndefOr[Boolean] = js.native
  
  var read: js.UndefOr[js.Any] = js.native
}
object Descendants {
  
  @scala.inline
  def apply(): Descendants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Descendants]
  }
  
  @scala.inline
  implicit class DescendantsMutableBuilder[Self <: Descendants] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescendants(value: Boolean): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescendantsUndefined: Self = StObject.set(x, "descendants", js.undefined)
    
    @scala.inline
    def setRead(value: js.Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
  }
}
