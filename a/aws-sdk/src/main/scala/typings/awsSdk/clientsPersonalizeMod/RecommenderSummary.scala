package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommenderSummary extends StObject {
  
  /**
    * The date and time (in Unix format) that the recommender was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The date and time (in Unix format) that the recommender was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the recommender.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was created for.
    */
  var recipeArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the recommender.
    */
  var recommenderArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The configuration details of the recommender.
    */
  var recommenderConfig: js.UndefOr[RecommenderConfig] = js.undefined
  
  /**
    * The status of the recommender. A recommender can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}
object RecommenderSummary {
  
  inline def apply(): RecommenderSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommenderSummary]
  }
  
  extension [Self <: RecommenderSummary](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupArnUndefined: Self = StObject.set(x, "datasetGroupArn", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecipeArn(value: Arn): Self = StObject.set(x, "recipeArn", value.asInstanceOf[js.Any])
    
    inline def setRecipeArnUndefined: Self = StObject.set(x, "recipeArn", js.undefined)
    
    inline def setRecommenderArn(value: Arn): Self = StObject.set(x, "recommenderArn", value.asInstanceOf[js.Any])
    
    inline def setRecommenderArnUndefined: Self = StObject.set(x, "recommenderArn", js.undefined)
    
    inline def setRecommenderConfig(value: RecommenderConfig): Self = StObject.set(x, "recommenderConfig", value.asInstanceOf[js.Any])
    
    inline def setRecommenderConfigUndefined: Self = StObject.set(x, "recommenderConfig", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
