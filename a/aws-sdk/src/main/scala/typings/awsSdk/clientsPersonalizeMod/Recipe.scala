package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recipe extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize uses to train the model.
    */
  var algorithmArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The date and time (in Unix format) that the recipe was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the recipe.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ARN of the FeatureTransformation object.
    */
  var featureTransformationArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The date and time (in Unix format) that the recipe was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the recipe.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the recipe.
    */
  var recipeArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * One of the following values:   PERSONALIZED_RANKING   RELATED_ITEMS   USER_PERSONALIZATION  
    */
  var recipeType: js.UndefOr[RecipeType] = js.undefined
  
  /**
    * The status of the recipe.
    */
  var status: js.UndefOr[Status] = js.undefined
}
object Recipe {
  
  inline def apply(): Recipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recipe]
  }
  
  extension [Self <: Recipe](x: Self) {
    
    inline def setAlgorithmArn(value: Arn): Self = StObject.set(x, "algorithmArn", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmArnUndefined: Self = StObject.set(x, "algorithmArn", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFeatureTransformationArn(value: Arn): Self = StObject.set(x, "featureTransformationArn", value.asInstanceOf[js.Any])
    
    inline def setFeatureTransformationArnUndefined: Self = StObject.set(x, "featureTransformationArn", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecipeArn(value: Arn): Self = StObject.set(x, "recipeArn", value.asInstanceOf[js.Any])
    
    inline def setRecipeArnUndefined: Self = StObject.set(x, "recipeArn", js.undefined)
    
    inline def setRecipeType(value: RecipeType): Self = StObject.set(x, "recipeType", value.asInstanceOf[js.Any])
    
    inline def setRecipeTypeUndefined: Self = StObject.set(x, "recipeType", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
