package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRecommendationsRequestEntry extends StObject {
  
  /**
    * The identifier of the source database.
    */
  var DatabaseId: String
  
  /**
    * The required target engine settings.
    */
  var Settings: RecommendationSettings
}
object StartRecommendationsRequestEntry {
  
  inline def apply(DatabaseId: String, Settings: RecommendationSettings): StartRecommendationsRequestEntry = {
    val __obj = js.Dynamic.literal(DatabaseId = DatabaseId.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRecommendationsRequestEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartRecommendationsRequestEntry] (val x: Self) extends AnyVal {
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "DatabaseId", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: RecommendationSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
  }
}
