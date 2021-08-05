package typings.astTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parenthesized extends StObject {
  
  var parenthesized: Boolean
}
object Parenthesized {
  
  inline def apply(parenthesized: Boolean): Parenthesized = {
    val __obj = js.Dynamic.literal(parenthesized = parenthesized.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parenthesized]
  }
  
  extension [Self <: Parenthesized](x: Self) {
    
    inline def setParenthesized(value: Boolean): Self = StObject.set(x, "parenthesized", value.asInstanceOf[js.Any])
  }
}
