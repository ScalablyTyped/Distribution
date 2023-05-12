package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recommendation extends StObject {
  
  /**
    * The date when Fleet Advisor created the target engine recommendation.
    */
  var CreatedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The recommendation of a target engine for the specified source database.
    */
  var Data: js.UndefOr[RecommendationData] = js.undefined
  
  /**
    * The identifier of the source database for which Fleet Advisor provided this recommendation.
    */
  var DatabaseId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the target engine. Valid values include "rds-aurora-mysql", "rds-aurora-postgresql", "rds-mysql", "rds-oracle", "rds-sql-server", and "rds-postgresql".
    */
  var EngineName: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that this target is the rightsized migration destination.
    */
  var Preferred: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The settings in JSON format for the preferred target engine parameters. These parameters include capacity, resource utilization, and the usage type (production, development, or testing).
    */
  var Settings: js.UndefOr[RecommendationSettings] = js.undefined
  
  /**
    * The status of the target engine recommendation. Valid values include "alternate", "in-progress", "not-viable", and "recommended".
    */
  var Status: js.UndefOr[String] = js.undefined
}
object Recommendation {
  
  inline def apply(): Recommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recommendation] (val x: Self) extends AnyVal {
    
    inline def setCreatedDate(value: String): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setData(value: RecommendationData): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "DatabaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "DatabaseId", js.undefined)
    
    inline def setEngineName(value: String): Self = StObject.set(x, "EngineName", value.asInstanceOf[js.Any])
    
    inline def setEngineNameUndefined: Self = StObject.set(x, "EngineName", js.undefined)
    
    inline def setPreferred(value: BooleanOptional): Self = StObject.set(x, "Preferred", value.asInstanceOf[js.Any])
    
    inline def setPreferredUndefined: Self = StObject.set(x, "Preferred", js.undefined)
    
    inline def setSettings(value: RecommendationSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
