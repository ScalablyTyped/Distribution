package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentRequest extends StObject {
  
  /**
    * The ARN of the component version.
    */
  var arn: ComponentVersionARN
  
  /**
    * The format of the recipe.
    */
  var recipeOutputFormat: js.UndefOr[RecipeOutputFormat] = js.undefined
}
object GetComponentRequest {
  
  inline def apply(arn: ComponentVersionARN): GetComponentRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetComponentRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ComponentVersionARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setRecipeOutputFormat(value: RecipeOutputFormat): Self = StObject.set(x, "recipeOutputFormat", value.asInstanceOf[js.Any])
    
    inline def setRecipeOutputFormatUndefined: Self = StObject.set(x, "recipeOutputFormat", js.undefined)
  }
}
