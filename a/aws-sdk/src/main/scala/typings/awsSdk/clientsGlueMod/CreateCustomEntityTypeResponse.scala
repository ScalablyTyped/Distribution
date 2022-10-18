package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomEntityTypeResponse extends StObject {
  
  /**
    * The name of the custom pattern you created.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object CreateCustomEntityTypeResponse {
  
  inline def apply(): CreateCustomEntityTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomEntityTypeResponse]
  }
  
  extension [Self <: CreateCustomEntityTypeResponse](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
