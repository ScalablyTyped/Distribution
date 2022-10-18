package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceInput extends StObject {
  
  /**
    * The name of the service that you want to get the detailed data for.
    */
  var name: ResourceName
}
object GetServiceInput {
  
  inline def apply(name: ResourceName): GetServiceInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceInput]
  }
  
  extension [Self <: GetServiceInput](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
