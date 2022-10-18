package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecommenderRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the destination domain dataset group for the recommender.
    */
  var datasetGroupArn: Arn
  
  /**
    * The name of the recommender.
    */
  var name: Name
  
  /**
    * The Amazon Resource Name (ARN) of the recipe that the recommender will use. For a recommender, a recipe is a Domain dataset group use case. Only Domain dataset group use cases can be used to create a recommender. For information about use cases see Choosing recommender use cases. 
    */
  var recipeArn: Arn
  
  /**
    * The configuration details of the recommender.
    */
  var recommenderConfig: js.UndefOr[RecommenderConfig] = js.undefined
  
  /**
    * A list of tags to apply to the recommender.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateRecommenderRequest {
  
  inline def apply(datasetGroupArn: Arn, name: Name, recipeArn: Arn): CreateRecommenderRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recipeArn = recipeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecommenderRequest]
  }
  
  extension [Self <: CreateRecommenderRequest](x: Self) {
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRecipeArn(value: Arn): Self = StObject.set(x, "recipeArn", value.asInstanceOf[js.Any])
    
    inline def setRecommenderConfig(value: RecommenderConfig): Self = StObject.set(x, "recommenderConfig", value.asInstanceOf[js.Any])
    
    inline def setRecommenderConfigUndefined: Self = StObject.set(x, "recommenderConfig", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
