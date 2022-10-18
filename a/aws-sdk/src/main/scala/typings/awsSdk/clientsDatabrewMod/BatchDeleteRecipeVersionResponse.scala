package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteRecipeVersionResponse extends StObject {
  
  /**
    * Errors, if any, that occurred while attempting to delete the recipe versions.
    */
  var Errors: js.UndefOr[RecipeErrorList] = js.undefined
  
  /**
    * The name of the recipe that was modified.
    */
  var Name: RecipeName
}
object BatchDeleteRecipeVersionResponse {
  
  inline def apply(Name: RecipeName): BatchDeleteRecipeVersionResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteRecipeVersionResponse]
  }
  
  extension [Self <: BatchDeleteRecipeVersionResponse](x: Self) {
    
    inline def setErrors(value: RecipeErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: RecipeVersionErrorDetail*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
