package typings.astTypes.anon

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdIdentifierKind extends StObject {
  
  var id: IdentifierKind
  
  var init: LiteralKind
}
object IdIdentifierKind {
  
  inline def apply(id: IdentifierKind, init: LiteralKind): IdIdentifierKind = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdIdentifierKind]
  }
  
  extension [Self <: IdIdentifierKind](x: Self) {
    
    inline def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: LiteralKind): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
  }
}
