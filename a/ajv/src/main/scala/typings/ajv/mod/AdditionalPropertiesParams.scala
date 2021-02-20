package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalPropertiesParams extends ErrorParameters {
  
  var additionalProperty: String = js.native
}
object AdditionalPropertiesParams {
  
  @scala.inline
  def apply(additionalProperty: String): AdditionalPropertiesParams = {
    val __obj = js.Dynamic.literal(additionalProperty = additionalProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalPropertiesParams]
  }
  
  @scala.inline
  implicit class AdditionalPropertiesParamsMutableBuilder[Self <: AdditionalPropertiesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalProperty(value: String): Self = StObject.set(x, "additionalProperty", value.asInstanceOf[js.Any])
  }
}
