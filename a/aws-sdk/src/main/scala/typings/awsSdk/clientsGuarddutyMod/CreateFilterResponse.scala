package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFilterResponse extends StObject {
  
  /**
    * The name of the successfully created filter.
    */
  var Name: FilterName
}
object CreateFilterResponse {
  
  inline def apply(Name: FilterName): CreateFilterResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFilterResponse]
  }
  
  extension [Self <: CreateFilterResponse](x: Self) {
    
    inline def setName(value: FilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
