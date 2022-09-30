package typings.angularCompilerCli.srcHostMod

import typings.angularCompilerCli.angularCompilerCliInts.`5`
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsupportedType
  extends StObject
     with UnavailableValue {
  
  var kind: `5`
  
  var typeNode: TypeNode
}
object UnsupportedType {
  
  inline def apply(typeNode: TypeNode): UnsupportedType = {
    val __obj = js.Dynamic.literal(kind = 5, typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedType]
  }
  
  extension [Self <: UnsupportedType](x: Self) {
    
    inline def setKind(value: `5`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTypeNode(value: TypeNode): Self = StObject.set(x, "typeNode", value.asInstanceOf[js.Any])
  }
}
