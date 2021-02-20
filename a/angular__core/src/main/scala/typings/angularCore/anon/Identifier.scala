package typings.angularCore.anon

import typings.typescript.mod.ClassDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identifier extends StObject {
  
  var identifier: typings.typescript.mod.Identifier = js.native
  
  var node: ClassDeclaration = js.native
}
object Identifier {
  
  @scala.inline
  def apply(identifier: typings.typescript.mod.Identifier, node: ClassDeclaration): Identifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
  
  @scala.inline
  implicit class IdentifierMutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: typings.typescript.mod.Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: ClassDeclaration): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
