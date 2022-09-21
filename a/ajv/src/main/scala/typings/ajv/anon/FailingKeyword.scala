package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailingKeyword extends StObject {
  
  var failingKeyword: String
}
object FailingKeyword {
  
  inline def apply(failingKeyword: String): FailingKeyword = {
    val __obj = js.Dynamic.literal(failingKeyword = failingKeyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailingKeyword]
  }
  
  extension [Self <: FailingKeyword](x: Self) {
    
    inline def setFailingKeyword(value: String): Self = StObject.set(x, "failingKeyword", value.asInstanceOf[js.Any])
  }
}
