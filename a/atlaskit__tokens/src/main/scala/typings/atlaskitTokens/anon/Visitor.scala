package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visitor extends StObject {
  
  var visitor: Program
}
object Visitor {
  
  inline def apply(visitor: Program): Visitor = {
    val __obj = js.Dynamic.literal(visitor = visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visitor]
  }
  
  extension [Self <: Visitor](x: Self) {
    
    inline def setVisitor(value: Program): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
  }
}
