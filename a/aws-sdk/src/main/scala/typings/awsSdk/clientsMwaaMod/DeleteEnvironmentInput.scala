package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentInput extends StObject {
  
  /**
    * The name of the Amazon MWAA environment. For example, MyMWAAEnvironment.
    */
  var Name: EnvironmentName
}
object DeleteEnvironmentInput {
  
  inline def apply(Name: EnvironmentName): DeleteEnvironmentInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentInput]
  }
  
  extension [Self <: DeleteEnvironmentInput](x: Self) {
    
    inline def setName(value: EnvironmentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
