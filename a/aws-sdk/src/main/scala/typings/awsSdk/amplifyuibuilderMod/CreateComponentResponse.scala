package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComponentResponse extends StObject {
  
  /**
    * Describes the configuration of the new component.
    */
  var entity: js.UndefOr[Component] = js.undefined
}
object CreateComponentResponse {
  
  inline def apply(): CreateComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateComponentResponse]
  }
  
  extension [Self <: CreateComponentResponse](x: Self) {
    
    inline def setEntity(value: Component): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
  }
}
