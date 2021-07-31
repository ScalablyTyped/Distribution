package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitParams
  extends StObject
     with ErrorParameters {
  
  var limit: Double
}
object LimitParams {
  
  @scala.inline
  def apply(limit: Double): LimitParams = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitParams]
  }
  
  @scala.inline
  implicit class LimitParamsMutableBuilder[Self <: LimitParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
  }
}
