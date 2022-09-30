package typings.angularCompilerCli.srcHostMod

import typings.angularCompilerCli.angularCompilerCliInts.`3`
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnknownReference
  extends StObject
     with UnavailableValue {
  
  var kind: `3`
  
  var typeNode: TypeNode
}
object UnknownReference {
  
  inline def apply(typeNode: TypeNode): UnknownReference = {
    val __obj = js.Dynamic.literal(kind = 3, typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnknownReference]
  }
  
  extension [Self <: UnknownReference](x: Self) {
    
    inline def setKind(value: `3`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTypeNode(value: TypeNode): Self = StObject.set(x, "typeNode", value.asInstanceOf[js.Any])
  }
}
