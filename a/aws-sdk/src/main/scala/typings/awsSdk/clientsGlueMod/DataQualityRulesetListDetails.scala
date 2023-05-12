package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityRulesetListDetails extends StObject {
  
  /**
    * The date and time the data quality ruleset was created.
    */
  var CreatedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the data quality ruleset.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The date and time the data quality ruleset was last modified.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the data quality ruleset.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * When a ruleset was created from a recommendation run, this run ID is generated to link the two together.
    */
  var RecommendationRunId: js.UndefOr[HashString] = js.undefined
  
  /**
    * The number of rules in the ruleset.
    */
  var RuleCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * An object representing an Glue table.
    */
  var TargetTable: js.UndefOr[DataQualityTargetTable] = js.undefined
}
object DataQualityRulesetListDetails {
  
  inline def apply(): DataQualityRulesetListDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQualityRulesetListDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQualityRulesetListDetails] (val x: Self) extends AnyVal {
    
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
    
    inline def setRuleCount(value: NullableInteger): Self = StObject.set(x, "RuleCount", value.asInstanceOf[js.Any])
    
    inline def setRuleCountUndefined: Self = StObject.set(x, "RuleCount", js.undefined)
    
    inline def setTargetTable(value: DataQualityTargetTable): Self = StObject.set(x, "TargetTable", value.asInstanceOf[js.Any])
    
    inline def setTargetTableUndefined: Self = StObject.set(x, "TargetTable", js.undefined)
  }
}
