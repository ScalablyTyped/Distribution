package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfParams
  extends StObject
     with ErrorParameters {
  
  var failingKeyword: String
}
object IfParams {
  
  inline def apply(failingKeyword: String): IfParams = {
    val __obj = js.Dynamic.literal(failingKeyword = failingKeyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfParams]
  }
  
  extension [Self <: IfParams](x: Self) {
    
    inline def setFailingKeyword(value: String): Self = StObject.set(x, "failingKeyword", value.asInstanceOf[js.Any])
  }
}
