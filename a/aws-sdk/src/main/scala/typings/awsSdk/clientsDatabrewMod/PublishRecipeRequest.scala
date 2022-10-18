package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishRecipeRequest extends StObject {
  
  /**
    * A description of the recipe to be published, for this version of the recipe.
    */
  var Description: js.UndefOr[RecipeDescription] = js.undefined
  
  /**
    * The name of the recipe to be published.
    */
  var Name: RecipeName
}
object PublishRecipeRequest {
  
  inline def apply(Name: RecipeName): PublishRecipeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishRecipeRequest]
  }
  
  extension [Self <: PublishRecipeRequest](x: Self) {
    
    inline def setDescription(value: RecipeDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
