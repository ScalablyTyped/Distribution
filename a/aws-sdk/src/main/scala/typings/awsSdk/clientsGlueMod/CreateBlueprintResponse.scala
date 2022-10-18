package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBlueprintResponse extends StObject {
  
  /**
    * Returns the name of the blueprint that was registered.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object CreateBlueprintResponse {
  
  inline def apply(): CreateBlueprintResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBlueprintResponse]
  }
  
  extension [Self <: CreateBlueprintResponse](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
