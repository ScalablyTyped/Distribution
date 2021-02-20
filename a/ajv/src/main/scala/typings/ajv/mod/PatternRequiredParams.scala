package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatternRequiredParams extends ErrorParameters {
  
  var missingPattern: String = js.native
}
object PatternRequiredParams {
  
  @scala.inline
  def apply(missingPattern: String): PatternRequiredParams = {
    val __obj = js.Dynamic.literal(missingPattern = missingPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternRequiredParams]
  }
  
  @scala.inline
  implicit class PatternRequiredParamsMutableBuilder[Self <: PatternRequiredParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissingPattern(value: String): Self = StObject.set(x, "missingPattern", value.asInstanceOf[js.Any])
  }
}
