package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MissingType extends StObject {
  
  var kind: 0
}
object MissingType {
  
  inline def apply(): MissingType = {
    val __obj = js.Dynamic.literal(kind = 0)
    __obj.asInstanceOf[MissingType]
  }
  
  extension [Self <: MissingType](x: Self) {
    
    inline def setKind(value: 0): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
