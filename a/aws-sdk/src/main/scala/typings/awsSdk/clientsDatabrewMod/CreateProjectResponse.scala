package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectResponse extends StObject {
  
  /**
    * The name of the project that you created.
    */
  var Name: ProjectName
}
object CreateProjectResponse {
  
  inline def apply(Name: ProjectName): CreateProjectResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResponse]
  }
  
  extension [Self <: CreateProjectResponse](x: Self) {
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
