package typings.ajv.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpLike extends StObject {
  
  def test(s: String): Boolean
}
object RegExpLike {
  
  inline def apply(test: String => Boolean): RegExpLike = {
    val __obj = js.Dynamic.literal(test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[RegExpLike]
  }
  
  extension [Self <: RegExpLike](x: Self) {
    
    inline def setTest(value: String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
  }
}
