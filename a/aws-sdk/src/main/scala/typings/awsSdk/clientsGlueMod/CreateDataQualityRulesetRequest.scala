package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataQualityRulesetRequest extends StObject {
  
  /**
    * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or starting multiple instances of the same resource.
    */
  var ClientToken: js.UndefOr[HashString] = js.undefined
  
  /**
    * A description of the data quality ruleset.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * A unique name for the data quality ruleset.
    */
  var Name: NameString
  
  /**
    * A Data Quality Definition Language (DQDL) ruleset. For more information, see the Glue developer guide.
    */
  var Ruleset: DataQualityRulesetString
  
  /**
    * A list of tags applied to the data quality ruleset.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * A target table associated with the data quality ruleset.
    */
  var TargetTable: js.UndefOr[DataQualityTargetTable] = js.undefined
}
object CreateDataQualityRulesetRequest {
  
  inline def apply(Name: NameString, Ruleset: DataQualityRulesetString): CreateDataQualityRulesetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Ruleset = Ruleset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataQualityRulesetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDataQualityRulesetRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: HashString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRuleset(value: DataQualityRulesetString): Self = StObject.set(x, "Ruleset", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTargetTable(value: DataQualityTargetTable): Self = StObject.set(x, "TargetTable", value.asInstanceOf[js.Any])
    
    inline def setTargetTableUndefined: Self = StObject.set(x, "TargetTable", js.undefined)
  }
}
