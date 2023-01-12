package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecipeResponse extends StObject {
  
  /**
    * The name of the recipe that you created.
    */
  var Name: RecipeName
}
object CreateRecipeResponse {
  
  inline def apply(Name: RecipeName): CreateRecipeResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecipeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRecipeResponse] (val x: Self) extends AnyVal {
    
    inline def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
