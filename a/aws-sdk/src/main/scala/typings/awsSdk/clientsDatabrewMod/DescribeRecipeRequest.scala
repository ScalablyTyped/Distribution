package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecipeRequest extends StObject {
  
  /**
    * The name of the recipe to be described.
    */
  var Name: RecipeName
  
  /**
    * The recipe version identifier. If this parameter isn't specified, then the latest published version is returned.
    */
  var RecipeVersion: js.UndefOr[typings.awsSdk.clientsDatabrewMod.RecipeVersion] = js.undefined
}
object DescribeRecipeRequest {
  
  inline def apply(Name: RecipeName): DescribeRecipeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecipeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRecipeRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
    
    inline def setRecipeVersionUndefined: Self = StObject.set(x, "RecipeVersion", js.undefined)
  }
}
