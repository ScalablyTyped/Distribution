package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AqlLiteral extends StObject {
  
  def toAQL(): String = js.native
}
object AqlLiteral {
  
  @scala.inline
  def apply(toAQL: () => String): AqlLiteral = {
    val __obj = js.Dynamic.literal(toAQL = js.Any.fromFunction0(toAQL))
    __obj.asInstanceOf[AqlLiteral]
  }
  
  @scala.inline
  implicit class AqlLiteralMutableBuilder[Self <: AqlLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToAQL(value: () => String): Self = StObject.set(x, "toAQL", js.Any.fromFunction0(value))
  }
}
