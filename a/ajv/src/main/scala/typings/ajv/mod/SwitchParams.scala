package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchParams
  extends StObject
     with ErrorParameters {
  
  var caseIndex: Double
}
object SwitchParams {
  
  @scala.inline
  def apply(caseIndex: Double): SwitchParams = {
    val __obj = js.Dynamic.literal(caseIndex = caseIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchParams]
  }
  
  @scala.inline
  implicit class SwitchParamsMutableBuilder[Self <: SwitchParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseIndex(value: Double): Self = StObject.set(x, "caseIndex", value.asInstanceOf[js.Any])
  }
}
