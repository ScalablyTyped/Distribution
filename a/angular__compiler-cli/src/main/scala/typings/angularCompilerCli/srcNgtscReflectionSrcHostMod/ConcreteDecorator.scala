package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcreteDecorator
  extends StObject
     with BaseDecorator {
  
  @JSName("identifier")
  var identifier_ConcreteDecorator: DecoratorIdentifier
  
  @JSName("node")
  var node_ConcreteDecorator: Node
}
object ConcreteDecorator {
  
  inline def apply(identifier: DecoratorIdentifier, name: String, node: Node): ConcreteDecorator = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], args = null)
    __obj.updateDynamic("import")(null)
    __obj.asInstanceOf[ConcreteDecorator]
  }
  
  extension [Self <: ConcreteDecorator](x: Self) {
    
    inline def setIdentifier(value: DecoratorIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
