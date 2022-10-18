package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationResultQualifier extends StObject {
  
  /**
    * The name of the Config rule that was used in the evaluation.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConfigRuleName] = js.undefined
  
  /**
    * The ID of the evaluated Amazon Web Services resource.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.undefined
  
  /**
    * The type of Amazon Web Services resource that was evaluated.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object EvaluationResultQualifier {
  
  inline def apply(): EvaluationResultQualifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResultQualifier]
  }
  
  extension [Self <: EvaluationResultQualifier](x: Self) {
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
    
    inline def setResourceId(value: BaseResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
