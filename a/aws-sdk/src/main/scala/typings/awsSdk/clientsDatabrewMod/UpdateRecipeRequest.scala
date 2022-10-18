package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRecipeRequest extends StObject {
  
  /**
    * A description of the recipe.
    */
  var Description: js.UndefOr[RecipeDescription] = js.undefined
  
  /**
    * The name of the recipe to be updated.
    */
  var Name: RecipeName
  
  /**
    * One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under which the action should succeed.
    */
  var Steps: js.UndefOr[RecipeStepList] = js.undefined
}
object UpdateRecipeRequest {
  
  inline def apply(Name: RecipeName): UpdateRecipeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecipeRequest]
  }
  
  extension [Self <: UpdateRecipeRequest](x: Self) {
    
    inline def setDescription(value: RecipeDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: RecipeStepList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
    
    inline def setStepsVarargs(value: RecipeStep*): Self = StObject.set(x, "Steps", js.Array(value*))
  }
}
