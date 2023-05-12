package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataQualityRulesetResponse extends StObject {
  
  /**
    * A description of the ruleset.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The name of the data quality ruleset.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * A Data Quality Definition Language (DQDL) ruleset. For more information, see the Glue developer guide.
    */
  var Ruleset: js.UndefOr[DataQualityRulesetString] = js.undefined
}
object UpdateDataQualityRulesetResponse {
  
  inline def apply(): UpdateDataQualityRulesetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDataQualityRulesetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDataQualityRulesetResponse] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRuleset(value: DataQualityRulesetString): Self = StObject.set(x, "Ruleset", value.asInstanceOf[js.Any])
    
    inline def setRulesetUndefined: Self = StObject.set(x, "Ruleset", js.undefined)
  }
}
