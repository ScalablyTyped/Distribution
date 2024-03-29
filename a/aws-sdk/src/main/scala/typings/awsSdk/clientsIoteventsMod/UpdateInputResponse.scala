package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInputResponse extends StObject {
  
  /**
    * Information about the configuration of the input.
    */
  var inputConfiguration: js.UndefOr[InputConfiguration] = js.undefined
}
object UpdateInputResponse {
  
  inline def apply(): UpdateInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInputResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateInputResponse] (val x: Self) extends AnyVal {
    
    inline def setInputConfiguration(value: InputConfiguration): Self = StObject.set(x, "inputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInputConfigurationUndefined: Self = StObject.set(x, "inputConfiguration", js.undefined)
  }
}
