package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityRulesetFilterCriteria extends StObject {
  
  /**
    * Filter on rulesets created after this date.
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filter on rulesets created before this date.
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the ruleset filter criteria.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * Filter on rulesets last modified after this date.
    */
  var LastModifiedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filter on rulesets last modified before this date.
    */
  var LastModifiedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the ruleset filter criteria.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * The name and database name of the target table.
    */
  var TargetTable: js.UndefOr[DataQualityTargetTable] = js.undefined
}
object DataQualityRulesetFilterCriteria {
  
  inline def apply(): DataQualityRulesetFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQualityRulesetFilterCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQualityRulesetFilterCriteria] (val x: Self) extends AnyVal {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "CreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "CreatedAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "CreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "CreatedBefore", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedAfter(value: js.Date): Self = StObject.set(x, "LastModifiedAfter", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedAfterUndefined: Self = StObject.set(x, "LastModifiedAfter", js.undefined)
    
    inline def setLastModifiedBefore(value: js.Date): Self = StObject.set(x, "LastModifiedBefore", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBeforeUndefined: Self = StObject.set(x, "LastModifiedBefore", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTargetTable(value: DataQualityTargetTable): Self = StObject.set(x, "TargetTable", value.asInstanceOf[js.Any])
    
    inline def setTargetTableUndefined: Self = StObject.set(x, "TargetTable", js.undefined)
  }
}
