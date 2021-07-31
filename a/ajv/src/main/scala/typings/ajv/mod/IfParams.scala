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
  
  @scala.inline
  def apply(failingKeyword: String): IfParams = {
    val __obj = js.Dynamic.literal(failingKeyword = failingKeyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfParams]
  }
  
  @scala.inline
  implicit class IfParamsMutableBuilder[Self <: IfParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailingKeyword(value: String): Self = StObject.set(x, "failingKeyword", value.asInstanceOf[js.Any])
  }
}
