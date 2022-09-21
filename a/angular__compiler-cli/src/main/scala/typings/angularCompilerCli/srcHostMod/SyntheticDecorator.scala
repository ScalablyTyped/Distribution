package typings.angularCompilerCli.srcHostMod

import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntheticDecorator
  extends StObject
     with BaseDecorator
     with Decorator {
  
  @JSName("identifier")
  var identifier_SyntheticDecorator: Null
  
  @JSName("node")
  var node_SyntheticDecorator: Null
  
  /**
    * The `ts.Node` for which this decorator was created.
    */
  var synthesizedFor: Node
}
object SyntheticDecorator {
  
  inline def apply(identifier: Null, name: String, node: Null, synthesizedFor: Node): SyntheticDecorator = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], synthesizedFor = synthesizedFor.asInstanceOf[js.Any], args = null)
    __obj.updateDynamic("import")(null)
    __obj.asInstanceOf[SyntheticDecorator]
  }
  
  extension [Self <: SyntheticDecorator](x: Self) {
    
    inline def setIdentifier(value: Null): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Null): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setSynthesizedFor(value: Node): Self = StObject.set(x, "synthesizedFor", value.asInstanceOf[js.Any])
  }
}
