package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyNamesParams extends ErrorParameters {
  
  var propertyName: String = js.native
}
object PropertyNamesParams {
  
  @scala.inline
  def apply(propertyName: String): PropertyNamesParams = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyNamesParams]
  }
  
  @scala.inline
  implicit class PropertyNamesParamsMutableBuilder[Self <: PropertyNamesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
