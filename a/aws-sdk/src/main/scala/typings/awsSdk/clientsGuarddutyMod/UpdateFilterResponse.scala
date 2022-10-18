package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFilterResponse extends StObject {
  
  /**
    * The name of the filter.
    */
  var Name: FilterName
}
object UpdateFilterResponse {
  
  inline def apply(Name: FilterName): UpdateFilterResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFilterResponse]
  }
  
  extension [Self <: UpdateFilterResponse](x: Self) {
    
    inline def setName(value: FilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
