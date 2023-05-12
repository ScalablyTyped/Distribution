package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataQualityRulesetResponse extends StObject {
  
  /**
    * A timestamp. The time and date that this data quality ruleset was created.
    */
  var CreatedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the ruleset.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * A timestamp. The last point in time when this data quality ruleset was modified.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the ruleset.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * When a ruleset was created from a recommendation run, this run ID is generated to link the two together.
    */
  var RecommendationRunId: js.UndefOr[HashString] = js.undefined
  
  /**
    * A Data Quality Definition Language (DQDL) ruleset. For more information, see the Glue developer guide.
    */
  var Ruleset: js.UndefOr[DataQualityRulesetString] = js.undefined
  
  /**
    * The name and database name of the target table.
    */
  var TargetTable: js.UndefOr[DataQualityTargetTable] = js.undefined
}
object GetDataQualityRulesetResponse {
  
  inline def apply(): GetDataQualityRulesetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataQualityRulesetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataQualityRulesetResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "CreatedOn", value.asInstanceOf[js.Any])
    
    inline def setCreatedOnUndefined: Self = StObject.set(x, "CreatedOn", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedOn(value: js.Date): Self = StObject.set(x, "LastModifiedOn", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedOnUndefined: Self = StObject.set(x, "LastModifiedOn", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRecommendationRunId(value: HashString): Self = StObject.set(x, "RecommendationRunId", value.asInstanceOf[js.Any])
    
    inline def setRecommendationRunIdUndefined: Self = StObject.set(x, "RecommendationRunId", js.undefined)
    
    inline def setRuleset(value: DataQualityRulesetString): Self = StObject.set(x, "Ruleset", value.asInstanceOf[js.Any])
    
    inline def setRulesetUndefined: Self = StObject.set(x, "Ruleset", js.undefined)
    
    inline def setTargetTable(value: DataQualityTargetTable): Self = StObject.set(x, "TargetTable", value.asInstanceOf[js.Any])
    
    inline def setTargetTableUndefined: Self = StObject.set(x, "TargetTable", js.undefined)
  }
}
