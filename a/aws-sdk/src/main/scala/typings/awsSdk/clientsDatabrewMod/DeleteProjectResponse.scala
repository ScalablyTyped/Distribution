package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectResponse extends StObject {
  
  /**
    * The name of the project that you deleted.
    */
  var Name: ProjectName
}
object DeleteProjectResponse {
  
  inline def apply(Name: ProjectName): DeleteProjectResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectResponse]
  }
  
  extension [Self <: DeleteProjectResponse](x: Self) {
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
