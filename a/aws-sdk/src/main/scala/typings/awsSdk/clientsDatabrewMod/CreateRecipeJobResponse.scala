package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecipeJobResponse extends StObject {
  
  /**
    * The name of the job that you created.
    */
  var Name: JobName
}
object CreateRecipeJobResponse {
  
  inline def apply(Name: JobName): CreateRecipeJobResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecipeJobResponse]
  }
  
  extension [Self <: CreateRecipeJobResponse](x: Self) {
    
    inline def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
