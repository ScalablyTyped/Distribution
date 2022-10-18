package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentInput extends StObject {
  
  /**
    * The name of the environment that you want to get the detailed data for.
    */
  var name: ResourceName
}
object GetEnvironmentInput {
  
  inline def apply(name: ResourceName): GetEnvironmentInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentInput]
  }
  
  extension [Self <: GetEnvironmentInput](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
