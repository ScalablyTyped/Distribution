package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternRequiredParams
  extends StObject
     with ErrorParameters {
  
  var missingPattern: String
}
object PatternRequiredParams {
  
  inline def apply(missingPattern: String): PatternRequiredParams = {
    val __obj = js.Dynamic.literal(missingPattern = missingPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternRequiredParams]
  }
  
  extension [Self <: PatternRequiredParams](x: Self) {
    
    inline def setMissingPattern(value: String): Self = StObject.set(x, "missingPattern", value.asInstanceOf[js.Any])
  }
}
