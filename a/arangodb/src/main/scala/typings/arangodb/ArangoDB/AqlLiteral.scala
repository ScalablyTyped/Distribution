package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AqlLiteral extends StObject {
  
  def toAQL(): String
}
object AqlLiteral {
  
  inline def apply(toAQL: () => String): AqlLiteral = {
    val __obj = js.Dynamic.literal(toAQL = js.Any.fromFunction0(toAQL))
    __obj.asInstanceOf[AqlLiteral]
  }
  
  extension [Self <: AqlLiteral](x: Self) {
    
    inline def setToAQL(value: () => String): Self = StObject.set(x, "toAQL", js.Any.fromFunction0(value))
  }
}
