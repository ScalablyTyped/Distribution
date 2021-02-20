package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequiredParams extends ErrorParameters {
  
  var missingProperty: String = js.native
}
object RequiredParams {
  
  @scala.inline
  def apply(missingProperty: String): RequiredParams = {
    val __obj = js.Dynamic.literal(missingProperty = missingProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredParams]
  }
  
  @scala.inline
  implicit class RequiredParamsMutableBuilder[Self <: RequiredParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissingProperty(value: String): Self = StObject.set(x, "missingProperty", value.asInstanceOf[js.Any])
  }
}
