package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecipeResponse extends StObject {
  
  /**
    * An object that describes the recipe.
    */
  var recipe: js.UndefOr[Recipe] = js.undefined
}
object DescribeRecipeResponse {
  
  inline def apply(): DescribeRecipeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecipeResponse]
  }
  
  extension [Self <: DescribeRecipeResponse](x: Self) {
    
    inline def setRecipe(value: Recipe): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    
    inline def setRecipeUndefined: Self = StObject.set(x, "recipe", js.undefined)
  }
}
