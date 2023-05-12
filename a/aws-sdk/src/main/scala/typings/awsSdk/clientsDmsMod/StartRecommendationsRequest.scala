package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRecommendationsRequest extends StObject {
  
  /**
    * The identifier of the source database to analyze and provide recommendations for.
    */
  var DatabaseId: String
  
  /**
    * The settings in JSON format that Fleet Advisor uses to determine target engine recommendations. These parameters include target instance sizing and availability and durability settings. For target instance sizing, Fleet Advisor supports the following two options: total capacity and resource utilization. For availability and durability, Fleet Advisor supports the following two options: production (Multi-AZ deployments) and Dev/Test (Single-AZ deployments).
    */
  var Settings: RecommendationSettings
}
object StartRecommendationsRequest {
  
  inline def apply(DatabaseId: String, Settings: RecommendationSettings): StartRecommendationsRequest = {
    val __obj = js.Dynamic.literal(DatabaseId = DatabaseId.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRecommendationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartRecommendationsRequest] (val x: Self) extends AnyVal {
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "DatabaseId", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: RecommendationSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
  }
}
