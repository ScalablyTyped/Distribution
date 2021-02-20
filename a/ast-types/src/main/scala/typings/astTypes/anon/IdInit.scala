package typings.astTypes.anon

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdInit extends StObject {
  
  var id: IdentifierKind = js.native
  
  var init: LiteralKind | Boolean = js.native
}
object IdInit {
  
  @scala.inline
  def apply(id: IdentifierKind, init: LiteralKind | Boolean): IdInit = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdInit]
  }
  
  @scala.inline
  implicit class IdInitMutableBuilder[Self <: IdInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: LiteralKind | Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
  }
}
